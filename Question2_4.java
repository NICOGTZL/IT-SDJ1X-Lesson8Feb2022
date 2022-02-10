//Write an application that uses a Scanner object,
//to read your name, age and address. Afterwards the application
//should display the information on the screen

import java.util.Scanner;

public class Question2_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Please enter your address: ");
        String address = keyboard.nextLine();

        System.out.print("Please enter your age in numbers: ");
        int age = keyboard.nextInt();

        System.out.println("\nYour name: " + name + "\n" + "Your age: " + age + "\n" + "Address: " + address);

    }
}
