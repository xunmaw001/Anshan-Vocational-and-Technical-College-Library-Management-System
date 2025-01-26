package com.entity.model;

import com.entity.TushuxujieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 图书续借
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-11 11:33:04
 */
public class TushuxujieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * ISBN编号
	 */
	
	private String bianhao;
		
	/**
	 * 图书名称
	 */
	
	private String tushumingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 续借天数
	 */
	
	private Integer xujietianshu;
		
	/**
	 * 续借日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xujieriqi;
		
	/**
	 * 续借原因
	 */
	
	private String xujieyuanyin;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：ISBN编号
	 */
	 
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	
	/**
	 * 获取：ISBN编号
	 */
	public String getBianhao() {
		return bianhao;
	}
				
	
	/**
	 * 设置：图书名称
	 */
	 
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：续借天数
	 */
	 
	public void setXujietianshu(Integer xujietianshu) {
		this.xujietianshu = xujietianshu;
	}
	
	/**
	 * 获取：续借天数
	 */
	public Integer getXujietianshu() {
		return xujietianshu;
	}
				
	
	/**
	 * 设置：续借日期
	 */
	 
	public void setXujieriqi(Date xujieriqi) {
		this.xujieriqi = xujieriqi;
	}
	
	/**
	 * 获取：续借日期
	 */
	public Date getXujieriqi() {
		return xujieriqi;
	}
				
	
	/**
	 * 设置：续借原因
	 */
	 
	public void setXujieyuanyin(String xujieyuanyin) {
		this.xujieyuanyin = xujieyuanyin;
	}
	
	/**
	 * 获取：续借原因
	 */
	public String getXujieyuanyin() {
		return xujieyuanyin;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
