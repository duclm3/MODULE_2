package com.baitap;

public class TriangleClassifier {
    public static String TriangularClassification(int sideA,int sideB,int sideC){
        if(sideA == sideB && sideA == sideC && sideA!=0){
            return "Tam giác đều.";
        }else if((sideA == sideB || sideA == sideC || sideB == sideC) && sideA!=0 && sideB!=0 && sideC!=0){
            return "Tam giác cân.";
        }else if(sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA){
            return "Không phải tam giác.";
        }
        return "Tam giác thường.";
    }
}
