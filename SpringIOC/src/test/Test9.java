package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;
import web.UserController;
import web.UserController2;

public class Test9 {

	/**
	 * spring �еĶ������ڵ���ģʽ
	 * @param args
	 */
	public static void main(String[] args) {
		/*User user = new User();
		System.out.println(user);*/
		
		ApplicationContext app=
				new ClassPathXmlApplicationContext("applicationContext4.xml");
		UserController2 controller = (UserController2) app.getBean("web");
		controller.web();
	}
	
	
}
