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
@Table(name = "chat_time")
public class ChatTime {
	
	@Id
	@Column(name="ctime_id", nullable = false)
	private Integer ctimeId;
	
	@Column(name="ctime_ctecd_ctech_id", length=20)
	private String ctimeCtecdCtechId;
	
	@Column(name="ctime_ctecd_id", length=20)
	private String ctimeCtecdId;
	
	@Column(name="ctime_from", length=20)
	private String ctimeFrom;
	
	@Column(name="ctime_to", length=20)
	private String ctimeTo;
	
	@Column(name="ctime_date")
	private Date ctimeDate;
	
	@Column(name="ctime_decs", length=500)
	private String ctimeDecs;
	
	@Column(name="ctime_img1_filename", length=100)
	private String ctimeImg1Filename;
	
	@Column(name="ctime_img1_filepath", length=100)
	private String ctimeImg1Filepath;
	
	@Column(name="ctime_img2_filename", length=100)
	private String ctimeImg2Filename;
	
	@Column(name="ctime_img2_filepath", length=100)
	private String ctimeImg2Filepath;
	

}
