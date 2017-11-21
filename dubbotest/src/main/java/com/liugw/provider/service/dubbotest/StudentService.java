package com.liugw.provider.service.dubbotest;

public interface StudentService extends UserService {

	public String getScoreByUserId(String UserId);

	public String getSexByUserId(String UserId);
}
