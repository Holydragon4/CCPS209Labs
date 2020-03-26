

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRecamanLeung
{
    @Test public void testRecamanLeung(){
        //String without removing characters
        int testCase1 = 1;
        assertEquals(1, P2J2.recaman(testCase1));
        
        int testCase2 = 11;
        assertEquals(22, P2J2.recaman(testCase2));
        
        int testCase3 = 111;
        assertEquals(40, P2J2.recaman(testCase3));
        
        int testCase4 = 1111;
        assertEquals(574, P2J2.recaman(testCase4));
        
        int testCase5 = 11111;
        assertEquals(7458, P2J2.recaman(testCase5));
        
        int testCase6 = 111111;
        assertEquals(88410, P2J2.recaman(testCase6));
        
        int testCase7 = 1111111;
        assertEquals(3173194, P2J2.recaman(testCase7));
        
        int testCase8 = 11111111;
        assertEquals(31504904, P2J2.recaman(testCase8));
        
        int testCase9 = 111111111;
        assertEquals(90898542, P2J2.recaman(testCase9));
        
        int testCase10 = 100000000;
        assertEquals(203701556, P2J2.recaman(testCase10));
        
        int testCase11 = 2;
        assertEquals(3, P2J2.recaman(testCase11));
        
        int testCase12 = 12;
        assertEquals(10, P2J2.recaman(testCase12));
        
        int testCase13 = 123;
        assertEquals(260, P2J2.recaman(testCase13));
        
        int testCase14 = 1234;
        assertEquals(4205, P2J2.recaman(testCase14));
        
        int testCase15 = 12345;
        assertEquals(6209, P2J2.recaman(testCase15));
        
        int testCase16 = 123456;
        assertEquals(201782, P2J2.recaman(testCase16));
        
        int testCase17 = 1234567;
        assertEquals(827716, P2J2.recaman(testCase17));
        
        int testCase18 = 12345678;
        assertEquals(20395349, P2J2.recaman(testCase18));
        
        int testCase19 = 123456789;
        assertEquals(324951689, P2J2.recaman(testCase19));
        
        int testCase20 = 3;
        assertEquals(6, P2J2.recaman(testCase20));
    }
}