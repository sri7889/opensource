import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int peri_max = -1;
        
        for(int i=n-1;i>=2;i--){
            int sum=arr[i-1]+arr[i-2];
            if(arr[i]<sum) {
                peri_max = arr[i]+sum;
                break;
            }
        } System.out.print(peri_max);
    }
}
