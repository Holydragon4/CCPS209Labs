import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.util.*;
public class TestEveryOtherCzerniawski
{
    @Test public void testEveryOtherCzerniawski(){
       
      // Test for ZERO ELEMENT ARRAY  scenario
      int[] intArr1 = {};
      int[] result = P2J1.everyOther(intArr1);
      int[] intArr1Output = {};
      String x1 = Arrays.toString(intArr1Output);
      String y1 = Arrays.toString(result);
      assertEquals(x1,y1);
      
      // Test for SINGLE ELEMENT array scenario
      
      int[] intArr2 = {25};
      int[] result2 = P2J1.everyOther(intArr2);
      int[] intArr2Output = {25};
      String x2 = Arrays.toString(intArr2Output);
      String y2 = Arrays.toString(result2);
      assertEquals(x2,y2);     
        
      int[] intArr3 = {-25};
      int[] result3 = P2J1.everyOther(intArr3);
      int[] intArr3Output = {-25};
      String x3 = Arrays.toString(intArr3Output);
      String y3 = Arrays.toString(result3);
      assertEquals(x3,y3);    
      
      // Test for TWO ELEMENT array scenario
      
      int[] intArr4 = {-25,72};
      int[] result4 = P2J1.everyOther(intArr4);
      int[] intArr4Output = {-25};
      String x4 = Arrays.toString(intArr4Output);
      String y4 = Arrays.toString(result4);
      assertEquals(x4,y4);
      
      int[] intArr5 = {25,-72};
      int[] result5 = P2J1.everyOther(intArr5);
      int[] intArr5Output = {25};
      String x5 = Arrays.toString(intArr5Output);
      String y5 = Arrays.toString(result5);
      assertEquals(x5,y5);
      
      int[] intArr6 = {-34525,3534534};
      int[] result6 = P2J1.everyOther(intArr6);
      int[] intArr6Output = {-34525};
      String x6 = Arrays.toString(intArr6Output);
      String y6 = Arrays.toString(result6);
      assertEquals(x6,y6);      
      
      int[] intArr7 = {-99999,-99999};
      int[] result7 = P2J1.everyOther(intArr7);
      int[] intArr7Output = {-99999};
      String x7 = Arrays.toString(intArr7Output);
      String y7 = Arrays.toString(result7);
      assertEquals(x7,y7);      
      
      int[] intArr8 = {-99999,-998899,-99999};
      int[] result8 = P2J1.everyOther(intArr8);
      int[] intArr8Output = {-99999,-99999};
      String x8 = Arrays.toString(intArr8Output);
      String y8 = Arrays.toString(result8);
      assertEquals(x8,y8);
      
      int[] intArr9 = {1, 11, 111, 1111, 11111, 111111,1111111};
      int[] result9 = P2J1.everyOther(intArr9);
      int[] intArr9Output = {1,111,11111,1111111};
      String x9 = Arrays.toString(intArr9Output);
      String y9 = Arrays.toString(result9);
      assertEquals(x9,y9); 
      
      int[] intArr10 = {-123,456,789};
      int[] result10 = P2J1.everyOther(intArr10);
      int[] intArr10Output = {-123,789};
      String x10 = Arrays.toString(intArr10Output);
      String y10 = Arrays.toString(result10);
      assertEquals(x10,y10); 
      
      int[] intArr11 = {987,-654,-321,654,-987};
      int[] result11 = P2J1.everyOther(intArr11);
      int[] intArr11Output = {987, -321, -987};
      String x11 = Arrays.toString(intArr11Output);
      String y11 = Arrays.toString(result11);
      assertEquals(x11,y11); 
      
      int[] intArr12 = {79303,62271,92244,72381,95117,39962,63416};
      int[] result12 = P2J1.everyOther(intArr12);
      int[] intArr12Output = {79303, 92244, 95117, 63416};
      String x12 = Arrays.toString(intArr12Output);
      String y12 = Arrays.toString(result12);
      assertEquals(x12,y12); 

      int[] intArr13 = {-93520,57481,-94587,56935,-23175,36117,80196,-77901,25200,-24370,40927,-72703,-1896};
      int[] result13 = P2J1.everyOther(intArr13);
      int[] intArr13Output = {-93520, -94587, -23175, 80196, 25200, 40927, -1896};
      String x13 = Arrays.toString(intArr13Output);
      String y13 = Arrays.toString(result13);
      assertEquals(x13,y13);
      
      int[] intArr14 = {-53241,-67688,-38485,-90695,-73307};
      int[] result14 = P2J1.everyOther(intArr14);
      int[] intArr14Output = {-53241, -38485, -73307};
      String x14 = Arrays.toString(intArr14Output);
      String y14 = Arrays.toString(result14);
      assertEquals(x14,y14);
      
      int[] intArr15 = {(-128+33290-98561*30059),(9811-13648-3825-75959*30828),(57596+1128-45281*23827-49535)};
      int[] result15 = P2J1.everyOther(intArr15);
      int[] intArr15Output = {1332355359, -1078901198};
      String x15 = Arrays.toString(intArr15Output);
      String y15 = Arrays.toString(result15);
      assertEquals(x15,y15);
      
      int[] intArr16 = {73146,61139,62578,80464,-81692,5014,91405,-68219,47263,86846,47670,-52881,
                         42050,26227,86780,56228,-19472,14396,77187,57671,76147,-24384,95876,56592,45481,41459,-20504,3043};
      int[] result16 = P2J1.everyOther(intArr16);
      int[] intArr16Output = {73146, 62578, -81692, 91405, 47263, 47670, 42050, 86780, 
                                -19472, 77187, 76147, 95876, 45481, -20504};
      String x16 = Arrays.toString(intArr16Output);
      String y16 = Arrays.toString(result16);
      assertEquals(x16,y16);
      
      int[] intArr17 = {-80547,11970,38458,-461,70885,37072,-5223,82746,-50718,59891,92102};
      int[] result17 = P2J1.everyOther(intArr17);
      int[] intArr17Output = {-80547, 38458, 70885, -5223, -50718, 92102};
      String x17 = Arrays.toString(intArr17Output);
      String y17 = Arrays.toString(result17);
      assertEquals(x17,y17);
      
      int[] intArr18 = {22077,61360,20322,22178,76131,87734,74074,76741+5,
                        -571,63348,25848,55070,22642,27156,80265,60793,36135,98401,-18838,78900,26087,57100,95938,67835};
      int[] result18 = P2J1.everyOther(intArr18);
      int[] intArr18Output = {22077, 20322, 76131, 74074, -571, 25848, 22642, 80265, 36135, -18838, 26087, 95938};
      String x18 = Arrays.toString(intArr18Output);
      String y18 = Arrays.toString(result18);
      assertEquals(x18,y18);
      
      int[] intArr19 = {-94728,96471,(92667+123),1752,23124,(60196-99983),40166,(21811*3),40753,10669,35349,61989};
      int[] result19 = P2J1.everyOther(intArr19);
      int[] intArr19Output = {-94728, 92790, 23124, 40166, 40753, 35349};
      String x19 = Arrays.toString(intArr19Output);
      String y19 = Arrays.toString(result19);
      assertEquals(x19,y19);
      
      int[] intArr20 = {(72546+77347-16297+97277-16792+22475-8611-62749+42382-42949+41438-32059+73163-25079+65716-87616+67568)};
      int[] result20 = P2J1.everyOther(intArr20);
      int[] intArr20Output = {267760};
      String x20 = Arrays.toString(intArr20Output);
      String y20 = Arrays.toString(result20);
      assertEquals(x20,y20);  
  }
}
