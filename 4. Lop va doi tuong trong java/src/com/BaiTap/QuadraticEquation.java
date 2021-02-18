package com.BaiTap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4 * this.a * this.c;
    }
    public void getRoot1(){
        double delta = this.getDiscriminant();
        if(delta > 0){
            System.out.println((-this.b + Math.pow(delta,0.5))/(2 * this.a));
        }else if(delta == 0){
            System.out.println(-b /(2*a));
        }else{
            System.out.println("The equation has no roots");
        }
    }
    public void getRoot2(){
        double delta = this.getDiscriminant();
        if(delta > 0){
            System.out.println((-this.b - Math.pow(delta,0.5))/(2 * this.a));
        }else if(delta == 0){
            System.out.println( -b /(2*a));
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
