package struts.test.ex02;

import java.sql.Timestamp;

public class DTO {
   private String id;
   private String pw;
   private int age;
   private String name;
   private Timestamp reg_date;
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Timestamp getReg_date() {
	return reg_date;
}
public void setReg_date(Timestamp reg_date) {
	this.reg_date = reg_date;
}
   
}
