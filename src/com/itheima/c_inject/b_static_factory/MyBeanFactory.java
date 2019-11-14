package com.itheima.c_inject.b_static_factory;
/**
 * 静态工厂
 * @author Administrator
 *
 */
public class MyBeanFactory {
	/**
	 * 创建实例
	 * @return
	 */
	public static UserService createService() {
		return new UserServiceImpl();
	}
}
