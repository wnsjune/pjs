package struts.test.ex02;

public class TestAction implements Addface {
	public void add() {
		System.out.println("add");
	}
	public String execute() {
		
		System.out.println("execute");
		return "success";
		
	}

}
