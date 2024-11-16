import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        
        int[] res = Unique_ele(n,arr);
        for(int num: res) {
            System.out.print(num+" ");
        }
        
    }
    
    public static int[] Unique_ele(int n,int[] arr) {
        Set<Integer> uniq = new HashSet<>();
        int[] setuniq = new int[n];
        int dex = 0;
        
        for(int num:arr) {
            if(uniq.add(num)) {
                setuniq[dex++] = num;
            }
        }
        int[] array = new int[dex];
        for(int i=0;i<dex;i++) {
            array[i] = setuniq[i];
        }
            
        return array;
    }
}
