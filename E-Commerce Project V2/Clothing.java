// Subclass dari Product yang mewakili pakaian
public class Clothing extends Product implements Discountable {
    private Size size;

    public Clothing() {
        super();
    }

    // Override kategori
    @Override
    protected String getCategory() {
        return "Clothing";
    }

    // Getter dan setter
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    // Implementasi diskon
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() - (getPrice() * discountPercentage / 100);
    }

    // Tambahan info pakaian
    @Override
    public String getInfo() {
        return super.getInfo() + "\nUkuran: " + size;
    }
}
