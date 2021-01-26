package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vmspTcPurchase extends Parent{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
    private int purchaserId;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'采购方代码'")
	private String purchaserCode;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'采购方名称'")
	private String purchaserName;
	
	@Column(columnDefinition = "varchar(20) DEFAULT NULL COMMENT'联系人'")
	private String contact;
	
	@Column(columnDefinition = "varchar(20) DEFAULT NULL COMMENT'手机号码'")
	private String mobileNo;
	
	@Column(columnDefinition = "TEXT DEFAULT NULL COMMENT'备注'")
	private String comments;
	
	
	
}
