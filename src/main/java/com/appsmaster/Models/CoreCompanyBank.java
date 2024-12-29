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
@Table(name = "core_company_bank")
public class CoreCompanyBank {
	
	@Id
	@Column(name="ccbank_ccom_id", nullable = false)
	private Integer ccbankCcomId;
	
	@Column(name="ccbank_cmba_id", length=5)
	private String ccbankCmbaId;
	
	@Column(name="ccbank_id")
	private Integer ccbankId;
	
	@Column(name="ccbank_account_name", length=100)
	private String ccbankAccountName;
	
	@Column(name="ccbank_account_no", length=20)
	private String ccbankAccountNo;
	
	@Column(name="ccbank_account_name_virtual", length=20)
	private String ccbankAccountNameVirtual;
	
	@Column(name="ccbank_account_no_virtual", length=20)
	private String ccbankAccountNoVirtual;
	
	@Column(name="ccbank_created_by", length=40)
	private String ccbankCreatedBy;
	
	@Column(name="ccbank_created_date")
	private Date ccbankCreateDate;
	
	@Column(name="ccbank_updated_by", length=40)
	private String ccbankUpdateBy;
	
	@Column(name="ccbank_updated_date")
	private Date ccbankUpdateDate;

}
