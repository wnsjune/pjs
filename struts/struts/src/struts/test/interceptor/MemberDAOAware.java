package struts.test.interceptor;

import struts.test.ex03.MemberDAO;

public interface MemberDAOAware {
	public abstract void setMemberDAO(MemberDAO dao);

}
