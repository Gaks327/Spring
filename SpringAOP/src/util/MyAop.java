package util;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyAop implements MethodBeforeAdvice{

	@Override//ǰ����ǿ
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println(arg0.getName());//������
		System.out.println(arg1[0]);//�����б�Ĳ���ֵ
		System.out.println(arg2.toString());//����ǿ��Ķ���
		
	}
	
	
	

}
