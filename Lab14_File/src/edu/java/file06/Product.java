package edu.java.file06;

import java.io.Serializable;

// Object 타입으로 파일에 write하거나, 파일에서 read를 하려면
// 그 클래스는 Serializable 인터페이스를 구현해야 함. -> "직렬화"가 가능하다라는 선언.
// Serializable은 구현해야 할 추상 메서드는 없음.
public class Product implements Serializable {
	// field
	private int productId; // 상품 번호
	private String productName; // 상품 이름
	private int productPrice; // 상품 가격
	
	// constructor
	public Product() {}
	public Product(int productId, String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	// getters & setters
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product{id=" + this.productId + ", name=" + this.productName + ", price=" + this.productPrice + "}";
	}
	
}