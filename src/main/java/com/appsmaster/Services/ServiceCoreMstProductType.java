package com.appsmaster.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Repository.ICoreMstProductTypeRepository;

@Service
public class ServiceCoreMstProductType {
	
	@Autowired
	ICoreMstProductTypeRepository repoCmprt;
	
	public List<CoreMstProductType> getCmprtListAll(){
		return repoCmprt.findAll();
	}
	
	public List<CoreMstProductType> getCmprtListByCmprCode(Integer CmprCode){
		return repoCmprt.findByCmprtCmprCode(CmprCode);
	}
	
	public Optional<CoreMstProductType> getPrTypeCode(Integer code, Integer typecode){
	    return repoCmprt.findBycmprtCmprCodeAndCmprtCode(code, typecode);
	}
	
	public String saveUpdateProductType(CoreMstProductType ProdType) {
		repoCmprt.save(ProdType);
		return "Submit Successfully";
	}

}
