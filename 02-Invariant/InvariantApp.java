/**
 * - Polymorphism dan Inheritance tidak bisa dilakukan
 * - Tidak bisa convert dari Chield class ke Parent Class dan sebaliknya
 */
 
class All<T> {
	private T data;
	
	public All(T t) {
		this.data = t;
	}
}

public class InvariantApp {
	
	public static void main (String[] args) {
		
		All<String> stringAll = new All<>("Jameeet");
		
		// doIt(stringAll); // ERROR, Walaupun method bertipe parameter Object
		
		All<Integer> integerAll = new All<>(1000);
		
		// Convert from Integer to Object
		// All<Object> objectAll = integerAll; // ERROR
		
	}
	
	public void doIt(All<Object> data) {
		System.out.println("Hello");
	}
	
	
}