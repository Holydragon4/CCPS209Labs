import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.util.*;

public class TestReverseVowelsKonova { 
    
      @Test public void testReverseVowelsKonova(){
      
      String str = "Binary Number";
      String result = P2J3.reverseVowels(str);
      String realVal = "Benury Nambir";
      assertEquals(realVal, result);

      String str1 = "Esperanto: the International Language";
      String result1 = P2J3.reverseVowels(str1);
      String realVal1 = "Esparunta: tha Ontirnateinel Longaege";
      assertEquals(realVal1, result1);

      String str2 = "Artificial intelligence";
      String result2 = P2J3.reverseVowels(str2);
      String realVal2 = "Erteficeil antilliginca";
      assertEquals(realVal2, result2);

      String str3 = "Machine Learning And Deep Learning";
      String result3 = P2J3.reverseVowels(str3);
      String realVal3 = "Michane Leernang Ind Daep Leirnang";
      assertEquals(realVal3, result3);

      String str4 = "Business Process Automation";
      String result4 = P2J3.reverseVowels(str4);
      String realVal4 = "Bosinass Procuss Aetometiun";
      assertEquals(realVal4, result4);

      String str5 = "SoFtWaRe EnGiNeErInG";
      String result5 = P2J3.reverseVowels(str5);
      String realVal5 = "SiFtWeRe InGeNeArOnG";
      assertEquals(realVal5, result5);

      String str6 = "A full Moon is nine times as bright as a half moon";
      String result6 = P2J3.reverseVowels(str6);
      String realVal6 = "O foll Maan as nina temis es bright is o holf muan";
      assertEquals(realVal6, result6);

      String str7 = "nuclear fusion and nuclear fission";
      String result7 = P2J3.reverseVowels(str7);
      String realVal7 = "nocliir faseun and nocliur fasseun";
      assertEquals(realVal7, result7);

      String str8 = "astronomical units";
      String result8 = P2J3.reverseVowels(str8);
      String realVal8 = "istrunamicol onats";
      assertEquals(realVal8, result8);

      String str9 = "The Central Processing Unit";
      String result9 = P2J3.reverseVowels(str9);
      String realVal9 = "Thi Cuntril Precossang Enet";
      assertEquals(realVal9, result9);

       String str10 = "Abstract data type";
      String result10 = P2J3.reverseVowels(str10);
      String realVal10 = "Ebstract data typa";
      assertEquals(realVal10, result10);

      String str11 = "application programming interface";
      String result11 = P2J3.reverseVowels(str11);
      String realVal11 = "epplacetiin pragrommong intarfica";
      assertEquals(realVal11, result11);

      String str12 = "boolean algebra";
      String result12 = P2J3.reverseVowels(str12);
      String realVal12 = "baelaan elgobro";
      assertEquals(realVal12, result12);

       String str13 = "wAr is peAce, freedom is slAvery, ignorAnce is strength";
      String result13 = P2J3.reverseVowels(str13);
      String realVal13 = "wEr is peAco, friedam is slOvery, egnerAnce is strangth";
      assertEquals(realVal13, result13);

      String str14 = "fault-tolerant computer system";
      String result14 = P2J3.reverseVowels(str14);
      String realVal14 = "feelt-tulorant cempotur systam";
      assertEquals(realVal14, result14);

       String str15 = "I AGREE TO THE TERMS AND CONDITIONS";
      String result15 = P2J3.reverseVowels(str15);
      String realVal15 = "O IGRIO TA THE TERMS OND CENDETAINS";
      assertEquals(realVal15, result15);

       String str16 = "Pluto is a dwarf planet";
      String result16 = P2J3.reverseVowels(str16);
      String realVal16 = "Pleta as a dwirf plonut";
      assertEquals(realVal16, result16);

      String str17 = "EurOpa is the smallest Of Jupiter's Galilean mOOns";
      String result17 = P2J3.reverseVowels(str17);
      String realVal17 = "OorApe is tha smellist Uf Jopetar's Gelilaon mUEns";
      assertEquals(realVal17, result17);

      String str18 = "REVERSE ENGINEERING";
      String result18 = P2J3.reverseVowels(str18);
      String realVal18 = "RIVERSE INGENEERENG";
      assertEquals(realVal18, result18);

      String str19 = "seven billion six hundred thousand";
      String result19 = P2J3.reverseVowels(str19);
      String realVal19 = "savun bolleun six hondrid thiesend";
      assertEquals(realVal19, result19);
}}