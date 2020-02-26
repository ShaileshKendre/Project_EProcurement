package com.jbk.EProc.Vehicle.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Supplier {
	
	private Integer sid;
	private String sname;
	private Long sphone;
	private String semailid;
	private String saddress;
	public Supplier() {
		super();
	}
	
	
}
