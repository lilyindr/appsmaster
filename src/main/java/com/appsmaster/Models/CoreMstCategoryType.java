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
@Table(name = "core_mst_category_type")
public class CoreMstCategoryType {
	
	@Id
	@Column(name="cmct_id", nullable = false)
	private Integer cmctId;
	
	@Column(name="cmct_category", length=100)
	private String cmctCategory;
	
	@Column(name="cmct_created_by", length=40)
	private String cmctCreatedBy;
	
	@Column(name="cmct_created_date")
	private Date cmctCreateDate;
	
	@Column(name="cmct_updated_by", length=40)
	private String cmctUpdateBy;
	
	@Column(name="cmct_updated_date")
	private Date cmctUpdateDate;

}
