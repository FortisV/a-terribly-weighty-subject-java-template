package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to my ounces to pounds converter");

    boolean repeat = true;

    int ouncesInput = Integer.MIN_VALUE;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Enter number of ounces to convert to pounds: ");
      String input = scanner.nextLine().trim();
      if(input.isBlank()) {
        System.out.println("Blank values are not valid");
      } else try {
        ouncesInput = Integer.parseInt(input);
        if (ouncesInput < 0) {
          System.out.println("Negative numbers are not valid");
          ouncesInput = Integer.MIN_VALUE;
        } else {
          repeat = false;
        }
      } catch(NumberFormatException e) {
        System.out.println("Non-integers and letters are not valid");
        ouncesInput = Integer.MIN_VALUE;
      }
      System.out.println();
    } while(repeat);

    scanner.close();

    Converter converter = new Converter();
    System.out.println(ouncesInput + " oz is equivalent to " + converter.toPounds(ouncesInput));
    System.out.println(ouncesInput + " oz is equivalent to " + converter.toPoundsAndOunces(ouncesInput));
    System.out.println();
    System.out.println("Exiting...");
  }
}
