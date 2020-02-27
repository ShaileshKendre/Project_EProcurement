package com.jbk.EProc.Vehicle.Bean;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProfileMapper implements RowMapper<Profile> {

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profile profile= new Profile();
		profile.setpId(rs.getInt(1));
		profile.setFirstName(rs.getString(2));
		profile.setLastName(rs.getString(3));
		profile.setEmail(rs.getString(4));
		profile.setMobile(rs.getLong(5));
		profile.setAddress(rs.getString(6));
		profile.setUsername(rs.getString(7));
		profile.setPassword(rs.getString(8));
		
		return profile;
	}

}
