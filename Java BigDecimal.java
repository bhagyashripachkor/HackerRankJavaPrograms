import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){ 
                if(compare(s[j-1], s[j]) < 0){
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                }else{ 
                    j = 0;
                }
            }
        }
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
	public static int compare(String a, String b){
		BigDecimal b1,b2;
	    b1 = new BigDecimal(a);
	    b2 = new BigDecimal(b);
	    return b1.compareTo(b2);
	}

    

}
