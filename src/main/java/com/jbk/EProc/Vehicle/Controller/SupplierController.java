package com.jbk.EProc.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import  com.jbk.EProc.Vehicle.Bean.Supplier;
import com.jbk.EProc.Vehicle.Service.SupplierServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SupplierController {

	@Autowired
	SupplierServiceImpl supplierservice;
	
	@RequestMapping("/getsupplierlist")
	public List<Supplier> getAllSuppliers(){
		return supplierservice.getAllSuppliers();
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/newsupplier",produces = "application/json")
	public String addSuppliers(@RequestBody Supplier supplier){
		return supplierservice.addSuppliers(supplier);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/editsupplier",produces = "application/json")
	public String editsupplier(@RequestBody Supplier supplier){
		return supplierservice.editsupplier(supplier);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletesupplier",produces = "application/json")
	public String deletesupplier(@RequestBody Supplier supplier){
		return supplierservice.deletesupplier(supplier.getSid());
		
	}
}
