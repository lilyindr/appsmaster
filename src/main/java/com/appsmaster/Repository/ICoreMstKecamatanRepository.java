package com.appsmaster.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstKecamatan;

@Repository
public interface ICoreMstKecamatanRepository extends JpaRepository<CoreMstKecamatan,String>{
	
	public List<CoreMstKecamatan> findBycmkecKecCode(String KecCode);
	
	public List<CoreMstKecamatan> findBycmkecCityCode(String CityCode);

}
