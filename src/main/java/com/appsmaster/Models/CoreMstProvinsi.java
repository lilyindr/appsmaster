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
@Table(name = "core_mst_provinsi")
public class CoreMstProvinsi {
	
	@Id
	@Column(name="cmpsi_prov_code", length=10, nullable = false)
	private String cmpsiProvCode;
	
	@Column(name="cmpsi_provinsi", length=100)
	private String cmpsiProvinsi;
		
	@Column(name="cmpsi_created_by", length=40)
	private String cmpsiCreateBy;
	
	@Column(name="cmpsi_created_date")
	private Date cmpsiCreateDate;
		
	@Column(name="cmpsi_updated_date")
	private Date cmpsiUpdateDate;
	
	@Column(name="cmpsi_started_timestamp")
	private Date cmpsiStartedTimestamp;
	
	@Column(name="cmpsi_updated_by", length=40)
	private String cmpsiUpdateBy;

}
