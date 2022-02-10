//[Gaddis] Programming Challenge 18, p. 148
// Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the purchase:
// The number of shares that Joe purchased was 1,000.
// When Joe purchased stock, he paid $32.87 per share.
// Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
// for the stock.

// Two weeks later Joe sold the stock. Here are the details of the sale:
/*
* The number of shares that Joe sold was 1,000.
* He sold the stock for $33.92 per share.
* He paid his stockbroker another commission that amounted to 2% of the amount he
* received for the stock.
*
* Write a program that displays the following information:
* The amount of money Joe paid for the stock.
* The amount of commission Joe paid his broker when he bought the stock.
* The amount that Joe sold the stock for.
* The amount of commission Joe paid his broker when he sold the stock.
* Display the amount of profit that Joe made after selling his stock and paying the two
* commissions to his broker. (If the amount of profit that your program displays is a
* negative number, then Joe lost money on the transaction.)
* */
public class Question2_7 {
    public static void main(String[] args) {
        double sharesPurchased = (1000);
        double stockPricePurchased = (32.87);
        double stockPriceSold = (33.92);

        //Amount of money Joe paid for the stock.
        double amountPaid = ((sharesPurchased*stockPricePurchased)+(sharesPurchased*stockPricePurchased*2/100));
        System.out.print("Amount of money paid for the purchased stock: " + amountPaid);
        //Amount of commission Joe paid for the stock.
        double amountCommissionPurchase = (sharesPurchased*stockPricePurchased*2/100);
        System.out.print("\nAmount of commission paid for the purchased stock: " + amountCommissionPurchase);
        //Amount of money Joe sold the stock.
        double amountSold = (sharesPurchased*stockPriceSold);
        System.out.print("\nAmount of money paid for the sold stock: " + amountCommissionPurchase);
        //Amount of commission Joe paid for sold the stock.
        double amountCommissionSold = (sharesPurchased*stockPriceSold*2/100);
        System.out.print("\nAmount of money paid for the sold stock: " + amountCommissionSold);

        //Profit or Lose?
        double profitLose = ((amountSold-amountCommissionSold)-amountPaid);
        if (profitLose <= amountPaid){
            System.out.print("\nJoe has lost " + profitLose);
        }
            else{
            System.out.print("\nJoe has won " + profitLose);
            }
    }
}
