//[Gaddis] Programming Challenge 10, p. 147
//. Test Average
//Write a program that asks the user to enter three test scores. The program should display
//each test score, as well as the average of the scores.

import java.util.Scanner;

public class Question2_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("(1/3) Please enter the first score: ");
        int firstScore = keyboard.nextInt();

        System.out.println("(2/3) Please enter the second score: ");
        int secondScore = keyboard.nextInt();

        System.out.println("(3/3) Please enter the third score: ");
        int thirdScore = keyboard.nextInt();

        double average = ((firstScore + secondScore + thirdScore) / 3);
        System.out.print("SCORES.\n1st. " + firstScore + "\n2nd. " + secondScore + "\n3rd. " + thirdScore);
        System.out.print("\nThe average of those scores is: " + average);
    }
}
