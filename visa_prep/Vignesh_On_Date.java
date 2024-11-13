import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        long money = scan.nextLong();
        long bill = scan.nextLong();
        if(bill<=money)
            System.out.println("YES"); 
        else 
            System.out.println("NO");
    }
}
