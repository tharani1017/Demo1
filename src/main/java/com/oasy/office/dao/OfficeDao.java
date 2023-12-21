package com.oasy.office.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasy.office.entity.OfficeEntity;
import com.oasy.office.repo.OfficeRepository;
@Repository
public class OfficeDao {
@Autowired
OfficeRepository offRep;
	public OfficeEntity insertInfo(OfficeEntity o) {
		return offRep.save(o);
	}
	
	public List<OfficeEntity> insertInfo(List<OfficeEntity> o) {
		offRep.saveAll(o);
		return o;
	}
	
	public OfficeEntity findInfo(int e1) {
		return offRep.findById(e1).get();
	}
	
	public OfficeEntity updateInfo(OfficeEntity s) {
		return offRep.save(s);
	}
	
	public OfficeEntity deleteInfo(int s) {
		OfficeEntity m=offRep.findById(s).get();
		offRep.deleteById(s);
		return m;
	}
	
	public List<OfficeEntity> findAll() {
		return offRep.findAll();
	}

}
