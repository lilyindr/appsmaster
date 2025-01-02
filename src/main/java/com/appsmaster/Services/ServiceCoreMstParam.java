package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstParam;
import com.appsmaster.Repository.ICoreMstParamRepository;

@Service
public class ServiceCoreMstParam {
	
	@Autowired
	ICoreMstParamRepository repoCmparam;
	
	public List<CoreMstParam> getCmparamListAll(){
		return repoCmparam.findAll();
	}

}
