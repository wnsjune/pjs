package struts.test.ex02;

public class SumDAO {
	public int add(NumberForAdd num) {
		return num.getNum1() + num.getNum2();
	}
   
}
