<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css" >
.listbox{
position: relative;
left: 90px;
margin: 5px;
width: 150px;
background-color: #000;
color: #fff;
border: 2px solid #000; 
}

.nameslist{
margin: 0px;
padding: 0px;
list-style: none;
}

.hover{
background-color: cyan;
color: red;
}

</style>

<script type="text/javascript" src="js/jquery-1.9.js"></script>
<script type="text/javascript">
$(document).ready(function(){
     $('.listbox').hide();
     $('.userid').keyup(function(){
	    var user = $('.userid').val();
	    var data = 'username='+user;
	    $.ajax({
	        type:"POST",
	        url:"AutoServlet",
	        data:data,
	 		success:function(html){
	  			$('.listbox').show();
	  			$('.nameslist').html(html);
	  			$('li').hover(
	  				function(){
	  	 				 $(this).addClass('hover');
	  				},
	  				function(){
	  					 $(this).removeClass('hover');
	  				}
	  			);
	    		$('li').click(function(){
	     			 $('.userid').val($(this).text());
	     			 $('.listbox').hide();
	    		});
	 	   }	
		});
		return false;
	});
});

</script>
</head>
<body>
<form>
  <span class="label">Enter username</span>
  <input type="text" name="userid" class="userid" />
  <div class="listbox">
  	<div class="nameslist">
  	</div>
  </div>
</form>
</body>
</html>