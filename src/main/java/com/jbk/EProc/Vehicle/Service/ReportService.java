package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.SupplierReport;



public interface ReportService {

	public  List<SupplierReport> getAllSupplier();
	
	public SupplierReport getSupplierById(int id);

	String generateReport(String format);


	public SupplierReport getSupplierByName(String name);

	
}
