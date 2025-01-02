package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstProvinsi;
import com.appsmaster.Repository.ICoreMstProvinsiRepository;

@Service
public class ServiceCoreMstProvinsi {
	
	@Autowired
	ICoreMstProvinsiRepository repoCmpsi;
	
	public List<CoreMstProvinsi> getCmpsiListAll(){
		return repoCmpsi.findAll();
	}
	
	public List<CoreMstProvinsi> getCmpsiListByProvCode(String ProvCode){
		return repoCmpsi.findBycmpsiProvCode(ProvCode);
	}

}
