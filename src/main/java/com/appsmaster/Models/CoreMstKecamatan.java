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
@Table(name = "core_mst_kecamatan")
public class CoreMstKecamatan {
	
	@Id
	@Column(name="cmkec_kec_code", length=10, nullable = false)
	private String cmkecKecCode;
	
	@Column(name="cmkec_kecamatan", length=100)
	private String cmkecKecamatan;
	
	@Column(name="cmkec_city_code", length=10)
	private String cmkecCityCode;
	
	@Column(name="cmkec_created_by", length=40)
	private String cmkecCreatedBy;
	
	@Column(name="cmkec_created_date")
	private Date cmkecCreateDate;
		
	@Column(name="cmkec_updated_date")
	private Date cmkecUpdateDate;
	
	@Column(name="cmkec_started_timestamp")
	private Date cmkecStartedTimestamp;
	
	@Column(name="cmkec_updated_by", length=40)
	private String cmkecUpdateBy;

}
