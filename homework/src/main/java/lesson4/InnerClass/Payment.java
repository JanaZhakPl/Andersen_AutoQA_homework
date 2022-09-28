package lesson4.InnerClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Payment {
    List<Product> productList = new ArrayList<>();

    public Payment() {
    }

    private static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    public void showProducts() {
        productList.forEach(System.out::println);
    }

    public void addProduct(String name, double price, int quantity) {
        productList.add(new Product(name, price, quantity));
    }
}