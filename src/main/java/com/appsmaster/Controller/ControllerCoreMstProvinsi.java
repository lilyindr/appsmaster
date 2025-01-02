package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstProvinsi;
import com.appsmaster.Services.ServiceCoreMstProvinsi;

@RestController
public class ControllerCoreMstProvinsi {
	
	@Autowired
	ServiceCoreMstProvinsi servCmpsi;
	
	@GetMapping("/appmst/getCmpsiListAll")
	public List<CoreMstProvinsi> getCmpsiListAll(){
		return servCmpsi.getCmpsiListAll();
	}
	
	@GetMapping("/appmst/getCmpsiListByProvCode")
	public List<CoreMstProvinsi> getProvinsiListByProvCode(String ProvCode){
		return servCmpsi.getCmpsiListByProvCode(ProvCode);
	}

}
