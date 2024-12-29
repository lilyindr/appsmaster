package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreCompanyBank;
import com.appsmaster.Repository.ICoreCompanyBankRepository;

@Service
public class ServiceCoreCompanyBank {
	
	@Autowired
	ICoreCompanyBankRepository repoCcbank;
	
	public List<CoreCompanyBank> getCcbankListAll(){
		return repoCcbank.findAll();
	}

}
