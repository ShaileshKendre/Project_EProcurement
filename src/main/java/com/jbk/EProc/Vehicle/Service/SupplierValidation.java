package com.jbk.EProc.Vehicle.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class SupplierValidation {

	public Map<String, String> getfielderrors(BindingResult rs) {
		
		Map<String, String>fielderrors=new HashMap<String,String>();
		List<FieldError>error=rs.getFieldErrors();
		
		for(FieldError e:error)
		{
			fielderrors.put(e.getField(), e.getDefaultMessage());
		}
		return fielderrors;
	}

}
