

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class TesetFirstMissingPositive.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TesetFirstMissingPositive
{
     @Test
    public void TestFirstMissingPositive(){
        List<Integer> original1 = Arrays.asList(1,1,1,1,1,1,1,1,1);
        int result1 = 2;
        int test1 = P2J4.firstMissingPositive(original1);
        assertEquals(result1,test1);

        List<Integer> original2 = Arrays.asList(1,6,3,7,2,99,7,5);
        int result2 = 4;
        int test2 = P2J4.firstMissingPositive(original2);
        assertEquals(result2,test2);

        List<Integer> original3 = Arrays.asList(2);
        int result3 = 1;
        int test3 = P2J4.firstMissingPositive(original3);
        assertEquals(result3,test3);

        List<Integer> original4 = Arrays.asList();
        int result4 = 1;
        int test4 = P2J4.firstMissingPositive(original4);
        assertEquals(result4,test4);

        List<Integer> original5 = Arrays.asList(1,2,4,3,5,8,7,6,99,9999999,566754);
        int result5 = 9;
        int test5 = P2J4.firstMissingPositive(original5);
        assertEquals(result5,test5);

        List<Integer> original6 = Arrays.asList(1,2,4,3,5,8,7,6,99,9999999,566754);
        int result6 = 9;
        int test6 = P2J4.firstMissingPositive(original6);
        assertEquals(result6,test6);

        List<Integer> original7 = Arrays.asList(10,9,8,7,6,4,3,2,1,5,5,5,5,5,5);
        int result7 = 11;
        int test7 = P2J4.firstMissingPositive(original7);
        assertEquals(result7,test7);

        List<Integer> original8 = Arrays.asList(1,3,66,44,55,77,88,99,11,22,33);
        int result8 = 2;
        int test8 = P2J4.firstMissingPositive(original8);
        assertEquals(result8,test8);

        List<Integer> original9 = Arrays.asList(6543,3456,5323,6634,2346,7531,1,2,3456,234567);
        int result9 = 3;
        int test9 = P2J4.firstMissingPositive(original9);
        assertEquals(result9,test9);

        List<Integer> original10 = Arrays.asList(1,1,1,2,3,3,4,5,5,7,8,9,100,34521,3456,1234,561,11);
        int result10 = 6;
        int test10 = P2J4.firstMissingPositive(original10);
        assertEquals(result10,test10);

        List<Integer> original11 = Arrays.asList(1,3,2,4,6,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,2,2,3,3,4,4,1,1);
        int result11 = 7;
        int test11 = P2J4.firstMissingPositive(original11);
        assertEquals(result11,test11);

        List<Integer> original12 = Arrays.asList(6,5,4,3,2,1,7,8,9,10,11,13,14,2234,56732,45347,3467235,12);
        int result12 = 15;
        int test12 = P2J4.firstMissingPositive(original12);
        assertEquals(result12,test12);

        List<Integer> original13 = Arrays.asList(1111,1112,1342,4425,6734,5673234,1,2,67346,784456,2345235);
        int result13 = 3;
        int test13 = P2J4.firstMissingPositive(original13);
        assertEquals(result13,test13);

        List<Integer> original14 = Arrays.asList(4,2,4,1,3,5,6,8,7,1345,67346,34568,4324674,52346,9,10,11,12,14);
        int result14 = 13;
        int test14 = P2J4.firstMissingPositive(original14);
        assertEquals(result14,test14);

        List<Integer> original15 = Arrays.asList(6,5,3,6,245,6724,56235,1,2,67845,62456,7,9);
        int result15 = 4;
        int test15 = P2J4.firstMissingPositive(original15);
        assertEquals(result15,test15);

        List<Integer> original16 = Arrays.asList(2,5,3,1,4,6,6,6,6,66666,6666666,666,6666);
        int result16 = 7;
        int test16 = P2J4.firstMissingPositive(original16);
        assertEquals(result16,test16);

        List<Integer> original17 = Arrays.asList(1,2,3,4,4,4,4,4,5,6,7,8,9,8,7,6,5,4,3,2,1);
        int result17 = 10;
        int test17 = P2J4.firstMissingPositive(original17);
        assertEquals(result17,test17);

        List<Integer> original18 = Arrays.asList(2,2345,6734,44,53236,7342456,3742245);
        int result18 = 1;
        int test18 = P2J4.firstMissingPositive(original18);
        assertEquals(result18,test18);

        List<Integer> original19 = Arrays.asList(268);
        int result19 = 1;
        int test19 = P2J4.firstMissingPositive(original19);
        assertEquals(result19,test19);

        List<Integer> original20 = Arrays.asList(999999,99,9999,999,9999999);
        int result20 = 1;
        int test20 = P2J4.firstMissingPositive(original20);
        assertEquals(result20,test20);

        
    }
}
