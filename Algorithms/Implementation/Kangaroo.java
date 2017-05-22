/*
 * https://www.hackerrank.com/challenges/kangaroo
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int dx = x1 - x2;
        int dv = v2 - v1;

        if(dx == 0 || dv != 0 && (dx) / dv > 0 && dx % dv == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}