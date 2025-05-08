// Penjelasan Lengkap Pada file "README.md" !!
public class MainApp {
    public static void main(String[] args) {
        // Membuat objek product shirt dengan constructor default
        Product shirt = new Product();
        

        // Membuat objek electronics dengan constructor default
        Electronics elektronik = new Electronics();
       

        // Membuat objek clothing dengan constructor default
        Clothing polo = new Clothing();


        // Set nama, harga, dan id produk shirt dengan setter
        shirt.setName("Shirt");
        shirt.setPrice(25.80);
        shirt.setProductId(1);


        // Set nama, harga, dan id produk shirt dengan setter
        elektronik.setName("Laptop");
        elektronik.setPrice(999.99);
        elektronik.setProductId(1);
        elektronik.setWarrantyMonths(3);


        // Set nama, harga, dan id produk clothing polo dengan setter
        polo.setName("Polo");
        polo.setPrice(9.99);
        polo.setProductId(1);
        polo.setSize("M");


        // Print objek product shirt, dan memanggil method getInfo()
        System.out.println("---Shirt---");
        shirt.getInfo();
        System.out.println();


        // Print objek electronics laptop, dan memanggil method getInfo()
        System.out.println("---Electronics---");
        System.out.println("Name : " + elektronik.getName() + "\nPrice : " + elektronik.getPrice() + "\nId : " + elektronik.getProductId());
        elektronik.getInfo();
        System.out.println();


        // Print objek clothing polo, dan memanggil size dengan method getSize()
        System.out.println("---Clothing---");
        System.out.println("Name : " + polo.getName() + "\nPrice : " + polo.getPrice() + "\nId : " + polo.getProductId());
        polo.getInfo();
        System.out.println();
    }
}