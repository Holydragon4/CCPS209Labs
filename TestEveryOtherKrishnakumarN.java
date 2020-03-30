import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestEveryOtherKrishnakumarN.
 *
 * @author  (Nathina Krishnakumar)
 * @version (March 29, 2020)
 */

public class TestEveryOtherKrishnakumarN {
	@Test public void testEveryOthee(){
	
		//array with 0 element
		int[] arr1 = {};
		assertArrayEquals(new int[]{},P2J1.everyOther(arr1)); 
		
		//array with 1 element
		int[] arr2 = {1};
		assertArrayEquals(new int[]{1},P2J1.everyOther(arr2));
		int[] arr3 = {-5};
		assertArrayEquals(new int[]{-5},P2J1.everyOther(arr3));
		int[] arr4 = {0};
		assertArrayEquals(new int[]{0},P2J1.everyOther(arr4));
		
		//array with even lengths
		int[] arr5 = {1,2};
		assertArrayEquals(new int[]{1},P2J1.everyOther(arr5)); 
		int[] arr6 = {1,2,3,4};
		assertArrayEquals(new int[]{1,3},P2J1.everyOther(arr6));
		int[] arr7 = {0,1,2,3,4,5};
		assertArrayEquals(new int[]{0,2,4},P2J1.everyOther(arr7));
		int[] arr8 = {10,11,12,13,14,15};
		assertArrayEquals(new int[]{10,12,14},P2J1.everyOther(arr8));
		int[] arr9 = {33,34,35,36,37,38,39,40,41,42};
		assertArrayEquals(new int[]{33,35,37,39,41},P2J1.everyOther(arr9));
		int[] arr10 = {-1,-2,-3,-4};
		assertArrayEquals(new int[]{-1,-3},P2J1.everyOther(arr10));
		int[] arr11 = {0,-1,-2,-3,-4,-5};
		assertArrayEquals(new int[]{0,-2,-4},P2J1.everyOther(arr11));
		int[] arr12 = {-33,-34,-35,-36,-37,-38,-39,-40,-41,-42};
		assertArrayEquals(new int[]{-33,-35,-37,-39,-41},P2J1.everyOther(arr12));
		
		//array with odd lengths
		int[] arr13 = {1,2,3};
		assertArrayEquals(new int[]{1,3},P2J1.everyOther(arr13)); 
		int[] arr14 = {1,2,3,4,5};
		assertArrayEquals(new int[]{1,3,5},P2J1.everyOther(arr14));
		int[] arr15 = {0,1,2,3,4,5,6};
		assertArrayEquals(new int[]{0,2,4,6},P2J1.everyOther(arr15));
		int[] arr16 = {10,11,12,13,14,15,16};
		assertArrayEquals(new int[]{10,12,14,16},P2J1.everyOther(arr16));
		int[] arr17 = {33,34,35,36,37,38,39,40,41,42,43};
		assertArrayEquals(new int[]{33,35,37,39,41,43},P2J1.everyOther(arr17));
		int[] arr18 = {-1,-2,-3,-4,-5};
		assertArrayEquals(new int[]{-1,-3,-5},P2J1.everyOther(arr18));
		int[] arr19 = {0,-1,-2,-3,-4,-5,-6};
		assertArrayEquals(new int[]{0,-2,-4,-6},P2J1.everyOther(arr19));
		int[] arr20 = {-33,-34,-35,-36,-37,-38,-39,-40,-41,-42,-43};
		assertArrayEquals(new int[]{-33,-35,-37,-39,-41,-43},P2J1.everyOther(arr20));
		
	}
}