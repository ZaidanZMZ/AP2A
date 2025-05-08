public class Electronics extends Product {
    private int warrantyMonths;

    // constructor
    protected Electronics() {
        this.name = "Unknown";
        this.price = 0.00;
        this.productId = 0;
        this.warrantyMonths = 12; // Default
    }

    // setters 
    protected void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // getters
    public void getInfo() {
        System.out.println("Warranty : " + warrantyMonths + " Months");
    }
}
