package test;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;

public class Test7 {

	/**
	 * spring �еĶ������ڵ���ģʽ
	 * 
	 * xml�ļ���Ŀ������ʱ����أ�����������ʱ�� ������ر�
	 * @param args
	 */
	public static void main(String[] args) {
		/*User user = new User();
		System.out.println(user);*/
		
		ApplicationContext app=
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		User user2 = (User) app.getBean("user3");
		System.out.println(user2.getAa());
	}
		
}
