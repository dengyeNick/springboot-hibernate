package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vmspTcSupplier extends Parent{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
    private int supplierId;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'供应商代码'")
	private String supplierCode;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'供应商名称'")
	private String supplierName;
	
	@Column(columnDefinition = "varchar(20) DEFAULT NULL COMMENT'联系人'")
	private String contact;
	
	@Column(columnDefinition = "varchar(20) DEFAULT NULL COMMENT'手机号码'")
	private String mobileNo;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'纳税人识别号'")
	private String taxNo;
	
	@Column(columnDefinition = "varchar(200) DEFAULT NULL COMMENT'工商注册地址'")
	private String registeredAddress;
	
	@Column(columnDefinition = "varchar(20) DEFAULT NULL COMMENT'注册电话'")
	private String tel;
	
	@Column(columnDefinition = "varchar(100) DEFAULT NULL COMMENT'开户行'")
	private String bank;
	
	@Column(columnDefinition = "varchar(30) DEFAULT NULL COMMENT'银行账号'")
	private String accountNo;
	
	@Column(columnDefinition = "TEXT DEFAULT NULL COMMENT'备注'")
	private String comments;
	

	
	
	
}
