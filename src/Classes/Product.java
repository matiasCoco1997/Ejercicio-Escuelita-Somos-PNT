package Classes;

public abstract class Product implements Comparable<Product>{

	protected String description ="";
	protected Double price= 0.00;
	
	public Product( String description, Double price) {
		
		this.description = description;
		this.price = price;
	}
	

	public Double getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}

	
	@Override
	public int compareTo(Product aux) {
		
		if(this.price > aux.getPrice()) return -1;
		if(this.price == aux.getPrice()) return 0;
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
}
