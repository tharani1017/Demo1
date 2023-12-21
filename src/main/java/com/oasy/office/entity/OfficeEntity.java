package com.oasy.office.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info")
public class OfficeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private int no_of_employee;
 private String location;
 private String office_type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo_of_employee() {
	return no_of_employee;
}
public void setNo_of_employee(int no_of_employee) {
	this.no_of_employee = no_of_employee;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getOffice_type() {
	return office_type;
}
public void setOffice_type(String office_type) {
	this.office_type = office_type;
}
 

}
