package com.appsmaster.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsmaster.Models.ChatTime;
import com.appsmaster.Repository.IChatTimeRepository;

@Service
public class ServiceChatTime {
	
	@Autowired
	IChatTimeRepository repoCtime;
	
	public List<ChatTime> getCtimeListAll(){
		return repoCtime.findAll();
	}

}
