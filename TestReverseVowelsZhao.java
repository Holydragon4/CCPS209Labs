//@author Tangxu Zhao

import static org.junit.Assert.*;
import org.junit.Test;

public class TestReverseVowelsZhao
{
    @Test public void TestReverseVowels(){
        //test null string
        assertEquals("", P2J3.reverseVowels(""));
        
        //test 1 char string
        assertEquals("B", P2J3.reverseVowels("B")); //uppercase non-vowel
        assertEquals("b", P2J3.reverseVowels("b")); //lowercase non-vowel
        assertEquals("A", P2J3.reverseVowels("A")); //uppercase vowel
        assertEquals("a", P2J3.reverseVowels("a")); //lowercase vowel
        
        //test string with 1 space 
        assertEquals("b c", P2J3.reverseVowels("b c")); //uppercase non-vowel
        assertEquals("b C", P2J3.reverseVowels("b C")); //lowercase non-vowel
        assertEquals("a b", P2J3.reverseVowels("a b")); //uppercase non-vowel + vowel
        assertEquals("A b", P2J3.reverseVowels("A b")); //lowercase non-vowel
        
        //test 2 vowels
        assertEquals("a e", P2J3.reverseVowels("e a")); //uppercase non-vowel + vowel
        assertEquals("A e", P2J3.reverseVowels("E a")); //lowercase non-vowel
        
        //test complex combinations
        assertEquals("cempetir sceunco", P2J3.reverseVowels("computer science"));
        assertEquals("Ulkka Markis", P2J3.reverseVowels("Ilkka Markus"));
        assertEquals("REVORSE VEWELS", P2J3.reverseVowels("REVERSE VOWELS"));
        assertEquals("Hullo Ieaoe", P2J3.reverseVowels("Hello Aeiou"));
        assertEquals("Prugrimming as Fon!", P2J3.reverseVowels("Programming is Fun!"));
        assertEquals("AEIOU uoiea", P2J3.reverseVowels("AEIOU uoiea"));
        assertEquals("HoLlO WeRlD!", P2J3.reverseVowels("HeLlO WoRlD!"));
        assertEquals("J e v i V a r t a u l M i c h a n a", P2J3.reverseVowels("J a v a V i r t u a l M a c h i n e"));
        assertEquals("AEIOU helle OEUOI hella thore UOIEA!!!", P2J3.reverseVowels("AEIOU hello AEIOU hello there UOIEA!!!"));
    }
}
