package Main;

import Classes.Fruit;
import Classes.Market;
import Classes.Product;
import Classes.Shampoo;
import Classes.Soda;

public class Main {

	public static void main(String[] args) {
		
		
		//Products
		Soda cocaColaZero = new Soda ( "Coca-Cola Zero", 20.0, 1.5 );
		Soda cocaCola = new Soda ( "Coca-Cola", 18.0, 1.5 );
		Shampoo sedal = new Shampoo ( "Sedal", 19.0, 500.0 ); 
		Fruit strawberry = new Fruit ( "Frutillas", 64.0, "kilo" );
				
		//Market
		Market coto = new Market("Coto");
		
		//Add products
		coto.addProduct(cocaColaZero);
		coto.addProduct(cocaCola);
		coto.addProduct(sedal);
		coto.addProduct(strawberry);
		
		//Show console
		coto.setMessage();
		System.out.println(coto.showProducts());
	}

}
