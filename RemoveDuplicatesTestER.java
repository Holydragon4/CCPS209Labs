  
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
import java.util.*;

/**
 * The test class RemoveDuplicatesTestER.
 *
 * @author  Esau
 */
public class RemoveDuplicatesTestER
{
    @Test public void testduplicates(){
        String str1[] = {"","a","aa","ab","abcabcabcabc","AaAaAaAaAa","AAAAAA","aaaaa","1121233345","11,11,1122","1995MAAYYY0099","jjjjhjkkkjjjkkklsdsasddddd......sssuudfffff....sdf.....fddsaa....","QYyBHwJ0","GGGGGiiZOOOSOOO","BBrXXXXwweoo","tMMMaaPBBBBqYYVPveeGGT","MUUUAAAAaaHH","WpeeLjOTlstWF","AAAAAAAAaaaaaaaaDDDDddd","AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"};
        String dup[] ={"","a","a","ab","abc","Aa","A","a","12345","1,1,12","195MAY09","jhjkjklsdsasd.sudf.sdf.fdsa.","QYyBHwJ0","GiZOSO","BrXweo","tMaPBqYVPveGT","MUAaH","WpeLjOTlstWF","AaDd","AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz" };
        
       for( int i =0;i<20;i++){
           str1[i] = P2J2.removeDuplicates(str1[i]);
           
           try{
               assertEquals(dup[i],str1[i]);
            }
            catch(AssertionError assertFailed)
            {System.out.println("Failed");}
        }
    }
}
