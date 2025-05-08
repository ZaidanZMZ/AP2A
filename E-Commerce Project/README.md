
# Java Inheritance Example: Product Management

Proyek ini merupakan contoh implementasi konsep **inheritance** (pewarisan) dalam bahasa pemrograman Java. Di dalamnya terdapat kelas dasar `Product`, serta dua kelas turunan `Electronics` dan `Clothing`, yang menunjukkan bagaimana pewarisan, enkapsulasi, dan polimorfisme dapat digunakan dalam desain sistem berorientasi objek.

## 📑 Navigasi Cepat

- [📁 Struktur File](#-struktur-file)
- [📌 Penjelasan Kode](#-penjelasan-kode)
  - [Product.java](#1-productjava)
  - [Electronics.java](#2-electronicsjava)
  - [Clothing.java](#3-clothingjava)
  - [MainApp.java](#4-mainappjava)
- [▶️ Cara Menjalankan Aplikasi](#️-cara-menjalankan-aplikasi)
- [📚 Konsep OOP yang Digunakan](#-konsep-oop-yang-digunakan)
- [📦 Catatan Tambahan](#-catatan-tambahan)
- [🧑‍💻 Author](#-author)

## 📁 Struktur File

- `Product.java`: Kelas induk dasar yang merepresentasikan produk umum.
- `Electronics.java`: Kelas turunan dari `Product` yang mewakili produk elektronik.
- `Clothing.java`: Kelas turunan dari `Product` yang mewakili produk pakaian.
- `MainApp.java`: Kelas utama untuk menjalankan program dan menampilkan informasi produk.

## 📌 Penjelasan Kode

### 1. `Product.java`

Kelas dasar `Product` memiliki properti:
- `name`: Nama produk (String)
- `price`: Harga produk (double)
- `productId`: ID produk (int)

Semua atribut dan metode menggunakan modifier **`protected`**, artinya:
- Dapat diakses oleh kelas turunan dan kelas dalam paket yang sama.
- Berguna untuk melindungi data dari akses luar sembarangan, namun tetap bisa digunakan di subclass.

Metode `getInfo()` menampilkan informasi singkat produk: nama dan harga.

### 2. `Electronics.java`

Merupakan subclass dari `Product`. Menambahkan atribut baru:
- `warrantyMonths`: Masa garansi (int)

Konstruktor memberi nilai default garansi 12 bulan.

Metode `getInfo()` di-*override* untuk menampilkan masa garansi elektronik.

### Alasan Penggunaan:
- `int` cocok untuk merepresentasikan bulan karena nilainya numerik dan tidak perlu desimal.
- Overriding `getInfo()` memungkinkan mencetak informasi spesifik elektronik.

### 3. `Clothing.java`

Subclass dari `Product`. Menambahkan atribut baru:
- `size`: Ukuran pakaian (String), seperti "M", "L", dll.

Konstruktor memberi nilai default "Unknown".

Metode `getInfo()` di-*override* untuk menampilkan ukuran pakaian.

### Alasan Penggunaan:
- `String` digunakan untuk ukuran karena biasanya berupa huruf (bukan angka).
- Enkapsulasi menjaga agar nilai `size` tidak langsung diakses dari luar kelas.

### 4. `MainApp.java`

Berfungsi sebagai entry point (`main` method). Dalam file ini:
- Dibuat objek dari masing-masing kelas (`Product`, `Electronics`, `Clothing`)
- Properti diset melalui setter.
- Informasi dicetak ke konsol menggunakan `System.out.println()` dan `getInfo()`.

## ▶️ Cara Menjalankan Aplikasi

### Prasyarat:
- JDK (Java Development Kit) telah terinstal di komputer Anda.
- Kompatibel dengan JDK 8 ke atas.

### Langkah-Langkah:

1. **Kompilasi Semua File**
   Jalankan perintah berikut di terminal dari direktori tempat file `.java` disimpan:

   ```bash
   javac Product.java Electronics.java Clothing.java MainApp.java
   ```

2. **Jalankan Program**
   Setelah berhasil dikompilasi, jalankan kelas utama:

   ```bash
   java MainApp
   ```

3. **Output**
   Anda akan melihat informasi tentang:
   - Produk umum (Shirt)
   - Produk elektronik (Laptop)
   - Produk pakaian (Polo Shirt)

## 📚 Konsep OOP yang Digunakan

- **Inheritance**: `Electronics` dan `Clothing` mewarisi atribut dan metode dari `Product`.
- **Encapsulation**: Atribut dilindungi melalui modifier `protected`, dan diakses via getter/setter.
- **Polymorphism**: Metode `getInfo()` di-*override* untuk menampilkan informasi spesifik sesuai jenis produk.

## 📦 Catatan Tambahan

- Anda bisa mengembangkan program ini dengan menambahkan lebih banyak jenis produk.
- Modifier `protected` dipilih untuk memberikan akses kepada subclass, tetapi tetap menjaga enkapsulasi dari kelas luar.

## 🧑‍💻 Author

Program ini dibuat sebagai contoh sederhana untuk memahami dasar-dasar OOP dalam Java.
