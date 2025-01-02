package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Repository.ICoreMstProductTypeRepository;

@Service
public class ServiceCoreMstProductType {
	
	@Autowired
	ICoreMstProductTypeRepository repoCmprt;
	
	public List<CoreMstProductType> getCmprtListAll(){
		return repoCmprt.findAll();
	}

}
