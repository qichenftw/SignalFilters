
public class MinFilterN<T extends Comparable<T>> extends ComparableNFilter<T> {
	public MinFilterN(int n) {
		super(n);
	}

	@Override
	protected boolean isFilteredValue(T input, T prevFiltered) {
		return input.compareTo(prevFiltered) <= 0;
	}
}
