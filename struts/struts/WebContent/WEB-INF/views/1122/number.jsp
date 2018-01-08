<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<h2> 鯵呪研 識澱</h2>
<form action="takeout.action" method="post">
    <c:if test= "${ColdBrew!=null}">
     ${ColdBrew}
       1接<input type="radio" name="ColdBrew" value="1接">
	   2接<input type="radio" name="ColdBrew" value="2接">
	   3接<input type="radio" name="ColdBrew" value="3接">
	   4接<input type="radio" name="ColdBrew" value="4接">
	  </c:if>
	  
     <br>
   
     <c:if test= "${Americano!=null}">   
     ${Americano}
       1接<input type="radio" name="Americano" value="1接">
	   2接<input type="radio" name="Americano" value="2接">
	   3接<input type="radio" name="Americano" value="3接">
	   4接<input type="radio" name="Americano" value="4接">
	  </c:if>
	 
     <br>

     <c:if test= "${Frappuccino!=null}">
     ${Frappuccino}
	   1接<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1接">
	   2接<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1接">
	   3接<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1接">
	   4接<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1接">
	  </c:if>
	  <br>
	  <input type="submit" value="陥製"/>
     
     </form>