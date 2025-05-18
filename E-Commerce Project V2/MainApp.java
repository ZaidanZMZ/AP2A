// Kelas utama untuk menjalankan program
public class MainApp {
    public static void main(String[] args) {
        // Buat produk elektronik
        Electronics elektronik = new Electronics();
        elektronik.setName("Laptop Lenovo");
        elektronik.setPrice(13000000);
        elektronik.setSpecification(2.2, "Lenovo");

        // Buat produk pakaian
        Clothing pakaian = new Clothing();
        pakaian.setName("Hoodie Polos");
        pakaian.setPrice(250000);
        pakaian.setSize(Size.L);

        // Polymorphic reference
        Product produk1 = elektronik;
        Product produk2 = pakaian;

        Discountable diskon1 = elektronik;
        Discountable diskon2 = pakaian;

        // Output rapi dan terstruktur
        System.out.println("=== PRODUK 1 ===");
        System.out.println("Kategori     : " + produk1.getCategory());
        System.out.println(produk1.getInfo());
        System.out.println("Harga Diskon 30% : Rp" + diskon1.getDiscountedPrice(30));
        System.out.println();

        System.out.println("=== PRODUK 2 ===");
        System.out.println("Kategori     : " + produk2.getCategory());
        System.out.println(produk2.getInfo());
        System.out.println("Harga Diskon 10% : Rp" + diskon2.getDiscountedPrice(10));
    }
}
