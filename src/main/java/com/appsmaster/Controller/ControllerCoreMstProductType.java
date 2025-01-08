package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/appmst/getCmprtListByCmprCode")
	public List<CoreMstProductType> getCmprtListByCmprCode(Integer CmprCode){
		return servCmprt.getCmprtListByCmprCode(CmprCode);
	}
	
	@PostMapping("/appmst/saveupdprodtype")
	public String saveUpdateProdType(@RequestBody CoreMstProductType ProdType) {
		return servCmprt.saveUpdateProductType(ProdType);	
	}

}
