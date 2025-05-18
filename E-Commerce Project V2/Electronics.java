// Subclass dari Product yang mewakili elektronik
public class Electronics extends Product implements Discountable {
    private Specification specification;

    public Electronics() {
        super();
    }

    // Override kategori
    @Override
    protected String getCategory() {
        return "Electronics";
    }

    // Set data spesifikasi dari luar
    public void setSpecification(double weight, String brand) {
        this.specification = new Specification(weight, brand);
    }

    public Specification getSpecification() {
        return specification;
    }

    // Implementasi diskon
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() - (getPrice() * discountPercentage / 100);
    }

    // Info produk + spesifikasi
    @Override
    public String getInfo() {
        return super.getInfo() + "\nSpesifikasi:\n" + specification.getSpecs();
    }

    // Inner class untuk spesifikasi
    public class Specification {
        private double weight;
        private String brand;

        private Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }

        public double getWeight() {
            return weight;
        }

        public String getBrand() {
            return brand;
        }

        public String getSpecs() {
            return "- Merek: " + brand + "\n- Berat: " + weight + " kg";
        }
    }
}
