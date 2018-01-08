package struts.test.ex03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import struts.test.interceptor.IbatisAware;
import struts.test.interceptor.MemberDAOAware;

public class LoginAction implements Preparable, ModelDriven, IbatisAware, ServletRequestAware {
	private HttpServletRequest request=null;
	private SqlMapClient sqlMap=null;
	
	private MemberDTO dto=null;
	
	private int result=0;
	
	public void prepare() throws Exception{
		dto= new MemberDTO();
	}
	
	public Object getModel() {return dto;}
	public String form() {return "success";}
	
	public String execute() throws Exception {
		
		result=(Integer)sqlMap.queryForObject("loginCheck",dto);
		if(result==1) {
			HttpSession session= (HttpSession)request.getSession();
			session.setAttribute("memId", dto.getId());
		}
		return "success";
	}
	
	public int getResult() {return result;}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
		
	}

	@Override
	public void setIbatis(SqlMapClient sqlmap) {
		// TODO Auto-generated method stub
		this.sqlMap=sqlmap;
		
	}
   
}
