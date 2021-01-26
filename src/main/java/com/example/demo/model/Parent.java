package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Parent implements Serializable{
	
	@Column(columnDefinition = "date COMMENT'创建时间'")
	private Date createDate;
	
	@Column(columnDefinition = "varchar(30) DEFAULT NULL COMMENT'创建人'")
	private String createUser;
	
	@Column(columnDefinition = "date COMMENT'修改时间'")
	private Date modifyDate;
	
	@Column(columnDefinition = "varchar(30) DEFAULT NULL COMMENT'修改人'")
	private String modifyUser;

}
