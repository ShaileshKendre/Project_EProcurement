package com.jbk.EProc.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.EProc.Vehicle.Bean.SupplierReport;
import com.jbk.EProc.Vehicle.Service.ReportService;


@CrossOrigin
@RestController
@RequestMapping("/e")
public class ReportController {

	@Autowired
	ReportService reportService;

	// 1
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "/getallsupplier")
	public ResponseEntity<SupplierReport> getAllSupplier() {
		List<SupplierReport> list = reportService.getAllSupplier();
		if (list == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else

			return new ResponseEntity(list, HttpStatus.OK);
	}

	// 2
	@GetMapping(value = "getsupplierbyid/{id}")
	public ResponseEntity<SupplierReport> getSupplierById(@PathVariable("id") int id) {

		SupplierReport supplier = reportService.getSupplierById(id);
		if (supplier == null) {
			return new ResponseEntity<SupplierReport>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SupplierReport>(supplier, HttpStatus.OK);
	}

	// 3
	@GetMapping(value = "getsupplierbyname/{name}")
	public ResponseEntity<SupplierReport> getSupplierByName(@PathVariable("name") String name) {

		SupplierReport supplier = reportService.getSupplierByName(name);
		if (supplier == null) {
			return new ResponseEntity<SupplierReport>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SupplierReport>(supplier, HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/report/{format}")
	public ResponseEntity<String> generateReport(@PathVariable ("format")  String format) {
		System.out.println("in generated report method");
		String string= reportService.generateReport(format);
		if (string == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else

			return new ResponseEntity(string, HttpStatus.OK);
	}

}
