package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Services.ServiceCoreMstProductType;

@RestController
public class ControllerCoreMstProductType {
	
	@Autowired
	ServiceCoreMstProductType servCmprt;
	
	@GetMapping("/appmst/getCmprtListAll")
	public List<CoreMstProductType> getCmprtListAll(){
		return servCmprt.getCmprtListAll();
	}

}
