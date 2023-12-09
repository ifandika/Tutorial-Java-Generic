@SuppressWarnings("unchecked")
public class BoxGeneric<T> {
	private T[] type;
	private int index = 0;

	public BoxGeneric() {
		type = (T[]) new Object[10];
	}

	public void add(T t) {
		type[index++] = t;
	}

	public T get(int index) {
		return type[index];
	}
}