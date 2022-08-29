package generics.comparator;

import generics.record.Product;

import java.util.ArrayList;
import java.util.List;

public class AppSortProduct {

	public static void main(String[] args) {

		List<Product> products = createProductList();

		products.sort(Product.sortByName());
		System.out.println("Product sorted by weight:"+products);

		products.sort(Product.sortByWeight());
		System.out.println("Product sorted by weight:"+products);

	}

	private static List<Product> createProductList() {
		var door = new Product("Wooden Door", 33);
		var floorPanel = new Product("Floor Panel", 25);
		var window = new Product("Glass Window", 10);
		
		List<Product> products = new ArrayList<>();
		
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		return products;
	}

}
