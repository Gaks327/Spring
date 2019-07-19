package test;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;

public class Test4 {

	/**
	 * spring �еĶ������ڵ���ģʽ
	 * 
	 * xml�ļ���Ŀ������ʱ����أ�����������ʱ�� ������ر�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * User user = new User(); System.out.println(user);
		 */

		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext2.xml");
		User user2 = (User) app.getBean("user1");
		
		System.out.println(user2.getV());
		
		for (String string : user2.getList()) {
			System.out.println(string);
		}

		Iterator<String> iterator = user2.getSet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println(user2.getMap().get("1"));
	}

}
