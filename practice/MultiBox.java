public class MultiBox<T1, T2> {
	private T1 tipe1;
	private T2 tipe2;
	
	public MultiBox(T1 t1, T2 t2) {
		this.tipe1 = t1;
		this.tipe2 = t2;
	}

	public void setType1(T t) {
		tipe1 = t;
	}

	public T2 getType2() {
		return tipe2;
	}
}