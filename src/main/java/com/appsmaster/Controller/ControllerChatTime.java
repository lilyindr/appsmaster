package com.appsmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.ChatTime;
import com.appsmaster.Services.ServiceChatTime;

@RestController
public class ControllerChatTime {
	
	@Autowired
	ServiceChatTime servCtime;
	
	@GetMapping("/appmst/getCtimeListAll")
	public List<ChatTime> getCmasListAll(){
		return servCtime.getCtimeListAll();
	}

}
