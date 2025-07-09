# 🛒 Online Shop GUI - Java Swing

Proyek ini merupakan simulasi **sistem toko online** berbasis desktop yang dibuat menggunakan bahasa pemrograman Java dengan antarmuka GUI (Graphical User Interface) menggunakan **Java Swing**. Aplikasi ini memungkinkan pengguna untuk menambah produk, mencari produk berdasarkan ID, melakukan transaksi pembelian, dan melihat daftar pembelian pelanggan.

---

## ✨ Fitur Utama

- Tambah produk dengan kategori:
  - 📱 Elektronik (dengan masa garansi)
  - 👕 Fashion (dengan ukuran: S, M, L, XL)
- Cari produk berdasarkan ID
- Transaksi pembelian oleh pelanggan
- Tabel daftar produk dan pembelian
- Validasi input untuk menghindari kesalahan

---

## 🧠 Cara Kerja Program

1. **Menambahkan Produk**
   - Pengguna mengisi ID produk, nama, harga, dan info tambahan (garansi/ukuran).
   - Setelah diklik tombol **Tambah Produk**, produk ditambahkan ke daftar dan combo box pemilihan produk.

2. **Pencarian Produk**
   - Pengguna memasukkan ID produk.
   - Program mencari produk di `ProductManager` dan menampilkan informasi detail melalui `JOptionPane`.

3. **Transaksi Pembelian**
   - Pengguna memilih produk dan mengisi nama pelanggan.
   - Setelah klik **Buy**, produk dicatat ke dalam `TransactionManager` sesuai nama pelanggan.
   - Tabel pembelian diperbarui secara otomatis.

4. **Manajemen Data**
   - Semua data disimpan dalam memori menggunakan struktur koleksi Java seperti `List` dan `Map`.
   - Setiap pelanggan menyimpan produk dalam `Set` agar tidak duplikat.

---

## 🛠 Teknologi

- Java 17+
- Maven
- Java Swing (GUI)
- OOP: Inheritance, Polymorphism, Encapsulation

---

## 📂 Struktur Paket

zaidanzakizmz.com.online_shop
├── MainApp.java // GUI utama
├── Product.java // Kelas abstrak produk
├── Clothing.java // Produk fashion (extends Product)
├── Electronics.java // Produk elektronik (extends Product)
├── ProductManager.java // Manajemen produk
├── TransactionManager.java // Manajemen transaksi pembelian
├── ProductNotFoundException.java
├── Size.java // Enum untuk ukuran baju

yaml
Copy
Edit

---

## 📌 Catatan

- Proyek ini hanya menyimpan data sementara (tidak menggunakan database).
- Diperlukan Java versi terbaru agar program dapat berjalan optimal.

---

## 👤 Dibuat oleh

**Zaidan Zaki Maksudi**

> Proyek ini dibuat sebagai bagian dari tugas kuliah [Algoritma dan Pemrograman II].  