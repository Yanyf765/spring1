package spring1_hello;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App2_bean {
	@Test
	public void testName() throws Exception {
		//�õ�IOC��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring1_hello/applicationContext.xml");
		System.out.println("��������");
		//�������л�ȡbean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println("���󴴽�");
	}
}
