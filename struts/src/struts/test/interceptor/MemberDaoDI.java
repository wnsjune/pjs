package struts.test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import struts.test.ex03.MemberDAO;

public class MemberDaoDI implements Interceptor {
	private MemberDAO dao =null;
	
	public void destroy() {
		// TODO Auto-generated method stub		
	}

	public void init() {
		dao=new MemberDAO();
	}
	
	public String intercept(ActionInvocation arg0) throws Exception{
	   Object obj=arg0.getAction(); //목적지 Action  클래스 객체
	   if(obj instanceof MemberDAOAware) {
		   MemberDAOAware md=(MemberDAOAware)obj;
		   md.setMemberDAO(dao);
	   }
		return arg0.invoke();
	}

}
