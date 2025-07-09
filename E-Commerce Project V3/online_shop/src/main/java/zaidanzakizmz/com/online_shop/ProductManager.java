package zaidanzakizmz.com.online_shop;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getProductId() == product.getProductId()) {
                throw new IllegalArgumentException("ID produk sudah ada!");
            }
        }
        products.add(product);
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public Product findProductById(int id) {
        for (Product p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        throw new ProductNotFoundException("Produk dengan ID " + id + " tidak ditemukan");
    }
}