package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductServices;

public class FuncoesQueRecebemFuncoesComoParametro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list  = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Cas", 80.90));
		
		ProductServices ps = new ProductServices();
		
		/* double sum  = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M'); */
		
		 double sum  = ps.filteredSum(list, t -> t.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum) );
		
	}

}
