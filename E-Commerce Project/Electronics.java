// Penjelasan Lengkap Pada file "README.md" !!
public class Electronics extends Product {
    // attributes tambahan! (warrantyMonths)
    private int warrantyMonths;

    // constructor untuk atribut tambahan warrantyMonths! (default)
    protected Electronics() {
        this.warrantyMonths = 12; // Default
    }

    
    // setters 
    protected void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // getters override method getInfo() dari class Product
    protected void getInfo() {
        System.out.println("Warranty : " + warrantyMonths + " Months");
    }
}
