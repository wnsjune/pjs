package struts.test.ex02;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SumAction implements Action, Preparable, ModelDriven {
	//������ ������Ʈ
	NumberForAdd num;
	private int sum=0;
	public String execute() throws Exception{
		SumDAO dao =new SumDAO();
		sum= dao.add(num);
		return "success";
	}
	
	//Preparable�������̽��� prepare ����
	public void prepare() throws Exception{
		num=new NumberForAdd();
	}
	//ModelDriven �������̽��� getModel ����
	public Object getModel() {
		return num;
	}
	 //result.jsp ���� sum ���� ������Ű�� ����
	public int getSum() {
		return sum;
	}

public String pp() {
	
	return "success";
}
	

}
