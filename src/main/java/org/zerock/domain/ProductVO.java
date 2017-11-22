package org.zerock.domain;

public class ProductVO {
	
	private String name;
	private double price;
	
	public ProductVO(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return name; }
	
	public double getprice() { return price; }
	
	@Override
	public String toString() {
		return "productVO [name="+name+",price="+price+"]";
	}

}
