package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.EProc.Vehicle.Bean.SupplierReport;
import com.jbk.EProc.Vehicle.Dao.ReportDao;


@Service
public class ReportServiceImp implements ReportService {

	@Autowired
	ReportDao reportDao;
	public List<SupplierReport> getAllSupplier() {

	return reportDao.getAllSupplier() ;
}

public SupplierReport getSupplierById(int id) {

	return reportDao.getSupplierById(id);
	}

@Override
public String generateReport(String format) {
	
	return reportDao.generateReport(format);
}


@Override
public SupplierReport getSupplierByName(String name) {

	return reportDao. getSupplierByName(name);
}




}
