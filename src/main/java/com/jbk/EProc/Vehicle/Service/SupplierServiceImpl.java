package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jbk.EProc.Vehicle.Dao.SupplierDaoImpl;
import com.jbk.EProc.Vehicle.Bean.Supplier;


@Service
public class SupplierServiceImpl {

	@Autowired
	SupplierDaoImpl supplierdao;
	
	public List<Supplier> getAllSuppliers() {
		
		return supplierdao.getAllSuppliers();
	}

	public String addSuppliers(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierdao.addSuppliers(supplier);
	}

	public String editsupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierdao.editsupplier(supplier);
	}

	public String deletesupplier(int id) {
		// TODO Auto-generated method stub
		return supplierdao.deletesupplier(id);
	}
}
