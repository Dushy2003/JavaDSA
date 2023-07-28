import java.util.*;

public class questionbank3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Find the number is positive/negative
        // System.out.print("Enter a number =");
        // int n = sc.nextInt();

        // if (n >= 0) {
        // System.out.println("Number is Positive ");
        // } else {
        // System.out.println("Number is Negative ");
        // }

        // Find the fever or not
        // System.out.print("Enter Your Temperature =");
        // double temp = sc.nextDouble();

        // if (temp > 100) {
        // System.out.println("You have a fever ");
        // } else {
        // System.out.println("You don`t have a fever ");
        // }

        // Find the day according to week
        // System.out.print("Enter a number (1-7) = ");
        // int week = sc.nextInt();

        // switch (week) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid Number !");

        // }

        // find value x,y

        // int a = 63, b = 36;

        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;

        // System.out.println(x);
        // System.out.println(y);

        // Find the year is leap year or not

        System.out.print("Enter the year = ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("The year is Leap Year ");
        } else {
            System.out.println("The year is not a leap year ");
        }

    }

}
