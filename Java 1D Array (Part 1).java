import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int cnt=0;
    //for(int j=0;j<n;j++){
    int x = 0;
    while(x < n ){
        int sum=0;
        for(int y=x;y<n;y++){
            sum=arr[y]+sum;
            if(sum<0){
                cnt++;
            }
        }
        x++;
    }
    System.out.println(cnt);
}
}
