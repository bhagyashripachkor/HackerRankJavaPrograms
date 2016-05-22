import java.util.*;
import java.util.Scanner;
//Write your code here
class myCalculator{
    int power(int n, int p) throws Exception{
        try {

            if (n < 0 || p < 0){
                throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n,p);

    }
    catch(Exception e){
        throw e;
    }
   }
}
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
