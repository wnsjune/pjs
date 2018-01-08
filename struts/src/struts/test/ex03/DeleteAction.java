package struts.test.ex03;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import struts.test.interceptor.MemberDAOAware;

public class DeleteAction implements MemberDAOAware, ServletRequestAware {
	private HttpServletRequest request=null;
	private MemberDAO dao=null;
	public String execute() {
		//DAO�� Ȱ���� ID����
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("memId"); //id�� �޾ƿ´�
		String image=dao.memberDelete(id);
		
		// �ش� �̹��� ���� ����
		String contextPath=request.getRealPath("save");
		File f=new File(contextPath+"//"+image);
		f.delete();
		
		//���� ����,�α׾ƿ�
		session.invalidate();
		return "success";
	}


	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}


	public void setMemberDAO(MemberDAO dao) {
		this.dao=dao;
		
	}

}
