import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestSumOfDistinctCubes
{
    @Test public void testP2J6()
    {
        //Test for n = 0;
        assertEquals("Empty list not returned for n = 0", List.of(), P2J6.sumOfDistinctCubes(0));
        
        //Test for n = x * x * x;
        Integer[] ans1 = new Integer[] {1};
        List<Integer> c1 = Arrays.asList(ans1);
        assertEquals("Cubes not computed near bounds, when n = x * x * x", c1, P2J6.sumOfDistinctCubes(1));
        
        Integer[] ans2 = new Integer[] {2};
        List<Integer> c2 = Arrays.asList(ans2);
        assertEquals("Cube not computed, when n = x * x * x", c2, P2J6.sumOfDistinctCubes(8));
        
        Integer[] ans3 = new Integer[] {10};
        List<Integer> c3 = Arrays.asList(ans3);
        assertEquals("Cube not computed, when n = x * x * x", c3, P2J6.sumOfDistinctCubes(1000));
        
        //Test for descending order:
        Integer[] res1 = new Integer[] {5, 11};
        List<Integer> r1 = Arrays.asList(res1);
        Integer[] ans4 = new Integer[] {11, 5};
        List<Integer> c4 = Arrays.asList(ans4);
        if (P2J6.sumOfDistinctCubes(1456) == r1)
        {
            assertEquals("Result not in descending order", c4, P2J6.sumOfDistinctCubes(1456));
        }
        Integer[] res2 = new Integer[] {3, 12};
        List<Integer> r2 = Arrays.asList(res2);
        Integer[] ans5 = new Integer[] {12, 3};
        List<Integer> c5 = Arrays.asList(ans5);
        if (P2J6.sumOfDistinctCubes(1755) == r2)
        {
            assertEquals("Result not in descending order", c5, P2J6.sumOfDistinctCubes(1755));
        }
        Integer[] res3 = new Integer[] {1, 2, 3};
        List<Integer> r3 = Arrays.asList(res3);
        Integer[] ans6 = new Integer[] {3, 2, 1};
        List<Integer> c6 = Arrays.asList(ans6);
        if (P2J6.sumOfDistinctCubes(136) == r3)
        {
            assertEquals("Result not in descending order", c6, P2J6.sumOfDistinctCubes(36));
        }
        
        // Test for n != the sum of distinct cubes
        assertEquals("Empty list near bounds not returned when n != the sum of distinct cubes",List.of(), P2J6.sumOfDistinctCubes(2));
        assertEquals("Empty list not returned when n != the sum of distinct cubes", List.of(), P2J6.sumOfDistinctCubes(54));
        assertEquals("Empty list not returned when n != the sum of distinct cubes", List.of(), P2J6.sumOfDistinctCubes(2000));
        
        // Test for lexicographically highest ordering
        Integer[] res4 = new Integer[] {9, 7};
        List<Integer> r4 = Arrays.asList(res4);
        Integer[] ans7 = new Integer[] {10, 4, 2};
        List<Integer> c7 = Arrays.asList(ans7);
        if (P2J6.sumOfDistinctCubes(1072) == r4)
        {
            assertEquals("Results not in lexicographically highest order", c7, P2J6.sumOfDistinctCubes(1072));
        }
             
        // Test for n = the sum of cubes that are not distinct 
        Integer[] res5 = new Integer[] {2, 2};
        List<Integer> r5 = Arrays.asList(res5);
        if (P2J6.sumOfDistinctCubes(16) == r5)
        {
            assertEquals("Result must compute distinct cubes", List.of(), P2J6.sumOfDistinctCubes(16)); 
        }
        
        Integer[] res6 = new Integer[] {5, 5, 4, 3};
        List<Integer> r6 = Arrays.asList(res6);
        Integer[] ans9 = new Integer[] {6, 5};
        List<Integer> c9 = Arrays.asList(ans9);
        if (P2J6.sumOfDistinctCubes(341) == r6)
        {
            assertEquals("Result must compute distinct cubes", c9, P2J6.sumOfDistinctCubes(341));
        }
        
        Integer[] res7 = new Integer[] {10, 10, 2};
        List<Integer> r7 = Arrays.asList(res7);
        Integer[] ans10 = new Integer[] {12, 6, 4};
        List<Integer> c10 = Arrays.asList(ans10);
        if (P2J6.sumOfDistinctCubes(2008) == r7)
        {
            assertEquals("Result must compute distinct cubes", c10, P2J6.sumOfDistinctCubes(2008));
        }
        
        //Generalized testing without expected result
        assertEquals("Result not compued as expected", c4, P2J6.sumOfDistinctCubes(1456));
        assertEquals("Result not compued as expected", c5, P2J6.sumOfDistinctCubes(1755));
        assertEquals("Result not compued as expected", c6, P2J6.sumOfDistinctCubes(36));
        assertEquals("Result not compued as expected", c7, P2J6.sumOfDistinctCubes(1072));
        assertEquals("Result not compued as expected", List.of(), P2J6.sumOfDistinctCubes(16)); 
        assertEquals("Result not compued as expected", c9, P2J6.sumOfDistinctCubes(341));
        assertEquals("Result not compued as expected", c10, P2J6.sumOfDistinctCubes(2008));
    }
}