import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) throws InputMismatchException, IOException {
     Scanner in = new Scanner(System.in);
    int z;
    try
    {
    int x = in.nextInt();
    int y = in.nextInt();
    if(x ==(int)x || y ==(int)y){
            z = x/y;
        }
      else  throw new InputMismatchException();
      System.out.println(z);
    }catch(InputMismatchException e1){
        System.out.println(e1.getClass().getName());
    } catch(Exception e){ 
        System.out.println(e); 
    }
    }
  
}
