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
@Table(name = "core_company_smtp")
public class CoreCompanySmtp {
	
	@Id
	@Column(name="ccsmtp_id", nullable = false)
	private Integer ccsmtpId;
	
	@Column(name="ccsmtp_ccom_id")
	private Integer ccsmtpCcomId;
	
	@Column(name="ccsmtp_server", length=100)
	private String ccsmtpServer;
	
	@Column(name="ccsmtp_user", length=30)
	private String ccsmtpUser;
	
	@Column(name="ccsmtp_password", length=30)
	private String ccsmtPassword;
	
	@Column(name="ccsmtp_email", length=30)
	private String ccsmtpEmail;
	
	@Column(name="ccsmtp_port", length=10)
	private String ccsmtpPort;
	
	@Column(name="ccsmtp_created_by", length=40)
	private String ccsmtpCreatedBy;
	
	@Column(name="ccsmtp_created_date")
	private Date ccsmtpCreateDate;
	
	@Column(name="ccsmtp_updated_by", length=40)
	private String ccsmtpUpdateBy;
	
	@Column(name="ccsmtp_updated_date")
	private Date ccsmtpUpdateDate;

}
