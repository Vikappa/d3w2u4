package org.example.entities;

import java.util.Random;

public class Product {
    long id;
    String name;
    String category;
    double price;

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", price=" + price +
                    '}';
        }
    public static Product createRandomProduct() {
        long newProdId = new Random().nextLong();
        ProductInfo productInfo = ProductInfo.getRandomProductInfo();
        return new Product(newProdId, productInfo.name, productInfo.category, productInfo.price);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public enum ProductInfo {
        BOOK_HOBBIT("The Hobbit", "Books", 10.99),
        BOOK_HP("Harry Potter Series", "Books", 29.99),
        BOOK_1984("1984", "Books", 8.99),
        BOOK_GOT("Game of Thrones", "Books", 19.99),
        BOOK_SAPIENS("Sapiens", "Books", 14.99),
        BABY_CAR_SEAT("Convertible Car Seat", "Baby", 199.99),
        BABY_STROLLER("Lightweight Stroller", "Baby", 149.99),
        BABY_DIAPERS("Disposable Diapers", "Baby", 39.99),
        BABY_BOTTLES("Baby Bottles", "Baby", 29.99),
        BABY_TOYS("Educational Toys", "Baby", 19.99),
        TECH_SMARTPHONE("Smartphone", "Tech", 999.99),
        TECH_LAPTOP("Laptop", "Tech", 1299.99),
        TECH_HEADPHONES("Headphones", "Tech", 199.99),
        TECH_CAMERA("Digital Camera", "Tech", 499.99),
        TECH_SMARTWATCH("Smartwatch", "Tech", 299.99),
        FOOD_CHOCOLATE("Chocolate Bar", "Food", 2.99),
        FOOD_COFFEE("Coffee Beans", "Food", 14.99),
        FOOD_TEABAGS("Teabags", "Food", 4.99),
        FOOD_OLIVE_OIL("Olive Oil", "Food", 10.99),
        FOOD_PASTA("Pasta", "Food", 1.99);

        final String name;
        final String category;
        final double price;

        ProductInfo(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        private static ProductInfo getRandomProductInfo() {
            Random random = new Random();
            ProductInfo[] values = ProductInfo.values();
            return values[random.nextInt(values.length)];
        }

    }

}
