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
import com.appsmaster.Models.CoreMstProductType;
import com.appsmaster.Repository.ICoreMstProductTypeRepository;

@Service
public class ServiceCoreMstProductType {
	
	@Autowired
	ICoreMstProductTypeRepository repoCmprt;
	String msg;
	 private final Path rootLocation = Paths.get("D:\\iasia\\UI\\IMAGES\\PRODUCTTYPES");
	
	public List<CoreMstProductType> getCmprtListAll(){
		return repoCmprt.findAll();
	}
	
	public List<CoreMstProductType> getCmprtListByCmprCode(Integer CmprCode){
		return repoCmprt.findByCmprtCmprCode(CmprCode);
	}
	
	public Optional<CoreMstProductType> getPrTypeCode(Integer code, Integer typecode){
	    return repoCmprt.findBycmprtCmprCodeAndCmprtCode(code, typecode);
	}
	
	public String saveUpdateProductType(CoreMstProductType ProdType) {
		repoCmprt.save(ProdType);
		return "Submit Successfully";
	}
	
	
	 public CoreMstProductType create(CoreMstProductType data, 
             MultipartFile file1) throws IOException {
		 

		 String filepath = "D:\\iasia\\UI\\IMAGES\\PRODUCTTYPES" ;
		 
		if (file1 != null && !file1.isEmpty()) {
		String filename = storeFile(file1, filepath, data);
		data.setCmprtImgFilename(filename);
		data.setCmprtImgFilepath(this.rootLocation.resolve(filename).toString());
		
		}
		
		
		// ... (simpan file 2 sampai 4 dengan logika yang sama)
		
		return repoCmprt.save(data);
	 }
	 
	  public String update( CoreMstProductType data, MultipartFile file1) throws IOException {
	       // CoreTransRequestEcDtl existingData = repository.findById(id).orElse(null);
	       
		   String filepath = "D:\\iasia\\UI\\IMAGES\\PRODUCTS"; 
		   
	            if (file1 != null && !file1.isEmpty()) {
	        		String filename = storeFile(file1, filepath, data);
	        		data.setCmprtImgFilename(filename);
	        		data.setCmprtImgFilepath(this.rootLocation.resolve(filename).toString());	        	   
	            }    
	            repoCmprt.save(data);
	             return "Submit Successfully";
	    }
	 
	 public String storeFile(MultipartFile file, String filepath, CoreMstProductType data) throws IOException {
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
