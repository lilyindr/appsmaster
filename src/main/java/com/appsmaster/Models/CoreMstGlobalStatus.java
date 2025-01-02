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
@Table(name = "core_mst_global_status")
public class CoreMstGlobalStatus {
	
	@Id
	@Column(name="cmgs_id", nullable = false)
	private Integer cmgsId;
	
	@Column(name="cmgs_status_code", length=5)
	private String cmgsStatusCode;
	
	@Column(name="cmgs_status_desc", length=50)
	private String cmgsStatusDesc;
	
	@Column(name="cmgs_created_by", length=40)
	private String cmgsCreateBy;
	
	@Column(name="cmgs_created_date")
	private Date cmgsCreateDate;
	
	@Column(name="cmgs_updated_by", length=40)
	private String cmgsUpdateBy;
	
	@Column(name="cmgs_updated_date")
	private Date cmgsUpdateDate;

}
