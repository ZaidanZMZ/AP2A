# 🛒 Mini Project: Java E-Commerce App

Selamat datang di repositori **Mini Project: Java E-Commerce App**, sebuah aplikasi sederhana yang dirancang sebagai **tugas pembelajaran** untuk memahami **dasar-dasar OOP (Object-Oriented Programming)** dalam bahasa pemrograman Java. Proyek ini mencontohkan bagaimana membuat dan mengelola data produk seperti pakaian dan elektronik menggunakan konsep inheritance, encapsulation, dan polymorphism.

---

## 📚 Navigasi Cepat

* [📘 Deskripsi Proyek](#-deskripsi-proyek)
* [🏗️ Struktur Kode](#-struktur-kode)

  * [1️⃣ Product.java](#1️⃣-productjava)
  * [2️⃣ Electronics.java](#2️⃣-electronicsjava)
  * [3️⃣ Clothing.java](#3️⃣-clothingjava)
  * [4️⃣ MainApp.java](#4️⃣-mainappjava)
* [🛠️ Alasan Penggunaan Modifier & Tipe Data](#️-alasan-penggunaan-modifier--tipe-data)
* [▶️ Cara Menjalankan Program](#️-cara-menjalankan-program)

---

## 📘 Deskripsi Proyek

Proyek ini dibuat dalam rangka **latihan membuat aplikasi e-commerce sederhana**. Fokus utama adalah **implementasi konsep OOP**, bukan UI atau database. Program terdiri dari:

* **Product** sebagai class induk.
* **Electronics** dan **Clothing** sebagai class turunan.
* Class utama **MainApp** yang menjalankan logika dan simulasi aplikasi.

Pengguna dapat:

* Membuat objek produk.
* Mengatur nama, harga, ID, dan atribut khusus.
* Menampilkan informasi produk ke konsol.

---

## 🏗️ Struktur Kode

### 1️⃣ Product.java

```java
private String name;
private double price;
private int productId;
```

* Class dasar untuk semua produk.
* Menggunakan `private` agar atribut hanya bisa diakses melalui setter/getter.
* `protected` digunakan pada method agar subclass dapat mengaksesnya tanpa membuka akses ke luar class.

### 2️⃣ Electronics.java

```java
private int warrantyMonths;
```

* Subclass dari Product.
* Menambahkan atribut `warrantyMonths`.
* Override `getInfo()` agar bisa menampilkan informasi garansi elektronik.

### 3️⃣ Clothing.java

```java
private String size;
```

* Subclass dari Product.
* Menambahkan atribut `size`.
* Override `getInfo()` untuk mencetak ukuran pakaian.

### 4️⃣ MainApp.java

```java
Product shirt = new Product();
Electronics elektronik = new Electronics();
Clothing polo = new Clothing();
```

* Membuat objek produk.
* Mengatur data dengan setter.
* Mencetak informasi produk ke konsol menggunakan `getInfo()`.

---

## 🛠️ Alasan Penggunaan Modifier & Tipe Data

| Elemen              | Penjelasan                                                            |
| ------------------- | --------------------------------------------------------------------- |
| `private` attribute | Untuk menjaga enkapsulasi dan mencegah akses langsung dari luar class |
| `protected` method  | Agar subclass bisa mewarisi dan mengakses method dari class induk     |
| `String`            | Tipe data untuk nama produk dan ukuran pakaian                        |
| `double`            | Cocok untuk menyimpan harga dengan nilai desimal                      |
| `int`               | Dipakai untuk ID produk dan masa garansi                              |

---

## ▶️ Cara Menjalankan Program

### ✅ Langkah-langkah:

1. Pastikan Java Development Kit (JDK) telah terinstal.
2. Simpan semua file `.java` (Product.java, Electronics.java, Clothing.java, MainApp.java) di dalam satu folder.
3. Buka terminal/command prompt, navigasikan ke folder tersebut.
4. Compile semua file Java:

   ```bash
   javac *.java
   ```
5. Jalankan program utama:

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

* Proyek ini dapat dikembangkan dengan menambahkan fitur seperti: filter produk, daftar belanja, atau koneksi database.
* Sangat cocok untuk latihan implementasi OOP sebelum masuk ke level yang lebih kompleks (seperti GUI/Android/web).

---

Created with ❤️ for educational purposes.
