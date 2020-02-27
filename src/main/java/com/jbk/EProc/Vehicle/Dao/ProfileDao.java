package com.jbk.EProc.Vehicle.Dao;

import com.jbk.EProc.Vehicle.Bean.Profile;

public interface ProfileDao {
	public Profile checkprofile(String  username,String password);
	public Profile getProfile(String  username,String password);

}
