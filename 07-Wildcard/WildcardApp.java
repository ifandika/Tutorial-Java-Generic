
public class WildcardApp {
	
	public static void main (String[] args) {
		
		printData(new MyClass<String>("Juprii"));
		printData(new MyClass<Integer>(122883));
		printData(new MyClass<Junior>(new Junior("Hayuuk")));
		
	}
	
	public static class MyClass<T> {
		private T data;
		
		public MyClass(T t) {
			this.data = t;
		}
		
		public T getData() {
			return this.data;
		}
	}
	
	public static class Junior<T> {
		private T data;
		
		public Junior(T t) {
			this.data = t;
		}
	}
	
	// Wildcard : <?> bersifat general
	public static void printData(MyClass<?> data) {
		// hasil data akan bertipe Object
		System.out.println(data.getData());
	}
}