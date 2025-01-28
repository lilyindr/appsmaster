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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.appsmaster.Models.CoreMstProduct;
import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Services.ServiceCoreMstProductType;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@RestController
public class ControllerCoreMstProductType {
	
	@Autowired
	ServiceCoreMstProductType servCmprt;
	
	@Autowired
	 private EntityManager entityManager;
	
	@GetMapping("/appmst/getCmprtListAll")
	public List<CoreMstProductType> getCmprtListAll(){
		return servCmprt.getCmprtListAll();
	}
	
	@GetMapping("/appmst/getCmprtListByCmprCode")
	public List<CoreMstProductType> getCmprtListByCmprCode(Integer CmprCode){
		return servCmprt.getCmprtListByCmprCode(CmprCode);
	}
	
	@GetMapping("/appmst/getCmprTypeSingle")
	public Optional<CoreMstProductType> getPrTypeCode(Integer code, Integer typecode) {
		return servCmprt.getPrTypeCode(code, typecode);
	}
	
	@PostMapping("/appmst/saveupdprodtype")
	public String saveUpdateProdType(@RequestBody CoreMstProductType ProdType) {
		return servCmprt.saveUpdateProductType(ProdType);	
	}

	@GetMapping(value = "/images/producttypeImgsgl/{filename:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImage(
	        @PathVariable String filename) throws IOException {

		 Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES\\PRODUCTTYPES", filename); 
	    byte[] imageBytes = Files.readAllBytes(imagePath);
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
	            .body(imageBytes); 
	}
	
	@GetMapping(value = "/images/producttype/{prodno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getAllImagesInProduct(@PathVariable String prodno ) throws IOException {	
	    String sql = "SELECT cmprt_img_filename, cmprt_img_filepath FROM masterscheme.core_mst_product_type where cmprt_cmpr_code='"+prodno+"'";
	    Query query = entityManager.createNativeQuery(sql);
	    List<Object[]> results = query.getResultList(); // Get all results
	    List<String> imageUrls = new ArrayList<>();
	    String baseUrl = "http://localhost:8090/am-svc/images/producttypeImgsgl/";

	    for (Object[] result : results) { // Iterate through each result
	        String filename = (String) result[0];
	        String filepath = (String) result[1];
	        System.out.println("aaaaaaa :"+filename+ " --- "+filepath);
	       
	        if (filename != null && !filename.isEmpty() && filepath != null && !filepath.isEmpty()) {
	            Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES\\ProductTypes");
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
	
	@PostMapping("/appmst/saveproducttypes")	
	 public String createproduct(@RequestParam String userid,
	            @RequestPart("data") CoreMstProductType data,
	            @RequestPart(value = "file1", required = false) MultipartFile file1	          
	    ) throws IOException {
		 	
		CoreMstProductType createdData = servCmprt.create(data, file1);
	        System.out.println(" no dtl :");
	       return "Submit Successfullty";
	    }
	

	@PostMapping("/appmst/UpdateProducttypes")
	 public String UpdateRequest (@RequestParam String id, 
				 	@RequestParam String userid, 
				 	@RequestParam String  NoRequest,
		            @RequestPart("data") CoreMstProductType data,
		            @RequestPart(value = "file1", required = false) MultipartFile file1) 
		            		throws IOException {
		 return servCmprt.update( data, file1);
	 }
	

}
