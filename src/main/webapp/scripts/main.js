// 菜单初始化
$(document).ready(function (){
    var testjson = '{"一级标题":["二级标题1","二级标题1","二级标题1"]}';
    var i = 0;
     $(".treeview-menu").find("li").each(function(){
        i++;
        console.log($(this).text());
        if($(this).text() == 'test_parse_json'){
            alert("中了"+ $(this).find("a").prop('href'));
            $(this).find("a").prop('href',"/admin/register.htm");
            alert("中了"+ $(this).find("a").prop('href'));
        }
    });
     console.log("hello,"+ i);
// "admin/testJSONt.htm"
});
