import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestFallingPowerKrishnakumarN.
 *
 * @author  (Nathina Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestFallingPowerKrishnakumarN {
	@Test public void testFallingPower(){
	
		//where n is positive and k is positive
		assertEquals(336,P2J1.fallingPower(8,3));
		assertEquals(30240,P2J1.fallingPower(10,5));
		assertEquals(5040,P2J1.fallingPower(7,6));
		assertEquals(2,P2J1.fallingPower(2,1));
		assertEquals(3628800,P2J1.fallingPower(10,10));
		assertEquals(20274183401472000L,P2J1.fallingPower(20,15));
		
		//where n is zero and k is positive
		assertEquals(0,P2J1.fallingPower(0,15)); 
		
		//where n is negative and k is positive
		assertEquals(-6720,P2J1.fallingPower(-4,5)); 
		assertEquals(-160392960,P2J1.fallingPower(-12,7));
		assertEquals(11576551623436800L,P2J1.fallingPower(-36,10));
		assertEquals(-7,P2J1.fallingPower(-7,1));
		assertEquals(4673374364484042752L,P2J1.fallingPower(-24,15));
		assertEquals(-9223372036854775808L,P2J1.fallingPower(-45,65));
		
		//where n is postive and k is zero
		assertEquals(1,P2J1.fallingPower(2,0)); 
		assertEquals(1,P2J1.fallingPower(200,0));
		assertEquals(1,P2J1.fallingPower(50,0));
		
		//where n is zero and k is zero
		assertEquals(1,P2J1.fallingPower(0,0));
		
		//where n is negative and k is zero
		assertEquals(1,P2J1.fallingPower(-2,0)); 
		assertEquals(1,P2J1.fallingPower(-200,0));
		assertEquals(1,P2J1.fallingPower(-50,0));
		 
	}
}