package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapiexample.entity.CustProperty;

@Repository
public interface CustPropertyRepository extends JpaRepository<CustProperty, Long> {

}