package com.jbk.EProc.Vehicle.Dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jbk.EProc.Vehicle.Bean.Truck;
import com.jbk.EProc.Vehicle.Bean.TruckMapper;
import com.jbk.EProc.Vehicle.Bean.VehicleMapper;
import com.jbk.EProc.Vehicle.Bean.Vehicles;


@Repository
public class VehicleDaoImpl implements VehicleDao {

	private static final String SET_LOADED_WT = "update vehicles set loaded_wt=? where vehicle_no=?";
	private static final String GET_ALL_VEHICLES_LIST = "select * from vehicles ";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String addVehicle(String veh, int maxload) {
		String sql = "insert into vehicles(vehicle_no,max_load) values('" + veh + "','" + maxload + "')";
		jdbcTemplate.execute(sql);
		return "Vehicle Added Successfully..!!";

	}

	public List<Vehicles> getAllVehicles() {
		List<Vehicles> vehicles = jdbcTemplate.query(GET_ALL_VEHICLES_LIST, new VehicleMapper());
		Iterator<Vehicles> itr = vehicles.iterator();
		return vehicles;
	}

	public String loadVehicle(String veh, int loadtoadd) {
		int presentload = getVehicle(veh).getLoadedWt();
		jdbcTemplate.update(SET_LOADED_WT, (loadtoadd + presentload), veh);
		return "Vehicle Loaded Successfully...!";

	}

	public Vehicles getVehicle(String veh) {
		String sql = "select * from vehicles where vehicle_no='" + veh + "'";
		Vehicles vehicle = jdbcTemplate.queryForObject(sql, new VehicleMapper());
		return vehicle;

	}

	public String reduceLoadBy(String veh, int loadtoreduce) {
		int presentload = getVehicle(veh).getLoadedWt();
		jdbcTemplate.update(SET_LOADED_WT, (presentload - loadtoreduce), veh);
		return "Load Reduced Successfully...!";

	}
	
	    //shankar
	public List<Truck> fetchAllTruck() {
		// TODO Auto-generated method stub
		 String query = "select * from trucks_list";
			return (List<Truck>)jdbcTemplate.query(query,new TruckMapper());
	}

}
