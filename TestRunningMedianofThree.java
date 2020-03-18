// Authored by Edward Lee

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.util.*;

import java.util.Random;


public class TestRunningMedianofThree

{

    //*************************************************************************************

    //************************Tests for pancakeScramble************************************

    //*************************************************************************************

    

    /*  Test cases include:
     * 
     *  1.  Blank list
     *  2.  Single item list
     *  3.  Two item list
     *  4.  Three item list
     *  5.  Four item list
     *  6.  List of identical Integers
     *  7.  Large list of 30 Integers
     *  8.  Very large list of Integers
     *  9.  List of some negative numbers
     *  10. List of all negative numbers
     *  11. List of all zeroes
     *  12. Ascending List
     *  13. Descending List
     *  14. List with identical first two indices
     *  15. List with identical numbers at indices 1 & 2
     *  16. List with identical first three indices
     *  17. List with identical numbers at indicies >2
     *  18. List of all unique Integers
     *  19. List that ascends until a midpoint, then descends
     *  20. List that descends until a midpoint, then ascends
     */

    // #1
    /** covers testCase.size()==0; 
     *  <p>This is an empty list with no items
     *  <p>Attempting to iterate over an empty list will yield an exception
     */

    @Test public void blankList() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList());

        assertEquals(testCase, P2J4.runningMedianOfThree(testCase));

    }

    // #2

    /** covers testCase.size()==1,
     *  <p>This is a list with only one item
     *  <p>Attempting to iterate past the 0th index will yield an exception
     */
    @Test public void singleItem() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(1));
        assertEquals(testCase, P2J4.runningMedianOfThree(testCase));

    }

    // #3

    /** covers testCase.size()==2,
     *  <p>This is a list with only two items
     *  <p>Attempting to iterate past the 1st index will yield an exception
     */
    @Test public void doubleItem() {
        
        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(1,2));

        assertEquals(testCase, P2J4.runningMedianOfThree(testCase));
    }

    // #4

    /** covers testCase.size()==3,
     *  <p>This is a list with exactly three unique items, no more and no less
     *  <p>The algorithm must have a proper exit condition
     */

    @Test public void tripleItem() {
        
        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,2));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));
    }
    
    // #5
    /** covers testCase.size()==3,
     *  <p>This is a list with exactly four unique items, no more and no less
     *  <p>The algorithm must be able to decide upon the median item amongst the subsequent set of Integers
     */

    @Test public void quadraItem() {
        
        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,2,3));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }

    // #6

    /** covers cases of identical Integers,
     *  <p>This is a list of six Integers of the same value
     */

    @Test public void testIdentical() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,5));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #7
    
    /** covers cases of large lists of arbitrary Integers,
     *  <p>This is a list of 30 Integers, arbitrarily chosen
     */

    @Test public void testLarge() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,3,7,8,1,3,4,6,2,1111111,233333333,2,2,2,2,8,3,3,5,8,0,-5,-23232323,35,8234,93,999999,81,-99999,30));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 3, 5, 7, 7, 3, 3, 4, 4, 6, 1111111, 1111111, 2, 2, 2, 2, 3, 3, 3, 5, 5, 0, -5, -5, 35, 93, 8234, 93, 81, 30));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #8
    
    /** covers cases of very large lists of arbitrary Integers,
     *  <p>This is a list of 100 Integers, arbitrarily chosen from a range of 0 <= x <= 5000
     */

    @Test public void testVeryLarge() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(2233, 1790, 4848, 2833, 721, 1481, 498, 4776, 4797, 4260, 4960, 3195, 1642, 1102, 4224, 4836, 1948, 832, 2873, 922, 3492, 4549, 2753, 10, 4760, 4509, 1615, 1471, 3830, 209, 4517, 2498, 3420, 4456, 1356, 908, 3588, 4896, 328, 2050, 2396, 2354, 4495, 1362, 3581, 1431, 4505, 1089, 1625, 1247, 1208, 612, 4148, 4377, 1106, 1468, 1964, 4196, 1632, 3222, 2478, 2100, 952, 4684, 2976, 4921, 868, 4744, 2717, 342, 1450, 1575, 3844, 4069, 4748, 3348, 4896, 1387, 4775, 1957, 4456, 872, 197, 4257, 3437, 2500, 4190, 698, 4034, 3249, 3956, 839, 2188, 1768, 1711, 4688, 1275, 2837, 1854, 1799));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(2233, 1790, 2233, 2833, 2833, 1481, 721, 1481, 4776, 4776, 4797, 4260, 3195, 1642, 1642, 4224, 4224, 1948, 1948, 922, 2873, 3492, 3492, 2753, 2753, 4509, 4509, 1615, 1615, 1471, 3830, 2498, 3420, 3420, 3420, 1356, 1356, 3588, 3588, 2050, 2050, 2354, 2396, 2354, 3581, 1431, 3581, 1431, 1625, 1247, 1247, 1208, 1208, 4148, 4148, 1468, 1468, 1964, 1964, 3222, 2478, 2478, 2100, 2100, 2976, 4684, 2976, 4744, 2717, 2717, 1450, 1450, 1575, 3844, 4069, 4069, 4748, 3348, 4775, 1957, 4456, 1957, 872, 872, 3437, 3437, 3437, 2500, 4034, 3249, 3956, 3249, 2188, 1768, 1768, 1768, 1711, 2837, 1854, 1854));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));
    }
    
    // #9
    
    /** covers cases of lists with some mixture of negative Integers
     *  <p>This is a list of 10 Integers, half of which are negatives
     */

    @Test public void testSomeNegative() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(-5,1,-333,-284,5,89,-70,500,-1000,10));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(-5, 1, -5, -284, -284, 5, 5, 89, -70, 10));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #10
    
    /** covers cases of lists with all negative Integers
     *  <p>This is a list of 10 Integers, all of which are negatives
     */

    @Test public void testAllNegative() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(-5,-1,-333,-284,-5,-89,-70,-500,-1000,-10));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(-5, -1, -5, -284, -284, -89, -70, -89, -500, -500));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #11
    
    /** covers cases of lists with all zeroes
     *  <p>This is a list of 10 Integers, all of which are zeroes
     */

    @Test public void testAllZeroes() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #12
    
     /** covers cases of lists of Integers in ascending order
     *  <p>This is a list of 15 Integers, arbitrarily chosen and in ascending order
     */

    @Test public void testAscending() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,15,26,300,301,467,588,678,901,1000,1200,1567,1700,1840,2015));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 15, 15, 26, 300, 301, 467, 588, 678, 901, 1000, 1200, 1567, 1700, 1840));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    // #13
    
     /** covers cases of lists of Integers in ascending order
     *  <p>This is a list of 15 Integers, arbitrarily chosen and in descending order
     */

    @Test public void testDescending() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(201, 1840, 1700, 1567, 1200, 1000, 901, 678, 588, 467, 301, 300, 26, 15, 5));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(201, 1840, 1700, 1700, 1567, 1200, 1000, 901, 678, 588, 467, 301, 300, 26, 15));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #14
    
     /** covers cases of lists with identical first two indices
     *  <p>This is a list of 5 integers, the first two of which are identical
     *  <p>A list having the beginning two indices identical necessarily means that the third index becomes identical as well
     */

    @Test public void testFirstTwo() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,5,6,8,3));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 6, 6));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #15
    
     /** covers cases of lists with identical second and third indices
     *  <p>This is a list of 12 integers, the second and third indices of which are identical
     *  <p>A list having the second and third two indices identical necessarily means that the third index does not change
     */

    @Test public void testOneandTwo() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(6,5,5,8,3,7,15,200,1,201,500,800));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(6, 5, 5, 5, 5, 7, 7, 15, 15, 200, 201, 500));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #16
    
     /** covers cases of lists with identical first three indices
     *  <p>This is a list of 12 integers, the first three being identical
     *  <p>A list having the first three indices identical necessarily means that the fourth index becomes identical to the first three
     */

    @Test public void testFirstThree() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,5,5,8,3,7,15,200,1,201,500,800));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 7, 7, 15, 15, 200, 201, 500));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #17
    
     /** covers cases of lists with unique Integers at the first three indices, and identical Integers subsequently
     *  <p>This is a list of 12 integers, all Integers after the third index being identical
     */

    @Test public void testIdenticalAfter() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(5,6,9,10,10,10,10,10,10,10,10,10));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 6, 6, 9, 10, 10, 10, 10, 10, 10, 10, 10));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #18
    
     /** covers cases of lists with all unique Integers
     *  <p>This is a list of 12 integers, all unique and arbitrarily chosen
     */

    @Test public void testAllUnique() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(8,10,12,3,0,-500,60,36,50,-999,-233,92));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(8, 10, 10, 10, 3, 0, 0, 36, 50, 36, -233, -233));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #19
    
     /** covers cases of lists that ascend up to a certain point, then descend
     *  <p>This is a list of 15 integers: the first 8 ascending, the last 7 descending
     */

    @Test public void testAscendDescend() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(-200,-58,0,8,10,12,20,50,47,20,12,0,-50,-500,-900));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(-200, -58, -58, 0, 8, 10, 12, 20, 47, 47, 20, 12, 0, -50, -500));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
    // #20
    
     /** covers cases of lists that descend up to a certain point, then ascend
     *  <p>This is a list of 15 integers: the first 8 descending, the last 7 ascending
     */

    @Test public void testDescendAscend() {

        ArrayList<Integer> testCase = new ArrayList<Integer>(Arrays.asList(50,47,20,12,0,-50,-500,-900,-200,-58,0,8,10,12,20,50));
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(50, 47, 47, 20, 12, 0, -50, -500, -500, -200, -58, 0, 8, 10, 12, 20));
        assertEquals(result, P2J4.runningMedianOfThree(testCase));

    }
    
}