package util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AopDemo {
	public void dd() {
		System.out.println("����");
	}
	
	public void aa(JoinPoint point) {
		
	}

	public void bb() {
		System.out.println("����");
	}
	
	public void ee() {
		System.out.println("�쳣");
	}
	
	public void cc(ProceedingJoinPoint  point) {
		System.out.println("���ƿ�ʼ");
		try {
			point.proceed();//����������������
			System.out.println("���ƽ���");
			System.out.println("��������:"+point.getTarget().getClass().getName());
			System.out.println("����㷽��:"+point.getSignature().getName());
			System.out.println("��������:"+point.getArgs().length);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
