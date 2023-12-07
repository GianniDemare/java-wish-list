package org.lessons.java.wish;

import java.util.HashSet;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // CREO UN INSIEME DI NOME MA SENZA DUPLICATI
        HashSet<String> gifts = new HashSet<>();

        boolean stop = false;
        while (!stop){
            System.out.println("Insert new gifts? (y/n)");
            String answer = scanner.nextLine();
            switch (answer){
                case "y":
                    // AGGIUNGO NOME
                    System.out.println("Name of the gift: ");
                    String name = scanner.nextLine();
                    if(!gifts.contains(name)){
                        gifts.add(name);
                        System.out.println("Your gift list contains: " + (gifts.size()) + " " + "object");
                    } else {
                        System.out.println("The gift name already exists in the list");
                    }
                    break;
                case "n":
                    // ESCO
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid answer");
                    break;
            }
        }
        System.out.println("Your gift list");
        for (String element : gifts){
            System.out.println(element.toUpperCase());
        }

        scanner.close();
    }
}
