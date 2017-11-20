package com.liugw.provider.service.pojo;

public class UserInfo {

	private String userName;
	private String UserId;
	private int age;
	private float salary;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserName:" + userName + ", age=" + age + ", UserId=" + UserId + ",salary=" + salary;
	}

}
