public class MultipleBoundedTPApp {
	
	public static void main(String[] args) {
		
		// ERROR, Karena class Senior tidak implements Introduction
		// Profil<Senior> senior = new Profil<>(new Senior());
		
		Profil<Junior> junior = new Profil<>(new Junior());
		
		System.out.println(junior.getData());
		
	}
	
	public static interface Introduction {
		public void hello();
	}
	public static abstract class Title {}
	public static class Expert extends Title {}
	public static class Senior extends Title {}
	public static class Junior extends Title implements Introduction {
		@Override
		public void hello() {
			System.out.println("Hellooo");
		}
	}
	
	// Hanya bisa 1 class dan seterusnya adalah interface
	public static class Profil<T extends Title & Introduction> { // Hanya yang turunan Title dan implements Introduction
		private T data;
		
		public Profil(T t) {
			this.data = t;
		}
		
		public T getData() {
			return this.data;
		}
		
		public void setData(T newData) {
			this.data = newData;
		}
		
	}
}