package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstAdminStatus;
import com.appsmaster.Services.ServiceCoreMstAdminStatus;

@RestController
public class ControllerCoreMstAdminStatus {
	
	@Autowired
	ServiceCoreMstAdminStatus servCmas;
	
	@GetMapping("/appmst/getCmasListAll")
	public List<CoreMstAdminStatus> getCmasListAll(){
		return servCmas.getCmasListAll();
	}

}
