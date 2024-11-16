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
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:arr) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        int x=0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            if(entry.getValue()==1){
                x=entry.getKey();
                break;
            }
        } if(x!=0) System.out.println(x);
        else System.out.println("no");                                       
    }
}
