package cn.demo.call;

import cn.demo.context.BaseUserContext;
import cn.demo.context.UserContext1;
import cn.demo.service.UserService;

public class CallService2 extends BaseCall {

	public static void main(String[] args) {
		//main作为当前调用线程
		BaseUserContext userContext = new UserContext1();
		userContext.set(initUser(Thread.currentThread().getName()));
		UserService userService = new UserService(userContext);
		//开启新线程来进行调用
		new Thread(() -> userService.addUser(), "CallService2").start();
	}

}