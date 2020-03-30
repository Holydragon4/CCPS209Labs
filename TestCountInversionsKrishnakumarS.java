import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestCountInversionsKrishnakumarS.
 *
 * @author  (Sanjena Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestCountInversionsKrishnakumarS {
    @Test public void testCountInversions() {
        // even length array
        int[] arr1 = {25, 22};
        assertEquals(1, P2J1.countInversions(arr1));
        int[] arr2 = {23, 28};
        assertEquals(0, P2J1.countInversions(arr2));
        int[] arr3 = {54, 23, 12, 9};
        assertEquals(6, P2J1.countInversions(arr3));
        int[] arr4 = {72, 34, 12, 1, 15, 6};
        assertEquals(12, P2J1.countInversions(arr4));
        int[] arr5 = {24, 2, 15, 9, 34, 42};
        assertEquals(4, P2J1.countInversions(arr5));
        int[] arr6 = {73, 5, 21, 18, 2, 15, 9, 34};
        assertEquals(16, P2J1.countInversions(arr6));
        int[] arr7 = {61, 45, 23, 67, 29, 33, 11, 0};
        assertEquals(22, P2J1.countInversions(arr7));
        
        // odd length array
        int[] arr8 = {25, 22, 13};
        assertEquals(3, P2J1.countInversions(arr8));
        int[] arr9 = {23, 28, 30};
        assertEquals(0, P2J1.countInversions(arr9));
        int[] arr10 = {45, 33, 20, 7, 2};
        assertEquals(10, P2J1.countInversions(arr10));
        int[] arr11 = {70, 42, 32, 1, 13, 7, 6};
        assertEquals(18, P2J1.countInversions(arr11));
        int[] arr12 = {12, 1, 16, 8, 10, 32, 40};
        assertEquals(5, P2J1.countInversions(arr12));
        int[] arr13 = {76, 3, 20, 19, 3, 14, 7, 22, 32};
        assertEquals(16, P2J1.countInversions(arr13));
        int[] arr14 = {56, 42, 25, 64, 26, 69, 39, 22, 0};
        assertEquals(25, P2J1.countInversions(arr14));
        
        // array with one element
        int[] arr15 = {2};
        assertEquals(0, P2J1.countInversions(arr15));
        int[] arr16 = {5};
        assertEquals(0, P2J1.countInversions(arr16));
        int[] arr17 = {27};
        assertEquals(0, P2J1.countInversions(arr17));
        int[] arr18 = {-19};
        assertEquals(0, P2J1.countInversions(arr18));
        int[] arr19 = {-22};
        assertEquals(0, P2J1.countInversions(arr19));
        
        // array with zero elements
        int[] arr20 = {};
        assertEquals(0, P2J1.countInversions(arr20));
    }
}