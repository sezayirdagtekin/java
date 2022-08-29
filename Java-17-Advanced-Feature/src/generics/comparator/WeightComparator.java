package generics.comparator;

import generics.record.Product;

import java.util.Comparator;


public class WeightComparator  implements Comparator<Product>{

	@Override
	public int compare(final Product o1, final 	Product o2) {
			
		return Integer.compare(o1.weight(), o2.weight());
	}



}
