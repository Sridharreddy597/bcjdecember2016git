<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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

<form commandName="cust" action="update/" method="PUT"  id="submitForm"   >

 Id:<br>
 <input type="text" class="form-control" name="id"  id="id" required>
  <br>



  First name:<br>
 <input type="text" class="form-control" name="firstName"  id="firstName" required>
  <br>
  Last name:<br>
  <input type="text" class="form-control" name="lastName"  id ="lastName" required>
  <br><br>
  <input type="submit"  value="Submit">
</form> 
<div id ="result"></div>

</div>
<script>
 $(document).ready(function() {
 
		$('#submitForm').submit(function(e) {
			var frm = $('#submitForm');
			e.preventDefault();
			var id1 = $('#id').val();
 
		    var data = {}
		    var Form = this;
 
		    //Gather Data also remove undefined keys(buttons)
		    $.each(this, function(i, v){
		            var input = $(v);
		        data[input.attr("name")] = input.val();
		        delete data["undefined"];
		    }); 
        $.ajax({
            contentType : 'application/json; charset=utf-8',
            type: frm.attr('method'),
            url: frm.attr('action')+id1,
            dataType : 'json',
            data : JSON.stringify(data),
           success : function(customer) {
             $("#result").append('<li>     id : '+ customer.id+ ',   firstname : '+ customer.firstName+ ', lastName : '+ customer.lastName+ '</li>');
          
          } /*   alert("Data: " +  customer.firstName + "\nStatus: " + customer.lastName ); } */
           
	/* 	$.each(customers,function(i,customerdata) {
		$("#result").append('<li> firstname : '+ customer.firstName+ ', lastName : '+ customer.lastName+ '</li>');
					});
				} */,
            error : function(){
                $(this).text("Error!");
            }
        });
		});
	});
 
 
 
  /* $(document).ready(function() { 
		$('#submitForm').on('click' , function() {
			var customer = { 
		firstName :	$('#firstName').val();
		lastName : $('#lastName').val();
		};
		
		
		 $.ajax({
            contentType : 'application/json; charset=utf-8',
            type: frm.attr('method'),
            url: frm.attr('action'),
            dataType : 'json',
            data : customer ,
           sucess : function(newcustomer) {
           $customers.append('<li> firstname : '+ newcustomer.firstName+ ', lastName : '+ newcustomer.lastName+ '</li>');
					}
					});
				});
			}); */
		

</script>
</body>
</html>