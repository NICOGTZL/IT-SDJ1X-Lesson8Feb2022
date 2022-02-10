//17. Word Game
//Write a program that plays a word game with the user. The program should ask the user
//to enter the following:

//His or her name
//His or her age
//The name of a city
//The name of a college
//A profession
//A type of animal
//A pet´s name

//After the user has entered these items, the program should display the following story,
//inserting the user’s input into the appropriate locations:
//There once was a person named NAME who lived in CITY. At the age of AGE,
//NAME went to college at COLLEGE. NAME graduated and went to work as a
//PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
//happily ever after!


import java.util.Scanner;

public class Question2_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter your age in numbers: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter your city: ");
        String city = keyboard.nextLine();

        System.out.print("Enter your College´s name: ");
        String college = keyboard.nextLine();

        System.out.print("Enter your profession: ");
        String profession = keyboard.nextLine();

        System.out.print("What is your favorite animal?: ");
        String animal = keyboard.nextLine();

        System.out.print("What is your pet´s name: ");
        String pet = keyboard.nextLine();

        System.out.printf("There once was a person named %s who lived in %s. At the age of %s,\n", name, city, age);
        System.out.printf("%s went to college at %s. %s graduated and went to work as a\n", name, college, name);
        System.out.printf("%s. Then, %s adopted a %s named %s. They both lived\n", profession, name, animal, pet);
        System.out.printf("happily ever after!");

    }
}
