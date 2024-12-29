package com.appsmaster.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_employee_image")
public class CoreEmployeeImage {
	
	@Id
	@Column(name="cei_empl_nik", length=20, nullable = false)
	private String ceiEmplNik;
	
	@Column(name="cei_id_img1_filename", length=100)
	private String ceiIdImg1Filename;
	
	@Column(name="cei_id_img1_filepath", length=100)
	private String ceiIdImg1Filepath;
	
	@Column(name="cei_id_img2_filename", length=100)
	private String ceiIdImg2Filename;
	
	@Column(name="cei_id_img2_filepath", length=100)
	private String ceiIdImg2Filepath;
	
	@Column(name="cei_id_img3_filename", length=100)
	private String ceiIdImg3Filename;
	
	@Column(name="cei_id_img3_filepath", length=100)
	private String ceiIdImg3Filepath;
	
	@Column(name="cei_id_img4_filename", length=100)
	private String ceiIdImg4Filename;
	
	@Column(name="cei_id_img4_filepath", length=100)
	private String ceiIdImg4Filepath;

}
