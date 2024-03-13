package org.example;

import org.example.entities.Product;

import java.util.Random;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {

        Stream<Product> randomProductsStream = Stream.generate(() -> {
            long id = new Random().nextLong();
            Product newProd = Product.createRandomProduct(id);
            return newProd;
        }).limit(10);

        randomProductsStream.forEach(System.out::println);

    }
}
