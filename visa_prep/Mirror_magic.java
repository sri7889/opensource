import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            } System.out.println();
        }
        
    }
}
