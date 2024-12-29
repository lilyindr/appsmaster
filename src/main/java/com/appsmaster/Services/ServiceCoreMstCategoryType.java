package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstCategoryType;
import com.appsmaster.Repository.ICoreMstCategoryTypeRepository;

@Service
public class ServiceCoreMstCategoryType {
	
	@Autowired
	ICoreMstCategoryTypeRepository repoCmct;
	
	public List<CoreMstCategoryType> getCmctListAll(){
		return repoCmct.findAll();
	}

}
