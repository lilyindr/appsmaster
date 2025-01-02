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
@Table(name = "core_mst_customer_grade")
public class CoreMstCustomerGrade {
	
	@Id
	@Column(name="cmcg_id", nullable = false)
	private Integer cmcgId;
	
	@Column(name="cmcg_cust_grade", length=100)
	private String cmcgCustGrade;
	
	@Column(name="cmcg_created_by", length=40)
	private String cmcgCreateBy;
	
	@Column(name="cmcg_created_date")
	private Date cmcgCreateDate;
	
	@Column(name="cmcg_updated_by", length=40)
	private String cmcgUpdateBy;
	
	@Column(name="cmcg_updated_date")
	private Date cmcgUpdateDate;

}
