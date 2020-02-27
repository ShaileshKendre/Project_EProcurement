package com.jbk.EProc.Vehicle.Dao;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.SupplierReport;





public interface ReportDao {
   
	public  List<SupplierReport> getAllSupplier();
	
	public SupplierReport getSupplierById(int id);

	String generateReport(String format);


	public SupplierReport getSupplierByName(String name);

	
}
