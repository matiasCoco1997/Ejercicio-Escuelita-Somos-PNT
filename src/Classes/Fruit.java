package Classes;

import java.text.DecimalFormat;

public class Fruit extends Product{

	private String salesUnit = "";
	
	public Fruit(String description, Double price, String salesUnit) {
		
		super(description, price);
		
		this.salesUnit = salesUnit;
	}
	
	
	public String toString() {
		
		String msg =  	"Nombre: " + this.description + " /// Precio: $"+ Math.round(this.price) + " /// Unidad de Venta:   "+ this.salesUnit;
		
		return msg;
	}
}
