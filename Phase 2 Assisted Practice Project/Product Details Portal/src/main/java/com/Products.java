package com;

public class Products {
	private int productId;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + "]";
	}
	public Products(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
