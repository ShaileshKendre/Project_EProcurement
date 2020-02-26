package com.jbk.EProc.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jbk.EProc.Vehicle.Bean.Supplier;
import com.jbk.EProc.Vehicle.Bean.SupplierMapper;

@Repository
public class SupplierDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Supplier> getAllSuppliers() {
		
		String query="select * from suppliers;";
		return jdbctemplate.query(query, new SupplierMapper());
		
	}

	public String addSuppliers(Supplier supplier) {
		// TODO Auto-generated method stub
		int count = jdbctemplate.update(
				"INSERT INTO suppliers(sid,sname,sphone,saddress,semailid)VALUES(?,?,?,?,?)",
				new Object[] { supplier.getSid(), supplier.getSname(),supplier.getSphone(), supplier.getSaddress(),supplier.getSemailid()  });
		
		return "Supplier Added....";
	}

	public String editsupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		int count = jdbctemplate.update(
				"UPDATE suppliers set sname = ? , sphone = ? , saddress = ?,semailid=? where sid = ?",
				new Object[] { supplier.getSname(), supplier.getSphone(),supplier.getSaddress(),supplier.getSemailid(),supplier.getSid() });
		return "Supplier Edited.....";
	}

	public String deletesupplier(int id) {
		// TODO Auto-generated method stub
		int count = jdbctemplate.update("DELETE from suppliers WHERE sid = ?", new Object[] { id });
	
		return "Supplier Deleted.....";
	}

}
