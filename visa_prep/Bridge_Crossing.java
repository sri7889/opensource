import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int mango = scan.nextInt();
        int truck = scan.nextInt();
        int wg = scan.nextInt();
        int count=0;
        
        while(truck<=wg){
            truck+=mango;
            count++;
        } count--;
        
        System.out.println(count);
    }
}
