package com.BaiTap;

public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double nvc = 1.0;
    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setNvc(double nvc){
        this.nvc = nvc;
    }
    public double getNvc(){
        return nvc;
    }
    public boolean isTriangle(){
        return (getSide1() + getSide2() <= getSide3())
                || (getSide1() + getSide3() <= getSide2())
                || (getSide2() + getSide3() <= getSide1());
    }
    public double getArea(){
        if(!isTriangle()){
            setNvc((side1 + side2 + side3)/2);
            return Math.pow(nvc*(nvc-side1)*(nvc-side2)*(nvc-side3),0.5);
        }
        return 0;
    }
    public double getPerimeter(){
        if(!isTriangle()){
            return side1 + side2 + side3;
        }
        return 0;
    }
    @Override
    public String toString() {
        if(!isTriangle()){
            return "Triangular shape with sides = "
                    + getSide1() + ","
                    + getSide2() + ","
                    + getSide3() + "\n"
                    + "Area = " + getArea() + "\n"
                    + "Perimeter = " + getPerimeter() + "\n"
                    + "Color = " + super.getColor();
        }
        return "This is not a triangle";
    }
}
