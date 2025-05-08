// Penjelasan Lengkap Pada file "README.md" !!
public class Clothing extends Product {
    // attributes tambahan! (size)
    private String size;

    // constructor untuk atribut tambahan size! (default)
    protected Clothing() {
        this.size = "Unknown";
    }

    // setters 
    protected void setSize(String size) {
        this.size = size;
    }

    // getters override method getInfo() dari class Product
    protected void getInfo() {
        System.out.print("Size : " + size);
    }
}
