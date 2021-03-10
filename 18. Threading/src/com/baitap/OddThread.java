package com.baitap;

public class OddThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i%2==1){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
