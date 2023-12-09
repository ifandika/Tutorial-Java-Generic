public class Box {
	public Object[] obj;
	private int index = 0;

	public Box() {
		obj = new Object[5];
	}

	public void add(Object o) {
		obj[index++] = o;
	}

	public Object get(int index) {
		return obj[index];
	}
}