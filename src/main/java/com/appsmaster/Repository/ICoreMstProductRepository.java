package com.appsmaster.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsmaster.Models.CoreMstProduct;

@Repository
public interface ICoreMstProductRepository extends JpaRepository<CoreMstProduct,Integer>{
	
	Optional<CoreMstProduct> findBycmprCode(Integer code);

}
