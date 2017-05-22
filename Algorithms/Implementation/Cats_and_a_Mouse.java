/*
 * https://www.hackerrank.com/challenges/cats-and-a-mouse
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int m1len = Math.abs(x-z);
            int m2len = Math.abs(y-z);
            
            if(m1len == m2len) System.out.println("Mouse C");
            else if (m1len < m2len) System.out.println("Cat A");
            else System.out.println("Cat B");
        }
    }
}
