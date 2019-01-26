package com.liugw.provider.service.dubbotest;

import com.liugw.provider.service.pojo.Student;

public interface StudentService {

	public String getScoreByUserId2(String UserId);

	public String getSexByUserId(String UserId);

	public Student getUserbyId(String userId);

	public void addUser(Student user);

	public String getUserNamebyId(String userId);
}
