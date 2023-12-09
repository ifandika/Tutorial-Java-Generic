/**
 * ContraVariant
 * - Cara Convert/SubType dari SuperClass ke SubClass yang bertipe data tertentu
 * - <? Super ClassName>
 * - Namun harus berhati² dalam menggunakan ContraVariant
 * - ContraVariant bisa Read dan Write
 */

public class ContraVariantApp {
	
	public static void main(String[] args) {
		
		// karena Generic Type Object maka data bisa di ubah apa saja
		MyClass<Object> objectMyClass = new MyClass<>("Jupri");
		
		// objectMyClass.setData(100); // valid naum saat di run maka error;
		process(objectMyClass);
		
		// SubTye dari Object ke String
		MyClass<? super String> stringMyClass = objectMyClass;
		
		stringMyClass.getData();
	}
	
	public static class MyClass<T> {
		private T data;
		
		public MyClass(T data) {this.data = data;}
		public T getData() {return this.data;}
		public void setData(T data) {this.data = data;}
	}
	
	public static void process(MyClass<? super String> data) {
		// String value = (String)data.getData(); // karena Object maka di paksa menjadi String
		Object value = data.getData(); // Yang disarankan
		
		System.out.println("Process name "+value);
		System.out.println(data.getData());
	}
	
}