import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestEveryOtherPurcino {
    @Test public void testEveryOther(){
        //test for empty
        assertArrayEquals(new int[]{},P2J1.everyOther(new int[]{}));
        //test for 1 element        
        assertArrayEquals(new int[]{3},P2J1.everyOther(new int[]{3}));
        assertArrayEquals(new int[]{59},P2J1.everyOther(new int[]{59, 36}));
        assertArrayEquals(new int[]{89},P2J1.everyOther(new int[]{89, 95}));
        //test for 2 elements
        assertArrayEquals(new int[]{8, 34},P2J1.everyOther(new int[]{8, 46, 34,69}));
        assertArrayEquals(new int[]{4, 20},P2J1.everyOther(new int[]{4, 3, 20}));
        assertArrayEquals(new int[]{6, 9},P2J1.everyOther(new int[]{6, 33, 9}));
        //test for 3 elements
        assertArrayEquals(new int[]{8, 135, 39},P2J1.everyOther(new int[]{8, 15, 135, 13, 39, 88}));
        assertArrayEquals(new int[]{1, 3, 5},P2J1.everyOther(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{4, 4, 4},P2J1.everyOther(new int[]{4, 1, 4, 10, 4}));
        //test for 4 elements  
        assertArrayEquals(new int[]{10, 10, 20, 20},P2J1.everyOther(new int[]{10, 16, 10, 19, 20, 999, 20, 19}));
        assertArrayEquals(new int[]{98, 76, 54, 32},P2J1.everyOther(new int[]{98, 94, 76, 79, 54, 54, 32}));
        assertArrayEquals(new int[]{0, 0, 0, 0},P2J1.everyOther(new int[]{0, 1, 0, 1, 0, 1, 0, 1}));
        assertArrayEquals(new int[]{42, 42, 42, 42},P2J1.everyOther(new int[]{42, 29, 42, 11, 42, 33, 42}));
        assertArrayEquals(new int[]{12, 34, 56, 78},P2J1.everyOther(new int[]{12, 3, 34, 2, 56, 1, 78}));
        //test for 5 elements
        assertArrayEquals(new int[]{69, 96, 69, 96, 69},P2J1.everyOther(new int[]{69, 987, 96, 753, 69, 798, 96, 468, 69}));
        assertArrayEquals(new int[]{5, 3, 4, 1, 2},P2J1.everyOther(new int[]{24, 31, 15, 40, 21, 33, 36, 22, 22}));
        assertArrayEquals(new int[]{1, 1, 8, 1, 1},P2J1.everyOther(new int[]{1, 3, 1, 8, 8, 3, 1, 4, 1}));
        assertArrayEquals(new int[]{20, 21, 22, 23, 24},P2J1.everyOther(new int[]{20, 77, 21, 88, 22, 99, 23, 11, 24}));
        assertArrayEquals(new int[]{0, 1, 3, 2, 4},P2J1.everyOther(new int[]{0, 3, 1, 7, 3, 3, 2, 4, 4}));

    }
}

