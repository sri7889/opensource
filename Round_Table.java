import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int start = 1;
        for(int i=2;i<=n;i++) {
            start*=i;
        }
        System.out.print(start);
        
    }
    
}
