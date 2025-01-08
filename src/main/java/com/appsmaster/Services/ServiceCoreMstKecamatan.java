package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstKecamatan;
import com.appsmaster.Repository.ICoreMstKecamatanRepository;

@Service
public class ServiceCoreMstKecamatan {
	
	@Autowired
	ICoreMstKecamatanRepository repoCmkec;
	
	public List<CoreMstKecamatan> getCmkecListAll(){
		return repoCmkec.findAll();
	}
	
	public List<CoreMstKecamatan> getCmkecListByKecCode(String KecCode){
		return repoCmkec.findBycmkecKecCode(KecCode);
	}
	
	public List<CoreMstKecamatan> getCmkecListByCityCode(String CityCode){
		return repoCmkec.findBycmkecCityCode(CityCode);
	}

}