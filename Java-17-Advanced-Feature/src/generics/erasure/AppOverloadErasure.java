package generics.erasure;

/**
 * 
 * @author sezayir
 *
 */

// Experimental code with overloading

public class AppOverloadErasure {
	
	//Compilation error
	//Erasure of method print(List<String>) is the same as another method in type 
	/*
	private  void print(List<String> list) {
		System.out.println("String list:"+list);
	}
	
	//Erasure of method print(List<Integer>) is the same as another method in type OverloadErasure
	private  void print(List<Integer> list) {
		System.out.println("Integer list:"+list);
			
	}	
	*/

}
