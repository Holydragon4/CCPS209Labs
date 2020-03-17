import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;

public class TestsortByElementFrequencyKhan
{
    @Test public void testsortByElementFrequencyKhan(){
        int[] array = {4,99999,2,2,99999,4,4,4};
        List<Integer> items = new ArrayList<>();
        for(int i : array)
        {
            items.add(i);
        }

        P2J4.sortByElementFrequency(items);
        int[] arr = {4,4,4,4,2,2,99999,99999};
        List<Integer> realVal = new ArrayList<>();
        for(int i : arr)
        {
            realVal.add(i);
        }

        assertEquals(items, realVal);

        int[] array1 = {1,2,1,4,5,3,3,3,3};
        List<Integer> items1 = new ArrayList<>();
        for(int i : array1)
        {
            items1.add(i);
        }

        P2J4.sortByElementFrequency(items1);
        int[] arr1 = {3,3,3,3,1,1,2,4,5};
        List<Integer> realVal1 = new ArrayList<>();
        for(int i : arr1)
        {
            realVal1.add(i);
        }

        assertEquals(items1, realVal1);

        int[] array2 = {100,2,10,10,10100};
        List<Integer> items2 = new ArrayList<>();
        for(int i : array2)
        {
            items2.add(i);
        }

        P2J4.sortByElementFrequency(items2);
        int[] arr2 = {10,10,2,100,10100};
        List<Integer> realVal2 = new ArrayList<>();
        for(int i : arr2)
        {
            realVal2.add(i);
        }

        assertEquals(items2, realVal2);

        int[] array3 = {888,11,11,11,11,888,777};
        List<Integer> items3 = new ArrayList<>();
        for(int i : array3)
        {
            items3.add(i);
        }

        P2J4.sortByElementFrequency(items3);
        int[] arr3 = {11,11,11,11,888,888,777};
        List<Integer> realVal3 = new ArrayList<>();
        for(int i : arr3)
        {
            realVal3.add(i);
        }

        assertEquals(items3, realVal3);

        int[] array4 = {50,50,51,53,52,52,52,52};
        List<Integer> items4 = new ArrayList<>();
        for(int i : array4)
        {
            items4.add(i);
        }

        P2J4.sortByElementFrequency(items4);
        int[] arr4 = {52,52,52,52,50,50,51,53};
        List<Integer> realVal4 = new ArrayList<>();
        for(int i : arr4)
        {
            realVal4.add(i);
        }

        assertEquals(items4, realVal4);

        int[] array5 = {10000,10000,1,11,11,11};
        List<Integer> items5 = new ArrayList<>();
        for(int i : array5)
        {
            items5.add(i);
        }

        P2J4.sortByElementFrequency(items5);
        int[] arr5 = {11,11,11,10000,10000,1};
        List<Integer> realVal5 = new ArrayList<>();
        for(int i : arr5)
        {
            realVal5.add(i);
        }

        assertEquals(items5, realVal5);

        int[] array6 = {90,45,23,34,12};
        List<Integer> items6 = new ArrayList<>();
        for(int i : array6)
        {
            items6.add(i);
        }

        P2J4.sortByElementFrequency(items6);
        int[] arr6 = {12,23,34,45,90};
        List<Integer> realVal6 = new ArrayList<>();
        for(int i : arr6)
        {
            realVal6.add(i);
        }

        assertEquals(items6, realVal6);

        int[] array7 = {111,222,222,333,333,333,444,444,444,444};
        List<Integer> items7 = new ArrayList<>();
        for(int i : array7)
        {
            items7.add(i);
        }

        P2J4.sortByElementFrequency(items7);
        int[] arr7 = {444,444,444,444,333,333,333,222,222,111};
        List<Integer> realVal7 = new ArrayList<>();
        for(int i : arr7)
        {
            realVal7.add(i);
        }

        assertEquals(items7, realVal7);

        int[] array8 = {9,9,9,8,8,7,9};
        List<Integer> items8 = new ArrayList<>();
        for(int i : array8)
        {
            items8.add(i);
        }

        P2J4.sortByElementFrequency(items8);
        int[] arr8 = {9,9,9,9,8,8,7};
        List<Integer> realVal8 = new ArrayList<>();
        for(int i : arr8)
        {
            realVal8.add(i);
        }

        assertEquals(items8, realVal8);

        int[] array9 = {10000,23,23,23,34};
        List<Integer> items9 = new ArrayList<>();
        for(int i : array9)
        {
            items9.add(i);
        }

        P2J4.sortByElementFrequency(items9);
        int[] arr9 = {23,23,23,34,10000};
        List<Integer> realVal9 = new ArrayList<>();
        for(int i : arr9)
        {
            realVal9.add(i);
        }

        assertEquals(items9, realVal9);

        int[] array10 = {500,200,200,100,500,500};
        List<Integer> items10 = new ArrayList<>();
        for(int i : array10)
        {
            items10.add(i);
        }

        P2J4.sortByElementFrequency(items10);
        int[] arr10 = {500,500,500,200,200,100};
        List<Integer> realVal10 = new ArrayList<>();
        for(int i : arr10)
        {
            realVal10.add(i);
        }

        assertEquals(items10, realVal10);

        int[] array11 = {9,8,7,6,5,4,3,2,1,1};
        List<Integer> items11 = new ArrayList<>();
        for(int i : array11)
        {
            items11.add(i);
        }

        P2J4.sortByElementFrequency(items11);
        int[] arr11 = {1,1,2,3,4,5,6,7,8,9};
        List<Integer> realVal11 = new ArrayList<>();
        for(int i : arr11)
        {
            realVal11.add(i);
        }

        assertEquals(items11, realVal11);

        int[] array12 = {4,99999,2,2,99999,4,4,4,3};
        List<Integer> items12 = new ArrayList<>();
        for(int i : array12)
        {
            items12.add(i);
        }

        P2J4.sortByElementFrequency(items12);
        int[] arr12 = {4,4,4,4,2,2,99999,99999,3};
        List<Integer> realVal12 = new ArrayList<>();
        for(int i : arr12)
        {
            realVal12.add(i);
        }

        assertEquals(items12, realVal12);

        int[] array13 = {4,99999,2,5,5,5,2,99999,4,4,4};
        List<Integer> items13 = new ArrayList<>();
        for(int i : array13)
        {
            items13.add(i);
        }

        P2J4.sortByElementFrequency(items13);
        int[] arr13 = {4,4,4,4,5,5,5,2,2,99999,99999};
        List<Integer> realVal13 = new ArrayList<>();
        for(int i : arr13)
        {
            realVal13.add(i);
        }

        assertEquals(items13, realVal13);

        int[] array14 = {100,99999,2,2,99999,4,4,4};
        List<Integer> items14 = new ArrayList<>();
        for(int i : array14)
        {
            items14.add(i);
        }

        P2J4.sortByElementFrequency(items14);
        int[] arr14 = {4,4,4,2,2,99999,99999,100};
        List<Integer> realVal14 = new ArrayList<>();
        for(int i : arr14)
        {
            realVal14.add(i);
        }

        assertEquals(items14, realVal14);

        int[] array15 = {4,2,2,4,4,4,2,2,2,2,2,2,2,2,2};
        List<Integer> items15 = new ArrayList<>();
        for(int i : array15)
        {
            items15.add(i);
        }

        P2J4.sortByElementFrequency(items15);
        int[] arr15 = {2,2,2,2,2,2,2,2,2,2,2,4,4,4,4};
        List<Integer> realVal15 = new ArrayList<>();
        for(int i : arr15)
        {
            realVal15.add(i);
        }

        assertEquals(items15, realVal15);

        int[] array16 = {5,5,7,7,7,7,7,};
        List<Integer> items16 = new ArrayList<>();
        for(int i : array16)
        {
            items16.add(i);
        }

        P2J4.sortByElementFrequency(items16);
        int[] arr16 = {7,7,7,7,7,5,5};
        List<Integer> realVal16 = new ArrayList<>();
        for(int i : arr16)
        {
            realVal16.add(i);
        }

        assertEquals(items16, realVal16);

        int[] array17 = {288888,9999,9999,1000};
        List<Integer> items17 = new ArrayList<>();
        for(int i : array17)
        {
            items17.add(i);
        }

        P2J4.sortByElementFrequency(items17);
        int[] arr17 = {9999,9999,1000,288888};
        List<Integer> realVal17 = new ArrayList<>();
        for(int i : arr17)
        {
            realVal17.add(i);
        }

        assertEquals(items17, realVal17);

        int[] array18 = {1,2,3,3};
        List<Integer> items18 = new ArrayList<>();
        for(int i : array18)
        {
            items18.add(i);
        }

        P2J4.sortByElementFrequency(items18);
        int[] arr18 = {3,3,1,2};
        List<Integer> realVal18 = new ArrayList<>();
        for(int i : arr18)
        {
            realVal18.add(i);
        }

        assertEquals(items18, realVal18);

        int[] array19 = {4,99,2,2,99,4,4,4};
        List<Integer> items19 = new ArrayList<>();
        for(int i : array19)
        {
            items19.add(i);
        }

        P2J4.sortByElementFrequency(items19);
        int[] arr19 = {4,4,4,4,2,2,99,99};
        List<Integer> realVal19 = new ArrayList<>();
        for(int i : arr19)
        {
            realVal19.add(i);
        }

        assertEquals(items19, realVal19);

        int[] array20 = {10,5,10,3,3,2,2,2};
        List<Integer> items20 = new ArrayList<>();
        for(int i : array20)
        {
            items20.add(i);
        }

        P2J4.sortByElementFrequency(items20);
        int[] arr20 = {2,2,2,3,3,10,10,5};
        List<Integer> realVal20 = new ArrayList<>();
        for(int i : arr20)
        {
            realVal20.add(i);
        }

        assertEquals(items20, realVal20);
    }  

}

