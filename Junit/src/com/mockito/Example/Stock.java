package com.mockito.Example;

public class Stock {

	private String stockId;
	private String name;
	private int quantity;
	
	public Stock(String stockId, String name, int quantity){
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getStockId() {
		return stockId;
	}
}
