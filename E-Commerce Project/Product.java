// Penjelasan Lengkap Pada file "README.md" !!
public class Product {
    // attributes utama!
    private String name;
    private double price;
    private int productId;


    // constructor (nilai default)
    protected Product() {
      this.name = "Unknown";
      this.price = 0.0;
      this.productId = 0;
    }
    

    // getters
    protected String getName() {
      return name;
    }

    protected double getPrice() {
      return price;
    }

    protected int getProductId() {
      return productId;
    }


    // setters
    protected void setName(String name) {
      this.name = name;
    }
    
    protected void setPrice(double price) {
      this.price = price;
    }

    protected void setProductId(int productId) {
      this.productId = productId;
    }


    // output nama dan harga produk!
    protected void getInfo() {
      System.out.println(getName() + " - " + getPrice() + " Euro");
    }
}