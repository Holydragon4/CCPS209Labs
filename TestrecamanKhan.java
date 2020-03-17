import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;

public class TestrecamanKhan
{
    @Test public void testrecamanKhan() 
    {
        int n = 7;
        int result = P2J2.recaman(n);
        int realVal = 20;
        assertEquals(realVal, result);
        
         int n1 = 10;
        int result1 = P2J2.recaman(n1);
        int realVal1 = 11;
        assertEquals(realVal1, result1);
        
         int n2 = 12;
        int result2 = P2J2.recaman(n2);
        int realVal2 = 10;
        assertEquals(realVal2, result2);
        
         int n3 = 5;
        int result3 = P2J2.recaman(n3);
        int realVal3 = 7;
        assertEquals(realVal3, result3);
        
         int n4 = 13;
        int result4 = P2J2.recaman(n4);
        int realVal4 = 23;
        assertEquals(realVal4, result4);
        
         int n5 = 77;
        int result5 = P2J2.recaman(n5);
        int realVal5 = 75;
        assertEquals(realVal5, result5);
        
         int n6 = 3;
        int result6 = P2J2.recaman(n6);
        int realVal6 = 6;
        assertEquals(realVal6, result6);
        
         int n7 = 44;
        int result7 = P2J2.recaman(n7);
        int realVal7 = 36;
        assertEquals(realVal7, result7);
        
         int n8 = 28;
        int result8 = P2J2.recaman(n8);
        int realVal8 = 44;
        assertEquals(realVal8, result8);
        
         int n9 = 19;
        int result9 = P2J2.recaman(n9);
        int realVal9 = 62;
        assertEquals(realVal9, result9);
        
        int n10 = 100;
        int result10= P2J2.recaman(n10);
        int realVal10 = 164;
        assertEquals(realVal10, result10);
        
        int n11 = 42;
        int result11 = P2J2.recaman(n11);
        int realVal11 = 37;
        assertEquals(realVal11, result11);
        
        int n12 = 1;
        int result12 = P2J2.recaman(n12);
        int realVal12 = 1;
        assertEquals(realVal12, result12);
        
        int n13 = 16;
        int result13 = P2J2.recaman(n13);
        int realVal13 = 8;
        assertEquals(realVal13, result13);
        
        int n14 = 17;
        int result14 = P2J2.recaman(n14);
        int realVal14 = 25;
        assertEquals(realVal14, result14);
        
        int n15 = 25;
        int result15 = P2J2.recaman(n15);
        int realVal15 = 17;
        assertEquals(realVal15, result15);
        
        int n16 = 32;
        int result16 = P2J2.recaman(n16);
        int realVal16 = 46;
        assertEquals(realVal16, result16);
        
        int n17 = 35;
        int result17 = P2J2.recaman(n17);
        int realVal17 = 78;
        assertEquals(realVal17, result17);
        
        int n18 = 78;
        int result18 = P2J2.recaman(n18);
        int realVal18 = 153;
        assertEquals(realVal18, result18);
        
        int n19 = 22;
        int result19 = P2J2.recaman(n19);
        int realVal19 = 41;
        assertEquals(realVal19, result19);
        
        int n20 = 67;
        int result20 = P2J2.recaman(n20);
        int realVal20 = 224;
        assertEquals(realVal20, result20);
        
            
    }
    
}
