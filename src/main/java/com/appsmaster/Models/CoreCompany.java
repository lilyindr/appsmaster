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
@Table(name = "core_company")
public class CoreCompany {
	
	@Id
	@Column(name="ccom_id", nullable = false)
	private Integer ccomId;
	
	@Column(name="ccom_name", length=100)
	private String ccomName;

	@Column(name="ccom_name_short", length=100)
	private String ccomNameShort;
	
	@Column(name="ccom_address", length=100)
	private String ccomAddress;
	
	@Column(name="ccom_phone", length=20)
	private String ccomPhone;
	
	@Column(name="ccom_fax", length=20)
	private String ccomFax;
	
	@Column(name="ccom_email", length=20)
	private String ccomEmail;
	
	@Column(name="ccom_longlat", length=100)
	private String ccomLonglat;
	
	@Column(name="ccom_address_support", length=100)
	private String ccomAddressSupport;
	
	@Column(name="ccom_phone_support", length=20)
	private String ccomPhoneSupport;
	
	@Column(name="ccom_fax_support", length=20)
	private String ccomFaxSupport;
	
	@Column(name="ccom_email_support", length=20)
	private String ccomEmailSupport;
	
	@Column(name="ccom_longlat_support", length=100)
	private String ccomLonglatSupport;
	
	@Column(name="ccom_segment_coy", length=2)
	private String ccomSegmentCoy;
	
	@Column(name="ccom_set_of_book_id", length=15)
	private String ccomSetOfBookId;
	
	@Column(name="ccom_pref_je_category", length=2)
	private String ccomPrefJeCategory;
	
	@Column(name="ccom_default_platform", length=2)
	private String ccomDefaultPlatform;
	
	@Column(name="ccom_flag", length=2)
	private String ccomFlag;
	
	@Column(name="ccom_created_by", length=40)
	private String ccomCreatedBy;
	
	@Column(name="ccom_created_date")
	private Date ccomCreateDate;
	
	@Column(name="ccom_updated_by", length=40)
	private String ccomUpdateBy;
	
	@Column(name="ccom_updated_date")
	private Date ccomUpdateDate;
	
	@Column(name="ccom_pic_signature", length=60)
	private String ccomPicSignature;
	
	@Column(name="ccom_image_path", length=100)
	private String ccomImagePath;

}
