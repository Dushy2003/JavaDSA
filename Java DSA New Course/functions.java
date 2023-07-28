import java.util.*;

public class functions {

    // // fuction
    // public static void printHelloworld() {
    // // method
    // System.out.println("Hello World ");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // return;

    // }

    // Type 1 : function call by with no parameters
    // public static void calculateSum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("Sum is :" + sum);
    // }

    // Type 2 : Function call with parameters
    // public static int calculateSum(int num1, int num2) { // parameter or formal
    // parameter
    // int sum = num1 + num2;
    // return sum;
    // }

    // swap vaue
    // public static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    // find the product of a & b
    // Using with no return
    // public static void multiple(int a, int b) {

    // int product = a * b;
    // System.out.println("Product =" + product);
    // }

    // Using with return
    // public static int multiple(int a, int b) {
    // int product = a * b;
    // return product;
    // }

    // find factor of given number n
    // public static int factorize(int a) {

    // int fact = 1;
    // for (int i = 1; i <= a; i++) {
    // fact *= i; // f=f*i
    // }
    // return fact;
    // }

    // find binomial coefficient
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact; // return factorial n
    }

    public static int bincoff(int n, int r) {

        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n - r);
        int bincoff = nfact / (rfact * nmrfact);
        return bincoff;
    }

    // function overloading
    // Find the sum of 2 number using parameters
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // // Find the sum of 3 number using function overloading

    // public static int sum(int a, int b, int c) {

    // return a + b + c;
    // }

    // using data type
    // function to calculate int sum
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static float sum(float a, float b) {
    // return a + b;
    // }

    // import question
    // find the number is prime or not

    // public static boolean isprime(int n) {

    // for (int i = 2; i <= n - 1; i++) {

    // if (n % i == 0) {
    // return false;

    // }
    // }
    // return true;
    // }

    // optimized code for calculating number is prime or not

    // public static boolean prime(int n) {

    // for (int i = 2; i <= Math.sqrt(n); i++) {

    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // find prime number in range
    // public static boolean primes(int n) {

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void primeinrange(int n) {
    // for (int i = 2; i <= n; i++) {

    // if (primes(i)) {
    // System.out.print(i + " , ");
    // }
    // }
    // System.out.println();
    // }

    // convert binary number to decimal number
    // public static void binTodec(int binnum) {

    // int mynum = binnum;
    // int pow = 0;
    // int decnum = 0;

    // while (binnum > 0) {
    // int lastdigit = binnum % 10;
    // decnum = decnum + (lastdigit * (int) Math.pow(2, pow));

    // pow++;
    // binnum = binnum / 10;
    // }
    // System.out.print("decimal of " + mynum + " = " + decnum);
    // }

    // convert decimal to binary
    // public static void decTobin(int n) {
    // int pow = 0;
    // int decnum = n;
    // int bin = 0;

    // while (n > 0) {

    // int ren = n % 2; // remender
    // bin = bin + (ren * (int) Math.pow(10, pow));
    // pow++;
    // n = n / 2; // quotent
    // }
    // System.out.print("Binary number of " + decnum + " = " + bin);
    // }

    public static void main(String args[]) {

        // function call
        // printHelloworld();

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); // arguments or actual arguments
        // System.out.println("Sum is :" + sum);

        // swap by value
        // int a = 10;
        // int b = 5;
        // swap(a, b);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = multiple(a, b);
        // System.out.println("Product = " + product);

        // System.out.print("Enter the positive integer = ");
        // int a = sc.nextInt();
        // int fact = factorize(a);
        // System.out.println("Factorial " + a + " = " + fact);

        System.out.println(bincoff(15, 5));

        // System.out.println(sum(3, 5));
        // System.out.println(sum(5, 2, 1));

        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.4f, 5.5f));

        // System.out.println(isprime(2));

        // System.out.println(primes(5));

        // primeinrange(20);

        // binTodec(111);

        // decTobin(312);

    }

}
