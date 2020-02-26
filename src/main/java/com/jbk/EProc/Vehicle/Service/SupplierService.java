package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Supplier;

public interface SupplierService {
	
	public List<Supplier> getAllSuppliers();
	
	public String addSuppliers(Supplier supplier);
	
	public String editsupplier(Supplier supplier);
	
	public String deletesupplier(int id);

}
