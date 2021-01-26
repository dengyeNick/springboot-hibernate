package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vmspTcRegionalGeology implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
	private int id;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'名称'")
	private String areaName;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'区域编码'")
	private String adcode;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'城市编码'")
	private String citycode;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'关联父id'")
	private int pid;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'层级'")
	private int level;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'区域'")
	private String region;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAdcode() {
		return adcode;
	}

	public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
