package com.baitap;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11};
        for (int i = 0; i < a.length ; i++) {
            if(checkPrime(a[i])){
                System.out.println(a[i] + "là số nguyên tố O");
            }
        }
        return;
    }
    public boolean checkPrime(int a){
        for (int i = 2; i <= Math.sqrt(a) ; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
