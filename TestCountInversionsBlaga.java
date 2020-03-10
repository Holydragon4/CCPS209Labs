import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.util.*;

 

public class TestCountInversionsBlaga

{

    // #1

    /** covers String s2 = null;

     *  <p>This means that (null) or "no value at all" is assigned to s2.

     *  <p>So this one, s2.length() is the same as null.length(),

     *  <p>Running the length() method for either will yield a NullPointerException

     */

    /*
    @Test public void testNull() {

        int[] testCase = null;

        assertEquals(0, P2J1.countInversions(testCase));

    }
    */
    

  

    @Test public void testSingleCases() {

 

        

        int[] testCase2 = {-3};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase2));

        

        int[] testCase3 = {0};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase3));

        

        int[] testCase4 = {1};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase4));

        

        int[] testCase5 = {10};

        //The array has no inversions. 

        assertEquals(0, P2J1.countInversions(testCase5));

        

        

    }

    

    @Test public void testPositiveCases() {

 

        int[] testCase6 = {8, 4, 2, 1};

        //The array has six inversions: (8,4), (4,2), (8,2), (8,1), (4,1), (2,1).

        assertEquals(6, P2J1.countInversions(testCase6));

        

        int[] testCase7 = {1, 2, 4, 8};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase7));

        

    }

    

    @Test public void testNegativeCases() {

 

        int[] testCase8 = {-1, -2, -4, -8};

        //The array has six inversions: (-1,-8), (-2,-8), (-4,-8), (-1,-4), (-2,-4), (-4,-8).

        assertEquals(6, P2J1.countInversions(testCase8));

        

        int[] testCase9 = {-8, -4, -2, -1};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase9));

        

        

    }

    

    @Test public void testPositiveNegativeCases() {

 

        int[] testCase10 = {8, 4, -2, -1};

        //The array has five inversions: (8,4), (8,-2), (8,-1), (4,-2), (4,-1).

        //The case (-2,-1) does not count since the first element is less than the second element

        assertEquals(5, P2J1.countInversions(testCase10));

        

        int[] testCase11 = {2, 1, -3};

        //The array has six inversions: (2,1), (2,-3), (1,-3).

        assertEquals(3, P2J1.countInversions(testCase11));

        

    }

    

    @Test public void testZeroCases() {

 

        int[] testCase12 = {8, 4, 1, 0};

        //The array has six inversions: (8,4), (8,1), (8,0), (4,1), (4,0), (1,0).

        assertEquals(6, P2J1.countInversions(testCase12));

        

        int[] testCase13 = {2, 0, -3};

        //The array has six inversions: (2,0), (2,-3), (0,-3).

        assertEquals(3, P2J1.countInversions(testCase13));

        

        int[] testCase14 = {0, 1};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase14));

        

        int[] testCase15 = {-1, 0};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase15));

        

        

    }

    

    @Test public void testDuplicateCases() {

 

        int[] testCase16 = {8, 8, 2, 1};

        //The array has five inversions: (8,2), (8,2), (8,1), (8,1), (2,1).

        assertEquals(5, P2J1.countInversions(testCase16));

        

        int[] testCase17 = {2, 1, 2};

        //The array has one inversion: (2,1).

        assertEquals(1, P2J1.countInversions(testCase17));

        

        int[] testCase18 = {-1, 0, -1};

        //The array has one inversion: (0,-1).

        assertEquals(1, P2J1.countInversions(testCase18));

        

        int[] testCase19 = {1, 0, 0};

        //The array has two inversion: (1,0), (1,0).

        assertEquals(2, P2J1.countInversions(testCase19));

        

        int[] testCase20 = {0, 0, -1, -1};

        //The array has four inversion: ("first" 0,"first" -1), ("first" 0,"second" -1), ("second" 0,"first" -1), ("second" 0,"second" -1).

        assertEquals(4, P2J1.countInversions(testCase20));

        

    }

    

    @Test public void testExtremeCases() {

        int[] testCase21 = {Integer.MAX_VALUE}; //   Integer.MAX_VALUE is (2^31)-1

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase21));

        

        int[] testCase22 = {Integer.MIN_VALUE}; //   Integer.MIN_VALUE is -[(2^31)-1]

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase22));

 

        int[] testCase23 = {Integer.MAX_VALUE, 4, 2, 1};

        //The array has six inversions: (Integer.MAX_VALUE,4), (4,2), (Integer.MAX_VALUE,2), (Integer.MAX_VALUE,1), (4,1), (2,1).

        assertEquals(6, P2J1.countInversions(testCase23));

        

        int[] testCase24 = {1, 2, 4, Integer.MAX_VALUE};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase24));

        

        int[] testCase25 = {-1, -2, -4, Integer.MIN_VALUE};

        //The array has six inversions: (-1,Integer.MIN_VALUE), (-2,Integer.MIN_VALUE), (-4,Integer.MIN_VALUE), (-1,-4), (-2,-4), (-4,Integer.MIN_VALUE).

        assertEquals(6, P2J1.countInversions(testCase25));

        

        int[] testCase26 = {Integer.MIN_VALUE, -4, -2, -1};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase26));

        

        int[] testCase27 = {Integer.MAX_VALUE, 1, 0, -1, Integer.MIN_VALUE};

        //The array has six inversions: (Integer.MAX_VALUE,1), (Integer.MAX_VALUE,0), (Integer.MAX_VALUE,-1), (Integer.MAX_VALUE,Integer.MIN_VALUE),

        //(1,0), (1,-1), (1, Integer.MIN_VALUE), (0,-1), (0,Integer.MIN_VALUE), (-1,Integer.MIN_VALUE)

        assertEquals(10, P2J1.countInversions(testCase27));

        

        int[] testCase28 = {Integer.MIN_VALUE, Integer.MAX_VALUE};

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase28));

        

        int[] testCase29 = {0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        //The array has four inversion: ("first" 0,"first" Integer.MIN_VALUE), ("first" 0,"second" Integer.MIN_VALUE),

        //("second" 0,"first" Integer.MIN_VALUE), ("second" 0,"second" Integer.MIN_VALUE).

        assertEquals(4, P2J1.countInversions(testCase29));

        

        int[] testCase30 = {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0};

        //The array has four inversion: ("first" Integer.MAX_VALUE,"first" 0), ("first" Integer.MAX_VALUE,"second" 0),

        //("second" Integer.MAX_VALUE,"first" 0), ("second" Integer.MAX_VALUE,"second" 0).

        assertEquals(4, P2J1.countInversions(testCase30));

               

        int[] testCase31 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        //The array has four inversion: ("first" Integer.MAX_VALUE,"first" Integer.MIN_VALUE), ("first" Integer.MAX_VALUE,"second" Integer.MIN_VALUE),

        //("second" Integer.MAX_VALUE,"first" Integer.MIN_VALUE), ("second" Integer.MAX_VALUE,"second" Integer.MIN_VALUE).

        assertEquals(4, P2J1.countInversions(testCase31));

    }

    @Test public void testExtremeCase2() {

        int arrayLength = (2<<16); int fillValue = Integer.MIN_VALUE;

        //test for 131,072 elements. ...gets very slow between 2^17 and 2^30-1

        int[] testCase32 = filledArr(arrayLength, fillValue);

        

        //The array has no inversions.

        assertEquals(0, P2J1.countInversions(testCase32));

        

    }

    

     /* 

      *  may work a bit faster than Arrays.fill

      *  initialize a smaller piece of the array and use the System.arraycopy

      *  call to fill in the rest of the array in an expanding binary fashion

      */

    private static int[] filledArr(int desiredLength, int value) {

        int len = desiredLength;

        int[] array = new int[desiredLength];

        if (len > 0){

           array[0] = value;

        }

        

          //Value of i will be [1, 2, 4, 8, 16, 32, ..., len]

        for (int i = 1; i < len; i += i) {

            System.arraycopy(array, 0, array, i, ((len - i) < i) ? (len - i) : i);

        }

         

        return array;     

    }

}