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
        int maxi=0,c=0;
        for(int i=0;i<N;i++) {
            if(arr[i]==0) {
                c++;
                for(int j=i+1;j<N;j++) {
                    if(arr[j]==0){
                        c++;
                    } else break;
                } 
            } maxi = Math.max(maxi,c);
            c=0;
        }
        System.out.println(maxi);
    }
}
