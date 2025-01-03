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
@Table(name = "core_mst_kelurahan")
public class CoreMstKelurahan {
	
	@Id
	@Column(name="cmkel_kel_code", length=10, nullable = false)
	private String cmkelKelCode;
	
	@Column(name="cmkel_kelurahan", length=100)
	private String cmkelKelurahan;
	
	@Column(name="cmkel_kec_code", length=10)
	private String cmkelKecCode;
	
	@Column(name="cmkel_create_by", length=40)
	private String cmkelCreateBy;
	
	@Column(name="cmkel_create_date")
	private Date cmkelCreateDate;
		
	@Column(name="cmkel_update_date")
	private Date cmkelUpdateDate;
	
	@Column(name="cmkel_started_timestamp")
	private Date cmkelStartedTimestamp;
	
	@Column(name="cmkel_update_by", length=40)
	private String cmkelUpdateBy;

}
