package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstProduct;
import com.appsmaster.Services.ServiceCoreMstProduct;

@RestController
public class ControllerCoreMstProduct {
	
	@Autowired
	ServiceCoreMstProduct servCmpr;
	
	@GetMapping("/appmst/getCmprListAll")
	public List<CoreMstProduct> getCmprListAll(){
		return servCmpr.getCmprListAll();
	}
	
	@PostMapping("/appmst/saveupdprod")
	public String saveUpdateProd(@RequestBody CoreMstProduct Prod) {
		return servCmpr.saveUpdateProduct(Prod);	
	}

}
