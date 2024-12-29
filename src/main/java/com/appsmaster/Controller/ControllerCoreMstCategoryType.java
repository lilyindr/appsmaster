package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstCategoryType;
import com.appsmaster.Services.ServiceCoreMstCategoryType;

@RestController
public class ControllerCoreMstCategoryType {
	
	@Autowired
	ServiceCoreMstCategoryType servCmct;
	
	@GetMapping("/appmst/getCmctListAll")
	public List<CoreMstCategoryType> getCmctListAll(){
		return servCmct.getCmctListAll();
	}

}
