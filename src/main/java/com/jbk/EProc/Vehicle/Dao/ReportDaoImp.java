package com.jbk.EProc.Vehicle.Dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.jbk.EProc.Vehicle.Bean.SupplierReport;
import com.jbk.EProc.Vehicle.Bean.SupplierReportMapper;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

@Repository
public class ReportDaoImp implements ReportDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<SupplierReport> getAllSupplier() {

		String sql = "select * from supplier";
		return jdbcTemplate.query(sql, new SupplierReportMapper());
	}

	public SupplierReport getSupplierById(int id) {

		String sql = "select * from supplier where id='" + id + "'";
		return jdbcTemplate.queryForObject(sql, new SupplierReportMapper());
	}

	@Override
	public String generateReport(String format) {
		String destination = " D:";

		try {
			// load file
			File file = ResourceUtils.getFile("classpath:Supplierinfo.jrxml");

			// compile file
			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

			List<SupplierReport> suppliers = getAllSupplier();

			// data source
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(suppliers);
			//
			Map<String, Object> parameter = new HashMap<>();
			parameter.put("createdBy", "JavaByKiran");

			// jasper print
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
			// jasper viewer
			// JasperViewer jasperViewer=new JasperViewer(jasperPrint, false);
			// jasperViewer.setVisible(true);
			// ServletOutputStream outputstream = response.getOutputStream();

			if (format.equalsIgnoreCase("pdf")) {
				JasperExportManager.exportReportToPdfFile(jasperPrint,destination+"suppliers.pdf");
				return "pdf grnerated at:" + destination;

			} else if (format.equalsIgnoreCase("html")) {

				JasperExportManager.exportReportToHtmlFile(jasperPrint, destination+"suppliers.html");
				return "html generated at:" + destination;
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return destination = "wrong format";

	}

	@Override
	public SupplierReport getSupplierByName(String name) {
		String sql = "select * from supplier where name='" + name + "' ";
		return jdbcTemplate.queryForObject(sql, new SupplierReportMapper());
	}
}
