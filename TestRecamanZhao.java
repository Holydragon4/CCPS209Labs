//@author Tangxu Zhao

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRecamanZhao
{
    @Test public void TestRecamanZhao(){
        
        //test first 10 values + 0 case
        
        assertEquals(0, P2J2.recaman(0)); 
        assertEquals(1, P2J2.recaman(1)); 
        assertEquals(3, P2J2.recaman(2)); 
        assertEquals(6, P2J2.recaman(3)); 
        assertEquals(2, P2J2.recaman(4)); 
        assertEquals(7, P2J2.recaman(5)); 
        assertEquals(13, P2J2.recaman(6)); 
        assertEquals(20, P2J2.recaman(7));  
        assertEquals(12, P2J2.recaman(8)); 
        assertEquals(21, P2J2.recaman(9));       
        assertEquals(11, P2J2.recaman(10)); 
    
        //test arbitrary big numbers
        
        assertEquals(62, P2J2.recaman(19)); 
        assertEquals(38, P2J2.recaman(40)); 
        assertEquals(164, P2J2.recaman(100)); 
        assertEquals(250, P2J2.recaman(243)); 
        assertEquals(324, P2J2.recaman(600)); 
        assertEquals(3698, P2J2.recaman(1024)); 
        assertEquals(5106, P2J2.recaman(5000)); 
        assertEquals(18658, P2J2.recaman(10000)); 
        assertEquals(530476, P2J2.recaman(646464)); 
        
    }
}
