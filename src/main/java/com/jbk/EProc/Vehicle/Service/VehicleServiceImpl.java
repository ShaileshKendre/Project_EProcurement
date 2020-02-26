package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.EProc.Vehicle.Bean.Truck;
import com.jbk.EProc.Vehicle.Bean.Vehicles;
import com.jbk.EProc.Vehicle.Dao.VehicleDao;
import com.jbk.EProc.Vehicle.Dao.VehicleDaoImpl;


@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao vehicleDao;

	public String addVehicle(String veh, int maxload) {

		return vehicleDao.addVehicle(veh, maxload);

	}

	public List<Vehicles> getAllVehicles() {

		return vehicleDao.getAllVehicles();

	}

	public Vehicles getVehicle(String veh) {

		return vehicleDao.getVehicle(veh);

	}

	@SuppressWarnings("static-access")
	public String addToVehicle(String veh, int loadtoadd) {
		int maxload = getMaxLoad(veh);
		int presentload = getLoadedWt(veh);
		return loadVehicle(veh, loadtoadd, maxload, presentload);

	}

	private String loadVehicle(String veh, int loadtoadd, int maxload, int presentload) {
		if ((loadtoadd + presentload) > maxload) {
			return "Vehicle Overloading; you can add only upto=" + (maxload - presentload) + "Units";
		} else {
			return vehicleDao.loadVehicle(veh, loadtoadd);
		}
	}

	public String reduceLoadBy(String veh, int loadtoreduce) {

		return vehicleDao.reduceLoadBy(veh, loadtoreduce);

	}

	public int getLoadedWt(String veh) {
		int presentload = getVehicle(veh).getLoadedWt();
		return presentload;
	}

	public int getMaxLoad(String veh) {
		int maxload = getVehicle(veh).getMaxLoad();
		return maxload;
	}
	
	//shankar
	public List<Truck> fetchAllTruck() {
		
		 return vehicleDao.fetchAllTruck();
		}

}
