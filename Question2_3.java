//Modify the program you made last time in Exercise 1.05 so that it now asks the user to input the sales tax,
// and the prices for the three items. Then calculate and print out the tax and total prices like before.

import java.util.Scanner;

public class Question2_3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please write your tax number: ");
        double tax = keyboard.nextInt();
        System.out.print("(1/3) Please write the price of first product: ");
        double number1 = keyboard.nextInt();
        System.out.print("(2/3) Please write the price of second product: ");
        double number2 = keyboard.nextInt();
        System.out.print("(3/3) Please write the price of third product: ");
        double number3 = keyboard.nextInt();

        String bar = "________________________________________";

        double totalAmount1 = (((number1*tax)/100)+number1);
        System.out.println("#1.\nAmount before taxes: " + number1);
        System.out.println("» TOTAL ("+ tax + "% of VAT): " + totalAmount1 + " kr");

        double totalAmount2 = (((number2*tax)/100)+number2);
        System.out.println("#2.\nAmount before taxes: " + number2);
        System.out.println("» TOTAL ("+ tax + "% of VAT): " + totalAmount2 + " kr");

        double totalAmount3 = (((number3*tax)/100)+number3);
        System.out.println("#3.\nAmount before taxes: " + number3);
        System.out.println("» TOTAL ("+ tax + "% of VAT): " + totalAmount3 + " kr");

        System.out.println(bar);

        double Total = (totalAmount1+totalAmount2+totalAmount3);
        System.out.println("PURCHASE TOTAL (WITH TAXES): " + Total + " kr.");

    }
}