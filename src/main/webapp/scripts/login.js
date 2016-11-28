$("#register").click(function(){
	window.location.href = "admin/register.htm";
})


$("#sign_in").click(function(){
	var url = "admin/test.htm";
	var data = {a: 1, b: 2};
	$.post( url, 
			data, 
			function(data){
				alert(data, "hello")	
			}, 
			"json");
});