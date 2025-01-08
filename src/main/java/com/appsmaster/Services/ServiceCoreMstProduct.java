package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstProduct;
import com.appsmaster.Repository.ICoreMstProductRepository;

@Service
public class ServiceCoreMstProduct {
	
	@Autowired
	ICoreMstProductRepository repoCmpr;
	
	public List<CoreMstProduct> getCmprListAll(){
		return repoCmpr.findAll();
	}
	
	public String saveUpdateProduct(CoreMstProduct Prod) {
		repoCmpr.save(Prod);
		return "Submit Successfully";
	}

}
