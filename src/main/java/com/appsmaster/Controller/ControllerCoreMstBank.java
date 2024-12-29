package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstBank;
import com.appsmaster.Services.ServiceCoreMstBank;

@RestController
public class ControllerCoreMstBank {
	
	@Autowired
	ServiceCoreMstBank servCmba;
	
	@GetMapping("/appmst/getCmbaListAll")
	public List<CoreMstBank> getCmbaListAll(){
		return servCmba.getCmbaListAll();
	}

}
