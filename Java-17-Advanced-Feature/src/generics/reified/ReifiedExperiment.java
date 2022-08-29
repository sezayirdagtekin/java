package generics.reified;

import java.util.Arrays;
import java.util.List;

public class ReifiedExperiment {

	public static void main(String[] args) {
	
		String [] strings=  new String [3];
		Object [] objects=  strings;
		objects[0]=1; // At Run Time: java.lang.ArrayStoreException: java.lang.Integer
		
		Integer [] t= {1,2,3};
		List<Integer> list=Arrays.asList(t);

	}

}
