package com.company;

public class Main {

    public static void main(String[] args) {
        int[] memo = new int[16];
        for(int i = 0; i < 15; i++){
            System.out.println(i + ": " + fib(i, memo));
        }
    }

    /*
        Dynamic Programming calculating fibonacci sequence.
        Runtime of algorithm: O(N)
     */
    public static int fib(int n, int[] memo){
        if (n<=0) return 0;
        else if (n==1) return 1;
        else if(memo[n] < 0) return 0;
        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }
}
