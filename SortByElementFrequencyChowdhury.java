import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.List;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SortByElementFrequencyChowdhury{
        @Test public void test2SortByElementFrequency() {
            
            List<Integer> al = Arrays.asList(2, 2, 2, 5, 5, 5, 5, 5, 1);
            P2J4.sortByElementFrequency(al);
            List<Integer> ans = Arrays.asList(5, 5, 5, 5, 5, 2, 2, 2, 1);
            assertThat(al, is(ans));
            
            List<Integer> al2 = Arrays.asList(7, 7, 2, 7, 7, 7, 1, 5, 1);
            P2J4.sortByElementFrequency(al2);
            List<Integer> ans2 = Arrays.asList(7, 7, 7, 7, 7, 1, 1, 2, 5);
            assertThat(al2, is(ans2));
            
            List<Integer> al3 = Arrays.asList(4, 1, 1, 1, 4, 5, 5, 5, 6);
            P2J4.sortByElementFrequency(al3);
            List<Integer> ans3 = Arrays.asList(1, 1, 1, 5, 5, 5, 4, 4, 6);
            assertThat(al3, is(ans3));
            
            List<Integer> al4 = Arrays.asList(50, 51, 52, 51, 52, 51, 52, 50, 52);
            P2J4.sortByElementFrequency(al4);
            List<Integer> ans4 = Arrays.asList(52, 52, 52, 52, 51, 51, 51, 50, 50);
            assertThat(al4, is(ans4));
            
            List<Integer> al5 = Arrays.asList(48, 48, 66, 5, 8, 66, 5, 8, 8);
            P2J4.sortByElementFrequency(al5);
            List<Integer> ans5 = Arrays.asList(8, 8, 8, 5, 5, 48, 48, 66, 66);
            assertThat(al5, is(ans5));
            
            List<Integer> al6 = Arrays.asList(2, 11, 2, 11, 6, 11, 11, 6, 11);
            P2J4.sortByElementFrequency(al6);
            List<Integer> ans6 = Arrays.asList(11, 11, 11, 11, 11, 2, 2, 6, 6);
            assertThat(al6, is(ans6));
            
            List<Integer> al7 = Arrays.asList(33, 7, 7, 33, 7, 7, 7, 0, 0);
            P2J4.sortByElementFrequency(al7);
            List<Integer> ans7 = Arrays.asList(7, 7, 7, 7, 7, 0, 0, 33, 33);
            assertThat(al7, is(ans7));
            
            List<Integer> al8 = Arrays.asList(81, 45, 81, 45, 45, 9, 81, 81, 9);
            P2J4.sortByElementFrequency(al8);
            List<Integer> ans8 = Arrays.asList(81, 81, 81, 81, 45, 45, 45, 9, 9);
            assertThat(al8, is(ans8));
            
            List<Integer> al9 = Arrays.asList(8888, 8888, 55, 3, 3, 55, 8888, 3, 3);
            P2J4.sortByElementFrequency(al9);
            List<Integer> ans9 = Arrays.asList(3, 3, 3, 3, 8888, 8888, 8888, 55, 55);
            assertThat(al9, is(ans9));
            
            List<Integer> al10 = Arrays.asList(31, 2122, 2122, 31, 31, 5, 2122, 6, 6);
            P2J4.sortByElementFrequency(al10);
            List<Integer> ans10 = Arrays.asList(31, 31, 31, 2122, 2122, 2122, 6, 6, 5);
            assertThat(al10, is(ans10));
            
            List<Integer> al11 = Arrays.asList(8823, 8823, 8823, 8823, 8823, 8823, 8823, 4, 4);
            P2J4.sortByElementFrequency(al11);
            List<Integer> ans11 = Arrays.asList(8823, 8823, 8823, 8823, 8823, 8823, 8823, 4, 4);
            assertThat(al11, is(ans11));
            
            List<Integer> al12 = Arrays.asList(11, 34, 11, 34, 34, 91, 11, 91, 6);
            P2J4.sortByElementFrequency(al12);
            List<Integer> ans12 = Arrays.asList(11, 11, 11, 34, 34, 34, 91, 91, 6);
            assertThat(al12, is(ans12));
            
            List<Integer> al13 = Arrays.asList(15, 15, 99, 99, 99, 15, 3, 3, 3);
            P2J4.sortByElementFrequency(al13);
            List<Integer> ans13 = Arrays.asList(3, 3, 3, 15, 15, 15, 99, 99, 99);
            assertThat(al13, is(ans13));
            
            List<Integer> al14 = Arrays.asList(73, 47, 80, 86, 86, 73, 555, 47, 80);
            P2J4.sortByElementFrequency(al14);
            List<Integer> ans14 = Arrays.asList(47, 47, 73, 73, 80, 80, 86, 86, 555);
            assertThat(al14, is(ans14));
            
            List<Integer> al15 = Arrays.asList(4904, 22, 4904, 22, 4904, 22, 17, 22, 4904);
            P2J4.sortByElementFrequency(al15);
            List<Integer> ans15 = Arrays.asList(22, 22, 22, 22, 4904, 4904, 4904, 4904, 17);
            assertThat(al15, is(ans15));
            
            List<Integer> al16 = Arrays.asList(89329, 1, 1, 1, 1, 89329, 89329, 1, 89329);
            P2J4.sortByElementFrequency(al16);
            List<Integer> ans16 = Arrays.asList(1, 1, 1, 1, 1, 89329, 89329, 89329, 89329);
            assertThat(al16, is(ans16));
            
            List<Integer> al17 = Arrays.asList(92, 34, 34, 92, 34, 57, 34, 57, 57);
            P2J4.sortByElementFrequency(al17);
            List<Integer> ans17 = Arrays.asList(34, 34, 34, 34, 57, 57, 57, 92, 92);
            assertThat(al17, is(ans17));
            
            List<Integer> al18 = Arrays.asList(0005, 5, 0005, 5, 44, 77, 77, 44, 77);
            P2J4.sortByElementFrequency(al18);
            List<Integer> ans18 = Arrays.asList(0005, 0005, 5, 5, 77, 77, 77, 44, 44);
            assertThat(al18, is(ans18));
            
            List<Integer> al19 = Arrays.asList(1009, 85, 33, 1009, 85, 1009, 85, 85, 33);
            P2J4.sortByElementFrequency(al19);
            List<Integer> ans19 = Arrays.asList(85, 85, 85, 85, 1009, 1009, 1009, 33, 33);
            assertThat(al19, is(ans19));
            
            List<Integer> al20 = Arrays.asList(63, 222222222, 19, 19, 222222222, 63, 19, 63, 222222222);
            P2J4.sortByElementFrequency(al20);
            List<Integer> ans20 = Arrays.asList(19, 19, 19, 63, 63, 63, 222222222, 222222222, 222222222);
            assertThat(al20, is(ans20));
            
        }
}