package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TushuxujieEntity;
import com.entity.view.TushuxujieView;

import com.service.TushuxujieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 图书续借
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-11 11:33:04
 */
@RestController
@RequestMapping("/tushuxujie")
public class TushuxujieController {
    @Autowired
    private TushuxujieService tushuxujieService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuxujieEntity tushuxujie, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("duzhe")) {
			tushuxujie.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TushuxujieEntity> ew = new EntityWrapper<TushuxujieEntity>();


		PageUtils page = tushuxujieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuxujie), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuxujieEntity tushuxujie, 
		HttpServletRequest request){
        EntityWrapper<TushuxujieEntity> ew = new EntityWrapper<TushuxujieEntity>();

		PageUtils page = tushuxujieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuxujie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuxujieEntity tushuxujie){
       	EntityWrapper<TushuxujieEntity> ew = new EntityWrapper<TushuxujieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuxujie, "tushuxujie")); 
        return R.ok().put("data", tushuxujieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuxujieEntity tushuxujie){
        EntityWrapper< TushuxujieEntity> ew = new EntityWrapper< TushuxujieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuxujie, "tushuxujie")); 
		TushuxujieView tushuxujieView =  tushuxujieService.selectView(ew);
		return R.ok("查询图书续借成功").put("data", tushuxujieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuxujieEntity tushuxujie = tushuxujieService.selectById(id);
        return R.ok().put("data", tushuxujie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuxujieEntity tushuxujie = tushuxujieService.selectById(id);
        return R.ok().put("data", tushuxujie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuxujieEntity tushuxujie, HttpServletRequest request){
    	tushuxujie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuxujie);

        tushuxujieService.insert(tushuxujie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TushuxujieEntity tushuxujie, HttpServletRequest request){
    	tushuxujie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuxujie);

        tushuxujieService.insert(tushuxujie);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TushuxujieEntity tushuxujie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuxujie);
        tushuxujieService.updateById(tushuxujie);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<TushuxujieEntity> list = new ArrayList<TushuxujieEntity>();
        for(Long id : ids) {
            TushuxujieEntity tushuxujie = tushuxujieService.selectById(id);
            tushuxujie.setSfsh(sfsh);
            tushuxujie.setShhf(shhf);
            list.add(tushuxujie);
        }
        tushuxujieService.updateBatchById(list);
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuxujieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
