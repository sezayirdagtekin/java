package generics.erasure;



//Experimental code with exceptin in generic

//The generic class UnCompiledException<T> may not subclass java.lang.Throwable
public class UnCompiledException /*<T> */ extends Exception { 

	public static void main(String[] args) {

		try {

			throw new UnCompiledException();

		} catch (UnCompiledException /*<T> */ e) { //M aybe *<Integer>   -> compilation error
			System.out.println("Uncompiled ixception  is ocucred:");
			e.printStackTrace();
		}
	}

}
