package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstBank;
import com.appsmaster.Repository.ICoreMstBankRepository;

@Service
public class ServiceCoreMstBank {
	
	@Autowired
	ICoreMstBankRepository repoCmba;
	
	public List<CoreMstBank> getCmbaListAll(){
		return repoCmba.findAll();
	}

}
