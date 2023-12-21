package com.oasy.office.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasy.office.dao.OfficeDao;
import com.oasy.office.entity.OfficeEntity;
@Service
public class OfficeServices {
@Autowired
OfficeDao offDao;
	public OfficeEntity insertInfo(OfficeEntity o) {
		return offDao.insertInfo(o);
	}
	
	public List<OfficeEntity> insertInfo(List<OfficeEntity> o) {
		return offDao.insertInfo(o);
	}
	
	public OfficeEntity findInfo(int e1) {
		return offDao.findInfo(e1);
	}
	
	public OfficeEntity updateInfo(OfficeEntity s) {
		return offDao.updateInfo(s);
	}
	
	public OfficeEntity deleteInfo(int s) {
		return offDao.deleteInfo(s);
	}
	
	public List<OfficeEntity> findAllinfo() {
		return offDao.findAll();
	}

}
