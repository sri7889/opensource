import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        int first = bill-((bill*10)/100);
        int sec = bill-100;
        if(bill>=100) {
            System.out.println(Math.min(first,sec));
        } else {
            System.out.println(first);
        }
    }
}
