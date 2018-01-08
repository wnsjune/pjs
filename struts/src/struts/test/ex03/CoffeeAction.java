package struts.test.ex03;

import com.opensymphony.xwork2.ActionSupport;

public class CoffeeAction extends ActionSupport {
	public String execute() {return "success";}
	
	private String ColdBrew;
	private String Americano;
	private String Frappuccino;
	
	public String getColdBrew() {
		return ColdBrew;
	}
	public void setColdBrew(String coldBrew) {
		ColdBrew = coldBrew;
	}
	public String getAmericano() {
		return Americano;
	}
	public void setAmericano(String americano) {
		Americano = americano;
	}
	public String getFrappuccino() {
		return Frappuccino;
	}
	public void setFrappuccino(String frappuccino) {
		Frappuccino = frappuccino;
	}
	
	
	

}
