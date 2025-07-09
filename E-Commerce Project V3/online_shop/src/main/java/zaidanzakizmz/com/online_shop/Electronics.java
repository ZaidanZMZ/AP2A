package zaidanzakizmz.com.online_shop;

public class Electronics extends Product implements Discountable {
    private String warrantyMonths;
    private Specification spec;

    public Electronics() {
        this.warrantyMonths = "12";
    }

    @Override
    public String getCategory() {
        return "Elektronik";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }

    public String getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(String warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // Inner class
    public class Specification {
        private double weight;
        private String brand;

        public Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }

        public String getSpecs() {
            return "Brand: " + brand + ", Berat: " + weight + " kg";
        }
    }
}