package com.appsmaster.Controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;
	import org.springframework.web.multipart.MultipartFile;

import com.appsmaster.Models.Icon;
import com.appsmaster.Repository.IIconRepository;
import com.appsmaster.Services.ServiceIcon;

import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	@RestController

	public class ControllerIcon {

	    @Autowired
	    private ServiceIcon ServIcon;

	    private final String uploadDir = "D:\\iasia\\UI\\IMAGES\\ICONS"; 

	    @PostMapping("/api/saveicons")
	    public ResponseEntity<Icon> uploadIcon(@RequestParam("file") MultipartFile file,
	                                          @RequestParam("iconName") String iconName) throws IOException {
	        if (file.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }

	        String fileName = file.getOriginalFilename();
	        
	       
	        
	        Path filePath = Paths.get(uploadDir, fileName);
	        Files.write(filePath, file.getBytes());

	        Icon icon = new Icon();
	        icon.setIconName(iconName);
	        icon.setIconPath(uploadDir+"" ); 
	        
	       
	        String result = ServIcon.saveUpdateIcon(icon);
	        return new ResponseEntity<>(icon, HttpStatus.CREATED);
	    }

	    @GetMapping("/api/icons/{id}")
	    public ResponseEntity<byte[]> getIcon(@PathVariable Long id) throws IOException {
	        Icon icon = ServIcon.getbyId(id).orElseThrow(() -> new RuntimeException("Icon not found"));
	      
	        Path filePath = Paths.get(uploadDir, icon.getIconName());
	     
	        byte[] imageBytes = Files.readAllBytes(filePath);

	        return ResponseEntity.ok()
	                .contentType(MediaType.IMAGE_JPEG) 
	                .body(imageBytes);
	    }
	}