package com.liugw.provider.service.dubbotest;

import com.liugw.provider.service.pojo.UserInfo;

public interface UserService {

	public UserInfo getUserbyId(int userId);

	public void addUser(UserInfo user);
}
