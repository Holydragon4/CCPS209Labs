import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestReverseAscendingSubarraysParsons
{

    @Test public void testReverseAscendingSubarrays() 
    {
        // Case 0 - all numbers ascending
        int[] items0 = {1,2,3,4,5};
        P2J3.reverseAscendingSubarrays(items0);
        assertArrayEquals(items0, new int[] {5,4,3,2,1});
        
        // Case 1 - all numbers descending
        int[] items1 = {5,4,3,2,1};
        P2J3.reverseAscendingSubarrays(items1);
        assertArrayEquals(items1,  new int[] {5,4,3,2,1});
        
        // Case 2 - corner case - no values
        int[] items2 = {};
        P2J3.reverseAscendingSubarrays(items2);
        assertArrayEquals(items2, new int[] {});
        
        // Case 3 - corner case - single value
        int[] items3 = {99};
        P2J3.reverseAscendingSubarrays(items3);
        assertArrayEquals(items3, new int[] {99}); 
        
        // Case 4 - assorted cases
        int[] items4 = {1,10,5,4,2,8,14,20,9,3};
        P2J3.reverseAscendingSubarrays(items4);
        assertArrayEquals(items4, new int[] {10,1,5,4,20,14,8,2,9,3});
        
        // Case 5 - assorted cases
        int[] items5 = {-1,1,-2,2,-3,3,-4,4,-5,5};
        P2J3.reverseAscendingSubarrays(items5);
        assertArrayEquals(items5, new int[] {1,-1,2,-2,3,-3,4,-4,5,-5});
        
        // Case 6 - assorted cases
        int[] items6 = {1,2,3,4,5,-99};
        P2J3.reverseAscendingSubarrays(items6);
        assertArrayEquals(items6, new int[] {5,4,3,2,1,-99});
        
        // Case 7 - assorted cases
        int[] items7 = {1,2,3,-99,99,4,5,6,-99,99,7,8,9};
        P2J3.reverseAscendingSubarrays(items7);
        assertArrayEquals(items7, new int[] {3,2,1,99,-99,6,5,4,99,-99,9,8,7});
        
        // Case 8 - assorted cases
        int[] items8 = {1,2,3,5,4,7,8,6,9,11,12,10,0,-99,99};
        P2J3.reverseAscendingSubarrays(items8);
        assertArrayEquals(items8, new int[] {5,3,2,1,8,7,4,12,11,9,6,10,0,99,-99});
        
        // Case9 - assorted cases
        int[] items9 = {1000,999,998,5,4,3,1,2,10,20,50,100,500};
        P2J3.reverseAscendingSubarrays(items9);
        assertArrayEquals(items9, new int[] {1000,999,998,5,4,3,500,100,50,20,10,2,1});
        
        // Case10 - assorted cases
        int[] items10 = {5,3,1,2,4,6,0,7,-1,8,-2,9};
        P2J3.reverseAscendingSubarrays(items10);
        assertArrayEquals(items10, new int[] {5,3,6,4,2,1,7,0,8,-1,9,-2});        
        
        // Covered all standard permutations
        // Remaining cases are sourced from OEIS sequences
        // As per https://en.wikipedia.org/wiki/List_of_OEIS_sequences
        
        // Case11 - fibonacci ignoring 1st value (duplicate 1)
        int[] items11 = {1,2,3,5,8,13,21,34,55,89,144,233,377};
        P2J3.reverseAscendingSubarrays(items11);
        assertArrayEquals(items11, new int[] {377,233,144,89,55,34,21,13,8,5,3,2,1});
        
        // Case12 - decimal expansion of sqrt(2)
        int[] items12 = {1,4,1,4,2,1,3,5,6,2};
        P2J3.reverseAscendingSubarrays(items12);
        assertArrayEquals(items12, new int[] {4,1,4,1,2,6,5,3,1,2});        
        
        // Case13 - Decimal expansion of Pisot–Vijayaraghavan number
        int[] items13 = {1,3,2,4,7,1,7,9,5,7};
        P2J3.reverseAscendingSubarrays(items13);
        assertArrayEquals(items13, new int[] {3,1,7,4,2,9,7,1,7,5});  
        
        // Case14 - Ramanujan primes
        int[] items14 = {2,11,17,29,41,47,59,67};
        P2J3.reverseAscendingSubarrays(items14);
        assertArrayEquals(items14, new int[] {67,59,47,41,29,17,11,2});  
        
        // Case15 - Bernoulli numbers
        int[] items15 = {1,-1,1,0,-1,0,1,0,-1,0,5,0,-691,0,7,0,-3617,0,43867,0};
        P2J3.reverseAscendingSubarrays(items15);
        assertArrayEquals(items15, new int[] {1,1,-1,0,1,0,-1,0,5,0,-1,0,7,0,-691,0,43867,0,-3617,0});  
        
        // Case16 - Radical of an integer
        int[] items16 = {1,2,3,2,5,6,7,2,3,10};
        P2J3.reverseAscendingSubarrays(items16);
        assertArrayEquals(items16, new int[] {3,2,1,7,6,5,2,10,3,2});  
        
        // Case17 - Recamán's sequence
        int[] items17 = {0,1,3,6,2,7,13,20,12,21,11,22,10,23,9,24,8,25,43,62};
        P2J3.reverseAscendingSubarrays(items17);
        assertArrayEquals(items17, new int[] {6,3,1,0,20,13,7,2,21,12,22,11,23,10,24,9,62,43,25,8});
        
        // Case18 - Decimal expansion of e
        int[] items18 = {2,7,1,8,2,8,1,8,2,8};
        P2J3.reverseAscendingSubarrays(items18);
        assertArrayEquals(items18, new int[] {7,2,8,1,8,2,8,1,8,2});
        
        // Case19 - Decimal expansion of pi
        int[] items19 = {3,1,4,1,5,9,2,6,5,3};
        P2J3.reverseAscendingSubarrays(items19);
        assertArrayEquals(items19, new int[] {3,4,1,9,5,1,6,2,5,3});
        
    }    
}
