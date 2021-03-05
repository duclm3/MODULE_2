package com.thuchanh;

public class Triangle {

    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws   IllegalTriangleException {
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException(side1);//văng và khởi tạo một đối tượng IllegalTriangleException mới chuyền vào một cạnh nào đó
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException(side2);
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException(side3);
        else if(0 > side3  || 0 > side2 ||  0 > side1)
            throw new IllegalTriangleException();
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

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

    @Override
    public String toString() {
        return "Triangle side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3;
    }

}
