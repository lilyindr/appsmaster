package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstCities;
import com.appsmaster.Services.ServiceCoreMstCities;

@RestController
public class ControllerCoreMstCities {
	
	@Autowired
	ServiceCoreMstCities servCmcit;
	
	@GetMapping("/appmst/getCmcitListAll")
	public List<CoreMstCities> getCmcitListAll(){
		return servCmcit.getCmcitListAll();
	}
	
	@GetMapping("/appmst/getCmcitListByCityCode")
	public List<CoreMstCities> getCitiesListByCityCode(String CityCode){
		return servCmcit.getCmcitListByCityCode(CityCode);
	}

}
