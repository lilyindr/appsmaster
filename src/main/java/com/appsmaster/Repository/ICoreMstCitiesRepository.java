package com.appsmaster.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstCities;

@Repository
public interface ICoreMstCitiesRepository extends JpaRepository<CoreMstCities,String>{
	
	public List<CoreMstCities> findBycmcitCityCode(String CityCode);
	
	public List<CoreMstCities> findBycmcitProvCode(String ProvCode);

}
