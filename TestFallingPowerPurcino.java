

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFallingPowerPurcino
{
    @Test public void TestFallingPowerPurcino(){
        //first set of random numbers
        assertEquals(90, P2J1.fallingPower(10,2));
        assertEquals(20160, P2J1.fallingPower(8,6));
        assertEquals(210, P2J1.fallingPower(7,3));
        assertEquals(360, P2J1.fallingPower(6,4));
        assertEquals(362880, P2J1.fallingPower(-2,8));
        assertEquals(336, P2J1.fallingPower(8,3));
        //(exp > base) == 0
        assertEquals(0, P2J1.fallingPower(4,6));
        
        //second set of random numbers
        assertEquals(-504, P2J1.fallingPower(-7,3));
        assertEquals(3024, P2J1.fallingPower(-6,4));
        assertEquals(504, P2J1.fallingPower(9,3));
        assertEquals(6720, P2J1.fallingPower(8,5));
        assertEquals(17160, P2J1.fallingPower(-10,4));
        assertEquals(-98017920, P2J1.fallingPower(-11,7));
        assertEquals(665280, P2J1.fallingPower(12,6));
        
        
        //combinations of -1/0/1 
        assertEquals(1, P2J1.fallingPower(1,1));
        assertEquals(1, P2J1.fallingPower(0,0));
        assertEquals(-1, P2J1.fallingPower(-1,1));
        assertEquals(0, P2J1.fallingPower(0,1));
        assertEquals(1, P2J1.fallingPower(-1,0));
        assertEquals(1, P2J1.fallingPower(1,0));
        
        
        

      
  
        
        

    }
}