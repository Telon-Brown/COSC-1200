import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    public static void main(String[] args) {
        // Create multiple Products and Perishable Products
        Product product1 = new Product(101, "Laptop", 899.99, 10, 2, "Handle with care");
        Product product2 = new Product(102, "Smartphone", 599.99, 20, 5, "Water resistant");
        Product product3 = new Product(103, "Headphones", 99.99, 30, 10, "Noise cancelling");

        PerishableProduct perishableProduct1 = new PerishableProduct(201, "Milk", 2.49, 20, 5, "Keep refrigerated", "2024-04-10");
        PerishableProduct perishableProduct2 = new PerishableProduct(202, "Bread", 1.99, 30, 10, "Store in a cool, dry place", "2024-04-05");

        // Put all products in a container (ArrayList)
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(perishableProduct1);
        productList.add(perishableProduct2);

        // Display details of all products
        for (Product product : productList) {
            product.display();
            System.out.println(); // Add empty line for readability
        }
    }
}
