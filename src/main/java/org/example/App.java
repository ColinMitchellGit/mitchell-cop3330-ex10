/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String item1price_string = input.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String item1quantity_string = input.nextLine();

        System.out.print("Enter the price of item 2: ");
        String item2price_string = input.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String item2quantity_string = input.nextLine();

        System.out.print("Enter the price of item 3: ");
        String item3price_string = input.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String item3quantity_string = input.nextLine();

        int item1price = parseInt(item1price_string);
        int item1quantity = parseInt(item1quantity_string);

        int item2price = parseInt(item2price_string);
        int item2quantity = parseInt(item2quantity_string);

        int item3price = parseInt(item3price_string);
        int item3quantity = parseInt(item3quantity_string);

        double subtotal = (item1price * item1quantity) + (item2price * item2quantity) + (item3price * item3quantity);
        double tax = subtotal * .055;
        double total = subtotal + tax;

        String subtotal_string = String.format("%.2f", subtotal);
        String tax_string = String.format("%.2f", tax);
        String total_string = String.format("%.2f", total);

        System.out.println("Subtotal: $" + subtotal_string);
        System.out.println("Tax: $" + tax_string);
        System.out.println("Total: $" + total_string);
    }
}
