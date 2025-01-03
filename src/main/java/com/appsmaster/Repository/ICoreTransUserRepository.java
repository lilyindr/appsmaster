package com.appsmaster.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreTransUser;

@Repository
public interface ICoreTransUserRepository extends JpaRepository<CoreTransUser, BigDecimal>{

}