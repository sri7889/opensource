import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        
        while(test!=0) {
            int total = scan.nextInt();
            int tickets = scan.nextInt();
            
            //if people were more than tickets there
            if(total>tickets) System.out.println(total-tickets);
            //if tickets are available or more than people
            else System.out.println("0");
            test--;
        }
    }
}
