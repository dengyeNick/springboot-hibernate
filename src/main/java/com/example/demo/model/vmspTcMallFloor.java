package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vmspTcMallFloor extends Parent{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
    private int floorId;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'类层类型（海报、推荐（品牌）、商品）'")
	private String floorType;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'楼层排序'")
	private int sort;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'商品ID/品牌ID'")
	private int shopId;
}
