package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Vehicles;

public interface VehicleService {
	public String addVehicle(String veh, int maxload);
	
	public List<Vehicles> getAllVehicles();

	public Vehicles getVehicle(String veh);
	
	public String addToVehicle(String veh, int loadtoadd);
	
	public String reduceLoadBy(String veh, int loadtoreduce);
	
	public int getLoadedWt(String veh);
	
	public int getMaxLoad(String veh);
}
