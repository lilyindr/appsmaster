package com.appsmaster.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstProvinsi;

@Repository
public interface ICoreMstProvinsiRepository extends JpaRepository<CoreMstProvinsi,String>{
	
	public List<CoreMstProvinsi> findBycmpsiProvCode(String ProvCode);

}
