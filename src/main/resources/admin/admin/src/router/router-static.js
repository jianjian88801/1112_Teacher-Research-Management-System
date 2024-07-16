import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import lunwenxinxi from '@/views/modules/lunwenxinxi/list'
    import keyanketixiaoshen from '@/views/modules/keyanketixiaoshen/list'
    import keyanchengguoxiaoshen from '@/views/modules/keyanchengguoxiaoshen/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import ruanjianzhuzuoquan from '@/views/modules/ruanjianzhuzuoquan/list'
    import users from '@/views/modules/users/list'
    import zhuanlixiaoshen from '@/views/modules/zhuanlixiaoshen/list'
    import keyanketi from '@/views/modules/keyanketi/list'
    import lunwenxiaoshen from '@/views/modules/lunwenxiaoshen/list'
    import zhuzuoquanxiaoshen from '@/views/modules/zhuzuoquanxiaoshen/list'
    import zhuanlixinxi from '@/views/modules/zhuanlixinxi/list'
    import keyanchengguo from '@/views/modules/keyanchengguo/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/lunwenxinxi',
        name: '论文信息',
        component: lunwenxinxi
      }
      ,{
	path: '/keyanketixiaoshen',
        name: '科研课题校审',
        component: keyanketixiaoshen
      }
      ,{
	path: '/keyanchengguoxiaoshen',
        name: '科研成果校审',
        component: keyanchengguoxiaoshen
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/xueyuan',
        name: '学院',
        component: xueyuan
      }
      ,{
	path: '/ruanjianzhuzuoquan',
        name: '软件著作权',
        component: ruanjianzhuzuoquan
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/zhuanlixiaoshen',
        name: '专利校审',
        component: zhuanlixiaoshen
      }
      ,{
	path: '/keyanketi',
        name: '科研课题',
        component: keyanketi
      }
      ,{
	path: '/lunwenxiaoshen',
        name: '论文校审',
        component: lunwenxiaoshen
      }
      ,{
	path: '/zhuzuoquanxiaoshen',
        name: '著作权校审',
        component: zhuzuoquanxiaoshen
      }
      ,{
	path: '/zhuanlixinxi',
        name: '专利信息',
        component: zhuanlixinxi
      }
      ,{
	path: '/keyanchengguo',
        name: '科研成果',
        component: keyanchengguo
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
