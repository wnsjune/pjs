<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test= "${result == 1 }">
  <h2>�α��� ����</h2>
  <h2>${sessionScope.memId}���� �α��� �ϼ̽��ϴ�.!</h2>
  <input type="button" value="����Ȯ��" onclick="window.location='info.action'"/>
    <input type="button" value="Ż��" onclick="window.location='delete.action'"/>
  
</c:if>
<c:if test= "${result == 0 }">
  <h2>�α��� ����</h2>
</c:if>