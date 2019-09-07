package com.letsstartcoding.springbootrestapiexample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.entity.PropertyPojo;
import com.letsstartcoding.springbootrestapiexample.repository.PropertyRepository;

@Service
public class PropertyService {

	
	@Autowired
	PropertyRepository propertyRepository;


	public PropertyPojo save(PropertyPojo pojo) {
		return propertyRepository.save(pojo);
	}

	/* search all employees */

	public List<PropertyPojo> findAll() {
		return propertyRepository.findAll();
	}

	/* get an employee by id */
	public PropertyPojo findOne(Long empid) {
		return propertyRepository.findOne(empid);
	}

	/* delete an employee */

	public void delete(PropertyPojo pojo) {
		propertyRepository.delete(pojo);
	}

}
