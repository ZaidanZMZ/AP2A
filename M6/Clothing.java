public class Clothing extends Product {
    private String size;

    // constructor
    protected Clothing() {
        this.name = "Unknown";
        this.price = 0.00;
        this.productId = 0;
        this.size = "Unknown";
    }

    // setters 
    protected void setSize(String size) {
        this.size = size;
    }

    // getters
    public void getInfo() {
        System.out.print("Size : " + size);
    }
}
