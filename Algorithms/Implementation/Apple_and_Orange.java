/*
 * https://www.hackerrank.com/challenges/apple-and-orange
 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();        
        int c_a = 0, c_o = 0;     

        for(int i=0; i < m; i++) if(checkBetween(s, t, in.nextInt() + a)) c_a++;
        for(int i=0; i < n; i++) if(checkBetween(s, t, in.nextInt() + b)) c_o++;
        System.out.println(c_a + "\r\n" + c_o);
    }
    
    public static Boolean checkBetween(int s, int f, int v){
        return v >= s && v <= f;
    }
}