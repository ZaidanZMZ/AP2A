package zaidanzakizmz.com.online_shop;

public class Clothing extends Product implements Discountable {
    private Size size;

    @Override
    public String getCategory() {
        return "Fashion";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}