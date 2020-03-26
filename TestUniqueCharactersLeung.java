

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUniqueCharactersLeung
{
    @Test public void testUniqueCharactersLeung(){
        //String without removing characters
        String testCase1 = "a";
        assertEquals("a", P2J2.uniqueCharacters(testCase1));
        
        String testCase2 = "bc";
        assertEquals("bc", P2J2.uniqueCharacters(testCase2));
        
        String testCase3 = "def";
        assertEquals("def", P2J2.uniqueCharacters(testCase3));
        
        String testCase4 = "no";
        assertEquals("no", P2J2.uniqueCharacters(testCase4));
        
        String testCase5 = "yes";
        assertEquals("yes", P2J2.uniqueCharacters(testCase5));
        
        //String without removing characters - uppercase and lowercase
        String testCase6 = "LOlo";
        assertEquals("LOlo", P2J2.uniqueCharacters(testCase6));
        
        String testCase7 = "HelLo";
        assertEquals("HelLo", P2J2.uniqueCharacters(testCase7));
        
        String testCase8 = "Mom";
        assertEquals("Mom", P2J2.uniqueCharacters(testCase8));
        
        String testCase9 = "Dad";
        assertEquals("Dad", P2J2.uniqueCharacters(testCase9));
        
        String testCase10 = "JAva";
        assertEquals("JAva", P2J2.uniqueCharacters(testCase10));
        
        //String with removal of characters
        String testCase11 = "lolololol";
        assertEquals("lo", P2J2.uniqueCharacters(testCase11));
        
        String testCase12 = "orientation";
        assertEquals("orienta", P2J2.uniqueCharacters(testCase12));
        
        String testCase13 = "bomb";
        assertEquals("bom", P2J2.uniqueCharacters(testCase13));
        
        String testCase14 = "advantage";
        assertEquals("advntge", P2J2.uniqueCharacters(testCase14));
        
        String testCase15 = "carry";
        assertEquals("cary", P2J2.uniqueCharacters(testCase15));
        
        //Multiple words
        String testCase16 = "Hello World";
        assertEquals("Helo Wrd", P2J2.uniqueCharacters(testCase16));
        
        String testCase17 = "How are you";
        assertEquals("How areyu", P2J2.uniqueCharacters(testCase17));
        
        String testCase18 = "I am doing well";
        assertEquals("I amdoingwel", P2J2.uniqueCharacters(testCase18));
        
        String testCase19 = "Sounds good";
        assertEquals("Sounds g", P2J2.uniqueCharacters(testCase19));
        
        String testCase20 = "Happy Holiday";
        assertEquals("Hapy olid", P2J2.uniqueCharacters(testCase20));
    }
}
