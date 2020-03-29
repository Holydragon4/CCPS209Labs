import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.io.*;
import java.util.*;
/**
 * Human readable bug tester for:
 * P2J3.reverseAscendingSubarrays()
 * @version (2020-03-26)
 */
public class TestReverseAscendingSubarraysMullings {
    
    @Test public void testReverseAscendingSubarraysMullings() {
    /**
     * Given any int[]; your method should reverse the elements
     * ,in place, of any and all strickly ascending subarrays
     */
        int[] a = {42};
        int[] expectedResault = {42};
        int[] yourMethod = a.clone();
        P2J3.reverseAscendingSubarrays(yourMethod);
        assertArrayEquals(expectedResault, yourMethod);
        
        int[] a1 = {1, 2};        
        int[] expectedResault1 = {2, 1};
        int[] yourMethod1 = a1.clone();
        P2J3.reverseAscendingSubarrays(yourMethod1);
        assertArrayEquals(expectedResault1, yourMethod1);
        
        int[] a2 = {2, 1};
        int[] expectedResault2 = {2, 1};
        int[] yourMethod2 = a2.clone();
        P2J3.reverseAscendingSubarrays(yourMethod2);
        assertArrayEquals(expectedResault2, yourMethod2);
        
        int[] a3 = {1, 2, 0};
        int[] expectedResault3 = {2, 1, 0};
        int[] yourMethod3 = a3.clone();
        P2J3.reverseAscendingSubarrays(yourMethod3);
        assertArrayEquals(expectedResault3, yourMethod3);
        
        int[] a4 = {1, 2, 3, 0};
        int[] expectedResault4 = {3, 2, 1, 0};
        int[] yourMethod4 = a4.clone();
        P2J3.reverseAscendingSubarrays(yourMethod4);
        assertArrayEquals(expectedResault4, yourMethod4);
        
        int[] a5 = {1, 2, 0, 0, 3};
        int[] expectedResault5 = {2, 1, 0, 3, 0};
        int[] yourMethod5 = a5.clone();
        P2J3.reverseAscendingSubarrays(yourMethod5);
        assertArrayEquals(expectedResault5, yourMethod5);
        
        int[] a6 = {1, 2, 0, 0, 3, 5};
        int[] expectedResault6 = {2, 1, 0, 5, 3, 0};
        int[] yourMethod6 = a6.clone();
        P2J3.reverseAscendingSubarrays(yourMethod6);
        assertArrayEquals(expectedResault6, yourMethod6);
        
        int[] a7 = {1, 2, 0, 0, 3, 5, 7};
        int[] expectedResault7 = {2, 1, 0, 7, 5, 3, 0};
        int[] yourMethod7 = a7.clone();
        P2J3.reverseAscendingSubarrays(yourMethod7);
        assertArrayEquals(expectedResault7, yourMethod7);
        
        int[] a8 = {10, 12, 0, 0, 3, 5, 7, 9};
        int[] expectedResault8 = {12, 10, 0, 9, 7, 5, 3, 0};
        int[] yourMethod8 = a8.clone();
        P2J3.reverseAscendingSubarrays(yourMethod8);
        assertArrayEquals(expectedResault8, yourMethod8);
        
        int[] a9 = {12, 10, 0};
        int[] expectedResault9 = {12, 10, 0};
        int[] yourMethod9 = a9.clone();
        P2J3.reverseAscendingSubarrays(yourMethod9);
        assertArrayEquals(expectedResault9, yourMethod9);
        
        int[] a10 = {12, 10, 0, 10};
        int[] expectedResault10 = {12, 10, 10, 0};
        int[] yourMethod10 = a10.clone();
        P2J3.reverseAscendingSubarrays(yourMethod10);
        assertArrayEquals(expectedResault10, yourMethod10);
        
        int[] a11 = {2, 1, 3, 0, 3};
        int[] expectedResault11 = {2, 3, 1, 3, 0};
        int[] yourMethod11 = a11.clone();
        P2J3.reverseAscendingSubarrays(yourMethod11);
        assertArrayEquals(expectedResault11, yourMethod11);
        
        int[] a12 = {7, 6, 0, 0, 13, 15};
        int[] expectedResault12 = {7, 6, 0, 15, 13, 0};
        int[] yourMethod12 = a12.clone();
        P2J3.reverseAscendingSubarrays(yourMethod12);
        assertArrayEquals(expectedResault12, yourMethod12);
        
        int[] a13 = {2, 1, 0, 4, 5, 5, 7};
        int[] expectedResault13 = {2, 1, 5, 4, 0, 7, 5};
        int[] yourMethod13 = a13.clone();
        P2J3.reverseAscendingSubarrays(yourMethod13);
        assertArrayEquals(expectedResault13, yourMethod13);
        
        int[] a14 = {22, 12, 0, 4, 5, 7, 7, 9};
        int[] expectedResault14 = {22, 12, 7, 5, 4, 0, 9, 7};
        int[] yourMethod14 = a14.clone();
        P2J3.reverseAscendingSubarrays(yourMethod14);
        assertArrayEquals(expectedResault14, yourMethod14);
                
        int[] a15 = {42, 99, -3, -10, -4};
        int[] expectedResault15 = {99, 42, -3, -4, -10};
        int[] yourMethod15 = a15.clone();
        P2J3.reverseAscendingSubarrays(yourMethod15);
        assertArrayEquals(expectedResault15, yourMethod15);
        
        int[] a16 = {99, 0, 0, 0, 99, 0, 0, 0};
        int[] expectedResault16 = {99, 0, 0, 99, 0, 0, 0, 0};
        int[] yourMethod16 = a16.clone();
        P2J3.reverseAscendingSubarrays(yourMethod16);
        assertArrayEquals(expectedResault16, yourMethod16);
        
        int[] a17 = {};
        int[] expectedResault17 = {};
        int[] yourMethod17 = a17.clone();
        P2J3.reverseAscendingSubarrays(yourMethod17);
        assertArrayEquals(expectedResault17, yourMethod17);
        
        int[] a18 = {2, 1, 0, 4, 5, 7, 6, 9, 44};
        int[] expectedResault18 = {2, 1, 7, 5, 4, 0, 44, 9, 6};
        int[] yourMethod18 = a18.clone();
        P2J3.reverseAscendingSubarrays(yourMethod18);
        assertArrayEquals(expectedResault18, yourMethod18);
        
        int[] a19 = {23, 7, 14, 24, 2, 43, 3, 9, 33, 25};
        int[] expectedResault19 = {23, 24, 14, 7, 43, 2, 33, 9, 3, 25};
        int[] yourMethod19 = a19.clone();
        P2J3.reverseAscendingSubarrays(yourMethod19);
        assertArrayEquals(expectedResault19, yourMethod19);
        
        int[] a20 = {2, 7, 43, 23, 33, 9, 14, 24, 3, 1, 25};
        int[] expectedResault20 = {43, 7, 2, 33, 23, 24, 14, 9, 3, 25, 1};
        int[] yourMethod20 = a20.clone();
        P2J3.reverseAscendingSubarrays(yourMethod20);
        assertArrayEquals(expectedResault20, yourMethod20);
    }
}