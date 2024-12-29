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
@Table(name = "core_mst_admin_status")
public class CoreMstAdminStatus {
	
	@Id
	@Column(name="cmas_id", nullable = false)
	private Integer cmasId;
	
	@Column(name="cmas_status_code", length=5)
	private String cmasStatusCode;
	
	@Column(name="cmas_status_desc", length=50)
	private String cmasStatusDesc;
	
	@Column(name="cmas_created_by", length=40)
	private String cmasCreatedBy;
	
	@Column(name="cmas_created_date")
	private Date cmasCreateDate;
	
	@Column(name="cmas_updated_by", length=40)
	private String cmasUpdateBy;
	
	@Column(name="cmas_updated_date")
	private Date cmasUpdateDate;

}
