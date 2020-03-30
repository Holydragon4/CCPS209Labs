import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestCountInversionsKrishnakumarN.
 *
 * @author  (Nathina Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestCountInversionsKrishnakumarN {
	@Test public void testCountInversions(){

		//array with 0 element
		int[] arr1 = {};
		assertEquals(0,P2J1.countInversions(arr1)); 
		
		//array with 1 element
		int[] arr2 = {1};
		assertEquals(0,P2J1.countInversions(arr2));
		int[] arr3 = {-5};
		assertEquals(0,P2J1.countInversions(arr3));
		int[] arr4 = {0};
		assertEquals(0,P2J1.countInversions(arr4));
		
		//array with even lengths
		int[] arr5 = {1,2,3,4};
		assertEquals(0,P2J1.countInversions(arr5));
		int[] arr6 = {4,3,2,1};
		assertEquals(6,P2J1.countInversions(arr6));
		int[] arr7 = {0,1,2,3,4,5};
		assertEquals(0,P2J1.countInversions(arr7));
		int[] arr8 = {5,4,3,2,1,0};
		assertEquals(15,P2J1.countInversions(arr8));
		int[] arr9 = {33,34,35,36,37,38,39,40,41,42};
		assertEquals(0,P2J1.countInversions(arr9));
		int[] arr10 = {42,41,40,39,38,37,36,35,34,33};
		assertEquals(45,P2J1.countInversions(arr10));
		int[] arr11 = {0,-1,-2,-3,-4,-5};
		assertEquals(15,P2J1.countInversions(arr11));
		int[] arr12 = {-5,-4,-3,-2,-1,0};
		assertEquals(0,P2J1.countInversions(arr12));
		
		//array with odd lengths
		int[] arr13 = {1,2,3,4,5};
		assertEquals(0,P2J1.countInversions(arr13));
		int[] arr14 = {5,4,3,2,1};
		assertEquals(10,P2J1.countInversions(arr14));
		int[] arr15 = {0,1,2,3,4,5,6};
		assertEquals(0,P2J1.countInversions(arr15));
		int[] arr16 = {6,5,4,3,2,1,0};
		assertEquals(21,P2J1.countInversions(arr16));
		int[] arr17 = {33,34,35,36,37,38,39,40,41,42,43};
		assertEquals(0,P2J1.countInversions(arr17));
		int[] arr18 = {43,42,41,40,39,38,37,36,35,34,33};
		assertEquals(55,P2J1.countInversions(arr18));
		int[] arr19 = {0,-1,-2,-3,-4,-5,-6};
		assertEquals(21,P2J1.countInversions(arr19));
		int[] arr20 = {-6,-5,-4,-3,-2,-1,0};
		assertEquals(0,P2J1.countInversions(arr20));
		
	}
}