package struts.test.ex01;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {
	public String execute() {
		return "success";
	}
	
	private String id;
	private String pw;
	
	public void setId(String id) {   //dto�� �޾ƿ��� ��ó�� set�� ����
		System.out.println("parameter");
		this.id=id;
		
	}
	

public String pro() {
	//System.out.println("id="+id);
	//System.out.println("pw="+pw);
	System.out.println("execute");
	return "success";
}

 public String getId() {return id;}
 //public int getNum() {return 100;}
}
