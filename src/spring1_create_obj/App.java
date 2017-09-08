package spring1_create_obj;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@Test
	public void testIOC() throws Exception {
		ApplicationContext ac =new ClassPathXmlApplicationContext("spring1_create_obj/bean.xml");
		User user = (User) ac.getBean("user5");
		System.out.println(user.getId()+user.getName());
	}
}
