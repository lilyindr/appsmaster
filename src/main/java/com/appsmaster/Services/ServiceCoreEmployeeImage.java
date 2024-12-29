package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreEmployeeImage;
import com.appsmaster.Repository.ICoreEmployeeImageRepository;

@Service
public class ServiceCoreEmployeeImage {
	
	@Autowired
	ICoreEmployeeImageRepository repoCeimg;
	
	public List<CoreEmployeeImage> getCeimgListAll(){
		return repoCeimg.findAll();
	}

}
