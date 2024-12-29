package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstAdminStatus;
import com.appsmaster.Repository.ICoreMstAdminStatusRepository;

@Service
public class ServiceCoreMstAdminStatus {
	
	@Autowired
	ICoreMstAdminStatusRepository repoCmas;
	
	public List<CoreMstAdminStatus> getCmasListAll(){
		return repoCmas.findAll();
	}

}
