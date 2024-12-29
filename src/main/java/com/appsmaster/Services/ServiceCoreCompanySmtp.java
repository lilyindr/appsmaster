package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreCompanySmtp;
import com.appsmaster.Repository.ICoreCompanySmptRepository;

@Service
public class ServiceCoreCompanySmtp {
	
	@Autowired
	ICoreCompanySmptRepository repoCcsmtp;
	
	public List<CoreCompanySmtp> getCcsmtpListAll(){
		return repoCcsmtp.findAll();
	}

}
