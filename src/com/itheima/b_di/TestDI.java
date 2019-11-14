package com.itheima.b_di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestDI {
	
	@Test   //@Test 鏄祴璇曞叆鍙ｏ紝绫讳技main鏂规硶锛岄�氳繃Junit4jar鍖呭紩鍏ュ疄鐜�
	public void demo01() {
		//浠巗pring鑾峰緱
		String xmlPath = "com/itheima/b_di/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		
		bookService.addBook();
		bookService.testStu();
		bookService.addBook2();
	}

	@Test   //@Test 鏄祴璇曞叆鍙ｏ紝绫讳技main鏂规硶锛岄�氳繃Junit4jar鍖呭紩鍏ュ疄鐜�
	public void demo02() {
		//浣跨敤BeanFactory   --绗竴娆¤皟鐢╣etBean瀹炰緥鍖�
		String xmlPath = "com/itheima/b_di/beans.xml";	
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
		
		BookService bookService = (BookService) beanFactory.getBean("bookServiceId");
		
		bookService.addBook();
		bookService.testStu();
		bookService.addBook2();
	}
	
}
