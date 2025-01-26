const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"读者","menuJump":"列表","tableName":"duzhe"}],"menu":"读者管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"图书分类","menuJump":"列表","tableName":"tushufenlei"}],"menu":"图书分类管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除","图书数量"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","删除","审核","借阅数量","图书借阅次数","读者借阅次数"],"menu":"图书借阅","menuJump":"列表","tableName":"tushujieyue"}],"menu":"图书借阅管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除","审核"],"menu":"图书续借","menuJump":"列表","tableName":"tushuxujie"}],"menu":"图书续借管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除","审核"],"menu":"图书归还","menuJump":"列表","tableName":"tushuguihai"}],"menu":"图书归还管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"到期提醒","menuJump":"列表","tableName":"daoqitixing"}],"menu":"到期提醒管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"},{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-time","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","图书数量","图书借阅"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","图书续借","图书归还"],"menu":"图书借阅","menuJump":"列表","tableName":"tushujieyue"}],"menu":"图书借阅管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","图书归还"],"menu":"图书续借","menuJump":"列表","tableName":"tushuxujie"}],"menu":"图书续借管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"图书归还","menuJump":"列表","tableName":"tushuguihai"}],"menu":"图书归还管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","删除"],"menu":"到期提醒","menuJump":"列表","tableName":"daoqitixing"}],"menu":"到期提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","图书数量","图书借阅"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"读者","tableName":"duzhe"}]
    }
}
export default menu;
