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
        int k = scan.nextInt();
        int low=0;
        int high=n-1;
        int x=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(k==arr[mid]) {
                x=mid;
                break;
            } else if(k>arr[mid]) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        } System.out.print(x);
    }
}
