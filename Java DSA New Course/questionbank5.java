import java.util.*;

public class questionbank5 {

    // Write a Java method to compute the average of three numbers.
    // public static void average(int a, int b, int c) {

    // float average = (a + b + c) / 3;
    // System.out.println("Average of three number = " + average);
    // }

    // Write a method named isEven that accepts an int argument. The method
    // should return true if the argument is even, or false otherwise. Also write a
    // program to test your method.\

    // public static boolean isEven(int n) {

    // if (n % 2 == 0) {
    // return true;
    // }
    // return false;
    // }

    // Write a Java program to check if a number is a palindrome in Java? ( 121 is a
    // palindrome, 321 is not)
    // A number is called a palindrome if the number is equal to the reverse of a
    // number e.g., 121 is a
    // palindrome because the reverse of 121 is 121 itself. On the other hand, 321
    // is not a
    // palindrome because the reverse of 321 is 123, which is not equal to 321.

    // public static boolean ispalindrome(int number) {
    // int palindrome = number; // copied number into variable

    // int reverse = 0;

    // while (palindrome != 0) {
    // int remainder = palindrome % 10;
    // reverse = reverse * 10 + remainder;
    // palindrome = palindrome / 10;
    // }

    // // if original and reverse of number is equal means number is palindrome in
    // java

    // if (number == reverse) {

    // return true;
    // }
    // return false;

    // }

    // Write a Java method to compute the sum of the digits in an integer.

    public static int sumdigits(int n){
        int sumdigits =0;

        while(n>0){
            int lastdigit = n%10;
            sumdigits += lastdigit;
            n /=10;
        }
        return sumdigits;
    }

    public static void main(String args[]) {

        // average(3, 5, 6);

        // System.out.println((isEven(5)));

        Scanner sc = new Scanner(System.in);
        // System.out.print("please enter number : ");
        // int palindrome = sc.nextInt();

        // if (ispalindrome(palindrome)) {
        // System.out.println("Number :" + palindrome + " is a palindrome");
        // }

        System.out.print("Input an integer = ");
        int digit = sc.nextInt();
        System.out.println("The sum is :" + sumdigits(digit));
    }

}
