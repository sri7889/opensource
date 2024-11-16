import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        
        int c=0;
        for(int i=0;i<N-1;i++) {
            for(int j=i+1;j<N;j++) {
              if(arr[i]+arr[j]==k) {
                c++;
                  break;
            } }
        }
        System.out.println((c>=1 ? "true" : "false"));
    }
}
