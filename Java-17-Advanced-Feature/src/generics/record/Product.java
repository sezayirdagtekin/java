package generics.record;

import java.util.Comparator;

public record Product(String name, int weight) {

	public final static Comparator<Product> sortByWeight() {
		return Comparator.comparingInt(Product::weight);
	}

	public final static Comparator<Product> sortByName() {

		return Comparator.comparing(Product::name);
	}
	

}
