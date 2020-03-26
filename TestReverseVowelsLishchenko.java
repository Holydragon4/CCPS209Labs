//@author Andrew Lishchenko 500815035

import static org.junit.Assert.*;
import org.junit.Test;

public class TestReverseVowelsLishchenko
{
    @Test public void reverseVowels(){
        
        //Empty Case and Single Character
        assertEquals("",P2J3.reverseVowels(""));
        assertEquals("a",P2J3.reverseVowels("a"));
        assertEquals("E",P2J3.reverseVowels("E"));
        assertEquals("-",P2J3.reverseVowels("-"));
        assertEquals("7",P2J3.reverseVowels("7"));
        assertEquals(" ",P2J3.reverseVowels(" "));
        
        assertEquals("uoiea",P2J3.reverseVowels("aeiou"));
        assertEquals("U O I E A",P2J3.reverseVowels("A E I O U"));
        assertEquals("AeIoUuOiEa",P2J3.reverseVowels("AeIoUuOiEa"));
        assertEquals("Cempetir Sceunco",P2J3.reverseVowels("Computer Science"));
        assertEquals("Ulkka Markis",P2J3.reverseVowels("Ilkka Markus"));
        
        assertEquals("wthtnlycnsnts",P2J3.reverseVowels("wthtnlycnsnts"));
        assertEquals("sdfghjklAlkjhgfds",P2J3.reverseVowels("sdfghjklAlkjhgfds"));
        assertEquals("ChimEceL IngEnaIrenG",P2J3.reverseVowels("ChemIcaL EngIneErinG"));
        assertEquals("ryiRsenInuvorsetY",P2J3.reverseVowels("ryeRsonUniversitY"));
        assertEquals("thars!ut@6&pm$",P2J3.reverseVowels("thurs!at@6&pm$"));
        
        assertEquals("shokeru@SAPIRBAWL",P2J3.reverseVowels("shakira@SUPERBOWL"));
        assertEquals("ballytalantWONTcemo TO cenadi",P2J3.reverseVowels("billytalentWONTcome TO canada"));
        assertEquals("MotollicaisAnlyEK",P2J3.reverseVowels("MetallicaisOnlyOK"));
        assertEquals("caming ep wath eximplus is hord",P2J3.reverseVowels("coming up with examples is hard"));
        assertEquals("thus shoeld be unoigh",P2J3.reverseVowels("this should be enough"));
    }
}
