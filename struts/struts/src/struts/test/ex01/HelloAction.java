package struts.test.ex01;

public class HelloAction {
	
	public String execute() {
		System.out.println("execute");
		return "success";
	}
	
	public String main() {
	   System.out.println("HelloAction");	
	   return "ok";	
	}
	
		

}
