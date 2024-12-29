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
@Table(name = "core_process_logs")
public class CoreProcessLogs {
	
	@Id
	@Column(name="cpl_process", length=50, nullable = false)
	private String cplProcess;
	
	@Column(name="cpl_err_msg", length=2000)
	private String cplErr_msg;
	
	@Column(name="cpl_created_by", length=40)
	private String cplCreated_by;
	
	@Column(name="cpl_created_timestamp")
	private Date cplCreatedTimestamp;

}
