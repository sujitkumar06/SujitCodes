package get_my_parking_interview;

public class Product {
	
	String name;
	int price;
	int weight;
	
	public Product() {
		name="";
		price=0;
		weight=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		price = p;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int w) {
		weight = w;
	}
}

	