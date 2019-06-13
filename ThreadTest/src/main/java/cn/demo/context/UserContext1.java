package cn.demo.context;

import cn.demo.entity.User;

public class UserContext1 extends BaseUserContext {
	
	public UserContext1() {
		//1、线程开启新线程有缺陷
		this.context = new ThreadLocal<User>();
	}
}