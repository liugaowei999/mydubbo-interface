package com.liugw.provider.service.dubbotest;

import com.liugw.provider.service.pojo.Student;

public interface StudentService {

	public String getScoreByUserId3(String UserId);


	public String getSexByUserId10(String UserId);

	public Student getUserbyId1(String userId);
	
	 if(v_module_id='1') then
    SETL_CITY_STAT(bill_month);
    SETL_CITY_DAILY(bill_month);
    SETL_CITY_DETAIL(bill_month);
    /*SETL_PROV_DETAIL(bill_month);
    SETL_PROV_DAILY(bill_month);
    --- SETL_PROV_STAT must be execute last. depended the daily date
    SETL_PROV_STAT(bill_month);*/
  end if;

	public void addUser1(Student user);


	public String getUserNamebyId(String userId);

	
	 if(v_module_id='1') then
    SETL_CITY_STAT(bill_month);
    SETL_CITY_DAILY(bill_month);
    SETL_CITY_DETAIL(bill_month);
    /*SETL_PROV_DETAIL(bill_month);
    SETL_PROV_DAILY(bill_month);
    --- SETL_PROV_STAT must be execute last. depended the daily date
    SETL_PROV_STAT(bill_month);*/
  end if;
}
