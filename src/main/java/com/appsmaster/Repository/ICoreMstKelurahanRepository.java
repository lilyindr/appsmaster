package com.appsmaster.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstKelurahan;

@Repository
public interface ICoreMstKelurahanRepository extends JpaRepository<CoreMstKelurahan,String> {
	
	public List<CoreMstKelurahan> findBycmkelKelCode(String KelCode);

}
