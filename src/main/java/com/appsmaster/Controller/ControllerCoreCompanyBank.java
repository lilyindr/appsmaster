package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreCompanyBank;
import com.appsmaster.Services.ServiceCoreCompanyBank;

@RestController
public class ControllerCoreCompanyBank {
	
	@Autowired
	ServiceCoreCompanyBank servCcbank;
	
	@GetMapping("/appmst/getCcbankListAll")
	public List<CoreCompanyBank> getCcbankListAll(){
		return servCcbank.getCcbankListAll();
	}

}
