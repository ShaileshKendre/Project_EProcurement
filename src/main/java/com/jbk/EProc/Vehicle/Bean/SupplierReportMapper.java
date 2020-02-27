package com.jbk.EProc.Vehicle.Bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class SupplierReportMapper implements RowMapper<SupplierReport> {

	public SupplierReport mapRow(ResultSet rs, int rowNum) throws SQLException {

		SupplierReport supplier= new SupplierReport();
		supplier.setId (Integer.parseInt(rs.getString("id")));
		supplier.setName(rs.getString("name"));
		supplier.setPhone(rs.getString("phone"));
		supplier.setEmail(rs.getString("email"));
		return supplier;
	}

	
}
