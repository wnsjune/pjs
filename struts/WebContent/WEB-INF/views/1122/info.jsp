<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
    <h2>${sessionScope.memId}�� ȸ������</h2>
    <h3>id=>> ${dto.id}</h3>
    <h3>pw=>> ${dto.pw}</h3>
    <h3>age=>> ${dto.age}</h3>
    <h3>name=>> ${dto.name}</h3>
    <h3><img src="/struts/save/${dto.image }"></h3>
    <form action="modifyForm.action" method="post">
    <input type="submit" value="ȸ������ ����"/>
    </form>

    