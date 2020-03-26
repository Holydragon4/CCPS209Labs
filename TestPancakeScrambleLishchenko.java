//@author Andrew Lishchenko 500815035

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPancakeScrambleLishchenko
{
    
    @Test public void pancakeScramble(){
        
        //Empty case and SingleCharacter
        assertEquals("",P2J3.pancakeScramble(""));
        assertEquals("a",P2J3.pancakeScramble("a"));
        assertEquals("X",P2J3.pancakeScramble("X"));
        assertEquals("-",P2J3.pancakeScramble("-"));
        assertEquals("7",P2J3.pancakeScramble("7"));
        assertEquals(" ",P2J3.pancakeScramble(" "));
        
        
        assertEquals("ebac kcapnaesrml",P2J3.pancakeScramble("pancake scramble"));
        assertEquals("eniSrtpoCmue cec",P2J3.pancakeScramble("Computer Science"));
        assertEquals("ska klIkaMru",P2J3.pancakeScramble("Ilkka Markus"));
        assertEquals("m6aydrhTusastp",P2J3.pancakeScramble("Thursdaysat6pm"));
        assertEquals("9192PCS0>0",P2J3.pancakeScramble("CPS209>109"));
        
        
        assertEquals("469113.4525",P2J3.pancakeScramble("3.141592654"));
        assertEquals("giengElcmhCeia niern",P2J3.pancakeScramble("Chemical Engineering"));
        assertEquals("srVNRCooaiu",P2J3.pancakeScramble("CoRoNaVirus"));
        assertEquals("888872.1212",P2J3.pancakeScramble("2.718281828"));
        assertEquals(")*^$@!#%&(",P2J3.pancakeScramble("!@#$%^&*()"));
        
        
        assertEquals("nsd&leTsaEio",P2J3.pancakeScramble("Tesla&Edison"));
        assertEquals("gilugERvGogErEainBidn",P2J3.pancakeScramble("gEorGEvaRiEngBuilding"));
        assertEquals("e og Mon os",P2J3.pancakeScramble("Mo ng oo se"));
        assertEquals("---tiT-----wSy--",P2J3.pancakeScramble("-----TwiSty-----"));
        assertEquals("ozmlKaaao",P2J3.pancakeScramble("Kalamazoo"));
    }
}
