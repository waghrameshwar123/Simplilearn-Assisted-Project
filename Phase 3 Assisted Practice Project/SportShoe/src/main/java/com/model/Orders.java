package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer id;
	private Long amount;
	private String orderPurchaseDate;
	
	public Orders() {
		super();
	}
	public Orders(Integer id, Long amount, String date) {
		super();
		this.id = id;
		this.amount = amount;
		this.orderPurchaseDate = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getOrderPurchaseDate() {
		return orderPurchaseDate;
	}
	public void setOrderPurchaseDate(String orderPurchaseDate) {
		this.orderPurchaseDate = orderPurchaseDate;
	}
	
}
