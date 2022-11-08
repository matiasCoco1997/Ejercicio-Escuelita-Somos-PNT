package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Market{

	private String name = "";
	private List<Product> products = new ArrayList <Product>();
	private String msg="";
	private Product cheapestProduct;
	private Product theMostExpensiveProduct;
	
	public Market(String name) {
		this.name = name;
	}

	public void addProduct( Product product) {
		products.add(product);
	}
	
	
	public String showProducts() {
		return this.msg;
	}
	
	public void setMessage() {
		
		setCheapestAndMostExpensiveProduct();
		
		for(Product product : products) {
			this.msg+= product + "\n";
		}
		
		this.msg += "============================= \n";
		
		this.msg += "Producto más caro: " + this.theMostExpensiveProduct.getDescription() + "\n" ;
		
		this.msg += "Producto más barato: " + this.cheapestProduct.getDescription();
		
	}

	
	public void setCheapestAndMostExpensiveProduct() {
		
		List<Product> aux = new ArrayList <Product>();
		
		Product theCheapestProduct;
		
		Product theMostExpensiveProduct;
		
		aux.addAll(products);
		
		Collections.sort(aux);
		
		theCheapestProduct = aux.get(aux.size()-1);
		
		setTheCheapestProduct(theCheapestProduct);
		
		theMostExpensiveProduct = aux.get(0);
		
		setTheMostExpensiveProduct(theMostExpensiveProduct);
		
	}
	
	public void setTheCheapestProduct(Product product) {
		this.cheapestProduct = product;
	}
	
	public void setTheMostExpensiveProduct(Product product) {
		this.theMostExpensiveProduct = product;
	}
}
