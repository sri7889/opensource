import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long count = (n/3)+(n/5)-(n/15);
        //if use loop takes longer time
         System.out.println(count);
    }
}
