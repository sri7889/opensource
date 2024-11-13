import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        if(x+y<=z)
            System.out.println("2");
        else if(x<=z) 
            System.out.println("1");
        else 
            System.out.println("0");
    }
}
