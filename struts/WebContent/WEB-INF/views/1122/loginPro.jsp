<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test= "${result == 1 }">
  <h2>로그인 성공</h2>
  <h2>${sessionScope.memId}님이 로그인 하셨습니다.!</h2>
  <input type="button" value="정보확인" onclick="window.location='info.action'"/>
    <input type="button" value="탈퇴" onclick="window.location='delete.action'"/>
  
</c:if>
<c:if test= "${result == 0 }">
  <h2>로그인 실패</h2>
</c:if>