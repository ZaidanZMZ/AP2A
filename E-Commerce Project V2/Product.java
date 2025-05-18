import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Kelas abstrak sebagai induk untuk semua produk
public abstract class Product {
    // Atribut hanya bisa diakses langsung di class ini (encapsulation)
    private String name;
    private double price;
    private LocalDateTime createdAt;

    // Konstruktor tanpa parameter, waktu dibuat otomatis
    public Product() {
        this.createdAt = LocalDateTime.now();
    }

    // Method abstrak, bisa di-override oleh subclass
    protected abstract String getCategory();

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Menampilkan info produk dengan waktu pembuatan
    public String getInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return name + " - Rp" + price + "\nDibuat pada: " + createdAt.format(formatter);
    }
}
