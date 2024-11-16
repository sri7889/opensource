import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long res=0;
        
        while(n!=0) {
            res = res*10 + n%10;
            n/=10;
        } 
        
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ) System.out.println("0");
        
        else {
            int rev = (int)res;
            System.out.println(rev);
             }
    }
}
