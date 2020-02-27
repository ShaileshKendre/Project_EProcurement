package com.jbk.EProc.Vehicle.Service;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jbk.EProc.Vehicle.Bean.Profile;
import com.jbk.EProc.Vehicle.Dao.ProfileDaoImpl;
import com.jbk.EProc.Vehicle.Dao.ProfileDaoImpl;

@Service
public class ProfileServiceImpl {
	
	@Autowired
	ProfileDaoImpl profileDao;

	public Profile getProfile(String  username,String password) {
		return profileDao.getProfile(username, password);
		
	}

}
