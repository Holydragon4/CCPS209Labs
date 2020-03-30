import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P2J4TestAhmedAldaeni {

    @Test
    public void runningMedianOfThree() {
        //Test for length 1

        List<Integer> realValue_1 = Arrays.asList(5);
        List<Integer> result_1 = Arrays.asList(5);
        List<Integer> test_1 = P2J4.runningMedianOfThree(realValue_1);
        assertEquals(result_1,test_1);

        //Test for length 2
        List<Integer> realValue_2 = Arrays.asList(2,6);
        List<Integer> result_2 = Arrays.asList(2,6);
        List<Integer> test_2 = P2J4.runningMedianOfThree(realValue_2);
        assertEquals(result_2,test_2);


        List<Integer> realValue_3 = Arrays.asList(7,4);
        List<Integer> result_3 = Arrays.asList(7,4);
        List<Integer> test_3 = P2J4.runningMedianOfThree(realValue_3);
        assertEquals(result_3,test_3);

        //Test for length 3
        List<Integer> realValue_4 = Arrays.asList(1,2,3);
        List<Integer> result_4 = Arrays.asList(1,2,2);
        List<Integer> test_4 = P2J4.runningMedianOfThree(realValue_4);
        assertEquals(result_4,test_4);

        List<Integer> realValue_5 = Arrays.asList(3,4,5);
        List<Integer> result_5 = Arrays.asList(3,4,4);
        List<Integer> test_5 = P2J4.runningMedianOfThree(realValue_5);
        assertEquals(result_5,test_5);


        List<Integer> realValue_6 = Arrays.asList(9,16,18);
        List<Integer> result_6 = Arrays.asList(9,16,16);
        List<Integer> test_6 = P2J4.runningMedianOfThree(realValue_6);
        assertEquals(result_6,test_6);
        //Test for length 4
        List<Integer> realValue_7 = Arrays.asList(1,2,3,4);
        List<Integer> result_7 = Arrays.asList(1,2,2,3);
        List<Integer> test_7 = P2J4.runningMedianOfThree(realValue_7);
        assertEquals(result_7,test_7);

        List<Integer> realValue_8 = Arrays.asList(55,42,43,12);
        List<Integer> result_8 = Arrays.asList(55, 42, 43, 42);
        List<Integer> test_8 = P2J4.runningMedianOfThree(realValue_8);
        assertEquals(result_8,test_8);

        List<Integer> realValue_9 = Arrays.asList(8,81,6,3);
        List<Integer> result_9 = Arrays.asList(8, 81, 8, 6);
        List<Integer> test_9 = P2J4.runningMedianOfThree(realValue_9);
        assertEquals(result_9,test_9);



        List<Integer> realValue_10 = Arrays.asList(8,4,7,2);
        List<Integer> result_10 = Arrays.asList(8, 4, 7, 4);
        List<Integer> test_10 = P2J4.runningMedianOfThree(realValue_10);
        assertEquals(result_10,test_10);



        List<Integer> realValue_11 = Arrays.asList(5,33,2,6);
        List<Integer> result_11 = Arrays.asList(5, 33, 5, 6);
        List<Integer> test_11 = P2J4.runningMedianOfThree(realValue_11);
        assertEquals(result_11,test_11);


        //Test for length >=5


        List<Integer> realValue_12 = Arrays.asList(3,7,4,9,2);
        List<Integer> result_12 = Arrays.asList(3, 7, 4, 7, 4);
        List<Integer> test_12 = P2J4.runningMedianOfThree(realValue_12);
        assertEquals(result_12,test_12);



        List<Integer> realValue_13 = Arrays.asList(3,6,2,7,8,4,7,3);
        List<Integer> result_13 = Arrays.asList(3, 6, 3, 6, 7, 7, 7, 4);
        List<Integer> test_13 = P2J4.runningMedianOfThree(realValue_13);
        assertEquals(result_13,test_13);


        List<Integer> realValue_14 = Arrays.asList(354,635,366,256,345,378,777);
        List<Integer> result_14 = Arrays.asList(354, 635, 366, 366, 345, 345, 378);
        List<Integer> test_14 = P2J4.runningMedianOfThree(realValue_14);
        assertEquals(result_14,test_14);


        List<Integer> realValue_15 = Arrays.asList(5,63,7,36,83,26,88);
        List<Integer> result_15 = Arrays.asList(5, 63, 7, 36, 36, 36, 83);
        List<Integer> test_15 = P2J4.runningMedianOfThree(realValue_15);
        assertEquals(result_15,test_15);

        //Test for length with negative numbers
        List<Integer> realValue_16 = Arrays.asList(3,-2,4,-9,2,5,-10,-17);
        List<Integer> result_16 = Arrays.asList(3, -2, 3, -2, 2, 2, 2, -10);
        List<Integer> test_16 = P2J4.runningMedianOfThree(realValue_16);
        assertEquals(result_16,test_16);


        List<Integer> realValue_17 = Arrays.asList(54,84,-93,43,-10,21,-9);
        List<Integer> result_17 = Arrays.asList(54, 84, 54, 43, -10, 21, -9);
        List<Integer> test_17 = P2J4.runningMedianOfThree(realValue_17);
        assertEquals(result_17,test_17);


        //Test for length with duplicate numbers

        List<Integer> realValue_18 = Arrays.asList(44,44,84,75,55,44);
        List<Integer> result_18 = Arrays.asList(44, 44, 44, 75, 75, 55);
        List<Integer> test_18 = P2J4.runningMedianOfThree(realValue_18);
        assertEquals(result_18,test_18);



        List<Integer> realValue_19 = Arrays.asList(8,4,3,6,8,8,5,8);
        List<Integer> result_19 = Arrays.asList(8, 4, 4, 4, 6, 8, 8, 8);
        List<Integer> test_19 = P2J4.runningMedianOfThree(realValue_19);
        assertEquals(result_19,test_19);


        //Test for length with only negative numbers
        List<Integer> realValue_20 = Arrays.asList(-3,-7,-5,-3,-4,-1);
        List<Integer> result_20 = Arrays.asList(-3, -7, -5, -5, -4, -3);
        List<Integer> test_20 = P2J4.runningMedianOfThree(realValue_20);
        assertEquals(result_20,test_20);


    }

    

    @Test
    public void firstMissingPositive() {

        //Test for length 0
        List<Integer> realValue_1 = Arrays.asList();
        int result_1 = 1;
        int test_1 = P2J4.firstMissingPositive(realValue_1);
        assertEquals(result_1,test_1);

        //Test for length 1
        List<Integer> realValue_2 = Arrays.asList(1);
        int result_2 = 2;
        int test_2 = P2J4.firstMissingPositive(realValue_2);
        assertEquals(result_2,test_2);


        List<Integer> realValue_3 = Arrays.asList(9);
        int result_3 = 1;
        int test_3 = P2J4.firstMissingPositive(realValue_3);
        assertEquals(result_3,test_3);

        //Test for length 2

        List<Integer> realValue_4 = Arrays.asList(1,2);
        int result_4 = 3;
        int test_4 = P2J4.firstMissingPositive(realValue_4);
        assertEquals(result_4,test_4);



        //Test for length 3
        List<Integer> realValue_5 = Arrays.asList(1,2,3);
        int result_5 = 4;
        int test_5 = P2J4.firstMissingPositive(realValue_5);
        assertEquals(result_5,test_5);

        //Test for length 4

        List<Integer> realValue_6 = Arrays.asList(1,9,2,3);
        int result_6 = 4;
        int test_6 = P2J4.firstMissingPositive(realValue_6);
        assertEquals(result_6,test_6);

        //Test for length >=5
        List<Integer> realValue_7 = Arrays.asList(7,3,4,2,1);
        int result_7 = 5;
        int test_7 = P2J4.firstMissingPositive(realValue_7);
        assertEquals(result_7,test_7);



        List<Integer> realValue_8 = Arrays.asList(8,1,5,3,7,2,4);
        int result_8 = 6;
        int test_8 = P2J4.firstMissingPositive(realValue_8);
        assertEquals(result_8,test_8);



        List<Integer> realValue_9 = Arrays.asList(4,3,6,2,1,10,5);
        int result_9 = 7;
        int test_9 = P2J4.firstMissingPositive(realValue_9);
        assertEquals(result_9,test_9);



        List<Integer> realValue_10 = Arrays.asList(10,9,13,1,43,6,1,2,3,4,5,6,7);
        int result_10 = 8;
        int test_10 = P2J4.firstMissingPositive(realValue_10);
        assertEquals(result_10,test_10);



        List<Integer> realValue_11 = Arrays.asList(8,1,4,3,6,5,4,2);
        int result_11 = 7;
        int test_11 = P2J4.firstMissingPositive(realValue_11);
        assertEquals(result_11,test_11);


        List<Integer> realValue_12 = Arrays.asList(4,1,3,6,24,6,53,64,2);
        int result_12 = 5;
        int test_12 = P2J4.firstMissingPositive(realValue_12);
        assertEquals(result_12,test_12);



        List<Integer> realValue_13 = Arrays.asList(59,2,53,2,45,3,5,3);
        int result_13 = 1;
        int test_13 = P2J4.firstMissingPositive(realValue_13);
        assertEquals(result_13,test_13);



        List<Integer> realValue_14 = Arrays.asList(3,23,2,5,1,4,6,7,8,10,9);
        int result_14 = 11;
        int test_14 = P2J4.firstMissingPositive(realValue_14);
        assertEquals(result_14,test_14);

        //Test for length with negative numbers
        List<Integer> realValue_15 = Arrays.asList(-1,-2,-5,1,2,3,-9,-33,5);
        int result_15 = 4;
        int test_15 = P2J4.firstMissingPositive(realValue_15);
        assertEquals(result_15,test_15);

        List<Integer> realValue_16 = Arrays.asList(89,235,6546,1,-3,-34,-342,32);
        int result_16 = 2;
        int test_16 = P2J4.firstMissingPositive(realValue_16);
        assertEquals(result_16,test_16);


        //Test for length with duplicate numbers
        List<Integer> realValue_17 = Arrays.asList(1,4,3,7,3,2,2,1,5,6,4,5);
        int result_17 = 8;
        int test_17 = P2J4.firstMissingPositive(realValue_17);
        assertEquals(result_17,test_17);

        List<Integer> realValue_18 = Arrays.asList(2,1,2);
        int result_18 = 3;
        int test_18 = P2J4.firstMissingPositive(realValue_18);
        assertEquals(result_18,test_18);


        //Test for length with only negative numbers

        List<Integer> realValue_19 = Arrays.asList(-3,-1,-2);
        int result_19 = 1;
        int test_19 = P2J4.firstMissingPositive(realValue_19);
        assertEquals(result_19,test_19);

        List<Integer> realValue_20 = Arrays.asList(-10,-4,-1,-2);
        int result_20 = 1;
        int test_20 = P2J4.firstMissingPositive(realValue_20);
        assertEquals(result_20,test_20);


    }
    


    @Test
    public void factorFactorial() {

        int n = 1;
        List<Integer> realValue_1 = P2J4.factorFactorial(n);
        List<Integer> result_1 = Arrays.asList();
        assertEquals(result_1, realValue_1);


        int n2 = 2;
        List<Integer> realValue_2 = P2J4.factorFactorial(n2);
        List<Integer> result_2 = Arrays.asList(2);
        assertEquals(result_2, realValue_2);

        int n3 = 3;
        List<Integer> realValue_3 = P2J4.factorFactorial(n3);
        List<Integer> result_3 = Arrays.asList(2, 3);
        assertEquals(result_3, realValue_3);


        int n4 = 4;
        List<Integer> realValue_4 = P2J4.factorFactorial(n4);
        List<Integer> result_4 = Arrays.asList(2, 2, 2, 3);
        assertEquals(result_4, realValue_4);



        int n5 = 5;
        List<Integer> realValue_5 = P2J4.factorFactorial(n5);
        List<Integer> result_5 = Arrays.asList(2, 2, 2, 3, 5);
        assertEquals(result_5, realValue_5);

        int n6 = 6;
        List<Integer> realValue_6 = P2J4.factorFactorial(n6);
        List<Integer> result_6 = Arrays.asList(2, 2, 2, 2, 3, 3, 5);
        assertEquals(result_6, realValue_6);


        int n7 = 7;
        List<Integer> realValue_7 = P2J4.factorFactorial(7);
        List<Integer> result_7 = Arrays.asList(2, 2, 2, 2, 3, 3, 5, 7);
        assertEquals(result_7, realValue_7);



        int n8 = 8;
        List<Integer> realValue_8 = P2J4.factorFactorial(n8);
        List<Integer> result_8 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 3, 3, 5, 7);
        assertEquals(result_8, realValue_8);


        int n9 = 9;
        List<Integer> realValue_9 = P2J4.factorFactorial(n9);
        List<Integer> result_9 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 5, 7);
        assertEquals(result_9, realValue_9);


        int n10 = 10;
        List<Integer> realValue_10 = P2J4.factorFactorial(n10);
        List<Integer> result_10 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 5, 5, 7);
        assertEquals(result_10, realValue_10);


        int n11 = 11;
        List<Integer> realValue_11 = P2J4.factorFactorial(n11);
        List<Integer> result_11 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 5, 5, 7, 11);
        assertEquals(result_11, realValue_11);

        int n12 = 12;
        List<Integer> realValue_12 = P2J4.factorFactorial(n12);
        List<Integer> result_12 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5, 5, 7, 11);
        assertEquals(result_12, realValue_12);



        int n13 = 13;
        List<Integer> realValue_13 = P2J4.factorFactorial(n13);
        List<Integer> result_13 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5, 5, 7, 11, 13);
        assertEquals(result_13, realValue_13);


        int n14 = 14;
        List<Integer> realValue_14 = P2J4.factorFactorial(n14);
        List<Integer> result_14 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5, 5, 7, 7, 11, 13);
        assertEquals(result_14, realValue_14);


        int n15 = 15;
        List<Integer> realValue_15 = P2J4.factorFactorial(n15);
        List<Integer> result_15 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 5, 5, 5, 7, 7, 11, 13);
        assertEquals(result_15, realValue_15);


        int n16 = 16;
        List<Integer> realValue_16 = P2J4.factorFactorial(n16);
        List<Integer> result_16 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 5, 5, 5, 7, 7, 11, 13);
        assertEquals(result_16, realValue_16);

        int n17 = 17;
        List<Integer> realValue_17 = P2J4.factorFactorial(n17);
        List<Integer> result_17 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 5, 5, 5, 7, 7, 11, 13, 17);
        assertEquals(result_17, realValue_17);


        int n18 = 18;
        List<Integer> realValue_18 = P2J4.factorFactorial(n18);
        List<Integer> result_18 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 7, 7, 11, 13, 17);
        assertEquals(result_18, realValue_18);


        int n19 = 19;
        List<Integer> realValue_19 = P2J4.factorFactorial(n19);
        List<Integer> result_19 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 7, 7, 11, 13, 17, 19);
        assertEquals(result_19, realValue_19);


        int n20 = 20;
        List<Integer> realValue_20 = P2J4.factorFactorial(n20);
        List<Integer> result_20 = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 7, 7, 11, 13, 17, 19);
        assertEquals(result_20, realValue_20);




    }
}