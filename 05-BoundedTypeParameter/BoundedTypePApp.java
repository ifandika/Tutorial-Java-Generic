/**
 * - Membatasi genric tipe data
 * - Hanya boleh Class itu dan Turunanya
 * - {@code NameGenericType extends NameClass}
 */

// Kelebihan bisa menggunakan method dari Class itu
// Class hanya bisa menerima Class Number dan turunannya
class NumberClass<T extends Number> {
	private T data;
	
	public NumberClass(T data) {this.data = data;}
	public T getData() {return this.data;}
	public void setData(T data) {this.data = data;}
	public void isDoubleValue() {
		// Hanya bisa mengakses method di class Number
		System.out.println(data.doubleValue());
	}
}

public class BoundedTypePApp {
	public static void main (String[] args) {
		
		NumberClass<Integer> intergerClass = new NumberClass<>(1000);
		
		// ERROR, String bukan turunan dari Number
		// NumberClass<String> stringClass = new NumberClass<>("ERROR");
		
		System.out.println(intergerClass.getData());
		intergerClass.isDoubleValue();
	}
}