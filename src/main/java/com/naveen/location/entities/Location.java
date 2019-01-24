package com.naveen.location.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Location {

	@javax.persistence.Id
	private int Id;
	private String code;
	private String name;
	private String type;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Location [Id=" + Id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
