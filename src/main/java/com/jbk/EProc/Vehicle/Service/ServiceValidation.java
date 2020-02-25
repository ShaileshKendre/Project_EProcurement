package com.jbk.EProc.Vehicle.Service;

import org.springframework.stereotype.Component;

import com.jbk.EProc.Vehicle.Bean.Vehicles;

@Component		
public class ServiceValidation {

	public boolean checkOverload(String veh, int loadtoadd, Vehicles vehicles) {
System.out.println("in ServiceValidation layer");
		int maxload = vehicles.getMaxLoad();
		int presentload = vehicles.getLoadedWt();
		if ((loadtoadd + presentload) > maxload) {
			return true;
		} else {
			return false;
		}

	}
	
	
}
