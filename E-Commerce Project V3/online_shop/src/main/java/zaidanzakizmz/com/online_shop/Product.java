package zaidanzakizmz.com.online_shop;

import java.time.LocalDateTime;

public abstract class Product {
    private String name;
    private double price;
    private int productId;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Product() {}

    public abstract String getCategory();

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}