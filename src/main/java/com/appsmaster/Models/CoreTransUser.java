package com.appsmaster.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_trans_user")
public class CoreTransUser {
	
	@Id
	@Column(name="ctuser_id", nullable = false)
	private BigDecimal ctuserId;
	
	@Column(name="ctuser_ccust_no", length=20, nullable = false)
	private BigDecimal ctuserCustNo;	
	
	@Column(name="ctuser_mac_address", length=100, nullable = false)
	private BigDecimal ctuserMacAddress;
	
	@Column(name="ctuser_device_name", length=100, nullable = false)
	private BigDecimal ctuserDeviceName;
	
	@Column(name="ctuser_location", length=100, nullable = false)
	private BigDecimal ctuserLocation;
	
	@Column(name="ctuser_form", length=200, nullable = false)
	private BigDecimal ctuserForm;
	
	@Column(name="ctuser_activity", length=200, nullable = false)
	private BigDecimal ctuserActivity;
	
	@Column(name="ctuser_login_date")
	private Date ctuserLoginDate;
	
	@Column(name="ctuser_login_enddate")
	private Date ctuserLoginEndDate;
	
	@Column(name="ctuser_created_by", length=40)
	private String ctuserCreateBy;
	
	@Column(name="ctuser_created_date")
	private Date ctuserCreateDate;
	
	@Column(name="ctuser_updated_by", length=40)
	private String ctuserUpdateBy;
	
	@Column(name="ctuser_updated_date")
	private Date ctuserUpdateDate;  
	
}

