package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreCompanySmtp;
import com.appsmaster.Services.ServiceCoreCompanySmtp;

@RestController
public class ControllerCoreCompanySmpt {
	
	@Autowired
	ServiceCoreCompanySmtp servCcsmtp;
	
	@GetMapping("/appmst/getCcsmtpListAll")
	public List<CoreCompanySmtp> getCcsmtpListAll(){
		return servCcsmtp.getCcsmtpListAll();
	}

}
