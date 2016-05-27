import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
	       boolean found = false;
	      while (sc.hasNext()) {
	         String input=sc.next();
	         Stack stk = new Stack();
	            //Complete the code
	         String s = "x";
	         for(int i = 0; i < input.length(); i++) {
	        	 found = false;
	        	 s = input.substring(i,i+1);
	        	 if(!stk.empty()){
	        		 if(s.equals(")") && stk.peek().equals("(")){
	        			 stk.pop();
	        			 found = true;
	        		 }
	        		 if(s.equals("}") && stk.peek().equals("{")){
	        			 stk.pop();
	        			 found = true;
	        		 }
	        		 if(s.equals("]") && stk.peek().equals("[")){
	        			 stk.pop();
	        			 found = true;
	        		 }
	        		 if(!found)
	        			 stk.push(s);
	        	 }else
	        		 stk.push(s);
	        	
	         }
	         if(stk.empty())
	        	 System.out.println("true");
	         else
	        	 System.out.println("false");
	      }
      
   }
}
