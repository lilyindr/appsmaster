package com.appsmaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsmaster.Models.ChatTime;

public interface IChatTimeRepository extends JpaRepository<ChatTime,Integer>{

}
