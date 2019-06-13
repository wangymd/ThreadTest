package cn.demo.context;

import com.alibaba.ttl.TransmittableThreadLocal;

import cn.demo.entity.User;

public class UserContext4 extends BaseUserContext {
	
	public UserContext4() {
		//3、提供的无侵入式实现
		this.context = new TransmittableThreadLocal<User>();
	}
}