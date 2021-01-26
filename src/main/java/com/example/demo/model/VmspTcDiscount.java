package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VmspTcDiscount  implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
    private int discountId;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'类型（1:电缆、2:润滑油、3:阀门）'")
	private int discountType;
	
	@Column(columnDefinition = "DECIMAL DEFAULT NULL COMMENT'金额'")
	private BigDecimal amount;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'优惠百分比（%）'")
	private int discount;
}
