package cn.demo.call;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

import cn.demo.entity.User;

/**
 * BaseService类将公共方法进行提取
 *
 */
public class BaseCall {

	//用户编号创建器
	public static final AtomicInteger creator = new AtomicInteger(1);
	//备选生日
	public static final LocalDate[] birthdays = { 
			LocalDate.of(1988, 9, 11), 
			LocalDate.of(1989, 11, 10),
			LocalDate.of(1990, 3, 7), 
			LocalDate.of(1995, 7, 26), 
			LocalDate.of(2000, 10, 1) };
	public static final int birthdayLength = birthdays.length;

	/**
	 * 初始化用户信息(模拟请求)
	 * 
	 * @param name -- 用户名
	 * @return -- 用户信息
	 */
	public static User initUser(String name) {
		User user = new User();
		user.setUserId(creator.getAndIncrement());
		user.setName(name);
		user.setBirthday(birthdays[user.getUserId() % birthdayLength]);
		return user;
	}
}