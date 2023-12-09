class MyArray {
	
	// penulisan Generic sebelum tipe data method
	public static <T> int showLength(T[] data) {
		return data.length;
	}
	
	// scope T di atas dengan T di bawah berbeda
	public static <T, U> boolean isEquals(T t, U u) {
		if(t == u || t.equals(u)) {
			return true;
		}
		return false;
	}
}

public class GenericMethodApp {
	
	public static void main (String[] args) {
		
		String[] dataRay = {"Maulana", "Ifan", "dika"};
		
		System.out.println(MyArray.showLength(dataRay));
		
		System.out.println(MyArray.isEquals("Kipli", "Kipli"));
		
	}
}