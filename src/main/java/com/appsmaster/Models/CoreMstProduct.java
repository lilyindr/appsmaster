package com.appsmaster.Models;

import java.util.Date;

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
@Table(name = "core_mst_param")
public class CoreMstProduct {
	
	@Id
	@Column(name="cmpr_code", nullable = false)
	private Integer cmprCode;
	
	@Column(name="cmpr_name", length=100)
	private String cmprName;
	
	@Column(name="cmpr_web_link", length=30)
	private String cmprWebLink;
	
	@Column(name="cmpr_mb_link", length=30)
	private String cmprMbLink;
	
	@Column(name="cmpr_created_by", length=40)
	private String cmprCreateBy;
	
	@Column(name="cmpr_created_date")
	private Date cmprCreateDate;
	
	@Column(name="cmpr_updated_by", length=40)
	private String cmprUpdateBy;
	
	@Column(name="cmpr_updated_date")
	private Date cmprUpdateDate;

}
