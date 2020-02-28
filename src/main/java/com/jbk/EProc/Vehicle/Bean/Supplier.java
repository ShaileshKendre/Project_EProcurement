package com.jbk.EProc.Vehicle.Bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Supplier {
	
private Integer sid;
	
	@NotNull(message="Name can not be null")
	@Size(min=3,max=8,message="Length should be between 3 to 8")
	@Pattern(regexp="^[A-Za-z]+$",message="Name is not valid")
	private String sname;
	
	
	private Long sphone;
	
	@NotNull(message="EmailID can not be null")
	@Pattern(regexp="^[A-Za-z0-9+_.-]+@(.+)$",message="EmailId is not valid")
	private String semailid;
	
	@NotNull(message="Address can not be null")
	private String saddress;
	
	public Supplier() {
		super();
	}
	

	
}
