# 📦 Java Product Inheritance Project

> Sebuah contoh sederhana program Java OOP (Object-Oriented Programming) yang menggunakan konsep inheritance (pewarisan), encapsulation (enkapsulasi), dan access modifiers (`private`, `protected`, `public`).

---

## 📚 Navigasi

* [📁 Struktur Proyek](#-struktur-proyek)
* [🧠 Penjelasan Logika Program](#-penjelasan-logika-program)
* [🔍 Penjelasan Kode & Alasan Penggunaan Sintaks](#-penjelasan-kode--alasan-penggunaan-sintaks)

  * [1. MainApp.java](#1-mainappjava)
  * [2. Product.java](#2-productjava)
  * [3. Electronics.java](#3-electronicsjava)
  * [4. Clothing.java](#4-clothingjava)
* [▶️ Cara Menjalankan Program](#️-cara-menjalankan-program)

---

## 📁 Struktur Proyek

```
ProductInheritance/
├── MainApp.java
├── Product.java
├── Electronics.java
├── Clothing.java
└── README.md
```

---

## 🧠 Penjelasan Logika Program

Program ini mendemonstrasikan **pewarisan class di Java**:

* `Product` adalah **kelas induk** dengan atribut dasar sebuah produk: `name`, `price`, dan `productId`.
* `Electronics` dan `Clothing` adalah **subclass** yang mewarisi `Product`, tetapi menambahkan atribut baru: `warrantyMonths` dan `size`.
* Kelas `MainApp` membuat objek-objek dari semua class tersebut, lalu menyetel dan menampilkan informasi produk dengan menggunakan **setter, getter**, dan **method override** (`getInfo`).

---

## 🔍 Penjelasan Kode & Alasan Penggunaan Sintaks

### 1. MainApp.java

```java
public class MainApp {
    public static void main(String[] args) {
        Product shirt = new Product();
        Electronics elektronik = new Electronics();
        Clothing polo = new Clothing();
        
        shirt.setName("Shirt");
        shirt.setPrice(25.80);
        shirt.setProductId(1);

        elektronik.setName("Laptop");
        elektronik.setPrice(999.99);
        elektronik.setProductId(1);
        elektronik.setWarrantyMonths(3);

        polo.setName("Polo");
        polo.setPrice(9.99);
        polo.setProductId(1);
        polo.setSize("M");

        System.out.println("---Shirt---");
        shirt.getInfo();

        System.out.println("\n---Electronics---");
        System.out.println("Name : " + elektronik.getName() + "\nPrice : " + elektronik.getPrice() + "\nId : " + elektronik.getProductId());
        elektronik.getInfo();

        System.out.println("\n---Clothing---");
        System.out.println("Name : " + polo.getName() + "\nPrice : " + polo.getPrice() + "\nId : " + polo.getProductId());
        polo.getInfo();
    }
}
```

✅ *Penjelasan:*

* `public static void main(String[] args)` adalah titik awal eksekusi program Java.
* Objek dibuat dari class dengan constructor default, lalu disetel dengan setter.

### 2. Product.java

```java
public class Product {
    private String name;
    private double price;
    private int productId;

    protected Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.productId = 0;
    }

    protected String getName() { return name; }
    protected double getPrice() { return price; }
    protected int getProductId() { return productId; }

    protected void setName(String name) { this.name = name; }
    protected void setPrice(double price) { this.price = price; }
    protected void setProductId(int productId) { this.productId = productId; }

    protected void getInfo() {
        System.out.println(getName() + " - " + getPrice() + " Euro");
    }
}
```

✅ *Penjelasan:*

* Semua atribut dibuat `private` untuk **encapsulation**, agar tidak bisa diakses langsung.
* Getter dan setter dibuat `protected` agar bisa diakses oleh subclass (seperti `Electronics`, `Clothing`).
* Method `getInfo()` menampilkan nama dan harga produk, dapat dioverride di subclass.

### 3. Electronics.java

```java
public class Electronics extends Product {
    private int warrantyMonths;

    protected Electronics() {
        this.warrantyMonths = 12;
    }

    protected void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    protected void getInfo() {
        System.out.println("Warranty : " + warrantyMonths + " Months");
    }
}
```

✅ *Penjelasan:*

* Menambahkan atribut baru `warrantyMonths` dengan default `12`.
* Override method `getInfo()` untuk menampilkan informasi garansi.

### 4. Clothing.java

```java
public class Clothing extends Product {
    private String size;

    protected Clothing() {
        this.size = "Unknown";
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected void getInfo() {
        System.out.print("Size : " + size);
    }
}
```

✅ *Penjelasan:*

* Tambahan atribut `size`.
* Override method `getInfo()` untuk menampilkan ukuran baju.

---

## ▶️ Cara Menjalankan Program

### 1. **Kompilasi Semua File**

Pastikan Anda berada di folder yang berisi file `.java` tersebut, lalu jalankan:

```bash
javac *.java
```

### 2. **Menjalankan Program**

Setelah berhasil dikompilasi, jalankan:

```bash
java MainApp
```

### 3. **Output yang Diharapkan**

```text
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

* Jika semua atribut dibuat `private`, pastikan ada getter dan setter (minimal `protected`) untuk akses di subclass.
* Kelas tidak bisa dijadikan `private` jika kelas tersebut adalah **top-level class**.
* Gunakan `protected` untuk memberikan akses ke subclass, tanpa membuat atribut atau method sepenuhnya `public`.

---

Selesai ✅

Jika ingin menambahkan fitur baru seperti diskon produk, kategori barang, atau ekspor ke file, silakan lanjutkan proyek ini 🚀
