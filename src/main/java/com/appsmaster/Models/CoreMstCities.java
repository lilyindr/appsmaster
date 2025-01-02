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
@Table(name = "core_mst_cities")
public class CoreMstCities {
	
	@Id
	@Column(name="cmcit_city_code", length=10, nullable = false)
	private String cmcitCityCode;
	
	@Column(name="cmcit_city", length=100)
	private String cmcitCity;
	
	@Column(name="cmcit_prov_code", length=10)
	private String cmcitProvCode;
	
	@Column(name="cmcit_created_by", length=40)
	private String cmcitCreateBy;
	
	@Column(name="cmcit_created_date")
	private Date cmcitCreateDate;
		
	@Column(name="cmcit_updated_date")
	private Date cmcitUpdateDate;
	
	@Column(name="cmcit_started_timestamp")
	private Date cmcitStartedTimestamp;
	
	@Column(name="cmcit_updated_by", length=40)
	private String cmcitUpdateBy;
	
	@Column(name="cmcit_sandi_bi", length=10)
	private String cmcitSandiBi;
	
	@Column(name="cmcit_niaga_code_dati_ii", length=4)
	private String cmcitNiagaCodeDatiIi;

}
