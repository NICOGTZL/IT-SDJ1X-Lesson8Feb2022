//Exercise 2.09 [Gaddis] Programming Challenge 4, p. 146
//4. Star Pattern
//Write a program that displays the following pattern:
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
public class Question2_9 {
    public static void main(String[] args) {
        String star1 = ("    *");
        String star3 = ("   ***");
        String star5 = ("  *****");
        String star7 = (" *******");
        String star5d = ("  *****");
        String star3d = ("   ***");
        String star1d = ("    *");

        System.out.print(star1 + "\n" + star3 + "\n" + star5 + "\n" + star7 + "\n" + star5d + "\n" + star3d + "\n" + star1d);
    }
}
