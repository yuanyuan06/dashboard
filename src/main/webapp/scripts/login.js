$("#register").click(function(){
	$.post(
	"admin/testJSON.htm",
	{a:'1', b:'2'},
	function(data){
		alert(data);
		console.log(data.a + '   ' + data.b);
	},
	'json'
	);
// 	window.location.href = "admin/register.htm";
})


$("#sign_in").click(function(){
	window.location.href = "admin/test.htm";
});