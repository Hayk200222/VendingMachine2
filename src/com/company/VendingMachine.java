package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class VendingMachine {
    int count;

    public void printListProduct() {
        System.out.println("Cola --> A1");
        System.out.println("Pepsi --> A2");
        System.out.println("Fanta --> A3");
        System.out.println("Snikers --> B1");
        System.out.println("KIT KAT --> B2");
        System.out.println("Bounty --> B3");
        System.out.println("Lays --> C1");
        System.out.println("Bringles --> C2");
    }

    public void printMenu() {
        System.out.println("---- Menu ----");
        System.out.println("purchase --> 1");
        System.out.println("List product --> 2");
        System.out.println("Exit --> 3");
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
}


