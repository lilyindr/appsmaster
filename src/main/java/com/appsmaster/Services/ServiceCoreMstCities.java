package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstCities;
import com.appsmaster.Repository.ICoreMstCitiesRepository;

@Service
public class ServiceCoreMstCities {
	
	@Autowired
	ICoreMstCitiesRepository repoCmcit;
	
	public List<CoreMstCities> getCmcitListAll(){
		return repoCmcit.findAll();
	}
	
	public List<CoreMstCities> getCmcitListByCityCode(String CityCode){
		return repoCmcit.findBycmcitCityCode(CityCode);
	}
	
	public List<CoreMstCities> getCmcitListByProvCode(String ProvCode){
		return repoCmcit.findBycmcitProvCode(ProvCode);
	}

}
