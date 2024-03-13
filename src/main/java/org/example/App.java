package org.example;

import org.example.entities.Customer;
import org.example.entities.Order;
import org.example.entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {

///////////////////CREO UNO STREAM
        System.out.println("--------------------------- STREAM DI PROVA ---------------------------");

        Stream<Product> randomProductsStream = Stream.generate(() -> {
            Product newProd = Product.sortRandomProd();
            return newProd;
        }).limit(3);

        randomProductsStream.forEach(System.out::println);

        /////////ESERCIZIO 1
        //////CREO UNO STREAM DI 10 PRODOTTI E LO FILTRO IN UN UNA LISTA
        System.out.println("--------------------------- ESERCIZIO 1 ---------------------------");
        System.out.println("--------------------------- BOOKS > 100 ---------------------------");

        List<Product> expensiveBooks = new ArrayList<>();

        Stream<Product> randomProductsStreamEs1 = Stream.generate(() -> {
            Product es1 = Product.sortRandomProd();
            return es1;
        }).limit(15);

        randomProductsStreamEs1.filter(p -> ((p.getPrice() > 100) && (Objects.equals(p.getCategory(), "Books")))).forEach(expensiveBooks::add);

        expensiveBooks.forEach(System.out::println);

        //////////////////////////ESERCIZIO 2
        /////////////////// CREO 3 ORDINI USANDO i metodi di classe per generare prodotti mockup
        System.out.println("--------------------------- ESERCIZIO 2 ---------------------------");
        System.out.println("----------------- ORDINI CON PRODOTTI PER BAMBINI -----------------");
        Random random = new Random();
        ArrayList<Product> carrello1 = new ArrayList<>();
        carrello1.add(Product.sortRandomProd());
        carrello1.add(Product.sortRandomProd());
        carrello1.add(Product.sortRandomProd());
        carrello1.add(Product.sortRandomProd());
        carrello1.add(Product.sortRandomProd());
        Order order1 = new Order(random.nextLong(), "in progress", LocalDate.now(), LocalDate.now().plusDays(10), carrello1, Customer.createRandomCustomer());

        ArrayList<Product> carrello2 = new ArrayList<>();
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        carrello2.add(Product.sortRandomProd());
        Order order2 = new Order(random.nextLong(), "in progress", LocalDate.now(), LocalDate.now().plusDays(15), carrello2, Customer.createRandomCustomer());

        ArrayList<Product> carrello3 = new ArrayList<>();
        carrello3.add(Product.sortRandomProd());
        carrello3.add(Product.sortRandomProd());
        carrello3.add(Product.sortRandomProd());
        carrello3.add(Product.sortRandomProd());
        Order order3 = new Order(random.nextLong(), "Delivered", LocalDate.now(), LocalDate.now(), carrello3, Customer.createRandomCustomer());

        /// TRASFORMO GLI ORDINI IN STREAM
        Stream<Order> orderStream = Stream.of(order1, order2, order3);

        ArrayList<Order> babyOrder = new ArrayList<>();

        // ORDINI CON PRODOTTI APPARTENENTI ALLA CATEGORIA BABY
        orderStream.forEach(order -> {
            if(order.getProducts().stream().anyMatch(prod -> Objects.equals(prod.getCategory(), "Baby"))){
                babyOrder.add(order);
            }
        });

        babyOrder.forEach(System.out::println);

        //////////////////////////ESERCIZIO 3
        /////////////////// CREO 3 ORDINI USANDO i metodi di classe per generare prodotti mockup
        System.out.println("--------------------------- ESERCIZIO 3 ---------------------------");
        System.out.println("---------------- SCONTI SUI PRODOTTI CATEGORY BOYS ----------------");

        //GENERO UNO STREAM DI 15 PRODOTTI
        Stream<Product> randomProductsStreamEs3 = Stream.generate(() -> {
            Product es1 = Product.sortRandomProd();
            return es1;
        }).limit(15);

        //FILTRO I PRODOTTI E NE RIDUCO IL PREZZO

        randomProductsStreamEs3.forEach(product -> {
            if(Objects.equals(product.getCategory(), "Boys")){
                System.out.println("Prodotto della categoria Boys trovato, prezzo ridotto da " + product.getPrice() + " a " + (product.getPrice()*0.9));
                product.setPrice(product.getPrice()*0.9);
            }
        });

        //////////////////////////ESERCIZIO 4
        /////////////////// CREO UNO STREAM DI MOLTI CLIENTI PER AVERE MOLTI CASI TRA CUI FILTARE
        System.out.println("--------------------------- ESERCIZIO 4 ---------------------------");
        System.out.println("--- PRODOTTI DI ORDINI CON DATA TRA 01/02/21 e 01/04/22 E TIER2 ---");

        ArrayList<Product> carrelloEse4N1 = new ArrayList<>();
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        carrelloEse4N1.add(Product.sortRandomProd());
        Customer customr1Es4 = new Customer(random.nextLong(), "Vincenzo", 2);
        Order orderEs4N1 = new Order(random.nextLong(), "in progress", LocalDate.of(2022, 2, 4), LocalDate.of(2021, 2, 10), carrelloEse4N1, customr1Es4);

        ArrayList<Product> carrelloEse4N2 = new ArrayList<>();
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        carrelloEse4N2.add(Product.sortRandomProd());
        Customer customr2Es4 = new Customer(random.nextLong(), "Alberto", 3);
        Order orderEs4N2 = new Order(random.nextLong(), "in progress", LocalDate.of(2022, 2, 4), LocalDate.of(2021, 2, 10), carrelloEse4N1, customr2Es4);

        ArrayList<Product> carrelloEse4N3 = new ArrayList<>();
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        carrelloEse4N3.add(Product.sortRandomProd());
        Customer customr3Es4 = new Customer(random.nextLong(), "Vincenzo", 2);
        Order orderEs4N3 = new Order(random.nextLong(), "in progress", LocalDate.of(2022, 2, 4), LocalDate.of(2021, 2, 10), carrelloEse4N1, customr3Es4);

        ArrayList<Product> carrelloEse4N4 = new ArrayList<>();
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        carrelloEse4N4.add(Product.sortRandomProd());
        Customer customr4Es4 = new Customer(random.nextLong(), "Vincenzo", 2);
        Order orderEs4N4 = new Order(random.nextLong(), "in progress", LocalDate.of(2022, 2, 4), LocalDate.of(2021, 2, 10), carrelloEse4N1, customr4Es4);

        ArrayList<Product> carrelloEse4N5 = new ArrayList<>();
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        carrelloEse4N5.add(Product.sortRandomProd());
        Customer customr5Es4 = new Customer(random.nextLong(), "Vincenzo", 2);
        Order orderEs4N5 = new Order(random.nextLong(), "in progress", LocalDate.of(2022, 2, 4), LocalDate.of(2021, 2, 10), carrelloEse4N1, customr5Es4);

        ///GENERO LO STREAM A PARTIRE DAGLI ORDINI SCRITTI A MANO

        Stream<Order> orderStreamEs4 = Stream.of(orderEs4N1, orderEs4N2, orderEs4N3, orderEs4N4, orderEs4N5);


        // ORDINI CON DATA TRA 1/02/22 e 01/04/22 DI CLIENTI TIER2
        ArrayList<Order> listaFinaleEs4 =new ArrayList<>();

        orderStreamEs4.filter(order ->
                !order.getOrderDate().isBefore(LocalDate.of(2022, 2, 1)) &&
                        !order.getOrderDate().isAfter(LocalDate.of(2022, 4, 1)) &&
                        order.getCustomer().getTier() == 2).forEach(listaFinaleEs4::add);

        listaFinaleEs4.forEach(System.out::println);
    }


}
