package generics.comparator;

import java.util.Comparator;

public record ReverseComparator<T>(Comparator<T> delegateComparator) implements Comparator<T> {


	@Override
	public int compare(final T left, final T right) {

		return -1 * delegateComparator.compare(left, right);
	}

}
