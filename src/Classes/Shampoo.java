package Classes;
import java.text.DecimalFormat;

public class Shampoo extends Product{

	private Double volume = 0.0;
	
	public Shampoo(String description, Double price, Double volume) {
		
		super(description, price);
		
		this.volume = volume;
	}

	public String toString() {
		
		String msg =  "Nombre: " + "Shampoo " + this.description + " /// Contenido: " + Math.round(this.volume) + "ml /// Precio: $"+ Math.round(this.price);	
		
		return msg;
	}
}
