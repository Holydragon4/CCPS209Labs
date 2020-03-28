import static org.junit.Assert.*;
import org.junit.Test;

public class TestFallingPowerJarvis {
    @Test public void testFallingPower(){
        assertEquals(720,P2J1.fallingPower(10,3));
        assertEquals(6,P2J1.fallingPower(-2,2));
        assertEquals(6652800,P2J1.fallingPower(-4,8));
        assertEquals(40320,P2J1.fallingPower(-1,8));
        assertEquals(121080960,P2J1.fallingPower(14,8));
        assertEquals(0,P2J1.fallingPower(6,8));
        // Falling power can be defined for negative exponents,
        // but that one is not required in this lab -- IK
        //assertEquals(10,P2J1.fallingPower(10,-1));
        assertEquals(1,P2J1.fallingPower(9,0));
        //assertEquals(7,P2J1.fallingPower(7,-1));
        //assertEquals(14,P2J1.fallingPower(14,-1));
        assertEquals(98017920,P2J1.fallingPower(17,7));
        assertEquals(600,P2J1.fallingPower(25,2));
        assertEquals(57657600,P2J1.fallingPower(16,7));
        assertEquals(380,P2J1.fallingPower(20,2));
        assertEquals(18,P2J1.fallingPower(18,1));
        assertEquals(2162160,P2J1.fallingPower(14,6));
        assertEquals(358800,P2J1.fallingPower(26,4));
        assertEquals(360360,P2J1.fallingPower(15,5));
        assertEquals(17297280,P2J1.fallingPower(14,7));
        assertEquals(17550,P2J1.fallingPower(27,3));

    }
}