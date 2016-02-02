import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      for (int x=0; x<t; x++)
          {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int n = sc.nextInt();
          int pow;
          int sum;
          for(int i=0; i<n; i++)
          {
              pow = 1;
              sum = 0;
              int j = 0;
              while(j<=i)
              {
                 pow=pow*2;
                 j++;
              }

              sum = a+pow*b-b;
              System.out.printf("%d ", sum);
          }
      System.out.println();
      }
      
    }
    }
}
