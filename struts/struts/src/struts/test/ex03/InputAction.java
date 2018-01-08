package struts.test.ex03;

import java.io.File;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import struts.test.interceptor.MemberDAOAware;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;


public class InputAction implements MemberDAOAware,Preparable,ModelDriven,ServletRequestAware {
	private MemberDAO dao=null;
	private MemberDTO dto=null;
	private File save=null, copy=null;
	private String saveFileName,saveContentType;
	private HttpServletRequest request=null;
	
	public void setServletRequest(HttpServletRequest arg0) {this.request=arg0;}
	public Object getModel() {return dto;}
	public void prepare() throws Exception{dto=new MemberDTO();}
	public void setMember(MemberDAO dao) {this.dao=dao;}
	@Override
	public void setMemberDAO(MemberDAO dao) {
		this.dao=dao;
		
	}
	
	
	
	public void setSave(File save) {this.save = save;}
	public void setSaveFileName(String saveFileName) {this.saveFileName = saveFileName;}
	public void setSaveContentType(String saveContentType) {this.saveContentType = saveContentType;}
	
	public String form() {
		return "success";
	}
	public String execute() throws Exception {
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
		
		dao.insertMember(dto);
		
		
		return "success";
	}




}
