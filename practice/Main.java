import java.util.*;

public class Main {
	public static void main(String[] args) {

		printList(List.of("Joni", "Frank", "Jammy", "Ali"));
		printList(List.of(100, 200, 500));
		
	}

	static void printList(List<?> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
}