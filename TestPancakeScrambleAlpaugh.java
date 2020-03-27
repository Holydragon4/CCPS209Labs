import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPancakeScrambleAlpaugh
{
    @Test
    public void testAlpaugh() {
        String r1 = P2J3.pancakeScramble("pancake");
        assertEquals("eanpack", r1);
        
        String r2 = P2J3.pancakeScramble("abcdefghijklmnopqrstuvwxyz");
        assertEquals("zxvtrpnljhfdbacegikmoqsuwy", r2);
        
        String r3 = P2J3.pancakeScramble("nmolpkqjishtgufvewdxcybza");
        assertEquals("abcdefghiqponmlkjstuvwxyz", r3);
        
        String r4 = P2J3.pancakeScramble("abcdef");
        assertEquals("fdbace", r4);
        
        String r5 = P2J3.pancakeScramble("");
        assertEquals("", r5);
        
        String r6 = P2J3.pancakeScramble("p");
        assertEquals("p", r6);
        
        String r7 = P2J3.pancakeScramble("Ryerson");
        assertEquals("nseRyro", r7);
        
        String r8 = P2J3.pancakeScramble("@#$% **");
        assertEquals("* $@#%*", r8);
        
        String r9 = P2J3.pancakeScramble("Polynomial in java");
        assertEquals("aa ilioyoPlnma njv", r9);
        
        String r10 = P2J3.pancakeScramble("Corona virus");
        assertEquals("srvaooCrn iu", r10);
        
        String r11 = P2J3.pancakeScramble("Oracle Blue J");
        assertEquals("Jel laOrceBu ", r11);
        
        String r12 = P2J3.pancakeScramble("Curb your enthusiasm");
        assertEquals("mashn uybuCr oretuis", r12);
        
        String r13 = P2J3.pancakeScramble("Buttermilk pancakes with syrup");
        assertEquals("prshi eanpkirtuBteml ackswt yu", r13);
        
        String r14 = P2J3.pancakeScramble("The Church of Latter day Saints");
        assertEquals("sna a etLf cuCeTh hrho atrdySit", r14);
        
        String r15 = P2J3.pancakeScramble("System.out.println()");
        assertEquals(")ntiptomtySse.u.rnl(", r15);
        
        String r16 = P2J3.pancakeScramble("java swing GUI");
        assertEquals("IGgisaajv wn U", r16);
        
        String r17 = P2J3.pancakeScramble("Java is an object oriented language");
        assertEquals("eaga enioteb as vJaai nojc retdlnug", r17);
        
        String r18 = P2J3.pancakeScramble("Social Distancing |--6M--|");
        assertEquals("|-6- ncasDlioSca itnig|-M-", r18);
        
        String r19 = P2J3.pancakeScramble("Winter goes to spring");
        assertEquals("gip tso enWitrge osrn", r19);
        
        String r20 = P2J3.pancakeScramble("Ground hog day");
        assertEquals("ydghdurGon o a", r20);
    }
}
