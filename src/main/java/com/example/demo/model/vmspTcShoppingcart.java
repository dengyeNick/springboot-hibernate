package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vmspTcShoppingcart extends Parent{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长主键
    private int shoppingcartId;
	
	@Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT'用户id'")
	private String userId;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'商店id'")
	private int shop_id;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'商品id'")
	private int productId;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'是否有效(1:是;2:否)'")
	private int isProductExists;
	
	@Column(columnDefinition = "int DEFAULT NULL COMMENT'购买数量'")
	private int purchaseQuantity;
	

}
