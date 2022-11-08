package Classes;
import java.text.DecimalFormat;

public class Soda extends Product {

	private Double volume = 0.0;
	
	public Soda(String description, Double price, Double volume) {
		
		super(description, price);
		this.volume = volume;
		
	}

	public String toString() {
		String msg =  	"Nombre: " + this.description + " /// Litros: " + this.volume + " /// Precio: $"+ Math.round(this.price);	
		
		return msg;
	}
	
}
