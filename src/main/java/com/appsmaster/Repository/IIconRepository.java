package com.appsmaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.Icon;

@Repository
public interface IIconRepository extends JpaRepository<Icon, Long> {
	
}
