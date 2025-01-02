package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstParam;
import com.appsmaster.Services.ServiceCoreMstParam;

@RestController
public class ControllerCoreMstParam {
	
	@Autowired
	ServiceCoreMstParam servCmparam;
	
	@GetMapping("/appmst/getCmparamListAll")
	public List<CoreMstParam> getCmparamListAll(){
		return servCmparam.getCmparamListAll();
	}

}
