/**
 * - Jumlah paramter pada generic bisa lebih dari 1
 * - Nama Harus beda
 */

// T : Tipe Data 1
// R : Tipe Data 2
// kebanyakan nama R sebagai return value
// class Person<T, T> { // Tidak disarankan
class Person<T1, T2> {
	private T1 first;
	private T2 second;
	
	public Person(T1 t1, T2 t2) {
		this.first = t1;
		this.second = t2;
	}
	
	public void show() {
		System.out.println(this.first);
		System.out.println(this.second);
	}
}

public class MultipleParameterApp {
	
	public static void main (String[] args) {
		
		// Tipe data boleh sama
		// Person<String, String> kipli = new Person<String, String>("Kipli");
		Person<String, String> kipli = new Person<>("Kipli", "Man");
		
		kipli.show();
		
	}
}