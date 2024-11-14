import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        char vig  = scan.next().charAt(0);
        char cha  = scan.next().charAt(0);
        
        if(vig=='R') {
            if(cha=='P') System.out.println("Charan");
            else if(cha=='S') System.out.println("Vignesh");
            else System.out.println("NULL");
            
        } else if(vig=='P') {
            if(cha=='S') System.out.println("Charan");
            else if(cha=='R') System.out.println("Vignesh");
            else System.out.println("NULL");
        } 
        
        else {
            if(cha=='P') System.out.println("Vignesh");
            else if(cha=='R') System.out.println("Charan");
            else System.out.println("NULL");
        }
        
        
        
    }
}
