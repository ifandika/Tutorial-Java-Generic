/**
 * [ Covariant ]
 * - Cara Convert/Subtype Generic dari SuperClass ke SubClass
 * - Covariant hanya bisa Read 
 * - Hanya bisa Read Only agar data yang di kirim aman
 * - <? extends Object> : Kode covariant, Object adalah SuperClass dari semua Class
 */

class General<T> {
	private T data;
	
	public T getData() {return this.data;}
	
	public void setData(T data) {this.data = data;}
}

public class CovariantApp {
	
	public static void main(String[] args) {
		
		General<String> stringGeneral = new General<>();
		stringGeneral.setData("Maul");
		
		process(stringGeneral);
		
		// karena extends Object maka data apapun bisa diterima karena Semua extends Object
		General<? extends Object> objectGeneral = stringGeneral; // Bisa
		
	}
	
	public static void process(General<? extends Object> data) {
		System.out.println(data.getData());
		
		// ERROR: Bahaya karena bisa saja merubah tipe data asli dari Object tersebut yang tadinya String menjadi Integer
		// data.setData(1); 
	}
}