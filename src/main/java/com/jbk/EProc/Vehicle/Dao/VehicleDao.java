package com.jbk.EProc.Vehicle.Dao;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Truck;
import com.jbk.EProc.Vehicle.Bean.Vehicles;

public interface VehicleDao {
	public String addVehicle(String veh, int maxload);

	public List<Vehicles> getAllVehicles();

	public String loadVehicle(String veh, int loadtoadd);

	public Vehicles getVehicle(String veh);

	public String reduceLoadBy(String veh, int loadtoreduce);

	//shankar
	public List<Truck> fetchAllTruck();
	
}