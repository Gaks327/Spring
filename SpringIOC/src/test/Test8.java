package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;
import web.UserController;

public class Test8 {

	/**
	 * spring �еĶ������ڵ���ģʽ
	 * @param args
	 */
	public static void main(String[] args) {
		/*User user = new User();
		System.out.println(user);*/
		
		ApplicationContext app=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController controller = (UserController) app.getBean("web");
		
		//controller.web();
	}
	
	
}
