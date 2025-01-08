package entities;

import java.util.Comparator;

public class Product {

	private String name;
	private Double price;
	
	// Construtrores
	
	public Product() {
		
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Get and set
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Products:" +
				"Name: " +
				name +
				" Price: " +
				price;
	}


	
	
}
