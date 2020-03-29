import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.io.*;
import java.util.*;
/**
 * Human readable bug tester for:
 * Polynomial.getCoefficient(int k)
 * @version (2020-03-27)
 */
public class TestGetCoefficientMullings {
    
    @Test public void TestGetCoefficientMullings() {
    /**
     * Your Polynomial class will be given an int[] of coefficients
     * that are listed in asscending term order;
     * Given an int k, return the coefficient for the term at order k
     */
        int[] givenArray = {};
        int lookupTerm = 5; int expectedResault = 0;
        int yourMethodResault = new Polynomial(givenArray).getCoefficient(lookupTerm);
        assertEquals(expectedResault, yourMethodResault);
        
        int[] givenArray1 = {42, -7, 0, 5};
        //expected Polynomial = "5x^3 - 7x + 42"
        int lookupTerm1 = 3; int expectedResault1 = 5;
        int yourMethodResault1 = new Polynomial(givenArray1).getCoefficient(lookupTerm1);
        assertEquals(expectedResault1, yourMethodResault1);
        
        int[] givenArray2 = {42, -7, 0, 5};
        //expected Polynomial = "5x^3 - 7x + 42"
        int lookupTerm2 = 0; int expectedResault2 = 42;
        int yourMethodResault2 = new Polynomial(givenArray2).getCoefficient(lookupTerm2);
        assertEquals(expectedResault2, yourMethodResault2);
        
        int[] givenArray3 = {42, -7, 0, 5};
        //expected Polynomial = "5x^3 - 7x + 42"
        int lookupTerm3 = 45670; int expectedResault3 = 0;
        int yourMethodResault3 = new Polynomial(givenArray3).getCoefficient(lookupTerm3);
        assertEquals(expectedResault3, yourMethodResault3);
        
        int[] givenArray4 = {42, -7, 0, 5};
        //expected Polynomial = "5x^3 - 7x + 42"
        int lookupTerm4 = -1; int expectedResault4 = 0;
        int yourMethodResault4 = new Polynomial(givenArray4).getCoefficient(lookupTerm4);
        assertEquals(expectedResault4, yourMethodResault4);
        
        int[] givenArray5 = {0, -2, 0, 43, -23, 0};
        //expected Polynomial = "-23x^4 + 43x^3 -2x + 0"
        int lookupTerm5 = 4; int expectedResault5 = -23;
        int yourMethodResault5 = new Polynomial(givenArray5).getCoefficient(lookupTerm5);
        assertEquals(expectedResault5, yourMethodResault5);
        
        int[] givenArray6 = {0, 0, -2, 0, 43, -23, 0, 0}; 
        //expected Polynomial = "-23x^5 + 43x^4 -2x^2 + 0"
        int lookupTerm6 = 4; int expectedResault6 = 43;
        int yourMethodResault6 = new Polynomial(givenArray6).getCoefficient(lookupTerm6);
        assertEquals(expectedResault6, yourMethodResault6);
        
        int[] givenArray7 = {33}; 
        //expected Polynomial = "33"
        int lookupTerm7 = 1; int expectedResault7 = 0;
        int yourMethodResault7 = new Polynomial(givenArray7).getCoefficient(lookupTerm7);
        assertEquals(expectedResault7, yourMethodResault7);
        
        int[] givenArray8 = {7, 9, 23, 24, -2}; 
        //expected Polynomial = "-2x^4 + 24x^3 + 23x^2 + 9x + 7"
        int lookupTerm8 = 5; int expectedResault8 = 0;
        int yourMethodResault8 = new Polynomial(givenArray8).getCoefficient(lookupTerm8);
        assertEquals(expectedResault8, yourMethodResault8);
        
        int[] givenArray9 = {-7, 0, -9, 0, -23, 0, 0, -1}; 
        //expected Polynomial = "-x^7 - 23x^4 - 9x^2 - 7"
        int lookupTerm9 = 5; int expectedResault9 = 0;
        int yourMethodResault9 = new Polynomial(givenArray9).getCoefficient(lookupTerm9);
        assertEquals(expectedResault9, yourMethodResault9);
        
        int[] givenArray10 = {-7, 0, -9, 0, -23, 0, 0, -1}; 
        //expected Polynomial = "-x^7 - 23x^4 - 9x^2 - 7"
        int lookupTerm10 = 7; int expectedResault10 = -1;
        int yourMethodResault10 = new Polynomial(givenArray10).getCoefficient(lookupTerm10);
        assertEquals(expectedResault10, yourMethodResault10);
        
        int[] givenArray11 = {-7, 0, -9, 0, -23, 0, 0, -1}; 
        //expected Polynomial = "-x^7 - 23x^4 - 9x^2 - 7"
        int lookupTerm11 = 1; int expectedResault11 = 0;
        int yourMethodResault11 = new Polynomial(givenArray11).getCoefficient(lookupTerm11);
        assertEquals(expectedResault11, yourMethodResault11);
        
        int[] givenArray12 = {0, -23, 0, 0, 0, 0, 0}; 
        //expected Polynomial = "-23x + 0"
        int lookupTerm12 = 1; int expectedResault12 = -23;
        int yourMethodResault12 = new Polynomial(givenArray12).getCoefficient(lookupTerm12);
        assertEquals(expectedResault12, yourMethodResault12);
        
        int[] givenArray13 = {0, 0, 0, 0, 0, 43, 0}; 
        //expected Polynomial = "43x^5 + 0"
        int lookupTerm13 = 5; int expectedResault13 = 43;
        int yourMethodResault13 = new Polynomial(givenArray13).getCoefficient(lookupTerm13);
        assertEquals(expectedResault13, yourMethodResault13);
        
        int[] givenArray14 = {-1, 1, -1, 1, 0 ,-2}; 
        //expected Polynomial = "-2x^5 + x^3 - x^2 + x - 1"
        int lookupTerm14 = 2; int expectedResault14 = -1;
        int yourMethodResault14 = new Polynomial(givenArray14).getCoefficient(lookupTerm14);
        assertEquals(expectedResault14, yourMethodResault14);
        
        int[] givenArray15 = {0, -50, -167, 18, -3, 0}; 
        //expected Polynomial = "-3x^4 + 18x^3 - 167x^2 - 50x + 0"
        int lookupTerm15 = 4; int expectedResault15 = -3;
        int yourMethodResault15 = new Polynomial(givenArray15).getCoefficient(lookupTerm15);
        assertEquals(expectedResault15, yourMethodResault15);
        
        int[] givenArray16 = {-4270, 0, 0, -2}; 
        //expected Polynomial = "-2x^3 - 4270"
        int lookupTerm16 = 2; int expectedResault16 = 0;
        int yourMethodResault16 = new Polynomial(givenArray16).getCoefficient(lookupTerm16);
        assertEquals(expectedResault16, yourMethodResault16);
        
        int[] givenArray17 = {4, 16, 19, 209}; 
        //expected Polynomial = "209x^3 + 19x^2 + 16x + 4"
        int lookupTerm17 = 3; int expectedResault17 = 209;
        int yourMethodResault17 = new Polynomial(givenArray17).getCoefficient(lookupTerm17);
        assertEquals(expectedResault17, yourMethodResault17);
        
        int[] givenArray18 = {2020, 20, 3}; 
        //expected Polynomial = "3x^2 + 20x + 2020"
        int lookupTerm18 = 0; int expectedResault18 = 2020;
        int yourMethodResault18 = new Polynomial(givenArray18).getCoefficient(lookupTerm18);
        assertEquals(expectedResault18, yourMethodResault18);
        
        int[] givenArray19 = {-25, 4, -23, 33, -24, 7, 2, 0, 1, 43, 0, -9}; 
        //expected Polynomial = "-9x^11 + 43x^9 + x^8 + 2x^6 + 7x^5 - 24x^4 + 33x^3 - 23x^2 + 4x - 25"
        int lookupTerm19 = 6; int expectedResault19 = 2;
        int yourMethodResault19 = new Polynomial(givenArray19).getCoefficient(lookupTerm19);
        assertEquals(expectedResault19, yourMethodResault19);
        
        int[] givenArray20 = {0, -25, 0, -23, 33, 0, 7, 0, 0, 23, 43, 0, 0}; 
        //expected Polynomial = "43x^10 + 23x^9 + 7x^6 + 33x^4 - 23x^3 - 25x + 0"
        int lookupTerm20 = 3; int expectedResault20 = -23;
        int yourMethodResault20 = new Polynomial(givenArray20).getCoefficient(lookupTerm20);
        assertEquals(expectedResault20, yourMethodResault20);    
    }
}