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
	
	@GetMapping("/users")
	public List<PropertyPojo> getAllProperties(){
		return service.findAll();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<PropertyPojo> getEmployeeById(@PathVariable(value="id") Long empid){
		
		PropertyPojo emp=service.findOne(empid);
		
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<PropertyPojo> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody PropertyPojo empDetails){
		
		PropertyPojo emp=service.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		
		PropertyPojo updateEmployee=service.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
		
		
		
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
