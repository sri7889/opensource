import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long fact = 1;
        
        //if condition is n!=1 then for input n=0 it will be timed out
        while(n!=0) {
            fact*=n;
            n--;
        }
        System.out.println(fact);
    }
}
