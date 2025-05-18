# 🛒 E-Commerce Project V2 (OOP Java)

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.java.com/)
![Status](https://img.shields.io/badge/status-complete-brightgreen)
![Contributions](https://img.shields.io/badge/contributions-welcome-lightgrey)

Sistem belanja online sederhana berbasis **Object-Oriented Programming (OOP)** dalam bahasa Java. Program ini dikembangkan untuk memenuhi tugas kuliah dengan penerapan konsep **class, inheritance, polymorphism, interface, enum, inner class**, serta **encapsulation** yang baik.

---

## 📚 Daftar Isi

- [🎯 Tujuan](#-tujuan)
- [⚙️ Fitur Utama](#%EF%B8%8F-fitur-utama)
- [🧠 Penjelasan Sintaks dan Logika](#-penjelasan-sintaks-dan-logika)
  - [1. Struktur Class](#1-struktur-class)
  - [2. Modifier Akses](#2-modifier-akses)
  - [3. Tipe Data dan Objek](#3-tipe-data-dan-objek)
  - [4. Polymorphism & Interface](#4-polymorphism--interface)
  - [5. Enum dan Inner Class](#5-enum-dan-inner-class)
- [🚀 Cara Menjalankan Program](#-cara-menjalankan-program)
- [👥 Anggota Kelompok](#-anggota-kelompok)

---

## 🎯 Tujuan

- Menerapkan konsep-konsep OOP tingkat lanjut dalam Java.
- Menggunakan *encapsulation*, *inheritance*, *abstract class*, *interface*, *enum*, dan *inner class*.
- Mengelola informasi produk dan menghitung diskon berdasarkan jenis produk.
- Menampilkan informasi produk dengan format yang bersih dan mudah dibaca.

---

## ⚙️ Fitur Utama

✅ Produk didefinisikan sebagai abstract class (`Product`)  
✅ `Electronics` memiliki inner class `Specification`  
✅ `Clothing` menggunakan enum `Size`  
✅ Interface `Discountable` digunakan untuk perhitungan diskon  
✅ Tanggal pembuatan produk otomatis dengan `LocalDateTime`  
✅ Struktur kode menggunakan *encapsulation* penuh dan OOP yang rapi  

---

## 🧠 Penjelasan Sintaks dan Logika

### 1. Struktur Class

```
OnlineShoppingSystem2/
├── Product.java           // Abstract class produk
├── Electronics.java       // Subclass + inner class Specification
├── Clothing.java          // Subclass + enum Size
├── Size.java              // Enum ukuran pakaian
├── Discountable.java      // Interface diskon
├── MainApp.java           // Main program
└── README.md              // Dokumentasi ini
```

### 2. Modifier Akses

| Modifier     | Deskripsi                                                   |
|--------------|-------------------------------------------------------------|
| `private`    | Melindungi data agar tidak bisa langsung diubah dari luar class |
| `protected`  | Digunakan untuk method/atribut yang bisa dioverride         |
| `public`     | Digunakan untuk akses global                                |

> Encapsulation diterapkan penuh: semua atribut `private`, diakses via getter/setter.  
> Modifier `protected` digunakan untuk method seperti `getCategory()`.

### 3. Tipe Data dan Objek

- `String`: untuk nama produk, merek, ukuran
- `double`: untuk harga dan berat
- `LocalDateTime`: untuk waktu pembuatan produk (menggunakan `java.time`)
- `Size`: enum untuk memastikan ukuran terbatas pada pilihan XS–XL

### 4. Polymorphism & Interface

```java
Product p = new Electronics(...);
Discountable d = (Discountable) p;
```

- Penggunaan `interface` memungkinkan pemanggilan `getDiscountedPrice()` tanpa tahu tipe produk-nya.
- `Product` sebagai superclass bisa menyimpan objek dari subclass apapun (polymorphism).

### 5. Enum dan Inner Class

```java
public enum Size {
    XS, S, M, L, XL
}
```

- Membatasi ukuran hanya ke pilihan valid, mencegah input asal.

```java
public class Specification {
    private double weight;
    private String brand;
}
```

- `Specification` adalah **inner class** dari `Electronics`, menyimpan info teknis produk.

---

## 🚀 Cara Menjalankan Program

### 1. Kompilasi Semua File

```bash
javac *.java
```

### 2. Jalankan Program

```bash
java MainApp
```

### Output Contoh:

```
=== PRODUK 1 ===
Kategori     : Electronics
Laptop Lenovo - Rp13000000.0
Dibuat pada  : 2025-05-17 22:13:45
Spesifikasi:
- Merek : Lenovo
- Berat : 2.2 kg
Harga Diskon : Rp9100000.0

=== PRODUK 2 ===
Kategori     : Clothing
Hoodie Polos - Rp250000.0
Dibuat pada  : 2025-05-17 22:13:45
Ukuran       : L
Harga Diskon : Rp225000.0
```

---

## 👥 Anggota Kelompok

- **Zaidan Zaki Maksudi**
- **NPM: 51424398**

---

## 💬 Kontribusi & Feedback

Silakan fork atau pull request jika ingin memberikan kontribusi tambahan!  
Untuk pertanyaan atau laporan bug, silakan buka *Issue*.

---
