//存放主要交互逻辑的js代码

var rest = {
    //封装相关ajax的url
    URL: {
        queryDetail: function (departId) {
            return '/restTest/departs/' + departId + '/departDetail';
        }
    },

    queryDetail: function (departId) {
        //执行根据部门id查询部门信息请求
        $.post(rest.URL.queryDetail(departId), {}, function (result) {
            if (result && result['success']) {
            	alert("查询成功！");
            	window.location.reload();
            }else{
            	alert(result['error']);
            }

        });

    },


}