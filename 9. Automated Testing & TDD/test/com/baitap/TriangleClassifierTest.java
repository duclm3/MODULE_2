package com.baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    void triangularClassification222() {
        String expected = TriangleClassifier.TriangularClassification(2,2,2);
        String result = "Tam giác đều.";
        assertEquals(expected,result);
    }
    @Test
    void triangularClassification223() {
        String expected = TriangleClassifier.TriangularClassification(2,2,3);
        String result = "Tam giác cân.";
        assertEquals(expected,result);
    }
    @Test
    void triangularClassification345() {
        String expected = TriangleClassifier.TriangularClassification(3,4,5);
        String result = "Tam giác thường.";
        assertEquals(expected,result);
    }
    @Test
    void triangularClassification823() {
        String expected = TriangleClassifier.TriangularClassification(8,2,3);
        String result = "Không phải tam giác.";
        assertEquals(expected,result);
    }
    @Test
    void triangularClassification_121() {
        String expected = TriangleClassifier.TriangularClassification(-1,2,1);
        String result = "Không phải tam giác.";
        assertEquals(expected,result);
    }
    @Test
    void triangularClassification011() {
        String expected = TriangleClassifier.TriangularClassification(0,1,1);
        String result = "Không phải tam giác.";
        assertEquals(expected,result);
    }
}