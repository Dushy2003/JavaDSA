import java.util.*;

public class questionbank8 {

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int count = 0;

    // for (int i = 0; i < str.length(); i++) {
    //   char ch = str.charAt(i);

    //   if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //     count++;
    //   }
    // }
    // System.out.println("Count of vowels is =" + count);

    //   String str = "shradhaDidi";
    //   String str1 = "Apnacollege";
    //   String str2 = "shradhaDidi";

    //   System.out.println(str.equals(str1) + " " + str.equals(str2));
    // }

    // String str = "apnacollege".replace("l", "");
    // System.out.println(str);

    // Determine if 2 String are anagrams of each other

    String str1 = "loop";
    String str2 = "pool";

    // Convert string to lowercase ? why so that we don`t have to check separately for lower & uppercase

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // First check if the length are same

    if (str1.length() == str2.length()) {
      // convert string into char array

      char[] str1CharArray = str1.toCharArray();
      char[] str2CharArray = str2.toCharArray();

      // sort the char array

      Arrays.sort(str1CharArray);
      Arrays.sort(str2CharArray);

      // if the sorted char arrays identical then the string are anagrams

      boolean result = Arrays.equals(str1CharArray, str2CharArray);

      if (result) {
        System.out.println(
          str1 + " and " + str2 + " are anagrams of  each other"
        );
      } else {
        System.out.println(
          str1 + " and " + str2 + " are not anagrams of each other "
        );
      }
    } else {
      System.out.println(
        str1 + "and " + str2 + " are not anagrams of each other "
      );
    }
  }
}
