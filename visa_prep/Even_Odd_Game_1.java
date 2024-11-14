import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        //String bcz constraint is 1000 if we take int or long exceed limit
        String n = scan.nextLine();
        int sum=0;
        
        for(int i=0;i<n.length();i++) {
            sum+=n.charAt(i)-'0';
        }
        
        if(sum%2 == 0) System.out.println("Vignesh");
        else System.out.println("Charan");
        
    }
}
