/*
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = in.nextBigInteger();
        BigInteger t2 = in.nextBigInteger();
        int tx = in.nextInt();
        in.close();
        
        BigInteger[] fibs = new BigInteger[tx];
        
        fibs[0] = t1;
        fibs[1] = t2;
        
        for(int i=2; i<tx; i++) fibs[i] = fibs[i-2].add(fibs[i-1].multiply(fibs[i-1]));
        
        System.out.println(fibs[tx-1]);
    }
}