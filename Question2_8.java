//Exercise 2.08 Modify the program you made in Exercise 2.07 so that all values can be input from the keyboard,
// rather than being created as literals in the program.
//
// The user should be able to input:
// -The number of purchased shares
// -The price per share of the purchased stock
// -The number of sold shares
// -The price per share of the sold stock
// -The commission for the stockbroker

import java.util.Scanner;

public class Question2_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please insert the number of shares you have purchased: ");
        double numberShares = keyboard.nextDouble();

        System.out.println("Please insert the price per share you have purchased: ");
        double pricePerShare = keyboard.nextDouble();

        System.out.println("Please insert the number of shares you have sold: ");
        double numberOfSharesSold = keyboard.nextDouble();

        System.out.println("Please insert the price per share at the moment you sold them: ");
        double pricePerShareSold = keyboard.nextDouble();

        System.out.println("Please insert the commission of the stockbroker: ");
        double numberCommission = keyboard.nextDouble();


        //Amount of money Joe paid for the stock.
        double amountPaid = ((numberShares*pricePerShare)+(numberShares*pricePerShare*numberCommission/100));
        System.out.print("Amount of money paid for the purchased stock: " + amountPaid);
        //Amount of commission Joe paid for the stock.
        double amountCommissionPurchase = (numberShares*pricePerShare*numberCommission/100);
        System.out.print("\nAmount of commission paid for the purchased stock: " + amountCommissionPurchase);
        //Amount of money Joe sold the stock.
        double amountSold = (numberOfSharesSold*pricePerShareSold);
        System.out.print("\nAmount of money paid for the sold stock: " + amountSold);
        //Amount of commission Joe paid for sold the stock.
        double amountCommissionSold = (numberShares*pricePerShareSold*numberCommission/100);
        System.out.print("\nAmount of commission paid for the sold stock: " + amountCommissionSold);

        //Profit or Lose?
        double profitLose = ((amountSold-amountCommissionSold)-amountPaid);
        if (profitLose > amountPaid){
            System.out.print("\n\nYou has lost " + profitLose);
        }
        else{
            System.out.print("\n\nYou has won " + profitLose);
        }

    }
}
