import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        
        while(test!=0){
            int target = scan.nextInt();
            int score = scan.nextInt();
            System.out.println(target-score+1);
            test--;
        }
    }
}
