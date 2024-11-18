import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        System.out.print(((year%4==0 && year%100!=0) || year%400==0) ? "YES" : "NO");
    }
}
