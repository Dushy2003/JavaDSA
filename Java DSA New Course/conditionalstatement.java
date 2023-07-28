import java.util.*;

public class conditionalstatement {
    public static void main(String args[]) {

        // int age = 16;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the age = ");
        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.print("You are Adult : Vote , Drive");
        // }
        // if (age > 13 && age < 18) {
        // System.out.print("You are teenager ");
        // } else {
        // System.out.print("Not Adult ");
        // }

        // int A = 10, B = 3;

        // if (A >= B) {
        // System.out.print("A is largest of 2 ");
        // } else {
        // System.out.print("B is largest of 2");
        // }

        // System.out.print("Enter a number = ");
        // int a = sc.nextInt();

        // if (a % 2 == 0) {
        // System.out.print(" " + a + " number is even");
        // } else {
        // System.out.println(" " + a + "Number is odd");
        // }

        // int age = 14;

        // if (age >= 18) {
        // System.out.print("Adult ");
        // } else if (age >= 13 && age < 18) {
        // System.out.print("Teenager");
        // } else {
        // System.out.print("Child");
        // }

        System.out.print("Enter the income (in lacs) = ");
        int income = sc.nextInt();
        int tax = 0;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2); // Type casting concept
        } else {
            tax = (int) (income * 0.3);
        }

        System.out.print("income tax you pay =" + tax);

        // int A = 8, B = 3, C = 6;

        // if ((A >= B) && (A >= C)) {
        // System.out.print("A is largest");
        // } else if (B >= C) {
        // System.out.print("B is largest");
        // } else {
        // System.out.print("C is largest");
        // }

        // Ternary Operator

        // int number = 4;

        // String type = ((number % 2 == 0)) ? "even" : "odd";
        // System.out.print(type);

        // boolean larger = (2 > 3) ? true : false;

        // System.out.print(larger);

        // System.out.print("Enter the marks of student =");
        // int marks = sc.nextInt();

        // String type = ((marks >= 33)) ? "PASS" : "FAIL";

        // System.out.print(type);

        // Switch Case

        // int number = 2;

        // switch (number) {
        // case 1:
        // System.out.println("Samosa");
        // break;
        // case 2:
        // System.out.println("Burger");
        // break;
        // case 3:
        // System.out.println("Mango Shake ");
        // break;
        // default:
        // System.out.println("we ae wake up");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char operator = sc.next().charAt(0);

        // switch (operator) {

        // case '+':
        // System.out.println(a + b);
        // break;
        // case '-':
        // System.out.println(a - b);
        // break;
        // case '*':
        // System.out.println(a * b);
        // break;
        // case '/':
        // System.out.println(a / b);
        // break;
        // default:
        // System.out.println("Invalid input");

        // }

    }
}
