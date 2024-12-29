package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreEmployeeImage;
import com.appsmaster.Services.ServiceCoreEmployeeImage;

@RestController
public class ControllerCoreEmployeeImage {
	
	@Autowired
	ServiceCoreEmployeeImage servCeimg;
	
	@GetMapping("/appmst/getCeimgListAll")
	public List<CoreEmployeeImage> getCeimgListAll(){
		return servCeimg.getCeimgListAll();
	}

}
