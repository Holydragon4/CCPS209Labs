
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRecamanPurcino
{
    @Test public void TestRecamanPurcino(){
        
        //test values
        int a1 = 0; 
        assertEquals(0, P2J2.recaman(a1)); 
        int a2 = 1; 
        assertEquals(1, P2J2.recaman(a2));  
        int a3 = 10; 
        assertEquals(11, P2J2.recaman(a3));
        int a4 = 20; 
        assertEquals(42, P2J2.recaman(a4)); 
        int a5 = 30; 
        assertEquals(45, P2J2.recaman(a5)); 
        int a6 = 40; 
        assertEquals(38, P2J2.recaman(a6)); 
        int a7 = 50; 
        assertEquals(33, P2J2.recaman(a7)); 
        int a8 = 60; 
        assertEquals(28, P2J2.recaman(a8)); 
        int a9 = 70; 
        assertEquals(155, P2J2.recaman(a9)); 
        int a10 = 25; 
        assertEquals(17, P2J2.recaman(a10)); 
        int a11 = 45; 
        assertEquals(81, P2J2.recaman(a11)); 
        int a12 = 15; 
        assertEquals(24, P2J2.recaman(a12));
        int a13 = 35; 
        assertEquals(78, P2J2.recaman(a13)); 
        int a14 = 55; 
        assertEquals(86, P2J2.recaman(a14));
        int a15 = 65; 
        assertEquals(91, P2J2.recaman(a15)); 
        int a16 = 47; 
        assertEquals(82, P2J2.recaman(a16)); 
        int a17 = 69; 
        assertEquals(225, P2J2.recaman(a17)); 
        int a18 = 44; 
        assertEquals(36, P2J2.recaman(a18)); 
        int a19 = 19; 
        assertEquals(62, P2J2.recaman(a19));
        int a20 = 23; 
        assertEquals(18, P2J2.recaman(a20));
        
    }
}