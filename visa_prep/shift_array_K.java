import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        long k = scan.nextInt();
        int x = (int)k%n;
        
        if(x!=0) {
        for(int i=0;i<x;i++){
            for(int j=n-1;j>0;j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        } }
        for(int num:arr) {
        System.out.print(num+" ");
        }
    }
}
