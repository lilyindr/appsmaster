package com.appsmaster.Models;

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
@Table(name = "core_mst_product_type")
@IdClass(CoreMstProductTypeCompKey.class)
public class CoreMstProductType {
	
	@Id
	@Column(name="cmprt_cmpr_code", nullable = false)
	private Integer cmprtCmprCode;
	
	@Id
	@Column(name="cmprt_code", nullable = false)
	private Integer cmprtCode;
	
	@Column(name="cmprt_type_desc", length = 100)
	private String cmprtTypeDesc;
	
	@Column(name="cmprt_measure", length = 50)
	private String cmprtMeasure;
	
	@Column(name="cmprt_spek_grade", length = 50)
	private String cmprtSpekGrade;
	
	@Column(name="cmprt_type_alias", length = 50)
	private String cmprtTypeAlias;
	
	@Column(name="cmprt_web_link", length = 30)
	private String cmprtWebLink;
	
	@Column(name="cmprt_mb_link", length = 30)
	private String cmprtMbLink;
	
	@Column(name="cmprt_created_by", length=40)
	private String cmprtCreateBy;
	
	@Column(name="cmprt_created_date")
	private Date cmprtCreateDate;
	
	@Column(name="cmprt_updated_by", length=40)
	private String cmprtUpdateBy;
	
	@Column(name="cmprt_updated_date")
	private Date cmprtUpdateDate;

}
