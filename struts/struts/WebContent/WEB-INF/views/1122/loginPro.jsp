<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test= "${result == true }">
  <h2>�α��� ����</h2>
</c:if>
<c:if test= "${result == false }">
  <h2>�α��� ����</h2>
</c:if>