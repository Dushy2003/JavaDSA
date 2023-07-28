import java.util.*;

public class loops {
    public static void main(String args[]) {

        // While Loop
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the range =");
        // int range = sc.nextInt();
        // int counter = 1;

        // while (counter <= range) {
        // System.out.print(counter + " ");
        // counter += 1; // counter = counter +1// counter ++
        // }

        // // Sum of natural number
        // System.out.print("Enter the range = ");
        // int range = sc.nextInt();
        // int counter = 1;
        // int sum = 0;

        // while (counter <= range) {
        // sum += counter;
        // counter += 1;
        // }
        // System.out.println("The sum of natural number is = " + sum);

        // int line = 1;
        // while (line <= 4) {
        // System.out.println("****");
        // line += 1;
        // }

        // print reverse number
        // int n = 10899;

        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit + " ");
        // n = n / 10;
        // }

        // store the reverse of given number

        // int n = 10899;
        // int rev = 0;

        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;
        // }
        // System.out.print(rev + " ");

        // For Loop

        // for (int i = 1; i <= 10; i += 1) {
        // System.out.println("Hello World " + i);
        // }

        // Print Square pattern

        // for (int i = 1; i <= 4; i += 1) {
        // System.out.println("*****");
        // }

        // print reverse number
        for (int n = 90303; n > 0;) {
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n / 10;
        }

        // store the reverse number of given number

        // int rev = 0;
        // for (int n = 10899; n > 0; n /= 10) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // }

        // System.out.println(rev + " ");

        // do while
        // int n = 1;

        // do {

        // System.out.println("Hello World" + n);
        // n += 1;
        // } while (n <= 10);

        // Break Statement

        // for (int n = 1; n <= 5; n += 1) {
        // if (n == 3) {
        // break;
        // }
        // System.out.println(n);
        // }

        // System.out.println("I am out off the loop");
        // }

        // do {
        // System.out.print("Enter your number =");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // break;
        // }

        // System.out.println(n);
        // } while (true);

        // while (true) {
        // System.out.println("Enter your number = ");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // break;
        // }

        // System.out.println(n);
        // }

        // for (; true;) {
        // System.out.println("Enter your number =");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // System.out.print("You have enter the multiple of 10 number ");
        // break;
        // }
        // System.out.println(n);

        // Continue

        // for (int n = 1; n <= 10; n += 1) {
        // if (n == 3) {
        // continue;
        // }
        // System.out.println(n);
        // }

        // do {
        // System.out.print("Enter your number = ");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // continue;
        // }

        // System.out.println(n);
        // } while (true);

        // while (true) {
        // System.out.print("Enter your number = ");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // continue;
        // }
        // System.out.println(n);
        // }

        // for (; true;) {
        // System.out.print("Enter your number = ");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // continue;
        // }
        // System.out.println(n);
        // }

        // for (; true;) {

        // System.out.print("Enter number =");
        // int n = sc.nextInt();

        // if (n % n == 0) {
        // System.out.println("Number is prime number ");
        // break;
        // }
        // System.out.println("Number is a not prime number ");
        // }

        System.out.print("Enter number =");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isprime = true;
            // for (int i = 2; i <= n - 1; i++) // for small number we use (n-1) &
            // for big number we use Math.sqrt(n)
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) { // n is multiple of i (i not equal to 1 or n )
                    isprime = false;
                }
            }

            if (isprime == true) {
                System.out.println("n is prime ");
            } else {
                System.out.println("n is not prime ");
            }
        }

    }
}
