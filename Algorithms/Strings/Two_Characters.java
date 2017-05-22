/*
 * https://www.hackerrank.com/challenges/two-characters
 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reduce(s));
    }
    
    public static String reduce(String s){
        int cur = 0;
        while(cur < s.length()-1){
            if(s.charAt(cur) == s.charAt(cur+1)){
                s = s.substring(0,cur) + s.substring(cur+2);
                if(cur>0) cur--;
            }
            else cur++;
        }
        return (s.length() == 0) ? "Empty String" : s;
    }
}