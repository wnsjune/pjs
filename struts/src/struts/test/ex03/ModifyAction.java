package struts.test.ex03;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import struts.test.interceptor.MemberDAOAware;

public class ModifyAction implements MemberDAOAware,Preparable, ModelDriven, ServletRequestAware {
	private MemberDAO dao=null;
	private MemberDTO dto=null;
	
	private File save=null, copy=null;
	private String saveFileName,saveContentType;
	private HttpServletRequest request= null;
	
	public void setServletRequest(HttpServletRequest arg0) {this.request=arg0;}
	public MemberDTO getDto() {return dto;}
	public Object getModel() {return dto;}
	public void prepare() throws Exception{dto=new MemberDTO();}
	public void setMemberDAO(MemberDAO dao) {this.dao=dao;}	
	
	public String form() {
		HttpSession session =request.getSession();
		String id= (String)session.getAttribute("memId");
		dto=dao.memberInfo(id);
		return "success";
	
		
	}
	public void setSave(File save) {this.save = save;}
	public void setSaveFileName(String saveFileName) {this.saveFileName = saveFileName;}
	public void setSaveContentType(String saveContentType) {this.saveContentType = saveContentType;}


	
    
	public String execute() throws Exception{
		String savePath= request.getRealPath("save");
		String id =dto.getId();
		int index=saveFileName.lastIndexOf(".");   //test.jpg
		String fn=saveFileName.substring(index);   //»Æ¿Â¿⁄
		
		System.out.println(savePath+"//"+id+fn);
		copy=new File(savePath+"//"+id+fn);
		
		String [] types=saveContentType.split("/");
		if(types[0].equals("image")) {
			FileUtils.copyFile(save, copy);;
		}
		dto.setImage(id+fn);
		
		dao.modifyMember(dto);
		
		return "success";
		
	}
	

}
