package spring1_hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App1_get {
	//ͨ�������õ�IOC���������Ķ���
	@Test
	public void testIOC() throws Exception {
		//�������� �Ѷ���Ĵ�������spring��IOC����
		Resource resource = new ClassPathResource("spring1_hello/applicationContext.xml");
		// ������������(Bean�Ĺ���), IOC���� = ������ + applicationContext.xml
		BeanFactory bf = new XmlBeanFactory(resource);
		// �õ����������Ķ���
		User user = (User) bf.getBean("user");
		System.out.println(user.getId());
	}
	//2. �����㣩ֱ�ӵõ�IOC��������
	@Test
	public void testAc() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring1_hello/applicationContext.xml");
		User user= (User) ac.getBean("user");
		System.out.println(user.getId());
	}
}
