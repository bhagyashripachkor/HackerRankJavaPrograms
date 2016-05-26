//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
       HashMap<String,String> hm = new HashMap<String,String>();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         String phone=in.nextLine();
          hm.put(name,phone);
         
      }
      while(in.hasNext())
      {
         String s=in.nextLine().trim();
          if(hm.containsKey(s))
              System.out.println(s+"="+hm.get(s));
          else
              System.out.println("Not found");
      }
   }
}
