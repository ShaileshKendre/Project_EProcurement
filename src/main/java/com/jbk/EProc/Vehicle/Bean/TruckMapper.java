package com.jbk.EProc.Vehicle.Bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//shankar

public class TruckMapper implements RowMapper<Truck> {

	@Override
	public Truck mapRow(ResultSet rs, int rowNum) throws SQLException {
		Truck truck=new Truck();
		truck.setId(Integer.parseInt(rs.getString("id")));
		truck.setTruck_No(rs.getString("Truck_No"));
		truck.setTruck_Name(rs.getString("Truck_Name"));
		truck.setTruck_Company(rs.getString("Truck_Company"));
		truck.setTruck_Owner(rs.getString("Truck_Owner"));
		truck.setDriverMoNo(rs.getString("DriverMoNo"));
		
		return truck;
	}

}
