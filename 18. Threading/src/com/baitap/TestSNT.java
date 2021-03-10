package com.baitap;

public class TestSNT {
    public static void main(String[] args) {
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();
        LazyPrimeFactorization lp = new LazyPrimeFactorization();
        Thread tho = new Thread(op);
        Thread thl = new Thread(lp);
        thl.start();
        tho.start();
    }

}
