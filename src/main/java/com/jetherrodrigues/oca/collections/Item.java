package com.jetherrodrigues.oca.collections;

import java.math.BigDecimal;

import com.google.gson.Gson;

public class Item {
	private String name;
	private int qty;
	private BigDecimal price;

	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this) + "\n";
	}
}
