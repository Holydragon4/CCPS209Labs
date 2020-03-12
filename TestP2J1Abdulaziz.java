/*
 * @author George Abdulaziz
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestP2J1Abdulaziz {
    
    @Test
    public void TestFallingPowerAbdulaziz() {
        
        assertEquals("Zero to the power of one fail",1, P2J1.fallingPower(1,0)); //1,0
        assertEquals("Zero to the power of zero fail",1, P2J1.fallingPower(0,0)); //0,0
        assertEquals("Zero to the power of one fail",0, P2J1.fallingPower(0,1)); //0,1
        assertEquals("One to the power of one fail",1, P2J1.fallingPower(1,1)); //1,1
        //-----------------------------------------------------------------------------------------------------------------------------------
        //Testing the long expected type:
        assertEquals("Maximum integer to the power of 2 fail return type must be long",4611686011984936962l, P2J1.fallingPower(Integer.MAX_VALUE,2)); //max int,2 
        assertEquals("Minimum integer to the power of 2 fail return type must be long",-4611686016279904256l, P2J1.fallingPower(Integer.MIN_VALUE,2)); //int min,2
        //-----------------------------------------------------------------------------------------------------------------------------------
        assertEquals("negative&even base, odd power fail",-120, P2J1.fallingPower(-4,3)); //negative, positive, evenBase oddPower
        assertEquals("negative&even base, even power fail",840, P2J1.fallingPower(-4,4)); //negative, positive, evenBase evenPower
        assertEquals("positive&even base, odd power fail",24, P2J1.fallingPower(4,3)); //positive, positive, evenBase oddPower
        assertEquals("positive&even base, even power fail",24, P2J1.fallingPower(4,4)); //positive, positive, evenBase evenPower
        //-----------------------------------------------------------------------------------------------------------------------------------
        assertEquals("negative&odd base, odd power fail",-210, P2J1.fallingPower(-5,3)); //negative, positive, oddBase oddPower
        assertEquals("negative&odd base, even power fail",1680, P2J1.fallingPower(-5,4)); //negative, positive, oddBase evenPower
        assertEquals("positive&odd base, odd power fail",60, P2J1.fallingPower(5,3)); //positive, positive, oddBase oddPower
        assertEquals("positive&odd base, even power fail",120, P2J1.fallingPower(5,4)); //positive, positive, oddBase evenPower
        //-----------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------
		assertEquals("Fail random values",6124895493223874560L, P2J1.fallingPower(98,55)); //MISC
		assertEquals("Fail random values",3105943812426432512L, P2J1.fallingPower(66,32)); //MISC
		assertEquals("Fail random values",61324560, P2J1.fallingPower(90,4)); //MISC
		assertEquals("Fail random values",341, P2J1.fallingPower(341,1)); //MISC
		assertEquals("Fail random values",81916137264L, P2J1.fallingPower(4344,3)); //MISC
		assertEquals("Fail random values",462, P2J1.fallingPower(22,2)); //MISC
}
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void TestEveryOtherAbdulaziz() {
        assertArrayEquals("The array should be empty if it had no elements",new int[] {}, P2J1.everyOther(new int[] {}));
        assertArrayEquals("Odd array returned wrong values",new int[] {1,3,5}, P2J1.everyOther(new int[] {1,2,3,4,5})); //odd
        assertArrayEquals("Even Array returned wrong values",new int[] {7,14}, P2J1.everyOther(new int[] {7,19,14,40})); //even
        assertArrayEquals("Odd array returned wrong values",new int[] {-1,-3,-5}, P2J1.everyOther(new int[] {-1,2,-3,4,-5})); //odd negative
        assertArrayEquals("Even Array returned wrong values",new int[] {-7,14}, P2J1.everyOther(new int[] {-7,19,14,-40})); //even negative
        assertArrayEquals("Wrong vlaue for min/max integer",new int[] {Integer.MAX_VALUE,Integer.MIN_VALUE}, P2J1.everyOther(new int[] {Integer.MAX_VALUE,0,Integer.MIN_VALUE})); //min/max
        assertArrayEquals("Even Array returned wrong values",new int[] {45,0,45,834,3,-55,-34}, P2J1.everyOther(new int[] {45,0,0,0,45,234,834,3,3,4,-55,-324,-34})); //Misc challenge 
        //-----------------------------------------------------------------------------------------------------------------------------------
		assertArrayEquals("Fail random values",new int[] {5,3,1,5,4,4}, P2J1.everyOther(new int[] {5,29,3,5,1,3,5,3,4,23,4})); //MISC
		assertArrayEquals("Fail random values",new int[] {432, 2, 3, 523, 234, 0, 4534}, P2J1.everyOther(new int[] {432,23543,2,34,3,234,523,452,234,36,0,076,4534})); //MISC
		assertArrayEquals("Fail random values",new int[] {432, 43, 3, 5, 2, 4}, P2J1.everyOther(new int[] {432,2,43,4,3,4,5,2,2,36,4})); //MISC
		assertArrayEquals("Fail random values",new int[] {2, 4, 3, 3444, 4, 7, 9}, P2J1.everyOther(new int[] {2,3,4,3,3,3333,3444,5,4,6,7,8,9,56})); //MISC
		assertArrayEquals("Fail random values",new int[] {76767, 4}, P2J1.everyOther(new int[] {76767,65,4})); //MISC
		assertArrayEquals("Fail random values",new int[] {766565, 345, 345, 345}, P2J1.everyOther(new int[] {766565,345,345,345,345,345,345,345})); //MISC
		assertArrayEquals("Fail random values",new int[] {0, 0, 0, 0,0, 43, 0, 4, 3, 34}, P2J1.everyOther(new int[] {0,0,0,0,0,0,0,0,0,0,43,43,0,-3,4,3,3,-23423,34})); //MISC
		assertArrayEquals("Fail random values",new int[] {44, 2, 4, 0}, P2J1.everyOther(new int[] {44,3,2,3,4,1,0})); //MISC
		assertArrayEquals("Fail random values",new int[] {6666, 888, 0, 22, 4, 666, 88}, P2J1.everyOther(new int[] {6666,7777,888,999,0000,11,22,3,4,5,666,777,88})); //MISC
		assertArrayEquals("Fail random values",new int[] {0}, P2J1.everyOther(new int[] {0,0})); //MISC
		assertArrayEquals("Fail random values",new int[] {4, 2, 8, -6, -3, 5, 8, -5, 3}, P2J1.everyOther(new int[] {4,3,2,1,8,-6,-6,-4,-3,-2,5,7,8,8,-5,-4,3})); //MISC
		assertArrayEquals("Fail random values",new int[] {-3, -3, -3, -3, 0, 0, 4, 3}, P2J1.everyOther(new int[] {-3,-3,-3,-3,-3,-3,-3,-3,0,0,0,4,4,4,3})); //MISC
		assertArrayEquals("Fail random values",new int[] {34, 34, 52, 43, 43}, P2J1.everyOther(new int[] {34,343432424,34,234,52,34,43,234,43})); //MISC    
        }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void TestCreateZigZagAbdulaziz() {
        assertArrayEquals("Wrong value for 2D array",new int[][] {{4,5,6,7,8},{13,12,11,10,9},{14,15,16,17,18},{23,22,21,20,19}}, P2J1.createZigZag(4,5,4)); //Original
        assertArrayEquals("Wrong value for 2D array",new int[][] {{-4,-3,-2},{1,0,-1}}, P2J1.createZigZag(2,3,-4)); //Original negative start
        assertArrayEquals("Wrong value when testing column to be zero",new int[][] {{},{}}, P2J1.createZigZag(2,0,20)); //Testing zero column
        assertArrayEquals("Wrong value when testing row to be zero",new int[][] {}, P2J1.createZigZag(0,6,78)); //Testing zero row
        
        try {
            P2J1.createZigZag(-3,4,5);
            fail("Exception is not whrown on negative array size"); //Assert Exception 
        } catch(NegativeArraySizeException ex) {
            assertEquals("-3", ex.getMessage());
        }
        
        assertArrayEquals("Wrong results",new int[][] {{45, 46, 47, 48, 49}, {54, 53, 52, 51, 50}, {55, 56, 57, 58, 59}, {64, 63, 62, 61, 60}}, P2J1.createZigZag(4, 5, 45));
		assertArrayEquals("Wrong results",new int[][] {{564, 565, 566, 567, 568, 569, 570, 571, 572}, {581, 580, 579, 578, 577, 576, 575, 574, 573}, {582, 583, 584, 585, 586, 587, 588, 589, 590}}, P2J1.createZigZag(3, 9, 564));
		assertArrayEquals("Wrong results",new int[][] {{654, 655, 656, 657, 658, 659, 660, 661}, {669, 668, 667, 666, 665, 664, 663, 662}, {670, 671, 672, 673, 674, 675, 676, 677}, {685, 684, 683, 682, 681, 680, 679, 678}, {686, 687, 688, 689, 690, 691, 692, 693}}, P2J1.createZigZag(5, 8, 654));
		assertArrayEquals("Wrong results",new int[][] {{45, 46, 47, 48, 49}, {54, 53, 52, 51, 50}, {55, 56, 57, 58, 59}, {64, 63, 62, 61, 60}, {65, 66, 67, 68, 69}, {74, 73, 72, 71, 70}}, P2J1.createZigZag(6, 5, 45));
		assertArrayEquals("Wrong results",new int[][] {{23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35}, {48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36}, {49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61}, {74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62}, {75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87}, {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88}, {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113}, {126, 125, 124, 123, 122, 121, 120, 119, 118, 117, 116, 115, 114}, {127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139}, {152, 151, 150, 149, 148, 147, 146, 145, 144, 143, 142, 141, 140}, {153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165}}, P2J1.createZigZag(11, 13, 23));
		assertArrayEquals("Wrong results",new int[][] {{32, 33, 34, 35}, {39, 38, 37, 36}}, P2J1.createZigZag(2, 4, 32));
		assertArrayEquals("Wrong results",new int[][] {{34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53}, {73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54}, {74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93}}, P2J1.createZigZag(3, 20, 34));
		assertArrayEquals("Wrong results",new int[][] {{90, 91}}, P2J1.createZigZag(1, 2, 90));
		assertArrayEquals("Wrong results",new int[][] {{-23, -22, -21, -20, -19}, {-14, -15, -16, -17, -18}, {-13, -12, -11, -10, -9}, {-4, -5, -6, -7, -8}}, P2J1.createZigZag(4, 5, -23));
		assertArrayEquals("Wrong results",new int[][] {{-3, -2}, {0, -1}, {1, 2}}, P2J1.createZigZag(3, 2, -3));
		assertArrayEquals("Wrong results",new int[][] {{0, 1, 2}, {5, 4, 3}, {6, 7, 8}, {11, 10, 9}, {12, 13, 14}}, P2J1.createZigZag(5, 3, 0));
		assertArrayEquals("Wrong results",new int[][] {{-909, -908, -907, -906, -905, -904}, {-898, -899, -900, -901, -902, -903}, {-897, -896, -895, -894, -893, -892}, {-886, -887, -888, -889, -890, -891}, {-885, -884, -883, -882, -881, -880}, {-874, -875, -876, -877, -878, -879}, {-873, -872, -871, -870, -869, -868}}, P2J1.createZigZag(7, 6, -909));
		assertArrayEquals("Wrong results",new int[][] {{-231, -230}, {-228, -229}, {-227, -226}, {-224, -225}, {-223, -222}, {-220, -221}}, P2J1.createZigZag(6, 2, -231));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void TestCountInversionsAbdulaziz() {
        assertEquals("Wrong when testing empty array",0, P2J1.countInversions(new int[] {})); //Testing empty array
        assertEquals("Wrong when testing single element array",0, P2J1.countInversions(new int[] {})); //Testing single element array
        assertEquals("Wrong when testing ascending values",0, P2J1.countInversions(new int[] {1,2,3,4,5,6,7,8,9,10})); //Testing ascending
        assertEquals("Wrong when testing ascending negative values",0, P2J1.countInversions(new int[] {-9,-8,-7,-6,-5,-4,-3,-2,-1})); //Testing ascending negative
        assertEquals("Wrong when testing descending values",15, P2J1.countInversions(new int[] {9,8,7,5,3,2})); //Testing descending 
        assertEquals("Wrong when testing descending negative values",36, P2J1.countInversions(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9})); //Testing descending negative
        assertEquals("Wrong when testing random positive values",4, P2J1.countInversions(new int[] {1,4,2,8,10,9,90,32,43})); //random positive values
        assertEquals("Wrong when testing random positive/negative values",7, P2J1.countInversions(new int[] {-1,-4,8,-8,4,2,9})); //random positive/negative values
        assertEquals("Wrong when testing {0,-1,1}",1, P2J1.countInversions(new int[] {0,-1,1})); //Testing with zero
        assertEquals("Wrong when testing max/min integer",2, P2J1.countInversions(new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,0})); //Testing min/max integer
        
        assertEquals("Wrong results for a random array",42, P2J1.countInversions(new int[] {4,345,345,96,-435,464,56456,564,4,45,6,-4,65})); //MISC
		assertEquals("Wrong results for a random array",60, P2J1.countInversions(new int[] {534,4,4,3,2,34,434,32,352,0,-4,-3,-234,34})); //MISC
		assertEquals("Wrong results for a random array",9, P2J1.countInversions(new int[] {-3,-3,-23,-3,342,-3,34,34,34,2324,342342,34})); //MISC
		assertEquals("Wrong results for a random array",9, P2J1.countInversions(new int[] {4,4,3,3,3,34,3})); //MISC
		assertEquals("Wrong results for a random array",10, P2J1.countInversions(new int[] {3,2,3,2,3,2,3,2,3})); //MISC
		assertEquals("Wrong results for a random array",0, P2J1.countInversions(new int[] {0,0,0,0,0,0,0,0})); //MISC
		assertEquals("Wrong results for a random array",7, P2J1.countInversions(new int[] {3,3,3,2,3,2})); //MISC
		assertEquals("Wrong results for a random array",0, P2J1.countInversions(new int[] {-9,-9,-9,-9,-9,-9})); //MISC
		assertEquals("Wrong results for a random array",14, P2J1.countInversions(new int[] {3,32,2,34,234,655,474,4,34235643,9655,34})); //MISC
		assertEquals("Wrong results for a random array",47, P2J1.countInversions(new int[] {4,43,2,23,11,2,312,12315,21355,656,696,9,456,34647,345,47,234})); //MISC
		assertEquals("Wrong results for a random array",14, P2J1.countInversions(new int[] {45345,323423,4242,23423,-4,324,34234})); //MISC

    }
        

}
