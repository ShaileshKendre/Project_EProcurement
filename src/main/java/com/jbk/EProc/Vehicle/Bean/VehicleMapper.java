package com.jbk.EProc.Vehicle.Bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class VehicleMapper implements RowMapper<Vehicles> {

	@Override
	public Vehicles mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicleNo(rs.getString("vehicle_no"));
		vehicles.setLoadedWt(rs.getInt("loaded_wt"));
		vehicles.setMaxLoad(rs.getInt("max_load"));
		return vehicles;
	}

	

}
