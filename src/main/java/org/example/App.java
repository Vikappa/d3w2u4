package org.example;

import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {

        Stream<Product> randomProductsStream = Stream.generate(() -> {
            Product newProd = Product.createRandomProduct();
            return newProd;
        }).limit(10);

        randomProductsStream.forEach(System.out::println);

        List<Product> expensiveBooks = new ArrayList<>();

        randomProductsStream.filter(p -> p.getPrice() > 1000).forEach(expensiveBooks::add);

        expensiveBooks.forEach(System.out::println);





    }
}
