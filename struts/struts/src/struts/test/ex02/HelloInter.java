package struts.test.ex02;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HelloInter implements Interceptor {


	public void destroy() {}   //����ɶ� ���� -������ �������� �ʴ´�.

	
	public void init() { //���� ����� ���� 1ȸ�� ����
		System.out.println("init");
	}

	
	public String intercept(ActionInvocation arg0) throws Exception {  //���ϼ��͸� ����Ҷ�����
		Object obj=arg0.getAction();
		if(obj instanceof Addface) {  //�������� Ȱ���� �ڵ�
			Addface af=(Addface)obj;
			af.add();
		}else{
			System.out.println("���� ����");
		}
		return arg0.invoke();
	}
	

}
