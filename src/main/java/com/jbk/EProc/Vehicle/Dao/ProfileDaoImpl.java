package com.jbk.EProc.Vehicle.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jbk.EProc.Vehicle.Bean.Profile;
import com.jbk.EProc.Vehicle.Bean.ProfileMapper;
import com.jbk.EProc.Vehicle.Service.LoginException;

@Repository
public class ProfileDaoImpl {
	@Autowired
	public   JdbcTemplate jdbcTemplate;
	
	//private final static String GET_PROFILE="select from profile where username=? and password=?";


	
	
	
	public Profile getProfile(String  username,String password) {
		if (checkprofile(username, password)!=null) {
			String sql="select * from profile where username='"+username+"' and password='"+password+"'";
			
		    Profile profile= jdbcTemplate.queryForObject(sql,  new ProfileMapper());
		    
		    if (profile.getUsername().equals(username)&&profile.getPassword().equals(password)) {
				return profile;
			
		    }else {
		    	throw new LoginException();
		    }
			
		
		}
		throw new LoginException();
		
		
		
		
	 }
	public Profile checkprofile(String  username,String password) {
		try {	
			String sql="select * from profile where username='"+username+"' and password='"+password+"'";
		
	         Profile profile= jdbcTemplate.queryForObject(sql,  new ProfileMapper());
	         return profile;
	    
	   
			
		} catch (Exception e) {
			return null;
		}
		
	 }

}
