package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        Drinks cola = new Drinks(50);
        Drinks pepsi = new Drinks(75);
        Drinks fanta = new Drinks(100);
        Sweet snikers = new Sweet(10);
        Sweet kitKat = new Sweet(12);
        Sweet bounty = new Sweet(20);
        Chips lays = new Chips(67);
        Chips bringles = new Chips(150);
        cola.setPrice(350);
        cola.setName("Cola");
        fanta.setPrice(380);
        fanta.setName("fanta");
        pepsi.setPrice(400);
        pepsi.setName("Pepsi");
        LinkedHashMap<String, Product> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A1", cola);
        linkedHashMap.put("A2", pepsi);
        linkedHashMap.put("A3", fanta);
        linkedHashMap.put("B1", snikers);
        linkedHashMap.put("B2", kitKat);
        linkedHashMap.put("B3", bounty);
        linkedHashMap.put("C1", lays);
        linkedHashMap.put("C2", bringles);

        vendingMachine.printMenu();
        int i;
        do {
            i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Please select product");
                System.out.println("A1");
                System.out.println("A2");
                System.out.println("A3");
                System.out.println("B1");
                System.out.println("B2");
                System.out.println("B3");
                System.out.println("C1");
                System.out.println("C2");
                String text = scanner.next();
                System.out.println("Thanks for the purchase ");
                System.out.println("You bought " + linkedHashMap.get(text).getName());
                System.out.println("Price is " + linkedHashMap.get(text).getPrice());
                vendingMachine.count = vendingMachine.count + linkedHashMap.get(text).getPrice();
                System.out.println(vendingMachine.count);
            } else if (i == 2) {
                vendingMachine.printListProduct();
            }
        } while (i != 3);
    }
}
