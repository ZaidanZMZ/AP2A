# 🛍️ Java Product Management App

Selamat datang di repositori **Java Product Management App**, sebuah aplikasi sederhana berbasis OOP (Object-Oriented Programming) yang mengelola produk seperti pakaian dan elektronik dengan menggunakan konsep inheritance, encapsulation, dan method overriding dalam Java.

---

## 📚 Navigasi Cepat

* [🧠 Penjelasan Program](#-penjelasan-program)
* [🏗️ Struktur Kode](#-struktur-kode)

  * [1️⃣ Product.java](#1️⃣-productjava)
  * [2️⃣ Electronics.java](#2️⃣-electronicsjava)
  * [3️⃣ Clothing.java](#3️⃣-clothingjava)
  * [4️⃣ MainApp.java](#4️⃣-mainappjava)
* [🔧 Alasan Penggunaan Modifier & Tipe Data](#-alasan-penggunaan-modifier--tipe-data)
* [▶️ Cara Menjalankan Program](#️-cara-menjalankan-program)

---

## 🧠 Penjelasan Program

Program ini menyimulasikan manajemen produk dengan 3 jenis objek:

* **Product** → kelas dasar.
* **Electronics** → subclass dengan atribut `warrantyMonths`.
* **Clothing** → subclass dengan atribut `size`.

Setiap class memiliki atribut yang **di-enkapsulasi (private)** dan diakses melalui **setter/getter**. Tujuannya: menjaga keamanan dan fleksibilitas data.

---

## 🏗️ Struktur Kode

### 1️⃣ Product.java

```java
private String name;
private double price;
private int productId;
```

* Modifier `private` digunakan agar atribut hanya bisa diubah lewat method (`setter/getter`).
* Getter dan setter `protected` agar subclass dapat mengaksesnya.
* `getInfo()` digunakan untuk mencetak informasi produk.

### 2️⃣ Electronics.java

```java
private int warrantyMonths;
```

* Menambahkan atribut khusus untuk barang elektronik.
* Override method `getInfo()` agar informasi garansi bisa ditampilkan.

### 3️⃣ Clothing.java

```java
private String size;
```

* Menambahkan atribut ukuran pakaian.
* Override method `getInfo()` untuk menampilkan ukuran.

### 4️⃣ MainApp.java

```java
Product shirt = new Product();
Electronics elektronik = new Electronics();
Clothing polo = new Clothing();
```

* Membuat objek, mengatur nilainya dengan setter, dan mencetak data.

---

## 🔧 Alasan Penggunaan Modifier & Tipe Data

| Elemen              | Alasan                                                            |
| ------------------- | ----------------------------------------------------------------- |
| `private` attribute | Enkapsulasi data agar tidak bisa diakses langsung dari luar class |
| `protected` method  | Dapat diakses dari subclass tanpa membuat semuanya public         |
| `String`            | Menyimpan nama atau ukuran produk sebagai teks                    |
| `double`            | Menyimpan harga karena memiliki nilai desimal                     |
| `int`               | ID produk dan jumlah garansi (bulan) hanya butuh bilangan bulat   |

---

## ▶️ Cara Menjalankan Program

### ✅ Langkah-langkah:

1. **Pastikan Java telah terinstal**.
2. Simpan semua file `.java` (Product.java, Electronics.java, Clothing.java, MainApp.java) di satu folder.
3. Buka terminal/command prompt di folder tersebut.
4. Compile semua file:

   ```bash
   javac *.java
   ```
5. Jalankan program:

   ```bash
   java MainApp
   ```

### 💡 Output yang Diharapkan

```
---Shirt---
Shirt - 25.8 Euro

---Electronics---
Name : Laptop
Price : 999.99
Id : 1
Warranty : 3 Months

---Clothing---
Name : Polo
Price : 9.99
Id : 1
Size : M
```

---

## 📌 Catatan Tambahan

* Kamu dapat menambahkan produk lain dengan membuat subclass baru.
* Bisa dikembangkan dengan database, GUI, atau REST API ke depannya.

---

Created with ❤️ by \[Zaidan Zaki Maksudi].