package string.string_extra;
import java.util.Arrays;    

import java.util.Scanner;

public class anagrams {
   public anagrams() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first string: ");
      String var2 = var1.nextLine().toLowerCase().replaceAll("\\s", "");
      System.out.print("Enter second string: ");
      String var3 = var1.nextLine().toLowerCase().replaceAll("\\s", "");
      if (var2.length() != var3.length()) {
         System.out.println("Not Anagrams");
      } else {
         char[] var4 = var2.toCharArray();
     
         char[] var5 = var3.toCharArray();
         Arrays.sort(var4);
         Arrays.sort(var5);
         if (Arrays.equals(var4, var5)) {
            System.out.println("The strings are Anagrams");
         } else {
            System.out.println("Not Anagrams");
         }
      }

   }
}

