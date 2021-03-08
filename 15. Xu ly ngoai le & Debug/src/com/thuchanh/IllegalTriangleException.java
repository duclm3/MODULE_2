package com.thuchanh;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Has side less than 0\n");
    }
    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");
    }
}
