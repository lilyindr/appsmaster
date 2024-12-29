package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.CoreProcessLogs;
import com.appsmaster.Repository.ICoreProcessLogsRepository;

@Service
public class ServiceCoreProcessLogs {
	
	@Autowired
	ICoreProcessLogsRepository repoCplog;
	
	public List<CoreProcessLogs> getCplogListAll(){
		return repoCplog.findAll();
	}

}
