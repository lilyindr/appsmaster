package com.appsmaster.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.appsmaster.Models.CoreMstProduct;
import com.appsmaster.Repository.ICoreMstProductRepository;

@Service
public class ServiceCoreMstProduct {
	
	@Autowired
	ICoreMstProductRepository repoCmpr;
	
	String msg;
	 private final Path rootLocation = Paths.get("D:\\iasia\\UI\\IMAGES\\PRODUCTS");
	
	public List<CoreMstProduct> getCmprListAll(){
		return repoCmpr.findAll();
	}
	
	public List<CoreMstProduct> getPrCode(Integer code){
	    return repoCmpr.findBycmprCode(code);
	}
	
	public String saveUpdateProduct(CoreMstProduct Prod) {
		repoCmpr.save(Prod);
		return "Submit Successfully";
	}
	
	 public CoreMstProduct create(CoreMstProduct data, 
             MultipartFile file1) throws IOException {		 

		 String filepath = "D:\\iasia\\UI\\IMAGES\\PRODUCTS" ;
		 
		if (file1 != null && !file1.isEmpty()) {
		String filename = storeFile(file1, filepath, data);
		data.setCmprImgFilename(filename);
		data.setCmprImgFilepath(this.rootLocation.resolve(filename).toString());
		}
		// ... (simpan file 2 sampai 4 dengan logika yang sama)		
		return repoCmpr.save(data);
	 }
	 
	 
	  public String update( CoreMstProduct data, MultipartFile file1) throws IOException {
	       // CoreTransRequestEcDtl existingData = repository.findById(id).orElse(null);
	       
		   String filepath = "D:\\iasia\\UI\\IMAGES\\PRODUCTS"; 
		   
	            if (file1 != null && !file1.isEmpty()) {
	        		String filename = storeFile(file1, filepath, data);
	        		data.setCmprImgFilename(filename);
	        		data.setCmprImgFilepath(this.rootLocation.resolve(filename).toString());
	            }          
	            repoCmpr.save(data);
	             return "Submit Successfully";
	    }
	 
	 public String storeFile(MultipartFile file, String filepath, CoreMstProduct data) throws IOException {
	     String filename = file.getOriginalFilename();

	     try {
	         // Pastikan filepath adalah path absolut dan valid
	         Path targetLocation = this.rootLocation.resolve(filename);
	         // Buat direktori jika belum ada
	        // Files.createDirectories(targetLocation.getParent());

	         // Salin file dengan StandardCopyOption.REPLACE_EXISTING
	         Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING); 

	         return filename;
	     } catch (IOException e) {
	         System.err.println("Error: Gagal menyimpan file: " + e.getMessage());
	         throw e; // Atau tangani error dengan cara lain
	     }
	 }
	 
	

}
