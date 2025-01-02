package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstCustomerGrade;
import com.appsmaster.Repository.ICoreMstCustomerGradeRepository;

@Service
public class ServiceCoreMstCustomerGrade {
	
	@Autowired
	ICoreMstCustomerGradeRepository repoCmcg;
	
	public List<CoreMstCustomerGrade> getCmcgListAll(){
		return repoCmcg.findAll();
	}

}
