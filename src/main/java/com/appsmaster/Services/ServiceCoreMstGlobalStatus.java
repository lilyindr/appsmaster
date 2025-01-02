package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreMstGlobalStatus;
import com.appsmaster.Repository.ICoreMstGlobalStatusRepository;

@Service
public class ServiceCoreMstGlobalStatus {
	
	@Autowired
	ICoreMstGlobalStatusRepository repoCmgs;
	
	public List<CoreMstGlobalStatus> getCmgsListAll(){
		return repoCmgs.findAll();
	}

}
