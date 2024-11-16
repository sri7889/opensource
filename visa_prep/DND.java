import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        
        int num1=0,num2=0;
        
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if(arr[i]%m!=0) {
                num1+=arr[i];
            } else {
                num2+=arr[i];
            }
        }
        
        System.out.println(num2-num1);
    }
}
