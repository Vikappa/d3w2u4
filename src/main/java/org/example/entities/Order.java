package org.example.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    long id;
    String statuts;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;
}
