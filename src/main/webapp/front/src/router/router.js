import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import duzheList from '../pages/duzhe/list'
import duzheDetail from '../pages/duzhe/detail'
import duzheAdd from '../pages/duzhe/add'
import tushufenleiList from '../pages/tushufenlei/list'
import tushufenleiDetail from '../pages/tushufenlei/detail'
import tushufenleiAdd from '../pages/tushufenlei/add'
import tushuxinxiList from '../pages/tushuxinxi/list'
import tushuxinxiDetail from '../pages/tushuxinxi/detail'
import tushuxinxiAdd from '../pages/tushuxinxi/add'
import tushujieyueList from '../pages/tushujieyue/list'
import tushujieyueDetail from '../pages/tushujieyue/detail'
import tushujieyueAdd from '../pages/tushujieyue/add'
import tushuxujieList from '../pages/tushuxujie/list'
import tushuxujieDetail from '../pages/tushuxujie/detail'
import tushuxujieAdd from '../pages/tushuxujie/add'
import tushuguihaiList from '../pages/tushuguihai/list'
import tushuguihaiDetail from '../pages/tushuguihai/detail'
import tushuguihaiAdd from '../pages/tushuguihai/add'
import daoqitixingList from '../pages/daoqitixing/list'
import daoqitixingDetail from '../pages/daoqitixing/detail'
import daoqitixingAdd from '../pages/daoqitixing/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'duzhe',
					component: duzheList
				},
				{
					path: 'duzheDetail',
					component: duzheDetail
				},
				{
					path: 'duzheAdd',
					component: duzheAdd
				},
				{
					path: 'tushufenlei',
					component: tushufenleiList
				},
				{
					path: 'tushufenleiDetail',
					component: tushufenleiDetail
				},
				{
					path: 'tushufenleiAdd',
					component: tushufenleiAdd
				},
				{
					path: 'tushuxinxi',
					component: tushuxinxiList
				},
				{
					path: 'tushuxinxiDetail',
					component: tushuxinxiDetail
				},
				{
					path: 'tushuxinxiAdd',
					component: tushuxinxiAdd
				},
				{
					path: 'tushujieyue',
					component: tushujieyueList
				},
				{
					path: 'tushujieyueDetail',
					component: tushujieyueDetail
				},
				{
					path: 'tushujieyueAdd',
					component: tushujieyueAdd
				},
				{
					path: 'tushuxujie',
					component: tushuxujieList
				},
				{
					path: 'tushuxujieDetail',
					component: tushuxujieDetail
				},
				{
					path: 'tushuxujieAdd',
					component: tushuxujieAdd
				},
				{
					path: 'tushuguihai',
					component: tushuguihaiList
				},
				{
					path: 'tushuguihaiDetail',
					component: tushuguihaiDetail
				},
				{
					path: 'tushuguihaiAdd',
					component: tushuguihaiAdd
				},
				{
					path: 'daoqitixing',
					component: daoqitixingList
				},
				{
					path: 'daoqitixingDetail',
					component: daoqitixingDetail
				},
				{
					path: 'daoqitixingAdd',
					component: daoqitixingAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
