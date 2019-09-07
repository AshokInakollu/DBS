package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapiexample.entity.PropertyPojo;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyPojo, Long> {

}