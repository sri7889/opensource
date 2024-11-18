import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        String month;
        if(n>=1 && n<=12) {
            switch(n) {
                case 3:
                case 4:
                case 5:
                    month ="Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    month ="Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    month ="Autumn";
                    break;
                default:
                    month="Winter";
            } System.out.print(month);
        }else{
                System.out.print("Invalid");
            }
        
    }
}
