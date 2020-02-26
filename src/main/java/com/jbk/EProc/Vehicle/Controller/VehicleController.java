package com.jbk.EProc.Vehicle.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.EProc.Vehicle.Bean.Truck;
import com.jbk.EProc.Vehicle.Bean.Vehicles;
import com.jbk.EProc.Vehicle.Service.VehicleServiceImpl;


@CrossOrigin
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleServiceImpl vehicleService;
	

	@PostMapping(value = "/addvehicle/{veh}/{maxload}")
	public ResponseEntity<String> addVehicle(@Valid @PathVariable("veh") String veh,
			@PathVariable("maxload") int maxload, BindingResult bindingResult) {
		String msg = vehicleService.addVehicle(veh, maxload);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "/retrieveall")
	public ResponseEntity<Vehicles> getAllVehicles() {
		List<Vehicles> list = vehicleService.getAllVehicles();
		if (list == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else

			return new ResponseEntity(list, HttpStatus.OK);

	}

	@GetMapping(value = "/retrievevehicle/{veh}")
	public ResponseEntity<Vehicles> getVehicle(@PathVariable("veh") String veh) {
		Vehicles vehicle = vehicleService.getVehicle(veh);
		if (vehicle == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Vehicles>(vehicle, HttpStatus.OK);

	}

	@PutMapping(value = "/addloadtovehicle/{veh}/{loadtoadd}")
	public ResponseEntity<String> addToVehicle(@PathVariable("veh") String veh,
			@PathVariable("loadtoadd") int loadtoadd) {
		if (veh == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			String msg = vehicleService.addToVehicle(veh, loadtoadd);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}

	}

	@GetMapping(value = "/reduceloadby/{veh}/{loadtoreduce}")
	public String reduceLoadBy(@PathVariable("veh") String veh, @PathVariable("loadtoreduce") int loadtoreduce) {

		return vehicleService.reduceLoadBy(veh, loadtoreduce);

	}
	
	//shankar
	
	@GetMapping("truckList")
	public List<Truck> fetchAllTruck() {
		/*List<Truck> listOfTrucks=truckService.getAllTruck();
		model.addAttribute("list", listOfTrucks);*/
		return vehicleService.fetchAllTruck();
	}
	

}
