package generics.erasure;

/**
 * 
 * @author sezayir
 *
 * @param <T>
 */

// Experimental code with generic  instance of
public class Customer<T> {

	public boolean equals(Object obj) {

		// With generic compilation error
		if (obj instanceof Customer /* <T> */) {
			return true;
		}
		return false;
	}
	
}
