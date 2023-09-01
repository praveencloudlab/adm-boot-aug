package com.cts.ecart.model;

public class Product {

	private int productId;
	private String productTitle;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productTitle, double price) {
		this.productId = productId;
		this.productTitle = productTitle;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", price=" + price + "]";
	}

}
