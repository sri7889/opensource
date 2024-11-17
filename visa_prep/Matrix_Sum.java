import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int[] row_sum = new int[n];
        int[] col_sum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                row_sum[i] += arr[i][j];
                col_sum[j] += arr[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            int sum = row_sum[i] + col_sum[i];
                System.out.print(sum+" ");
            
        }
        
    }
}
