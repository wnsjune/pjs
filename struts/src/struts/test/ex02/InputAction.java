package struts.test.ex02;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InputAction implements Preparable, ModelDriven  {
	public void add() {
	
	}
	private DTO dto=null;
	public void prepare() throws Exception{
		dto=new DTO();
		
	}
	public Object getModel() {
		return dto;
	}
	
	public String form() {
		System.out.println("execute");
		return "success";
		}
	
	public String execute() {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getAge());
		System.out.println(dto.getName());
		return "success";
	}

}
