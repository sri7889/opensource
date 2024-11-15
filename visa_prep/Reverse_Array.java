import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        String s = Arrays.toString(arr).replace("[","").replace(",","").replace("]","");
        System.out.println(s);
    }
}
