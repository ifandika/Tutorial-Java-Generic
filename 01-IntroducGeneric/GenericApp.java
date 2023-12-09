/**
 * [ Generic ]
 * - Kemampuan membuat type parameter yang general(umum)
 * - Default bertipe Object sehingga data apapun bisa
 * - Generic bisa di implementasikan pada class/interface
 * - Membuat sebuah data yang general
 * - Mirip seperti tipe data Object
 * - <..> adalah generic, seperti paramter namun bisa menampung berbagai tipe data yang bertipe Object
 * - Penulisan nama generic dilambangkan dengan 1 huruf upperCase
 * - Contoh Nama-nama generic type yang sering digunakan
 *   - E | Element
 *   - K | Key
 *   - N | Number
 *   - T | Type (Sering digunakan)
 *   - V | Value
 *   - dll
 */

// Penulisan tidak harus 1 huruf dan upperCase, hanya kebiasaan programer Java
interface Message<T> {
	public T getMessage();
}

// class Generic<Data> { // bisa
class Generic<T> { // maka data T akan bertipe sama
	private T data;
	
	Generic(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}

class Biasa {
	private Object data;
	
	Biasa(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
}

public class GenericApp {
	
	public static void main(String[] args) {
		
		// Membuat object dari generic
		Message<String> message = () -> "Hello My Friend";
		
		// Tipe Data wajib Bertipe Object: String, Integer, Boolean dll
		Generic<String/*wajib diisi*/> generic = new Generic<String/*penulisan tipe data optional*/>("Generic");
		// Generic<String/*wajib diisi*/> generic = new Generic<>("Generic");
		
		Biasa biasa = new Biasa("Biasa");
		
		String genericVal = generic.getData(); // tidak perlu dilakukan casting
		String biasaVal = (String)biasa.getData(); // jika pada object data berbeda maka harus casting manual
		
		System.out.println(message.getMessage());
		System.out.println(genericVal);
		System.out.println(biasaVal);
		
	}
	
}