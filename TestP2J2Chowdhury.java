import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.util.*;

public class TestP2J2Chowdhury {
    
    @Test public void testRemoveDuplicates() {
        String unique = "ComppuuteerrSScccciiennccee";
        String howans = P2J2.removeDuplicates(unique);
        String ans = "ComputerScience";
        assertEquals(ans, howans);
        
        String unique2 = "jjjjjjjAAAAVVVVVaaaaaaaa";
        String howans2 = P2J2.removeDuplicates(unique2);
        String ans2 = "jAVa";
        assertEquals(ans2, howans2);
        
        String unique3 = "bbbbbiiiiinnnaaaarrrrryyyy";
        String howans3 = P2J2.removeDuplicates(unique3);
        String ans3 = "binary";
        assertEquals(ans3, howans3);
        
        String unique4 = "QQQuuaaaarraanttttinnnnnneee";
        String howans4 = P2J2.removeDuplicates(unique4);
        String ans4 = "Quarantine";
        assertEquals(ans4, howans4);
        
        String unique5 = "Maammmmbbbbaaa MMMMennntaaalllllity";
        String howans5 = P2J2.removeDuplicates(unique5);
        String ans5 = "Mamba Mentality";
        assertEquals(ans5, howans5);
        
        String unique6 = "CCCCCoooorrrronaaaavvvirrrrusss";
        String howans6 = P2J2.removeDuplicates(unique6);
        String ans6 = "Coronavirus";
        assertEquals(ans6, howans6);
        
        String unique7 = "uNNNNiTTTeeeDDD StAAAAAttteesssss OOOOOOOfffff AAAAAMerIIICCCCAAAAA";
        String howans7 = P2J2.removeDuplicates(unique7);
        String ans7 = "uNiTeD StAtes Of AMerICA";
        assertEquals(ans7, howans7);
        
        String unique8 = "WWWOOOOrrrrllllllDDD HHHEEEAAALtttthhh OOOORGGGannniiiiiizzzatiiiiionnnn";
        String howans8 = P2J2.removeDuplicates(unique8);
        String ans8 = "WOrlD HEALth ORGanization";
        assertEquals(ans8, howans8);
        
        String unique9 = "DDIIIsssssEEEEAAASSSEEEE";
        String howans9 = P2J2.removeDuplicates(unique9);
        String ans9 = "DIsEASE";
        assertEquals(ans9, howans9);
        
        String unique10 = "shhharrrkkkktaaaankkkkkk";
        String howans10 = P2J2.removeDuplicates(unique10);
        String ans10 = "sharktank";
        assertEquals(ans10, howans10);
        
        String unique11 = "EXXXXCCCCCITTTTTEMENT     SAAAADNNNNESS     CONNNNTENNNNTT";
        String howans11 = P2J2.removeDuplicates(unique11);
        String ans11 = "EXCITEMENT SADNES CONTENT";
        assertEquals(ans11, howans11);
        
        String unique12 = "San----------------Francisco";
        String howans12 = P2J2.removeDuplicates(unique12);
        String ans12 = "San-Francisco";
        assertEquals(ans12, howans12);
        
        String unique13 = "Rome,,,,,,London,,,,,,,Washington,,,Rio";
        String howans13 = P2J2.removeDuplicates(unique13);
        String ans13 = "Rome,London,Washington,Rio";
        assertEquals(ans13, howans13);
        
        String unique14 = "Curry::::Durant::::Lebron::Kobe";
        String howans14 = P2J2.removeDuplicates(unique14);
        String ans14 = "Cury:Durant:Lebron:Kobe";
        assertEquals(ans14, howans14);
        
        String unique15 = "CHHHHEEESSSSEEE  and  CRACKKKERRRSSS";
        String howans15 = P2J2.removeDuplicates(unique15);
        String ans15 = "CHESE and CRACKERS";
        assertEquals(ans15, howans15);
        
        String unique16 = "ONLINE CLASSROOM ON ZOOM,,,,,   Google,,,, SKKypppeee......";
        String howans16 = P2J2.removeDuplicates(unique16);
        String ans16 = "ONLINE CLASROM ON ZOM, Gogle, SKype.";
        assertEquals(ans16, howans16);
        
        String unique17 = "O'ahu::: Kaaawa--Hauula-Punaluu";
        String howans17 = P2J2.removeDuplicates(unique17);
        String ans17 = "O'ahu: Kawa-Haula-Punalu";
        assertEquals(ans17, howans17);
        
        String unique18 = "north^^^^EASTT>>>west<<SOUTH";
        String howans18 = P2J2.removeDuplicates(unique18);
        String ans18 = "north^EAST>west<SOUTH";
        assertEquals(ans18, howans18);
        
        String unique19 = "{{##Twitter   ###Instagram       ##Slack}";
        String howans19 = P2J2.removeDuplicates(unique19);
        String ans19 = "{#Twiter #Instagram #Slack}";
        assertEquals(ans19, howans19);
        
        String unique20 = "7 wonders offf the worrrldd:::::    Pyramid,, Colossus,, Statue...";
        String howans20 = P2J2.removeDuplicates(unique20);
        String ans20 = "7 wonders of the world: Pyramid, Colosus, Statue.";
        assertEquals(ans20, howans20);
        
    }
    
    
    @Test public void testUniqueCharacters() {
        String unique = "Compppppsscccccciiiiiiennnnnccccceeeeee";
        String howans = P2J2.uniqueCharacters(unique);
        String ans = "Compscien";
        assertEquals(ans, howans);
        
        String unique2 = "bbbbaaaannnnnaaaa";
        String howans2 = P2J2.uniqueCharacters(unique2);
        String ans2 = "ban";
        assertEquals(ans2, howans2);
        
        String unique3 = "boooolean";
        String howans3 = P2J2.uniqueCharacters(unique3);
        String ans3 = "bolean";
        assertEquals(ans3, howans3);
        
        String unique4 = "maarrKKuuup";
        String howans4 = P2J2.uniqueCharacters(unique4);
        String ans4 = "marKup";
        assertEquals(ans4, howans4);
        
        String unique5 = "Looplooploop";
        String howans5 = P2J2.uniqueCharacters(unique5);
        String ans5 = "Lopl";
        assertEquals(ans5, howans5);
        
        String unique6 = "Looking to develop my skills";
        String howans6 = P2J2.uniqueCharacters(unique6);
        String ans6 = "Loking tdevlpmys";
        assertEquals(ans6, howans6);
        
        String unique7 = "uniQue pEopLeChaRaCters";
        String howans7 = P2J2.uniqueCharacters(unique7);
        String ans7 = "uniQe pEoLChaRtrs";
        assertEquals(ans7, howans7);
        
        String unique8 = "RabbItandturtle";
        String howans8 = P2J2.uniqueCharacters(unique8);
        String ans8 = "RabItndurle";
        assertEquals(ans8, howans8);
        
        String unique9 = "artstormandthunder";
        String howans9 = P2J2.uniqueCharacters(unique9);
        String ans9 = "artsomndhue";
        assertEquals(ans9, howans9);
        
        String unique10 = "entertainer";
        String howans10 = P2J2.uniqueCharacters(unique10);
        String ans10 = "entrai";
        assertEquals(ans10, howans10);
        
        String unique11 = "bubblebath";
        String howans11 = P2J2.uniqueCharacters(unique11);
        String ans11 = "buleath";
        assertEquals(ans11, howans11);
        
        String unique12 = "LiNeAr AlgebrA VerUs cAlculus";
        String howans12 = P2J2.uniqueCharacters(unique12);
        String ans12 = "LiNeAr lgbVUscu";
        assertEquals(ans12, howans12);
        
        String unique13 = "uOttawa-Ryerson-Ottawa-Toronto";
        String howans13 = P2J2.uniqueCharacters(unique13);
        String ans13 = "uOtaw-RyersonT";
        assertEquals(ans13, howans13);
        
        String unique14 = "Lightweight, Heavyweight, Flyweight, Welterweight";
        String howans14 = P2J2.uniqueCharacters(unique14);
        String ans14 = "Lightwe, HavyFlWr";
        assertEquals(ans14, howans14);
        
        String unique15 = "HelloWorldfromtheOtherSide";
        String howans15 = P2J2.uniqueCharacters(unique15);
        String ans15 = "HeloWrdfmthOSi";
        assertEquals(ans15, howans15);
        
        String unique16 = "ten plus seventeen equals?";
        String howans16 = P2J2.uniqueCharacters(unique16);
        String ans16 = "ten plusvqa?";
        assertEquals(ans16, howans16);
        
        String unique17 = "CoronaVirus has Created many problems";
        String howans17 = P2J2.uniqueCharacters(unique17);
        String ans17 = "CornaVius hetdmypbl";
        assertEquals(ans17, howans17);
        
        String unique18 = "JanuaryJuneDecember";
        String howans18 = P2J2.uniqueCharacters(unique18);
        String ans18 = "JanuryeDcmb";
        assertEquals(ans18, howans18);
        
        String unique19 = "FacebookAmazonAppleMicrosoft";
        String howans19 = P2J2.uniqueCharacters(unique19);
        String ans19 = "FacebokAmznplMirsft";
        assertEquals(ans, howans);
        
        String unique20 = "Lakers-Bucks chasing-after Raptors";
        String howans20 = P2J2.uniqueCharacters(unique20);
        String ans20 = "Lakers-Buc hingftRpo";
        assertEquals(ans20, howans20);
    }
}

    