<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h2>회원가입</h2>
<form action="inputPro.action" method="post" enctype="multipart/form-data">

id:<input type="text" name="id"/> <br />
pw:<input type="password" name="pw"/> <br />
age:<input type="text" name="age"/> <br />
name:<input type="text" name="name"/> <br />
image:<input type="file" name="save"/> <br />
      <input type="submit" value="가입"/> <br />
</form>
