//@author Andrew Lishchenko 500815035

import static org.junit.Assert.*;
import org.junit.Test;

public class TestReverseAscendingSubarraysLishchenko
{
    @Test public void reverseAscendingSubarrays(){        
        //Empty case
        int[] test={}; int[] ans={};
        P2J3.reverseAscendingSubarrays(test);
        assertArrayEquals(ans,test);
        
        //Single value
        int[] test1={0}; int[] ans1={0};
        P2J3.reverseAscendingSubarrays(test1);
        assertArrayEquals(ans1,test1);
        
        int[] test2={-50000}; int[] ans2={-50000};
        P2J3.reverseAscendingSubarrays(test2);
        assertArrayEquals(ans2,test2);
       
        int[] test3={100000}; int[] ans3={100000};
        P2J3.reverseAscendingSubarrays(test3);
        assertArrayEquals(ans3,test3);
        
        //Given Arrays in question
        int[] test4={5,7,10,4,2,7,8,1,3}; int[] ans4={10,7,5,4,8,7,2,3,1};
        P2J3.reverseAscendingSubarrays(test4);
        assertArrayEquals(ans4,test4);
        
        int[] test5={5,4,3,2,1}; int[] ans5={5,4,3,2,1};
        P2J3.reverseAscendingSubarrays(test5);
        assertArrayEquals(ans5,test5);
        
        //Others
        int[] test6={1,2,3,4,5}; int[] ans6={5,4,3,2,1};
        P2J3.reverseAscendingSubarrays(test6);
        assertArrayEquals(ans6,test6);
        
        int[] test7={0,0,0,0,0}; int[] ans7={0,0,0,0,0};
        P2J3.reverseAscendingSubarrays(test7);
        assertArrayEquals(ans7,test7);
        
        int[] test8={-5,-4,-3,-2,-1}; int[] ans8={-1,-2,-3,-4,-5};
        P2J3.reverseAscendingSubarrays(test8);
        assertArrayEquals(ans8,test8);
        
        int[] test9={1,-1,1,-1,1,-1,1}; int[] ans9={1,1,-1,1,-1,1,-1};
        P2J3.reverseAscendingSubarrays(test9);
        assertArrayEquals(ans9,test9);
        
        int[] test10={-5,5,-4,4,-3,3,-2,2,-1,1,0}; int[] ans10={5,-5,4,-4,3,-3,2,-2,1,-1,0};
        P2J3.reverseAscendingSubarrays(test10);
        assertArrayEquals(ans10,test10);
                
        
        //Randomly Generated Arrays
        int[] test11={16,9,-16,-8,-14,3,10,-13,17,-8}; int[] ans11={16,9,-8,-16,10,3,-14,17,-13,-8};
        P2J3.reverseAscendingSubarrays(test11);
        assertArrayEquals(ans11,test11);
        
        int[] test12={0,-9,14,-12,12,2,9,-10,-20,-12}; int[] ans12={0,14,-9,12,-12,9,2,-10,-12,-20};
        P2J3.reverseAscendingSubarrays(test12);
        assertArrayEquals(ans12,test12);
       
        int[] test13={12,8,-5,-13,-1,20,-19,5,17,10}; int[] ans13={12,8,-5,20,-1,-13,17,5,-19,10};
        P2J3.reverseAscendingSubarrays(test13);
        assertArrayEquals(ans13,test13);
        
        int[] test14={15,15,8,20,15,10,4,20,18,5}; int[] ans14={15,15,20,8,15,10,20,4,18,5};
        P2J3.reverseAscendingSubarrays(test14);
        assertArrayEquals(ans14,test14);
        
        int[] test15={16,0,19,-2,12,-17,11,-3,20,14}; int[] ans15={16,19,0,12,-2,11,-17,20,-3,14};
        P2J3.reverseAscendingSubarrays(test15);
        assertArrayEquals(ans15,test15);
        
        //Others
        int[] test16={-10,-18,8,4,5,12,15,-2,13,2}; int[] ans16={-10,8,-18,15,12,5,4,13,-2,2};
        P2J3.reverseAscendingSubarrays(test16);
        assertArrayEquals(ans16,test16);
        
        int[] test17={-7,10,-20,20,-2,15,1,2,3,14}; int[] ans17={10,-7,20,-20,15,-2,14,3,2,1};
        P2J3.reverseAscendingSubarrays(test17);
        assertArrayEquals(ans17,test17);
        
        int[] test18={11,20,12,4,11,-12,-12,-20,-16,10}; int[] ans18={20,11,12,11,4,-12,-12,10,-16,-20};
        P2J3.reverseAscendingSubarrays(test18);
        assertArrayEquals(ans18,test18);
        
        int[] test19={14,-4,6,-17,2,20,18,-4,19,-12}; int[] ans19={14,6,-4,20,2,-17,18,19,-4,-12};
        P2J3.reverseAscendingSubarrays(test19);
        assertArrayEquals(ans19,test19);
    }
}