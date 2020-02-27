package com.jbk.EProc.Vehicle.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.EProc.Vehicle.Bean.Profile;
import com.jbk.EProc.Vehicle.Service.ProfileServiceImpl;


@RestController
@CrossOrigin
@RequestMapping("/profile")
public class ProfileController {
	@Autowired
	ProfileServiceImpl profileService;

	@GetMapping(value = "/login/{username}/{password}"  )
	ResponseEntity<?> getProfile(@PathVariable("username") String username, @PathVariable("password") String password) {
		
		return new ResponseEntity<Profile>(profileService.getProfile(username, password), HttpStatus.OK);
		

	}
	
}
