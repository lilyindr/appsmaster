package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstGlobalStatus;
import com.appsmaster.Services.ServiceCoreMstGlobalStatus;

@RestController
public class ControllerCoreMstGlobalStatus {
	
	@Autowired
	ServiceCoreMstGlobalStatus servCmgs;
	
	@GetMapping("/appmst/getCmgsListAll")
	public List<CoreMstGlobalStatus> getCmgsListAll(){
		return servCmgs.getCmgsListAll();
	}

}
