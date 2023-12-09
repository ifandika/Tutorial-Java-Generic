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
		boxInteger.add(“Jhoni”);
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

