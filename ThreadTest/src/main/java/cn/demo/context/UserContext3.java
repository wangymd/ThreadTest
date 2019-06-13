package cn.demo.context;

import cn.demo.entity.User;

public class UserContext3 extends BaseUserContext {
	public UserContext3() {
		//2、线程复用导致数据混乱
		this.context = new InheritableThreadLocal<User>();
	}
}