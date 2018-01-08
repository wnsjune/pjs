package struts.test.ex02;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HelloInter implements Interceptor {


	public void destroy() {}   //종료될때 실행 -하지만 동작하지 않는다.

	
	public void init() { //서버 실행시 최초 1회만 실행
		System.out.println("init");
	}

	
	public String intercept(ActionInvocation arg0) throws Exception {  //인턴셉터를 사용할때마다
		Object obj=arg0.getAction();
		if(obj instanceof Addface) {  //다형성을 활용한 코드
			Addface af=(Addface)obj;
			af.add();
		}else{
			System.out.println("실행 오류");
		}
		return arg0.invoke();
	}
	

}
