//[Gaddis] Programming Challenge 12, p. 147

//12. String Manipulator
//Write a program that asks the user to enter the name of his or her favorite city. Use a String
//variable to store the input. The program should display the following:
// The number of characters in the city name.
// The name of the city in all uppercase letters.
// The name of the city in all lowercase letters.
// The first character in the name of the city.

import java.util.Scanner;

public class Question2_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your favorite city?: ");
        String yourCity = keyboard.nextLine();

        int cityCharSize = yourCity.length();
        System.out.print(cityCharSize + "\n");

        String upper = yourCity.toUpperCase();
        System.out.print(upper + "\n");

        String lower = yourCity.toLowerCase();
        System.out.print(lower + "\n");

        char firstLetter = yourCity.charAt(0);
        System.out.print(firstLetter + "\n");

    }
}
