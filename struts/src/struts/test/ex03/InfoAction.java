package struts.test.ex03;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;


import struts.test.interceptor.IbatisAware;
import struts.test.interceptor.MemberDAOAware;

public class InfoAction implements IbatisAware, ServletRequestAware {
	//private MemberDAO dao=null;
	private SqlMapClient sqlMap=null;
	private MemberDTO dto=null;
	private HttpServletRequest request= null;
	//private List<MemberDTO> list = new ArrayList<MemberDTO>();

	/*public void setMemberDAO(MemberDAO dao) {
	
		this.dao=dao;
		
	}
	*/
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}
	

	public String execute() {
		//HttpSession session =request.getSession();
		//String id= (String)session.getAttribute("memId");
		//dto=dao.memberInfo(id);
		
		HttpSession session= (HttpSession)request.getSession();
		String id= (String)session.getAttribute("memId");
		//dto=(MemberDTO)sqlMap.queryForList("memberInfo",id);
		
		return "success";
		
	}
	
	public MemberDTO getDto() {return dto;}

	@Override
	public void setIbatis(SqlMapClient sqlmap) {
		// TODO Auto-generated method stub
		this.sqlMap=sqlmap;
	}


}
