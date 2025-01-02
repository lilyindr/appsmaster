package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstCustomerGrade;
import com.appsmaster.Services.ServiceCoreMstCustomerGrade;

@RestController
public class ControllerCoreMstCustomerGrade {
	
	@Autowired
	ServiceCoreMstCustomerGrade servCmcg;
	
	@GetMapping("/appmst/getCmcgListAll")
	public List<CoreMstCustomerGrade> getCmcgListAll(){
		return servCmcg.getCmcgListAll();
	}

}
