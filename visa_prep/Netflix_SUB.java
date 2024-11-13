import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int vig = scan.nextInt();
        int cha = scan.nextInt();
        int ris = scan.nextInt();
        int amt = scan.nextInt(); 
        
        //also need to check for greater than too 
        if(vig+cha>=amt || vig+ris>=amt || cha+ris>=amt) 
            System.out.println("YES");
        else 
            System.out.println("NO");
        
    }
}
