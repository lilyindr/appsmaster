package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstKelurahan;
import com.appsmaster.Repository.ICoreMstKelurahanRepository;

@Service
public class ServiceCoreMstKelurahan {
	
	@Autowired
	ICoreMstKelurahanRepository repoCmkel;
	
	public List<CoreMstKelurahan> getCmkelListAll(){
		return repoCmkel.findAll();
	}
	
	public List<CoreMstKelurahan> getCmkelListByKelCode(String KelCode){
		return repoCmkel.findBycmkelKelCode(KelCode);
	}
	
	public List<CoreMstKelurahan> getCmkelListByKecCode(String KecCode){
		return repoCmkel.findBycmkelKecCode(KecCode);
	}

}
