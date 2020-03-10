import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class TestP2J5Kon
{
   @Test public void testFibonacciSumKonova() {
       BigInteger curr = BigInteger.valueOf(777666555);
       List<BigInteger> result = P2J5.fibonacciSum(curr);
       int[] arr = {701408733, 63245986, 9227465, 3524578, 196418,
        46368, 10946, 4181, 1597, 233, 34, 13, 3};
       List<BigInteger> realVal = new ArrayList<>();
       for (int i = 0; i < arr.length; i++){
          realVal.add(BigInteger.valueOf(arr[i]));}
       assertEquals(realVal, result);
       
       BigInteger curr1 = BigInteger.valueOf(1000000001);
       List<BigInteger> result1 = P2J5.fibonacciSum(curr1);
       int[] arr1 = {701408733, 267914296, 24157817, 5702887, 514229, 196418, 
        75025, 28657, 1597, 233, 89, 13, 5, 2};
       List<BigInteger> realVal1 = new ArrayList<>();
       for (int i = 0; i < arr1.length; i++){
          realVal1.add(BigInteger.valueOf(arr1[i]));}
       assertEquals(realVal1, result1);
       
       BigInteger curr2 = BigInteger.valueOf(388543097);
       List<BigInteger> result2 = P2J5.fibonacciSum(curr2);
       int[] arr2 = {267914296, 102334155, 14930352, 2178309, 832040, 317811,
        28657, 6765, 610, 89, 13};
       List<BigInteger> realVal2 = new ArrayList<>();
       for (int i = 0; i < arr2.length; i++){
          realVal2.add(BigInteger.valueOf(arr2[i]));}
       assertEquals(realVal2, result2);
       
       BigInteger curr3 = BigInteger.valueOf(1028);
       List<BigInteger> result3 = P2J5.fibonacciSum(curr3);
       int[] arr3 = {987, 34, 5, 2};
       List<BigInteger> realVal3 = new ArrayList<>();
       for (int i = 0; i < arr3.length; i++){
          realVal3.add(BigInteger.valueOf(arr3[i]));}
       assertEquals(realVal3, result3);
       
       BigInteger curr4 = BigInteger.valueOf(63005);
       List<BigInteger> result4 = P2J5.fibonacciSum(curr4);
       int[] arr4 = {46368, 10946, 4181, 987, 377, 144, 2};
       List<BigInteger> realVal4 = new ArrayList<>();
       for (int i = 0; i < arr4.length; i++){
          realVal4.add(BigInteger.valueOf(arr4[i]));}
       assertEquals(realVal4, result4);
       
       BigInteger curr5 = BigInteger.valueOf(740906);
       List<BigInteger> result5 = P2J5.fibonacciSum(curr5);
       int[] arr5 = {514229, 196418, 28657, 1597, 5};
       List<BigInteger> realVal5 = new ArrayList<>();
       for (int i = 0; i < arr5.length; i++){
          realVal5.add(BigInteger.valueOf(arr5[i]));}
       assertEquals(realVal5, result5);
       
       BigInteger curr6 = BigInteger.valueOf(21);
       List<BigInteger> result6 = P2J5.fibonacciSum(curr6);
       int[] arr6 = {21};
       List<BigInteger> realVal6 = new ArrayList<>();
       for (int i = 0; i < arr6.length; i++){
          realVal6.add(BigInteger.valueOf(arr6[i]));}
       assertEquals(realVal6, result6);
       
       BigInteger curr7 = BigInteger.valueOf(42009925);
       List<BigInteger> result7 = P2J5.fibonacciSum(curr7);
       int[] arr7 = {39088169, 2178309, 514229, 196418, 28657, 2584, 987, 377,
        144, 34, 13, 3, 1};
       List<BigInteger> realVal7 = new ArrayList<>();
       for (int i = 0; i < arr7.length; i++){
          realVal7.add(BigInteger.valueOf(arr7[i]));}
       assertEquals(realVal7, result7);
       
       BigInteger curr8 = BigInteger.valueOf(61094749);
       List<BigInteger> result8 = P2J5.fibonacciSum(curr8);
       int[] arr8 = {39088169, 14930352, 5702887, 1346269, 17711, 6765, 2584,
        8, 3, 1};
       List<BigInteger> realVal8 = new ArrayList<>();
       for (int i = 0; i < arr8.length; i++){
          realVal8.add(BigInteger.valueOf(arr8[i]));}
       assertEquals(realVal8, result8);
       
       BigInteger curr9 = BigInteger.valueOf(42914241);
       List<BigInteger> result9 = P2J5.fibonacciSum(curr9);
       int[] arr9 = {39088169, 3524578, 196418, 75025, 28657, 987, 377, 
        21, 8, 1};
       List<BigInteger> realVal9 = new ArrayList<>();
       for (int i = 0; i < arr9.length; i++){
          realVal9.add(BigInteger.valueOf(arr9[i]));}
       assertEquals(realVal9, result9);
       
       BigInteger curr10 = BigInteger.valueOf(267914296);
       List<BigInteger> result10 = P2J5.fibonacciSum(curr10);
       int[] arr10 = {267914296};
       List<BigInteger> realVal10 = new ArrayList<>();
       for (int i = 0; i < arr10.length; i++){
          realVal10.add(BigInteger.valueOf(arr10[i]));}
       assertEquals(realVal10, result10);
       
       BigInteger curr11 = BigInteger.valueOf(5505);
       List<BigInteger> result11 = P2J5.fibonacciSum(curr11);
       int[] arr11 = {4181, 987, 233, 89, 13, 2};
       List<BigInteger> realVal11 = new ArrayList<>();
       for (int i = 0; i < arr11.length; i++){
          realVal11.add(BigInteger.valueOf(arr11[i]));}
       assertEquals(realVal11, result11);
       
       BigInteger curr12 = BigInteger.valueOf(662658);
       List<BigInteger> result12 = P2J5.fibonacciSum(curr12);
       int[] arr12 = {514229, 121393, 17711, 6765, 1597, 610, 233, 89, 21,
        8, 2};
       List<BigInteger> realVal12 = new ArrayList<>();
       for (int i = 0; i < arr12.length; i++){
          realVal12.add(BigInteger.valueOf(arr12[i]));}
       assertEquals(realVal12, result12);
       
       BigInteger curr13 = BigInteger.valueOf(180048);
       List<BigInteger> result13 = P2J5.fibonacciSum(curr13);
       int[] arr13 = {121393, 46368, 10946, 987, 233, 89, 21, 8, 3};
       List<BigInteger> realVal13 = new ArrayList<>();
       for (int i = 0; i < arr13.length; i++){
          realVal13.add(BigInteger.valueOf(arr13[i]));}
       assertEquals(realVal13, result13);
       
       BigInteger curr14 = BigInteger.valueOf(6937448);
       List<BigInteger> result14 = P2J5.fibonacciSum(curr14);
       int[] arr14 = {5702887, 832040, 317811, 75025, 6765, 2584, 233,
        89, 13, 1};
       List<BigInteger> realVal14 = new ArrayList<>();
       for (int i = 0; i < arr14.length; i++){
          realVal14.add(BigInteger.valueOf(arr14[i]));}
       assertEquals(realVal14, result14);
       
       BigInteger curr15 = BigInteger.valueOf(165580146);
       List<BigInteger> result15 = P2J5.fibonacciSum(curr15);
       int[] arr15 = {165580141, 5};
       List<BigInteger> realVal15 = new ArrayList<>();
       for (int i = 0; i < arr15.length; i++){
          realVal15.add(BigInteger.valueOf(arr15[i]));}
       assertEquals(realVal15, result15);
       
       BigInteger curr16 = BigInteger.valueOf(94967477);
       List<BigInteger> result16 = P2J5.fibonacciSum(curr16);
       int[] arr16 = {63245986, 24157817, 5702887, 1346269, 514229, 233, 55,
        1};
       List<BigInteger> realVal16 = new ArrayList<>();
       for (int i = 0; i < arr16.length; i++){
          realVal16.add(BigInteger.valueOf(arr16[i]));}
       assertEquals(realVal16, result16);
       
       BigInteger curr17 = BigInteger.valueOf(8888881);
       List<BigInteger> result17 = P2J5.fibonacciSum(curr17);
       int[] arr17 = {5702887, 2178309, 832040, 121393, 46368,6765, 987, 89, 
           34, 8, 1};
       List<BigInteger> realVal17 = new ArrayList<>();
       for (int i = 0; i < arr17.length; i++){
          realVal17.add(BigInteger.valueOf(arr17[i]));}
       assertEquals(realVal17, result17);
       
       BigInteger curr18 = BigInteger.valueOf(7078);
       List<BigInteger> result18 = P2J5.fibonacciSum(curr18);
       int[] arr18 = {6765, 233, 55, 21, 3, 1};
       List<BigInteger> realVal18 = new ArrayList<>();
       for (int i = 0; i < arr18.length; i++){
          realVal18.add(BigInteger.valueOf(arr18[i]));}
       assertEquals(realVal18, result18);
       
       BigInteger curr19 = BigInteger.valueOf(24242424);
       List<BigInteger> result19 = P2J5.fibonacciSum(curr19);
       int[] arr19 = {24157817, 75025, 6765, 2584, 233};
       List<BigInteger> realVal19 = new ArrayList<>();
       for (int i = 0; i < arr19.length; i++){
          realVal19.add(BigInteger.valueOf(arr19[i]));}
       assertEquals(realVal19, result19);
    }
   
   @Test public void testSevenZeroKonova() {
      int n = 4;
      BigInteger result = P2J5.sevenZero(n);
      BigInteger realVal = BigInteger.valueOf(700);
      assertEquals(realVal, result);
      
      int n1 = 49;
      BigInteger result1 = P2J5.sevenZero(n1);
      BigInteger realVal1 = BigInteger.valueOf(777777);
      assertEquals(realVal1, result1);
      
      int n2 = 695;
      BigInteger result2 = P2J5.sevenZero(n2);
      BigInteger realVal2 = new BigInteger("77777777777777777777777777777777777777777777770");
      assertEquals(realVal2, result2);
      
      int n3 = 79994;
      BigInteger result3 = P2J5.sevenZero(n3);
      BigInteger realVal3 = new BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777770");
      assertEquals(realVal3, result3);
      
      int n4 = 1110000000;
      BigInteger result4 = P2J5.sevenZero(n4);
      BigInteger realVal4 = new BigInteger("7770000000");
      assertEquals(realVal4, result4);
      
      int n5 = 9225;
      BigInteger result5 = P2J5.sevenZero(n5);
      BigInteger realVal5 = new BigInteger("77777777777777777777777777777777777777777777700");
      assertEquals(realVal5, result5);
      
      int n6 = 19999;
      BigInteger result6 = P2J5.sevenZero(n6);
      BigInteger realVal6 = new BigInteger("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
      assertEquals(realVal6, result6);

       int n7 = 7807;
      BigInteger result7 = P2J5.sevenZero(n7);
      BigInteger realVal7 = new BigInteger("777777777777777777777777777777");
      assertEquals(realVal7, result7);

       int n8 = 2222;
      BigInteger result8 = P2J5.sevenZero(n8);
      BigInteger realVal8 = new BigInteger("77770");
      assertEquals(realVal8, result8);
     
       int n9 = 17550;
      BigInteger result9 = P2J5.sevenZero(n9);
      BigInteger realVal9 = new BigInteger("77777777777777777777777777777777777777777777777777777700");
      assertEquals(realVal9, result9);

       int n10 = 123;
      BigInteger result10 = P2J5.sevenZero(n10);
      BigInteger realVal10 = new BigInteger("777777777777777");
      assertEquals(realVal10, result10);

      
       int n11 = 570;
      BigInteger result11 = P2J5.sevenZero(n11);
      BigInteger realVal11 = new BigInteger("7777777777777777770");
      assertEquals(realVal11, result11);

       int n12 = 77;
      BigInteger result12 = P2J5.sevenZero(n12);
      BigInteger realVal12 = new BigInteger("77");
      assertEquals(realVal12, result12);

       int n13 = 8320;
      BigInteger result13 = P2J5.sevenZero(n13);
      BigInteger realVal13 = new BigInteger("7777770000000");
      assertEquals(realVal13, result13);

       int n14 = 55550;
      BigInteger result14 = P2J5.sevenZero(n14);
      BigInteger realVal14 = new BigInteger("777700");
      assertEquals(realVal14, result14);

      int n15 = 3133;
      BigInteger result15 = P2J5.sevenZero(n15);
      BigInteger realVal15 = new BigInteger("777777777777777777777777777777");
      assertEquals(realVal15, result15);

      int n16 = 4446;
      BigInteger result16 = P2J5.sevenZero(n16);
      BigInteger realVal16 = new BigInteger("7777777777777777770");
      assertEquals(realVal16, result16);

      int n17 = 676;
      BigInteger result17 = P2J5.sevenZero(n17);
      BigInteger realVal17 = new BigInteger("77777777777777777777777777777777777777777777777777777777777777777777777777777700");
      assertEquals(realVal17, result17);

      int n18 = 3311;
      BigInteger result18 = P2J5.sevenZero(n18);
      BigInteger realVal18 = new BigInteger("777777777777777777777777777777777777777777");
      assertEquals(realVal18, result18);

      int n19 = 2350;
      BigInteger result19 = P2J5.sevenZero(n19);
      BigInteger realVal19 = new BigInteger("777777777777777777777777777777777777777777777700");
      assertEquals(realVal19, result19);
    }
    }