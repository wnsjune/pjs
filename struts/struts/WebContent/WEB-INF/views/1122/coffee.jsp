<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<title>coffee</title>
</head>
<body>
       <form action="hotcold.action" method="post">
           ColdBrew(5000) <input type="checkbox" name="ColdBrew" value="ColdBrew(5000)">	
		   Americano(2000)<input type="checkbox" name="Americano" value="Americano(2000)"> 
		   Frappuccino(6000)<input type="checkbox" name="Frappuccino" value="Frappuccino(6000)">
		   <br>
		   <input type="submit" value="다음"/> 
       </form>



</body>
</html>