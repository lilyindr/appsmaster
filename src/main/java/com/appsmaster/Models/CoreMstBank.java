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
@Table(name = "core_mst_bank")
public class CoreMstBank {
	
	@Id
	@Column(name="cmba_id", length=5, nullable = false)
	private String cmbaId;
	
	@Column(name="cmba_name", length=100)
	private String cmbaName;
	
	@Column(name="cmba_address", length=100)
	private String cmbaAddress;
	
	@Column(name="cmba_phone", length=50)
	private String cmba_phone;
	
	@Column(name="cmba_fax", length=50)
	private String cmbaFax;
	
	@Column(name="cmba_email", length=50)
	private String cmbaEmail;
	
	@Column(name="cmba_created_by", length=40)
	private String cmbaCreatedBy;
	
	@Column(name="cmba_created_date")
	private Date cmbaCreateDate;
	
	@Column(name="cmba_updated_by", length=40)
	private String cmbaUpdateBy;
	
	@Column(name="cmba_updated_date")
	private Date cmbaUpdateDate;

}
