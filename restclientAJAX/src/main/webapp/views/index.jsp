<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<button type="button" id="post" class="btn btn-primary btn-md">post</button>
			<div id="div1"></div>
			<br>
		</div>
		<div>
			<button type="button" id="get" class="btn btn-primary btn-md">get</button>
			<div id="div2"></div>
			<br>
		</div>
			<br><br>
		<div>
			<button type="button" id="put" class="btn btn-primary btn-md">update</button>
			<div id="div3"></div>
			<br>
		</div>
		<br><br>
		<div>
			<button type="button" id="del" class="btn btn-primary btn-md">delete</button>
			<div id="div4"></div>
			<br>
		</div>
		
	</div>



	<script>

 $(document).ready(function () {
    $("#post").on('click', function(){
        $('#div1').load('postfrm');
        
    });
});

$(document).ready(function () {
    $("#get").on('click',function(){
        $('#div2').load('getfrm');
        
    });
});


$(document).ready(function () {
    $("#put").on('click',function(){
        $('#div3').load('putfrm');
        
    });
});

$(document).ready(function () {
    $("#del").on('click',function(){
        $('#div4').load('delfrm');
        
    });
});




</script>



</body>
</html>