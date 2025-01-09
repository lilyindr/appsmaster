package com.appsmaster.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.appsmaster.Models.CoreMstCities;
import com.appsmaster.Models.Icon;
import com.appsmaster.Repository.ICoreMstCitiesRepository;
import com.appsmaster.Repository.IIconRepository;

@Service
public class ServiceIcon {
	@Autowired
	 private IIconRepository repoIco;
	 
	public String saveUpdateIcon(Icon icon){
		System.out.println("bbbbb :");
		repoIco.save(icon);
		return "Submit Successfully";		
	}
	
	public Optional<Icon> getbyId(Long id){
		
		
		return 	repoIco.findById(id);
	}
}
