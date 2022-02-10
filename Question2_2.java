//Write an application that reads three integers from the keyboard and displays the sum and the product on the screen.

import java.util.Scanner;

public class Question2_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("(1/3) Please write one number: ");
        int number1 = keyboard.nextInt();
        System.out.print("(2/3) Please write another number: ");
        int number2 = keyboard.nextInt();
        System.out.print("(3/3) Please write another number: ");
        int number3 = keyboard.nextInt();

        double resultSum = (number1+number2+number3);
        double resultProduct = (number1*number2*number3);

        System.out.print("The product of those numbers is: " + resultProduct);
        System.out.print("\nThe sum of those numbers is: " + resultSum);
    }
}
