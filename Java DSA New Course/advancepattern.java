public class advancepattern {
    public static void main(String args[]) {
        // hollo_rectangle(4, 5);
        // halfpyramid(4);
        // inverted_half_pyramid_with_number(5);
        // flyodtriangle(5);
        // triangle(5);
        // butterflypattern(4);
        // solidrhombus(5);
        // hollowrhombus(5);
        // diamondpattern(4);
        // numberpyramid(5);
        palindromepattern(5);
    }

    // // print hollow rectangle
    // public static void hollo_rectangle(int tolrows, int tolcols) {

    // // outer loop
    // for (int i = 1; i <= tolrows; i++) {
    // // inner loop
    // for (int j = 1; j <= tolcols; j++) {
    // // cell -(i,j)
    // if (i == 1 || i == tolrows || j == 1 || j == tolcols) {
    // // boundary line
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // print inverted half pyramid pattern with stars
    // public static void halfpyramid(int n) {

    // // outer loop
    // for (int i = 1; i <= n; i++) {
    // // inner loop
    // // for spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // for stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // print inverted half pyramid pattern with number
    // public static void inverted_half_pyramid_with_number(int n) {

    // // outer loop
    // for (int i = 1; i <= n; i++) {
    // // inner loop
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

    // }

    // print flyods triangle
    // public static void flyodtriangle(int n) {
    // int counter = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();
    // }

    // }

    // Print 0-1 triangle
    // public static void triangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print(" 1 " + " ");
    // } else {
    // System.out.print(" 0 " + " ");
    // }
    // }
    // System.out.println();

    // }
    // }

    // print Butterfly patten
    // public static void butterflypattern(int n) {

    // // 1st half
    // for (int i = 1; i <= n; i++) {
    // // Stars = i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // // sapces = 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars =i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // 2nd half

    // for (int i = n; i >= 1; i--) {
    // // stars =i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // // spaces = 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars =i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // print solid rhombus
    // public static void solidrhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // // for spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // print hollow rhombus
    // public static void hollowrhombus(int n) {
    // // outer loop
    // for (int i = 1; i <= n; i++) {
    // // inner loop
    // // for spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // // for stars
    // if (i == 1 || i == 5 || j == 1 || j == 5) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // print diamond pattern
    // public static void diamondpattern(int n) {
    // // 1st half
    // // outer loop
    // for (int i = 1; i <= n; i++) {
    // // inner loop
    // // for spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= (2 * i - 1); j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // 2nd half

    // // outer loop
    // for (int i = n; i >= 1; i--) {
    // // inner loop
    // // for spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= (2 * i - 1); j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // print number pyramid
    // public static void numberpyramid(int n) {
    // // outer loop
    // for (int i = 1; i <= n; i++) {
    // // inner loop
    // // for spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // for numbers
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    // }

    // // print palindrome pattern with number
    public static void palindromepattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for number
            // descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
