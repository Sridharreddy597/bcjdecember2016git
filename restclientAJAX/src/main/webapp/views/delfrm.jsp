<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<div>

	<form commandName="cust" action="delfrm" method="DELETE" id="submitdelForm"><br>
		ID :<br> <input type="text" class="form-control" name="id" id="id"
			placeholder="enter customer id " required> <br><br>
			 <input	type="submit" value="Submit">
	</form>
	<div  id="result3"> </div>
</div>

	<script>
	
		$(document).ready(function() {
		$('#submitdelForm').submit(function(e) {
		e.preventDefault();
		var id1 = $('#id').val();
		console.log(id1);
		$.ajax({contentType : 'application/json; charset=utf-8',
		type : 'DELETE',
		url : '/restclient/delfrm/'+id1,
		success : function() {
		
	  $("#result3").append(id1+"  deleted successfully  \n");

       
				},
				error : function() {
							$('#result3').text("Error!");
						}
			});
		});
	}); 
 
		/* 
			 $(document).ready(function() {

				$('#submitGetForm').submit(function(e) {
				
					var frm = $('#submitGetForm');
					e.preventDefault();

					var data = {}
					var Form = this;

					//Gather Data also remove undefined keys(buttons)
					$.each(this, function(i, v) {
						var input = $(v);
						
						data[input.attr("name")] = input.val();
						delete data["undefined"];
					});
					$.ajax({
						contentType : 'application/json; charset=utf-8',
						type : frm.attr('method'),
						url : frm.attr('action'),
						success : function(data) {
							$("#div2").html('');
							var div2Content = '';
							for (var i = 0; i < data.length; i++) {
								div2Content += '<p>' + data[i].Name + '</p>'; // if Name is property of your Person object
							}
							$("#div2").append(div2Content);
						},
						error : function() {
							$(this).text("Error!");
						}
					});
				});
			}); */
	</script>

</body>
</html>