package cn.demo.entity;

import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private Integer userId;
	private String name;
	private LocalDate birthday;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birthday=" + birthday + "]";
	}
}