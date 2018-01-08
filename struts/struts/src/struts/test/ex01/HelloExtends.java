package struts.test.ex01;

import com.opensymphony.xwork2.ActionSupport;

public class HelloExtends extends ActionSupport {
	
	public void validate() {
		System.out.println("validate");
		
	}
	
	public String execute() {
		System.out.println("execute");
		return SUCCESS;
	}

}
