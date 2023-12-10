# Tutorial Java Generic
#
## 1. Pengertian
Java Generic adalah kemampuan dalam bahasa pemprograman Java untuk membuat tipe parameter yang umum.  

#### 1.2 Penulisan Tipe Generic
Penulisan Tipe Generic menggunakan.  

- E : Elemen
- K : Key/Kunci
- N : Number/Bilangan
- T : Type/Tipe
- V : Value/Nilai
- dll  

## 2. Tipe Generic
Tipe Generic disini adalah tipe generic class atau interface. Contoh dengan kelas Box.  

#### 2.1 Kelas Box
Membuat kelas Box tanpa menggunakan Generic & mempunyai beberapa fungsi seperti get,set, add.

```Java
/**
 * Kelas Box tanpa Generic
 * Kelas Box berisi Array Objek, dapat menyimpan data apapun
 */
public class Box {
	public Object[] obj;
	private int index = 0;

	public Box() {
		obj = new Object[5];
	}

	public void set(Object[] o) {
		obj = o;
	}

	public void add(Object o) {
		obj[index++] = o;
	}

	public Object get(int index) {
		return obj[index];
	}
}

```

Ketika buat Objek Box maka bisa memasukan jenis data apapun karena bertipe Objek, semisal kita masukan data String atau Integer akan bisa, jika semisal kondisi salah masukan data dan data yang kita ambil tidak sesuai maka akan terjadi eror.  

```Java
/**
 * Contoh program
 */ 
public class Main {
	public static vodi main(String[] args) {
		Box box = new Box();

		// Maka dapat dimasukan data dengan tipe yang berbeda
		boxInteger.add(10);
		boxInteger.add("Jhoni");
		boxInteger.add(true);

		System.out.println(Arrays.toString(box.obj));
	}
}
```
Output  
```Terminal
[10, Jhoni, true, null, null]
```

#### 2.2 Kelas Box Generic
Untuk format Generic pada class:  
```Java
class nama<T1, T2, ..., Tn> {
	...
}
```
Huruf T hanya sebagai simbol untuk tipe parameter dari kelas itu, Generic disimbolkan dengan kurung (<>) setelah nama kelas. Buat kelas Box dengan cara Generic dengan menambahkan <> & nama parameter T setelah nama kelas.  
```Java
/**
  * Versi Generic dari kelas Box
  * @param <T>  untuk tipe data.
  */
public class Box<T> {
	// T untuk tipe
	private T[] type;
	private int index = 0;

	public Box() {
		type = new T[10];
	}

	public void set(T[] t) {
		type = t;
	}

	public void add(T t) {
		type[index++] = t;
	}

	public T get(int index) {
		return type[index];
	}
}
```

## Tipe Raw
Tipe Raw adalah nama dari class atau interface tanpa tipe parameter. Sebagai contoh dengan class Box.
```Java
public class Box<T> {
    public void set(T t) { /* ... */ }
    // ...
}
```
Jika membuat objek generic seperti biasa akan seperti ini.
```Java
	Box<Integer> intBox = new Box<>();
```
Sedangkan yang disebut ***Raw Type*** adalah kita tidak memberikan tipe parameter apapun.
```Java
	Box rawBox = new Box();
```
Ini berati Box adalah tipe raw dari Box<T>, jika non-generic class atau interface bukan tipe raw.

## Type Inference

## Wildcards
Pada Generic, simbol tanda tanya (?) disebut ***Wildcards*** yang berati tipe tidak diketahui. Wildcards dapat dipakai di tipe parameter, field, tipe kembalian.  

#### Upper Bounded Wildcards

## Tipe Erasure
Generic diperkenalkan pada Java guna mendukung kompilasi dan generic programming. Hal yang terjadi pada kompilasi ketika menggunakan generic.

- Mengganti semua tipe generic menjadi Object jika tipe unbounded.
- Mengganti semua tipe generic menjadi tipe yang di tuju jika tipe generic bounded.
#### Contoh pada tipe parameter
**1. Contoh tipe unbounded**  
Ada class generic bernama Node representasi node single linked list.
```Java
public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}
	// ...
}
```

Karena tipe paramter adalah unbouded maka akan dirubah menjadi Object.

```Java
public class Node {

    private Object data;
    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() { return data; }
    // ...
}
```

**2. Contoh tipe bounded**  
Menggunakan class node tetapi bertipe bounded parameter.
```Java
public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> next;

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}
	// ...
}
```
Maka yang terjadi adalah compiler merubah tipe T menjadi Comparable.

```Java
public class Node {

    private Comparable data;
    private Node next;

    public Node(Comparable data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Comparable getData() {
    	return data;
    }
    // ...
}
```

#### Contoh pada fungsi

