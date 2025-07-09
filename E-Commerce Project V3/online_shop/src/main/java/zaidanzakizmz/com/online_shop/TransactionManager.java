package zaidanzakizmz.com.online_shop;

import java.util.*;

public class TransactionManager {
    private Map<String, Set<Product>> transactions = new HashMap<>();

    public void addPurchase(String customerName, Product product) {
        transactions.computeIfAbsent(customerName, k -> new HashSet<>()).add(product);
    }

    public Set<Product> getCustomerPurchases(String customerName) {
        return transactions.getOrDefault(customerName, Collections.emptySet());
    }
    
    public Set<String> getAllCustomerNames() {
        return transactions.keySet();
    }

    public Map<String, Set<Product>> getAllTransactions() {
    return transactions;
}


}