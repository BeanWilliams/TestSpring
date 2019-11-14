package com.itheima.c_inject.c_factory;
/**
 * 实例工厂
 * @author Administrator
 *
 */
public class MyBeanFactory {
	/**
	 * 创建实例
	 * @return
	 */
	public UserService createService() {
		return new UserServiceImpl();
	}
}
