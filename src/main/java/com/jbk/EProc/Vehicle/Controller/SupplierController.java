package com.jbk.EProc.Vehicle.Controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import  com.jbk.EProc.Vehicle.Bean.Supplier;
import com.jbk.EProc.Vehicle.Service.SupplierServiceImpl;
import com.jbk.EProc.Vehicle.Service.SupplierValidation;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SupplierController {

	@Autowired
	SupplierServiceImpl supplierservice;
	
	@Autowired
	SupplierValidation suppliervalidation;
	
	@RequestMapping("/getsupplierlist")
	public List<Supplier> getAllSuppliers(){
		return supplierservice.getAllSuppliers();
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/newsupplier",produces = "application/json")
	public ResponseEntity<?> addSuppliers(@Valid @RequestBody Supplier supplier,BindingResult rs){
		
		if(rs.hasErrors())
		{
			Map<String,String> m=suppliervalidation.getfielderrors(rs);
			return new ResponseEntity<Map<String,String>>(m, HttpStatus.BAD_REQUEST);
		}
		
		String m=supplierservice.addSuppliers(supplier);
		return new ResponseEntity<String>(m,HttpStatus.OK);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/editsupplier",produces = "application/json")
	public ResponseEntity<?> editsupplier(@Valid @RequestBody Supplier supplier,BindingResult rs){
		
		if(rs.hasErrors()) {
			Map<String, String> m=suppliervalidation.getfielderrors(rs);
			return new ResponseEntity<Map<String,String>>(m,HttpStatus.BAD_REQUEST);
		}
		
		String m=supplierservice.editsupplier(supplier);
		return new ResponseEntity<String>(m,HttpStatus.OK);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletesupplier",produces = "application/json")
	public ResponseEntity<?> deletesupplier(@RequestBody Supplier supplier,BindingResult rs){
		
		if(rs.hasErrors()) {
			Map<String, String>m=suppliervalidation.getfielderrors(rs);
			return new ResponseEntity<Map<String,String>>(m,HttpStatus.BAD_REQUEST);
		}
		
		String m= supplierservice.deletesupplier(supplier.getSid());
		return new ResponseEntity<String>(m,HttpStatus.OK);
		
	}}
