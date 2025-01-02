package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstKelurahan;
import com.appsmaster.Services.ServiceCoreMstKelurahan;

@RestController
public class ControllerCoreMstKelurahan {
	
	@Autowired
	ServiceCoreMstKelurahan servCmkel;
	
	@GetMapping("/appmst/getCmkelListAll")
	public List<CoreMstKelurahan> getCmkelListAll(){
		return servCmkel.getCmkelListAll();
	}
	
	@GetMapping("/appmst/getCmkelListByKelCode")
	public List<CoreMstKelurahan> getKelurahanListByKelCode(String KelCode){
		return servCmkel.getCmkelListByKelCode(KelCode);
	}

}
