package com.jbk.EProc.Vehicle.Bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jbk.EProc.Vehicle.Bean.Supplier;

public class SupplierMapper implements RowMapper<Supplier> {

	@Override
	public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
		Supplier supplier=new Supplier();
		supplier.setSid(rs.getInt("sid"));
		supplier.setSname(rs.getString("sname"));
		supplier.setSphone(rs.getLong("Sphone"));
		supplier.setSemailid(rs.getString("Semailid"));
		supplier.setSaddress(rs.getString("Saddress"));
		return supplier;
	}

}
