package struts.test.ex04;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class MainAction implements Preparable, ModelDriven{
	private DTO dto = null;
	public Object getModel() {
		return dto;
	}
	public void prepare() throws Exception {
		dto = new DTO();
	}
	public String execute() {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		return "success";
	}
}








