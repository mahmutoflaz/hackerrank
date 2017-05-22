/*
 * https://www.hackerrank.com/challenges/grading
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int grades_i=0; grades_i < n; grades_i++){
            int tmp = in.nextInt();
            
            if(tmp >= 38){
                int diff = 5- (tmp %5);
                if(diff < 3) tmp = tmp + diff;
            }
            System.out.println(tmp);
        }
    }
}
