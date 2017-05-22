/*
 * https://www.hackerrank.com/challenges/the-birthday-bar
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    static int getWays(int[] s, int d, int m){
        int n = 0;        
        for(int i = 0; i < s.length - m + 1; i++)
            if(IntStream.of(Arrays.copyOfRange(s, i, i + m)).sum() == d) n++;
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
