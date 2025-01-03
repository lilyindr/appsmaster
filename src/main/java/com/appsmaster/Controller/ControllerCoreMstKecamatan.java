package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstKecamatan;
import com.appsmaster.Services.ServiceCoreMstKecamatan;

@RestController
public class ControllerCoreMstKecamatan {
	
	@Autowired
	ServiceCoreMstKecamatan servCmkec;
	
	@GetMapping("/appmst/getCmkecListAll")
	public List<CoreMstKecamatan> getCmkelListAll(){
		return servCmkec.getCmkecListAll();
	}
	
	@GetMapping("/appmst/getCmkecListByKecCode")
	public List<CoreMstKecamatan> getKecamatanListByKecCode(String KecCode){
		return servCmkec.getCmkecListByKecCode(KecCode);
	}
	
	@GetMapping("/appmst/getCmkecListByCityCode")
	public List<CoreMstKecamatan> getKecamatanListByCityCode(String CityCode){
		return servCmkec.getCmkecListByCityCode(CityCode);
	}

}
