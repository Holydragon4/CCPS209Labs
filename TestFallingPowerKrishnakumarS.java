import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestFallingPowerKrishnakumarS.
 *
 * @author  (Sanjena Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestFallingPowerKrishnakumarS {
    @Test public void testFallingPower() {
	// postive base and postive exponent
	assertEquals(504, P2J1.fallingPower(9, 3));
	assertEquals(11880, P2J1.fallingPower(12, 4));
	assertEquals(360360, P2J1.fallingPower(15, 5));
	assertEquals(240, P2J1.fallingPower(16, 2));
	assertEquals(12144, P2J1.fallingPower(24, 3));
	
	// negative base and positive exponent
	assertEquals(-990, P2J1.fallingPower(-9, 3));
	assertEquals(32760, P2J1.fallingPower(-12, 4));
	assertEquals(-1395360, P2J1.fallingPower(-15, 5));
	assertEquals(272, P2J1.fallingPower(-16, 2));
	assertEquals(-15600, P2J1.fallingPower(-24, 3));
	
	// zero exponent
	assertEquals(1, P2J1.fallingPower(9, 0));
	assertEquals(1, P2J1.fallingPower(-12, 0));
	assertEquals(1, P2J1.fallingPower(15, 0));
	assertEquals(1, P2J1.fallingPower(-16, 0));
	assertEquals(1, P2J1.fallingPower(24, 0));
	
	// for long type
	assertEquals(9900979729344L, P2J1.fallingPower(21474, 3));
	assertEquals(-9902363062950L, P2J1.fallingPower(-21473, 3));
	assertEquals(951539877262593024L, P2J1.fallingPower(31234, 4));
	assertEquals(3093881154229052544L, P2J1.fallingPower(50000, 6));
	assertEquals(4068296323755194368L, P2J1.fallingPower(30000, 9));
    }
}