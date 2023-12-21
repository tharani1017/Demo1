package com.oasy.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasy.office.entity.OfficeEntity;
import com.oasy.office.services.OfficeServices;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/office")
public class OfficeController {
	@Autowired
	OfficeServices offSer;
	@PostMapping(value="/add")
	public OfficeEntity insertInfo(@RequestBody OfficeEntity o) {
		return offSer.insertInfo(o);
	}
	@PostMapping(value="/list")
	public List<OfficeEntity>insertInfo(@RequestBody List<OfficeEntity> o){
		return offSer.insertInfo(o);
	}
	
		
	@GetMapping(value="/find/{e1}")
	public OfficeEntity findInfo(@PathVariable int e1) {
		return offSer.findInfo(e1);
	}

	@PutMapping(value="/update/{s}")
	public OfficeEntity updateInfo(@RequestBody OfficeEntity s) {
		return offSer.updateInfo(s);
	}
	@DeleteMapping(value="/delete/{s}")
	public OfficeEntity deleteInfo(@PathVariable int s) {
		return offSer.deleteInfo(s);
	}

	@GetMapping(value = "/findAll")
	public List<OfficeEntity> findAllinfo() {
		return offSer.findAllinfo();
	}
}
