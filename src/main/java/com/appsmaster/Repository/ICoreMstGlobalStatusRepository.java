package com.appsmaster.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstGlobalStatus;

@Repository
public interface ICoreMstGlobalStatusRepository extends JpaRepository<CoreMstGlobalStatus,Integer>{

}
