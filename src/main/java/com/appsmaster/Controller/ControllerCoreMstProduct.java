package com.appsmaster.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsmaster.Models.CoreMstProduct;
import com.appsmaster.Services.ServiceCoreMstProduct;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@RestController
public class ControllerCoreMstProduct {
	
	@Autowired
	ServiceCoreMstProduct servCmpr;
	
	 @Autowired
	 private EntityManager entityManager;
	
	@GetMapping("/appmst/getCmprListAll")
	public List<CoreMstProduct> getCmprListAll(){
		return servCmpr.getCmprListAll();
	}
	
	@GetMapping("/appmst/getCmprSingle")
	public Optional<CoreMstProduct> getPrCode(Integer code) {
		return servCmpr.getPrCode(code);
	}
	
	@PostMapping("/appmst/saveupdprod")
	public String saveUpdateProd(@RequestBody CoreMstProduct Prod) {
		return servCmpr.saveUpdateProduct(Prod);	
	}
	
	@GetMapping(value = "/images/productImg/{filename:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImage(
	        @PathVariable String filename) throws IOException {

		 Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES\\PRODUCTS", filename); 
	    byte[] imageBytes = Files.readAllBytes(imagePath);
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
	            .body(imageBytes); 
	}
	
	@GetMapping(value = "/images/productImg", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getAllImagesInProduct( ) throws IOException {
	
	    String sql = "SELECT cmpr_img_filename, cmpr_img_filepath FROM masterscheme.core_mst_product";
	    Query query = entityManager.createNativeQuery(sql);
	    List<Object[]> results = query.getResultList(); // Get all results
	    List<String> imageUrls = new ArrayList<>();
	    String baseUrl = "http://localhost:8090/am-svc/images/productImg/";

	    for (Object[] result : results) { // Iterate through each result
	        String filename = (String) result[0];
	        String filepath = (String) result[1];
	       
	        if (filename != null && !filename.isEmpty() && filepath != null && !filepath.isEmpty()) {
	            Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES\\Products");
	            if (Files.exists(imagePath)) {
	                imageUrls.add(baseUrl + filename);
	            }
	        }
	    }
	    if (!imageUrls.isEmpty()) {
	        return ResponseEntity.ok(imageUrls);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}
