package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreCompany;
import com.appsmaster.Services.ServiceCoreCompany;

@RestController
public class ControllerCoreCompany {
	
	@Autowired
	ServiceCoreCompany servCcom;
	
	@GetMapping("/appmst/getCcomListAll")
	public List<CoreCompany> getCcomListAll(){
		return servCcom.getCcomListAll();
	}

}
