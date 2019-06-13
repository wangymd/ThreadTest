package cn.demo.service;

import cn.demo.context.BaseUserContext;

public class UserService {

	private BaseUserContext userContext;

	public UserService(BaseUserContext userContext) {
		this.userContext = userContext;
	}

	/**
	 * 执行添加用户
	 */
	public void addUser() {
		System.out.println(Thread.currentThread().getName() + "添加用户信息:" + userContext.get());
	}
}