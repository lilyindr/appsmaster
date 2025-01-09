package com.appsmaster.Models;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "icon")
public class Icon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="icon_id", length=255)
    private Long icon_id; 
    
    @Column(name="icon_name", length=255)
    private String iconName; 

    @Column(name="icon_path", length=255)
    private String iconPath;

	

	

}