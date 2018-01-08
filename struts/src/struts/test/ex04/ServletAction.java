package struts.test.ex04;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
public class ServletAction implements ServletRequestAware{
	private HttpServletRequest request = null;
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}
	public String execute() {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		session.setAttribute("memId",id);
		return "success";
	}
}






