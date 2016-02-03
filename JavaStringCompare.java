import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = sc.nextInt();
        List<String> str =  new ArrayList<String>();
        String s;
        for(int i = 0; i < input.length()-(len-1); i++){
            s = input.substring(i,i+len);
            str.add(s);
        }
        Collections.sort(str);
        System.out.println(str.get(0));
        System.out.println(str.get(str.size()-1));
    }
}
