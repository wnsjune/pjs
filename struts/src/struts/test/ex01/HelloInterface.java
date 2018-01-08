package struts.test.ex01;

import com.opensymphony.xwork2.Action;

public class HelloInterface implements Action {

	
	public String execute() {
		System.out.println("Action Interface");
		return SUCCESS;
		
	}
}
