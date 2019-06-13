package cn.demo.context;

import cn.demo.entity.User;

/**
 * 基于线程上下文的用户信息管理
 */
public class BaseUserContext {

	//存储线程变量
	public ThreadLocal<User> context = null;

	/**
	 * 设置用户信息
	 * 
	 * @param user -- 用户信息
	 */
	public void set(User user) {
		context.set(user);
	}

	/**
	 * 获取用户信息
	 * 
	 * @return -- 用户信息
	 */
	public User get() {
		return context.get();
	}

	/**
	 * 移除用户信息
	 */
	public void remove() {
		context.remove();
	}
}