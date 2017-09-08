package spring1_hello;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App2_bean {
	@Test
	public void testName() throws Exception {
		//得到IOC容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring1_hello/applicationContext.xml");
		System.out.println("容器创建");
		//从容器中获取bean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println("对象创建");
	}
}
