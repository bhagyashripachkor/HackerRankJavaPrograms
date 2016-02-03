import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       Boolean isAnagram = false;
        if(A != null && B != null) {
       char [] arrayA = A.toLowerCase().toCharArray();
       char [] arrayB = B.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       isAnagram = Arrays.equals(arrayA, arrayB);
   }
   return isAnagram;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
