import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.io.*;
import java.util.*;
/**
 * Human readable bug tester for:
 * P2J4.runningMedianOfThree()
 * @version (2020-03-26)
 */
public class TestRunningMedianOfThreeMullings {
    
    @Test public void TestRunningMedianOfThreeMullings() {
    /**
     * Given a List of Integers; return a new List whose first two
     * Integers are the same as the original List; but every Intgeger
     * after that, must equal the MEDIAN of the three Integers in the 
     * original list, leading up to, and including, that position
     */
        int[] givenArray = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int[] expectedResault = {5, 2, 5, 2, 7, 4, 6, 4, 6};
        int[] yourMethodResault = runAndReturnIntArray(givenArray.clone());
        assertArrayEquals(expectedResault, yourMethodResault);
        
        int[] givenArray1 = {};
        int[] expectedResault1 = {};
        int[] yourMethodResault1 = runAndReturnIntArray(givenArray1.clone());
        assertArrayEquals(expectedResault1, yourMethodResault1);
        
        int[] givenArray2 = {42};
        int[] expectedResault2 = {42};
        int[] yourMethodResault2 = runAndReturnIntArray(givenArray2.clone());
        assertArrayEquals(expectedResault2, yourMethodResault2);
        
        int[] givenArray3 = {2, 7, 23};
        int[] expectedResault3 = {2, 7, 7};
        int[] yourMethodResault3 = runAndReturnIntArray(givenArray3.clone());
        assertArrayEquals(expectedResault3, yourMethodResault3);
        
        int[] givenArray4 = {2, 7, 43, 23};
        int[] expectedResault4 = {2, 7, 7, 23};
        int[] yourMethodResault4 = runAndReturnIntArray(givenArray4.clone());
        assertArrayEquals(expectedResault4, yourMethodResault4);
        
        int[] givenArray5 = {7, 2, 23, 33, 43};
        int[] expectedResault5 = {7, 2, 7, 23, 33};
        int[] yourMethodResault5 = runAndReturnIntArray(givenArray5.clone());
        assertArrayEquals(expectedResault5, yourMethodResault5);
        
        int[] givenArray6 = {3, 7, 2, 14, 9};
        int[] expectedResault6 = {3, 7, 3, 7, 9};
        int[] yourMethodResault6 = runAndReturnIntArray(givenArray6.clone());
        assertArrayEquals(expectedResault6, yourMethodResault6);
        
        int[] givenArray7 = {43, 2, 9, 5, 7};
        int[] expectedResault7 = {43, 2, 9, 5, 7};
        int[] yourMethodResault7 = runAndReturnIntArray(givenArray7.clone());
        assertArrayEquals(expectedResault7, yourMethodResault7);
        
        int[] givenArray8 = {43, 43, 2, 2, 9, 25, 33};
        int[] expectedResault8 = {43, 43, 43, 2, 2, 9, 25};
        int[] yourMethodResault8 = runAndReturnIntArray(givenArray8.clone());
        assertArrayEquals(expectedResault8, yourMethodResault8);
        
        int[] givenArray9 = {43, -43, -2, 2, -9, 25, 23, -33, -24};
        int[] expectedResault9 = {43, -43, -2, -2, -2, 2, 23, 23, -24};
        int[] yourMethodResault9 = runAndReturnIntArray(givenArray9.clone());
        assertArrayEquals(expectedResault9, yourMethodResault9);
        
        int[] givenArray10 = {0, -2, -7, 43, -33};
        int[] expectedResault10 = {0, -2, -2, -2, -7};
        int[] yourMethodResault10 = runAndReturnIntArray(givenArray10.clone());
        assertArrayEquals(expectedResault10, yourMethodResault10);
        
        int[] givenArray11 = {1, 3, 5, 7, 9, 11};
        int[] expectedResault11 = {1, 3, 3, 5, 7, 9};
        int[] yourMethodResault11 = runAndReturnIntArray(givenArray11.clone());
        assertArrayEquals(expectedResault11, yourMethodResault11);
        
        int[] givenArray12 = {22, 20, 18, 16, 14, 12, 24};
        int[] expectedResault12 = {22, 20, 20, 18, 16, 14, 14};
        int[] yourMethodResault12 = runAndReturnIntArray(givenArray12.clone());
        assertArrayEquals(expectedResault12, yourMethodResault12);
        
        int[] givenArray13 = {2, 43, 14325, 0};
        int[] expectedResault13 = {2, 43, 43, 43};
        int[] yourMethodResault13 = runAndReturnIntArray(givenArray13.clone());
        assertArrayEquals(expectedResault13, yourMethodResault13);
        
        int[] givenArray14 = {-339, 0, -14, -2};
        int[] expectedResault14 = {-339, 0, -14, -2};
        int[] yourMethodResault14 = runAndReturnIntArray(givenArray14.clone());
        assertArrayEquals(expectedResault14, yourMethodResault14);
        
        int[] givenArray15 = {9, 4, 3, 6, 8, 2};
        int[] expectedResault15 = {9, 4, 4, 4, 6, 6};
        int[] yourMethodResault15 = runAndReturnIntArray(givenArray15.clone());
        assertArrayEquals(expectedResault15, yourMethodResault15);
        
        int[] givenArray16 = {2042, 1912, 1985, 2020, 1989};
        int[] expectedResault16 = {2042, 1912, 1985, 1985, 1989};
        int[] yourMethodResault16 = runAndReturnIntArray(givenArray16.clone());
        assertArrayEquals(expectedResault16, yourMethodResault16);
        
        int[] givenArray17 = {33, 33, 33, 33, 33};
        int[] expectedResault17 = {33, 33, 33, 33, 33};
        int[] yourMethodResault17 = runAndReturnIntArray(givenArray17.clone());
        assertArrayEquals(expectedResault17, yourMethodResault17);
        
        int[] givenArray18 = {0, -2, 4, 3, 23, -25, -7};
        int[] expectedResault18 = {0, -2, 0, 3, 4, 3, -7};
        int[] yourMethodResault18 = runAndReturnIntArray(givenArray18.clone());
        assertArrayEquals(expectedResault18, yourMethodResault18);
        
        int[] givenArray19 = {0, -2, 23, 42};
        int[] expectedResault19 = {0, -2, 0, 23};
        int[] yourMethodResault19 = runAndReturnIntArray(givenArray19.clone());
        assertArrayEquals(expectedResault19, yourMethodResault19);
        
        int[] givenArray20 = {25, -2, 7, 0};
        int[] expectedResault20 = {25, -2, 7, 0};
        int[] yourMethodResault20 = runAndReturnIntArray(givenArray20.clone());
        assertArrayEquals(expectedResault20, yourMethodResault20);    
    }
    
    private int[] runAndReturnIntArray(int[] array) {
        List<Integer> list = new ArrayList<Integer>(array.length);
        for (int num: array) { list.add(num); }
        list = P2J4.runningMedianOfThree(list);
        for (int i = 0; i < array.length; i++) { array[i] = list.get(i); }
        return array;
    }
}