package cn.demo.call;

import cn.demo.context.BaseUserContext;
import cn.demo.context.UserContext1;
import cn.demo.service.UserService;

public class CallService1 extends BaseCall {
	public static void main(String[] args) {
		BaseUserContext userContext = new UserContext1();
		UserService userService = new UserService(userContext);
		//同时10个调用
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				userContext.set(initUser(Thread.currentThread().getName()));
				//进行调用
				userService.addUser();
			}, "CallService1-" + i).start();
		}
	}

}