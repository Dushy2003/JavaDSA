import java.util.*;

public class strings {

  // public static boolean ispalindrome(String str) {
  //   for (int i = 0; i <= str.length() / 2; i++) {
  //     int n = str.length();
  //     if (str.charAt(i) != str.charAt(n - 1 - i)) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  // print letter present in the string
  // public static void printletters(String str) {
  //   for (int i = 0; i < str.length(); i++) {
  //     System.out.print(str.charAt(i) + " ");
  //   }
  // }

  // print string is palindrome or not
  // public static boolean ispalindrome(String str) {
  //   for (int i = 0; i < str.length() / 2; i++) {
  //     int n = str.length();
  //     if (str.charAt(i) != str.charAt(n - i - 1)) {
  //       System.out.println("This String is not palindrome");
  //       return false;
  //     }
  //   }
  //   System.out.println("This String is palindrome");
  //   return true;
  // }

  // print the shortest path of the string
  // public static float getshortestpath(String path) {
  //   int x = 0;
  //   int y = 0;

  //   for (int i = 0; i < path.length(); i++) {
  //     int dir = path.charAt(i);

  //     // South
  //     if (dir == 'S') {
  //       y--;
  //     }
  //     // North
  //     else if (dir == 'N') {
  //       y++;
  //     }
  //     // West
  //     else if (dir == 'W') {
  //       x--;
  //     }
  //     // East
  //     else {
  //       x++;
  //     }
  //   }

  //   int X2 = x * x;
  //   int Y2 = y * y;
  //   System.out.println(
  //     "The cordinate lies on the graph is (" + x + " , " + y + ")"
  //   );
  //   return (float) Math.sqrt(X2 + Y2);
  // }

  // print sub string
  // public static String substring(String str, int si, int ei) {
  //   String substr = "";
  //   for (int i = si; i < ei; i++) {
  //     substr += str.charAt(i);
  //   }
  //   return substr;
  // }

  //   // print touppercase function
  // public static String printupper(String str) {
  //   StringBuilder sb = new StringBuilder(" ");

  //   char ch = Character.toUpperCase(str.charAt(0));
  //   sb.append(ch);

  //   for (int i = 1; i < str.length(); i++) {
  //     if (str.charAt(i) == ' ' && i < str.length() - 1) {
  //       sb.append(str.charAt(i));
  //       i++;
  //       sb.append(Character.toUpperCase(str.charAt(i)));
  //     } else {
  //       sb.append(str.charAt(i));
  //     }
  //   }
  //   return sb.toString();
  // }

  //print compression string
  public static String compression(String str) {
    String newstr = " ";

    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newstr += str.charAt(i);

      if (count > 1) {
        newstr += count.toString();
      }
    }
    return newstr;
  }

  public static void main(String[] args) {
    // char ch[] = { 'a', 'b', 'c', 'd' };

    // String str = "A";
    // String str2 = new String("xyz");

    // System.out.println(ch);
    // System.out.println(str);
    // System.out.println(str2);

    // Scanner sc = new Scanner(System.in);
    // // String name = sc.next();
    // String name1 = sc.nextLine();

    // //System.out.println(name);
    // System.out.println(name1);

    // String str = "noon";
    // System.out.println(ispalindrome(str));
    // String str = "Dushyant Bhambore";
    // printletters(str);

    // print the shortest path of the string
    // String path = "WNEENESENNN";
    // System.out.println(getshortestpath(path));

    //   String str1 = "Tony";
    //   String str2 = new String("Tony");

    //   if (str1.equals(str2)) {
    //     System.out.println("String are equals");
    //   } else {
    //     System.out.println("String are not equals");
    //   }

    // print sub string
    // String str = "HelloWorld";
    // // System.out.println(substring(str, 0, 5));
    // System.out.println(str.substring(0, 5));

    // print the largest string using compareTo function
    // String fruits[] = { "apple", "mango", "banana" };
    // String largest = fruits[0];

    // for (int i = 1; i < fruits.length; i++) {
    //   if (largest.compareTo(fruits[i]) < 0) {
    //     largest = fruits[i];
    //   }
    // }
    // System.out.println(largest);

    // print String builder
    //   StringBuilder sb = new StringBuilder(" ");
    //   for (int ch = 1; ch <= 10; ch++) {
    //     sb.append(ch);
    //   }
    //   System.out.println(sb.length());
    // }

    //   // print touppercase function
    //   String str = "hello world";
    //   System.out.println(printupper(str));
    // }

    // print compreassion string
    String str = "aaabbcccdd";
    System.out.println(compression(str));
  }
}
