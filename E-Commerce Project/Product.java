public class Product {
    protected String name;
    protected double price;
    protected  int productId;

    // constructor  
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

    // Output Shirt
    public void getInfo() {
      System.out.println(getName() + " - " + getPrice() + " Euro");
    }
  }