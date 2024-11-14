import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();

        while(testcase!=0) {
        int x = scan.nextInt();
        int test = scan.nextInt();
        System.out.println((x/10)*test);
        testcase--;    
        }
    }
}
