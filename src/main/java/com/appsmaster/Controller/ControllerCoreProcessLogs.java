package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreProcessLogs;
import com.appsmaster.Services.ServiceCoreProcessLogs;

@RestController
public class ControllerCoreProcessLogs {
	
	@Autowired
	ServiceCoreProcessLogs servCplog;
	
	@GetMapping("/appmst/getCplogListAll")
	public List<CoreProcessLogs> getCplogListAll(){
		return servCplog.getCplogListAll();
	}

}
