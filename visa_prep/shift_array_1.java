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
        for(int i=0;i<1;i++) {
            int temp=0;
            for(int j=1;j<n;j++) {
                 temp =arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                //System.out.println(arr[j]);
            }
        } System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
    }
}
