//@author Tangxu Zhao

import static org.junit.Assert.*;
import org.junit.Test;

public class TestFallingPowerZhao
{
    @Test public void TestFallingPowerZhao(){
        //test -1,0,1 combinations
        assertEquals(1, P2J1.fallingPower(0,0));//test base 0, exp 0
        assertEquals(0, P2J1.fallingPower(0,1));//test base 0, exp 1
        assertEquals(1, P2J1.fallingPower(1,0));//test base 1, exp 0
        assertEquals(1, P2J1.fallingPower(1,1));//test base 1, exp 1
        assertEquals(1, P2J1.fallingPower(-1,0));//test base -1, exp 0
        assertEquals(-1, P2J1.fallingPower(-1,1));//test base -1, exp 0

        //test even/odd number exp combinations (even base)
        assertEquals(20, P2J1.fallingPower(-4,2));//test negative base, even exp
        assertEquals(-120, P2J1.fallingPower(-4,3));//test negative base, odd exp
        assertEquals(12, P2J1.fallingPower(4,2));//test positive base, even exp
        assertEquals(24, P2J1.fallingPower(4,3));//test positive base, odd exp
        
        //test even/odd number exp combinations (odd base)
        assertEquals(30, P2J1.fallingPower(-5,2));//test negative base, even exp
        assertEquals(-210, P2J1.fallingPower(-5,3));//test negative base, odd exp
        assertEquals(20, P2J1.fallingPower(5,2));//test positive base, even exp
        assertEquals(60, P2J1.fallingPower(5,3));//test positive base, odd exp
        
        //test exp > base
        assertEquals(60480, P2J1.fallingPower(-4,6));//exp > negative base 
        assertEquals(0, P2J1.fallingPower(4,6));//exp > positive base (always 0)
        
        //test large numbers (long type)
        assertEquals(1421734777575178240L, P2J1.fallingPower(-50,20));//test negative base, even exp
        assertEquals(-3864263378976000L, P2J1.fallingPower(-50,9));//test negative base, odd exp
        assertEquals(6955069520581918720L, P2J1.fallingPower(50,16));//test positive base, even exp
        assertEquals(-3885458424159313920L, P2J1.fallingPower(50,13));//test positive base, odd exp

    }
}
