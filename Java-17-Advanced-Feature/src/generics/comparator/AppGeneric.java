package generics.comparator;

import generics.record.Product;

import java.util.*;


public class AppGeneric {

	public static void main(String[] args) {

		List<Product> list = createMap();
		
		System.out.println("Min Product with Generic:"+minWithGenerics(list, new WeightComparator()));
		System.out.println("Min Product with Lambda:"+minWithLambda(list));
		System.out.println("Min Product with Collection api:"+Collections.min(list,new WeightComparator()));
		
		

		//Using lambda
		Comparator<Product> comparatorLambda = ( p1,  p2) ->  (p1.weight() -p2.weight());
		//Collections.sort(list, comparatorLambda);
		
		Comparator<Product> comparator= new WeightComparator();
		Collections.sort(list, comparator);
		
		ReverseComparator<Product> reverseComparator= new ReverseComparator<>(new WeightComparator());
		//Collections.sort(list, reverseComparator);

		for (Product p : list) {
			System.out.println(p);
		}


	}
	

	
/**
 * 
 * @param list
 * @return
 */
	private static Product minWithLambda(List<Product> list) {

		Optional<List<Product>> opt= Optional.ofNullable(list);
		
		return opt.get().stream().sorted(new WeightComparator()).findFirst().orElseThrow();
	}
	

	/**
	 * 
	 * @param <T>
	 * @param list
	 * @param comparator
	 * @return
	 */
	private static <T> T minWithGenerics(List<T> list, Comparator<T> comparator) {

		if (list.isEmpty()) {
			throw new IllegalArgumentException("List is empty!");
		}
		T minValue = list.get(0);
		for (T value : list) {
			if (comparator.compare(value, minValue) < 0) {
				minValue = value;
			}
		}
		return minValue;
	}
	
	
	private static List<Product> createMap() {
		var door = new Product("Wooden Door", 33);
		var floorPanel = new Product("Floor Panel", 25);
		var window = new Product("Glass Window", 10);
		List<Product> list = new ArrayList<>();
		list.add(door);
		list.add(floorPanel);
		list.add(window);
		return list;
	}
}