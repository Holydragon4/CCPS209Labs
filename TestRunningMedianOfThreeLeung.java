import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestRunningMedianOfThreeLeung
{
    @Test public void testP2J4()
    {
        //Test for length 0
        List<Integer> c1 = new ArrayList<>();
        List<Integer> ans = P2J4.runningMedianOfThree(c1);
        assertEquals("Size of arrays do not match for length 0", 0, ans.size());
        
        //Test for length 1
        c1.add(4);
        ans = P2J4.runningMedianOfThree(c1);
        assertEquals("Values of length 1 do not match", c1.get(0), ans.get(0));
        assertEquals("Size of arrays do not match for length 1", 1, ans.size());
        
        //Test for length 2
        c1.add(0);
        ans = P2J4.runningMedianOfThree(c1);
        assertEquals("Values of length 1 do not match", c1.get(0), ans.get(0));
        assertEquals("Values of length 2 do not match", c1.get(1), ans.get(1));
        assertEquals("Size of arrays do not match for length 2", 2, ans.size());
        
        //Test for length 3
        Integer[] arr = new Integer[] {5, 2, 9};
        List<Integer> c2 = Arrays.asList(arr);
        Integer[] arr1 = new Integer[] {5, 2, 5};
        List<Integer> ans2 = Arrays.asList(arr1);
        assertEquals("Values of length 3 do not match", c2.get(0), ans2.get(0));
        assertEquals("Values of length 3 do not match", c2.get(1), ans2.get(1));
        assertEquals("Size of arrays do not match for length 3", 3, ans2.size());
        assertEquals("Median not computed near bounds", ans2.get(2), P2J4.runningMedianOfThree(c2).get(2));
        
        //Test for length > 3
        Integer[] arr2 = new Integer[] {5, 2, 9, 1, 7, 4, 6, 3, 8};
        List<Integer> c3 = Arrays.asList(arr2);
        Integer[] arr3 = new Integer[] {5, 2, 5, 2, 7, 4, 6, 4, 6};
        List<Integer> ans3 = Arrays.asList(arr3);
        assertEquals("Medians not computed", ans3, P2J4.runningMedianOfThree(c3));
        assertEquals("Size of arrays do not match", 9, ans3.size());
        
        //Test for array with duplicate numbers
        Integer[] arr4 = new Integer[] {5, 2, 9, 2, 9, 9, 2, 2, 9};
        List<Integer> c4 = Arrays.asList(arr4);
        Integer[] arr5 = new Integer[] {5, 2, 5, 2, 9, 9, 9, 2, 2};
        List<Integer> ans4 = Arrays.asList(arr5);
        assertEquals("Median not computed near bounds", ans4.get(8), P2J4.runningMedianOfThree(c4).get(8));
        assertEquals("Medians not computed", ans4, P2J4.runningMedianOfThree(c4));
        assertEquals("Size of arrays do not match", 9, ans4.size());
        
        //Test for array with negative numbers
        Integer[] arr6 = new Integer[] {5, 2, -9, 2, -9, 9, -2, 2, -9};
        List<Integer> c5 = Arrays.asList(arr6);
        Integer[] arr7 = new Integer[] {5, 2, 2, 2, -9, 2, -2, 2, -2};
        List<Integer> ans5 = Arrays.asList(arr7);
        assertEquals("Median not computed near bounds", ans5.get(8), P2J4.runningMedianOfThree(c5).get(8));
        assertEquals("Medians not computed", ans5, P2J4.runningMedianOfThree(c5));
        assertEquals("Size of arrays do not match", 9, ans5.size());
    }
}