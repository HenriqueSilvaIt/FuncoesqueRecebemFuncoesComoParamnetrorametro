package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductServices  {
	
	public double filteredSum(List<Product> list, Predicate<Product> criter) {
		double sum = 0.0;
		for (Product t : list) {
			if (criter.test(t)) {
				sum = sum + t.getPrice();
			}
		}
		return sum;
		
	}
	
}
