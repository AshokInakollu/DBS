package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.entity.PropertyPojo;
import com.letsstartcoding.springbootrestapiexample.service.PropertyService;


@RestController
@RequestMapping("/Easyloan/Property")
public class PropertyController {
	
	@Autowired
	PropertyService service;
	
	@PostMapping("/propertyDetails")
	public PropertyPojo createProperty(@Valid @RequestBody PropertyPojo prop) {
		return service.save(prop);
	}
	
	@GetMapping("/propeerties")
	public List<PropertyPojo> getAllProperties(){
		return service.findAll();
	}
	
	@GetMapping("/property/{id}")
	public ResponseEntity<PropertyPojo> getPropertyById(@PathVariable(value="id") Long propertyId){
		
		PropertyPojo pojo=service.findOne(propertyId);
		
		if(pojo==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(pojo);
		
	}
	
	
	@PutMapping("/property/{id}")
	public ResponseEntity<PropertyPojo> updateProperty(@PathVariable(value="id") Long propertyId,@Valid @RequestBody PropertyPojo propertyDetails){
		
		PropertyPojo emp=service.findOne(propertyId);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		
		PropertyPojo updateProperty=service.save(emp);
		return ResponseEntity.ok().body(updateProperty);
		
		
		
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<PropertyPojo> deleteEmployee(@PathVariable(value="id") Long empid){
		
		PropertyPojo emp=service.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		service.delete(emp);
		return ResponseEntity.ok().build();
	}
	
}
