package com.appsmaster.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Models.CoreMstProductTypeCompKey;

@Repository
public interface ICoreMstProductTypeRepository extends JpaRepository<CoreMstProductType,CoreMstProductTypeCompKey>{
	
	public List<CoreMstProductType> findByCmprtCmprCode(Integer CmprCode);
	
	public List<CoreMstProductType> findBycmprtCmprCodeAndCmprtCode(Integer code, Integer typecode);

}
