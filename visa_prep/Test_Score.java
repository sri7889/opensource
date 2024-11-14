import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int total = n*x;
        
        if(y%x==0 && total<=y) System.out.println("YES");
        else if(x==0) System.out.println("NO");
        else System.out.println("NO");
    }
}
