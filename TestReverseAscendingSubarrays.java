

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestReverseAscendingSubarrays {

        @Test
        public void TestReverseAscendingSubarrays(){

            int [] originalArray1 = {1,1,1,1,1,1};
            P2J3.reverseAscendingSubarrays(originalArray1);
            int [] reverseArray1 = {1,1,1,1,1,1};
            assertArrayEquals(originalArray1,reverseArray1);

            int [] originalArray2 = {9,8,5,3,2};
            P2J3.reverseAscendingSubarrays(originalArray2);
            int [] reverseArray2 = {9,8,5,3,2};
            assertArrayEquals(originalArray2,reverseArray2);

            int [] originalArray3 = {2,3,5,3,6,9,15};
            P2J3.reverseAscendingSubarrays(originalArray3);
            int [] reverseArray3 = {5,3,2,15,9,6,3};
            assertArrayEquals(originalArray3,reverseArray3);

            int [] originalArray4 = {0,5,7,2,8,0,0,0,4};
            P2J3.reverseAscendingSubarrays(originalArray4);
            int [] reverseArray4 = {7,5,0,8,2,0,0,4,0};
            assertArrayEquals(originalArray4,reverseArray4);

            int [] originalArray5 = {-1,-8,45,87,3,-6};
            P2J3.reverseAscendingSubarrays(originalArray5);
            int [] reverseArray5 = {-1, 87, 45, -8, 3, -6};
            assertArrayEquals(originalArray5,reverseArray5);

            int [] originalArray6 = {-45,45,-56,56,-88,88,-777,777};
            P2J3.reverseAscendingSubarrays(originalArray6);
            int [] reverseArray6 = {45, -45, 56, -56, 88, -88, 777, -777};
            assertArrayEquals(originalArray6,reverseArray6);

            int [] originalArray7 = {0,1,-1,0,1,2,0,1,-2,0,1,3};
            P2J3.reverseAscendingSubarrays(originalArray7);
            int [] reverseArray7 = {1,0,2,1,0,-1,1,0,3,1,0,-2};
            assertArrayEquals(originalArray7,reverseArray7);

            int [] originalArray8 = {99,87,45,0,45,87,99};
            P2J3.reverseAscendingSubarrays(originalArray8);
            int [] reverseArray8 = {99,87,45,99,87,45,0};
            assertArrayEquals(originalArray8,reverseArray8);

            int [] originalArray9 = {5906,6095,5960,9506,6509,5690,6590};
            P2J3.reverseAscendingSubarrays(originalArray9);
            int [] reverseArray9 = {6095,5906,9506,5960,6509,6590,5690};
            assertArrayEquals(originalArray9,reverseArray9);

            int [] originalArray10 = {22,22,33,22,33,44,33,22,44,33};
            P2J3.reverseAscendingSubarrays(originalArray10);
            int [] reverseArray10 = {22,33,22,44,33,22,33,44,22,33};
            assertArrayEquals(originalArray10,reverseArray10);

            int [] originalArray11 = {1,8,9,9,0,5,6,7,4,2,2,1,8,9,9,0,5,1,6,7,4,3};
            P2J3.reverseAscendingSubarrays(originalArray11);
            int [] reverseArray11 = {9,8,1,9,7,6,5,0,4,2,2,9,8,1,9,5,0,7,6,1,4,3};
            assertArrayEquals(originalArray11,reverseArray11);

            int [] originalArray12 = {-1,1,0,-2,2,0,-3,3,0,-4,4,0,-5,5,0,-6,6,0,-7,7,0,-8,8,0,-9,9,0};
            P2J3.reverseAscendingSubarrays(originalArray12);
            int [] reverseArray12 = {1,-1,0,2,-2,0,3,-3,0,4,-4,0,5,-5,0,6,-6,0,7,-7,0,8,-8,0,9,-9,0};
            assertArrayEquals(originalArray12,reverseArray12);

            int [] originalArray13 = {11,12,67,23,78,-777,0,443,264,784,555,1,4,9};
            P2J3.reverseAscendingSubarrays(originalArray13);
            int [] reverseArray13 = {67,12,11,78,23,443,0,-777,784,264,555,9,4,1};
            assertArrayEquals(originalArray13,reverseArray13);

            int [] originalArray14 = {-29845,45234,45234,45222,56742,88888453,3,-777777};
            P2J3.reverseAscendingSubarrays(originalArray14);
            int [] reverseArray14 = {45234,-29845,45234,88888453,56742,45222,3,-777777};
            assertArrayEquals(originalArray14,reverseArray14);

            int [] originalArray15 = {7845,2,6,-7,-7,-5,-5,-7,-7,-4,-4};
            P2J3.reverseAscendingSubarrays(originalArray15);
            int [] reverseArray15 = {7845,6,2,-7,-5,-7,-5,-7,-4,-7,-4};
            assertArrayEquals(originalArray15,reverseArray15);

            int [] originalArray16 = {62304,-2,42336,43,-73,90,21,3,2,2,2,4,5,6};
            P2J3.reverseAscendingSubarrays(originalArray16);
            int [] reverseArray16 = {62304,42336,-2,43,90,-73,21,3,2,2,6,5,4,2};
            assertArrayEquals(originalArray16,reverseArray16);

            int [] originalArray17 = {-888,654,-888,-657,-888,-956,456,3,5,2,1,2};
            P2J3.reverseAscendingSubarrays(originalArray17);
            int [] reverseArray17 = {654,-888,-657,-888,-888,456,-956,5,3,2,2,1};
            assertArrayEquals(originalArray17,reverseArray17);

            int [] originalArray18 = {1,2,3,2,4,2,5,6,7,2,8,2,9,10,2,11,13,14,2,-2};
            P2J3.reverseAscendingSubarrays(originalArray18);
            int [] reverseArray18 = {3,2,1,4,2,7,6,5,2,8,2,10,9,2,14,13,11,2,2,-2};
            assertArrayEquals(originalArray18,reverseArray18);

            int [] originalArray19 = {1,2,3,5,7,9,99,999,9999,999,99,9,7,5,3,2,1};
            P2J3.reverseAscendingSubarrays(originalArray19);
            int [] reverseArray19 = {9999,999,99,9,7,5,3,2,1,999,99,9,7,5,3,2,1};
            assertArrayEquals(originalArray19,reverseArray19);

            int [] originalArray20 = {-1,-3,-4,-2,1,3,4,2,11,34,-11,-34,55,65,-65,-55};
            P2J3.reverseAscendingSubarrays(originalArray20);
            int [] reverseArray20 = {-1,-3,4,3,1,-2,-4,34,11,2,-11,65,55,-34,-55,-65};
            assertArrayEquals(originalArray20,reverseArray20);
        }

    }