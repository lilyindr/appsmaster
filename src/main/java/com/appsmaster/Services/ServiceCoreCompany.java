package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreCompany;
import com.appsmaster.Repository.ICoreCompanyRepository;

@Service
public class ServiceCoreCompany {
	
	@Autowired
	ICoreCompanyRepository repoCcom;
	
	public List<CoreCompany> getCcomListAll(){
		return repoCcom.findAll();
	}

}
