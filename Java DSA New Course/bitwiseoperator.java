import java.util.*;

public class bitwiseoperator {

  // Check number is even or odd
  public static void oddeven(int n) {
    int bitwisenumber = 1;

    if ((n & bitwisenumber) == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("Odd number");
    }
  }

  public static void main(String args[]) {
    // System.out.println(5 & 6); // AND
    // System.out.println(5 | 6); // OR
    // System.out.println(5 ^ 6); // XOR
    // System.out.println(~(5)); // one`s complement
    // System.out.println(5 << 2); // Left shift
    // System.out.println(6 >> 1); // Right shift

    // check the number is odd or even
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();

    // if ((a & 1) == 0) {
    //   System.out.println("Number " + a + " is even");
    // } else {
    //   System.out.println("Number" + a + " is odd ");
    // }

    oddeven(3);
    oddeven(11);
    oddeven(14);
  }
}
