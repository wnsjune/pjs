<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <h2>  hot/cold 페이지!!!!!!</h2>
    <form action="number.action" method="post">
    <c:if test= "${ColdBrew!=null}">
     ${ColdBrew}
       HOT<input type="radio" name="ColdBrew" value="ColdBrew(5000) HOT">
	   COlD<input type="radio" name="ColdBrew" value="ColdBrew(5000) COLD">
	  </c:if>
	  
     <br>
     <c:if test= "${Americano!=null}">
     ${Americano}
       HOT<input type="radio" name="Americano" value="Americano(2000) HOT">
	   COlD<input type="radio" name="Americano" value="Americano(2000) COLD">
	  </c:if>
	 
     <br>
     <c:if test= "${Frappuccino!=null}">
     ${Frappuccino}
	   COlD<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD">
	  </c:if>
	  <br>
	  <input type="submit" value="다음"/>
     
     </form>