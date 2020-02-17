package com.example.model;

public class Cart {

	private Integer cartId;
	private String cartCode;
	private Double cartFinalCost;

	public Cart(Integer cartId, String cartCode, Double cartFinalCost) {
		super();
		this.cartId = cartId;
		this.cartCode = cartCode;
		this.cartFinalCost = cartFinalCost;
	}

	public Cart() {
		super();
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCartCode() {
		return cartCode;
	}

	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}

	public Double getCartFinalCost() {
		return cartFinalCost;
	}

	public void setCartFinalCost(Double cartFinalCost) {
		this.cartFinalCost = cartFinalCost;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartCode=" + cartCode + ", cartFinalCost=" + cartFinalCost + "]";
	}

}
