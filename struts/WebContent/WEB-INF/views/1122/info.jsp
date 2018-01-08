<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
    <h2>${sessionScope.memId}님 회원정보</h2>
    <h3>id=>> ${dto.id}</h3>
    <h3>pw=>> ${dto.pw}</h3>
    <h3>age=>> ${dto.age}</h3>
    <h3>name=>> ${dto.name}</h3>
    <h3><img src="/struts/save/${dto.image }"></h3>
    <form action="modifyForm.action" method="post">
    <input type="submit" value="회원정보 수정"/>
    </form>

    