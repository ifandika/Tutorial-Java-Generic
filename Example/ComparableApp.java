/**
 * Contoh implementasi Generic
 * - Comparable
 */
 
import java.util.Arrays;

public class ComparableApp {
	
	public static void main(String[] args) {
		
		Person[] person = {
			new Person("Budi", "Indonesian"),
			new Person("Garok", "Japanese"),
			new Person("Penaldo", "Purtogal")
		};
		
		Arrays.sort(person);
		
		System.out.println(Arrays.toString(person));
	}
	
	private static class Person implements Comparable<Person> {
		private String name;
		private String country;
		
		public Person(String name, String country) {
			this.name = name;
			this.country = country;
		}
		
		@Override
		public int compareTo(Person o) {
			return this.name.compareTo(o.name);
		}
		
		// Override method toString() dari Arrays
		@Override
		public String toString() {
			return "Person{" +
					"Name:\"" + this.name + '\"' +
					", Country:\"" + this.country + '\"' +
					"}";
		}
		
	}
}