package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapiexample.entity.PropertyResp;

@Repository
public interface PropertyRespRepository extends JpaRepository<PropertyResp, Long> {

}