import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestEveryOtherKrishnakumarS.
 *
 * @author  (Sanjena Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestEveryOtherKrishnakumarS {
    @Test public void testEveryOther() {
        // even length array
        int[] arr1 = {12, 64};
        assertArrayEquals(new int[]{12}, P2J1.everyOther(arr1));
        int[] arr2 = {3, 6, 2, 15};
        assertArrayEquals(new int[]{3, 2}, P2J1.everyOther(arr2));
        int[] arr3 = {20, 13, 16, 9};
        assertArrayEquals(new int[]{20, 16}, P2J1.everyOther(arr3));
        int[] arr4 = {15, 9, 31, 52, 41, 97};
        assertArrayEquals(new int[]{15, 31, 41}, P2J1.everyOther(arr4));
        int[] arr5 = {5, 2, 9, 14, 49, 32};
        assertArrayEquals(new int[]{5, 9, 49}, P2J1.everyOther(arr5));
        int[] arr6 = {2, 4, 7, 15, 2, 36, 7, 18};
        assertArrayEquals(new int[]{2, 7, 2, 7}, P2J1.everyOther(arr6));
        int[] arr7 = {12, 17, 20, 70, 54, 32, 39};
        assertArrayEquals(new int[]{12, 20, 54, 39}, P2J1.everyOther(arr7));
        
        // odd length array
        int[] arr8 = {15, 2, 45};
        assertArrayEquals(new int[]{15, 45}, P2J1.everyOther(arr8));
        int[] arr9 = {3, 16, 12};
        assertArrayEquals(new int[]{3, 12}, P2J1.everyOther(arr9));
        int[] arr10 = {32, 21, 42};
        assertArrayEquals(new int[]{32, 42}, P2J1.everyOther(arr10));
        int[] arr11 = {15, 39, 25, 49, 32};
        assertArrayEquals(new int[]{15, 25, 32}, P2J1.everyOther(arr11));
        int[] arr12 = {43, 67, 43, 5, 52};
        assertArrayEquals(new int[]{43, 43, 52}, P2J1.everyOther(arr12));
        int[] arr13 = {12, 42, 37, 15, 21, 36, 43};
        assertArrayEquals(new int[]{12, 37, 21, 43}, P2J1.everyOther(arr13));
        int[] arr14 = {32, 89, 56, 43, 15, 2, 10};
        assertArrayEquals(new int[]{32, 56, 15, 10}, P2J1.everyOther(arr14));
        
        // array with only one element
        int[] arr15 = {1};
        assertArrayEquals(new int[]{1}, P2J1.everyOther(arr15));
        int[] arr16 = {2};
        assertArrayEquals(new int[]{2}, P2J1.everyOther(arr16));
        int[] arr17 = {4};
        assertArrayEquals(new int[]{4}, P2J1.everyOther(arr17));
        int[] arr18 = {52};
        assertArrayEquals(new int[]{52}, P2J1.everyOther(arr18));
        int[] arr19 = {118};
        assertArrayEquals(new int[]{118}, P2J1.everyOther(arr19));
        
        // array with zero elements
        int[] arr20 = {};
        assertArrayEquals(new int[]{}, P2J1.everyOther(arr20));
    }
}