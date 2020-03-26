import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFallingPowerLeung
{
    @Test public void testFallingPowerLeung() {
        int[] case1 = {10, 5};
        assertEquals(30240, P2J1.fallingPower(case1[0], case1[1]));
        
        int[] case2 = {10, 4};
        assertEquals(5040, P2J1.fallingPower(case2[0], case2[1]));
        
        int[] case3 = {10, 3};
        assertEquals(720, P2J1.fallingPower(case3[0], case3[1]));
        
        int[] case4 = {10, 2};
        assertEquals(90, P2J1.fallingPower(case4[0], case4[1]));
        
        int[] case5 = {10, 1};
        assertEquals(10, P2J1.fallingPower(case5[0], case5[1]));
        
        int[] case6 = {9, 5};
        assertEquals(15120, P2J1.fallingPower(case6[0], case6[1]));
        
        int[] case7 = {9, 4};
        assertEquals(3024, P2J1.fallingPower(case7[0], case7[1]));
        
        int[] case8 = {9, 3};
        assertEquals(504, P2J1.fallingPower(case8[0], case8[1]));
        
        int[] case9 = {9, 2};
        assertEquals(72, P2J1.fallingPower(case9[0], case9[1]));
        
        int[] case10 = {9, 1};
        assertEquals(9, P2J1.fallingPower(case10[0], case10[1]));
        
        int[] case11 = {8, 5};
        assertEquals(6720, P2J1.fallingPower(case11[0], case11[1]));
        
        int[] case12 = {8, 4};
        assertEquals(1680, P2J1.fallingPower(case12[0], case12[1]));
        
        int[] case13 = {8, 3};
        assertEquals(336, P2J1.fallingPower(case13[0], case13[1]));
        
        int[] case14 = {8, 2};
        assertEquals(56, P2J1.fallingPower(case14[0], case14[1]));
        
        int[] case15 = {8, 1};
        assertEquals(8, P2J1.fallingPower(case15[0], case15[1]));
        
        int[] case16 = {7, 5};
        assertEquals(2520, P2J1.fallingPower(case16[0], case16[1]));
        
        int[] case17 = {7, 4};
        assertEquals(840, P2J1.fallingPower(case17[0], case17[1]));
        
        int[] case18 = {7, 3};
        assertEquals(210, P2J1.fallingPower(case18[0], case18[1]));
        
        int[] case19 = {7, 2};
        assertEquals(42, P2J1.fallingPower(case19[0], case19[1]));
        
        int[] case20 = {7, 1};
        assertEquals(7, P2J1.fallingPower(case20[0], case20[1]));
        
    }
}
