<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<h2> ������ ����</h2>
<form action="takeout.action" method="post">
    <c:if test= "${ColdBrew!=null}">
     ${ColdBrew}
       1��<input type="radio" name="ColdBrew" value="1��">
	   2��<input type="radio" name="ColdBrew" value="2��">
	   3��<input type="radio" name="ColdBrew" value="3��">
	   4��<input type="radio" name="ColdBrew" value="4��">
	  </c:if>
	  
     <br>
   
     <c:if test= "${Americano!=null}">   
     ${Americano}
       1��<input type="radio" name="Americano" value="1��">
	   2��<input type="radio" name="Americano" value="2��">
	   3��<input type="radio" name="Americano" value="3��">
	   4��<input type="radio" name="Americano" value="4��">
	  </c:if>
	 
     <br>

     <c:if test= "${Frappuccino!=null}">
     ${Frappuccino}
	   1��<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1��">
	   2��<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1��">
	   3��<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1��">
	   4��<input type="radio" name="Frappuccino" value="Frappuccino(6000) COLD 1��">
	  </c:if>
	  <br>
	  <input type="submit" value="����"/>
     
     </form>