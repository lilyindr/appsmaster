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
public class CoreMstParam {
	
	@Id
	@Column(name="cmparam_id", nullable = false)
	private Integer cmparamId;
	
	@Column(name="cmparam_key", length=20)
	private String cmparamKey;
	
	@Column(name="cmparam_value", length=50)
	private String cmparamValue;
	
	@Column(name="cmparam_description", length=150)
	private String cmparamDescription;
	
	@Column(name="cmparam_status", length=1)
	private String cmparamStatus;
	
	@Column(name="cmparam_created_by", length=40)
	private String cmparamCreateBy;
	
	@Column(name="cmparam_created_date")
	private Date cmparamCreateDate;
	
	@Column(name="cmparam_updated_by", length=40)
	private String cmparamUpdateBy;
	
	@Column(name="cmparam_updated_date")
	private Date cmparamUpdateDate;

}
