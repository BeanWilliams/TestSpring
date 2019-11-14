package com.itheima.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
	
	@Test   //@Test 是测试入口，类似main方法，通过Junit4jar包引入实现
	public void demo01() {
		//之前开发
		UserService userService = new UserServiceImpl();
		userService.addUser();
		
	}
	
	@Test   //@Test 是测试入口，类似main方法，通过Junit4jar包引入实现
	public void demo02() {
		//从spring容器获得
		//1.获得容器
		String xmlPath = "com/itheima/a_ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2.获得内容 -- 不需要自己new，都是从spring容器中获得
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
		
	}
}
