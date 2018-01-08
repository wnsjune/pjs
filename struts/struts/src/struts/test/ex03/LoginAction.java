package struts.test.ex03;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import struts.test.interceptor.MemberDAOAware;

public class LoginAction implements Preparable,ModelDriven,MemberDAOAware {
	private MemberDTO dto=null;
	private MemberDAO dao=null;
	private boolean result=false;
	
	public void prepare() throws Exception{
		dto= new MemberDTO();
	}
	
	public Object getModel() {return dto;}
	public String form() {return "success";}
	
	public String execute() {
		
		result=dao.loginCheck(dto);
		return "success";
	}
	
	public boolean getResult() {return result;}

	@Override
	public void setMemberDAO(MemberDAO dao) {
		// TODO Auto-generated method stub
		this.dao=dao;
		
	}
   
}
