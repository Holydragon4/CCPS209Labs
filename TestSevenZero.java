

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

/**
 * The test class TestSevenZero.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestSevenZero
{
    @Test
    public void TestSevenZero(){
        int num1 = 1;
        BigInteger result1 = P2J5.sevenZero(num1);
        BigInteger test1 = new BigInteger(7+"");
        assertEquals(test1,result1);

        int num2 = 7;
        BigInteger result2 = P2J5.sevenZero(num2);
        BigInteger test2 = new BigInteger(7+"");
        assertEquals(test2,result2);

        int num3 = 12;
        BigInteger result3 = P2J5.sevenZero(num3);
        BigInteger test3 = new BigInteger(77700+"");
        assertEquals(test3,result3);

        int num4 = 17;
        BigInteger result4 = P2J5.sevenZero(num4);
        BigInteger test4 = new BigInteger("7777777777777777");
        assertEquals(test4,result4);

        int num5 = 60;
        BigInteger result5 = P2J5.sevenZero(num5);
        BigInteger test5 = new BigInteger("77700");
        assertEquals(test5,result5);

        int num6 = 69;
        BigInteger result6 = P2J5.sevenZero(num6);
        BigInteger test6 = new BigInteger("777777777777777777777777777777777777777777777777777777777777777777");
        assertEquals(test6,result6);

        int num7 = 324;
        BigInteger result7 = P2J5.sevenZero(num7);
        BigInteger test7 = new BigInteger("77777777777777777777777777777777777777777777777777777777777777777777777777777777700");
        assertEquals(test7,result7);

        int num8 = 666;
        BigInteger result8 = P2J5.sevenZero(num8);
        BigInteger test8 = new BigInteger("7777777770");
        assertEquals(test8,result8);

        int num9 = 2134;
        BigInteger result9 = P2J5.sevenZero(num9);
        BigInteger test9 = new BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777770");
        assertEquals(test9,result9);

        int num10 = 990;
        BigInteger result10 = P2J5.sevenZero(num10);
        BigInteger test10 = new BigInteger("7777777777777777770");
        assertEquals(test10,result10);

        int num11 = 145;
        BigInteger result11 = P2J5.sevenZero(num11);
        BigInteger test11 = new BigInteger("77777777777777777777777777770");
        assertEquals(test11,result11);

        int num12 = 147;
        BigInteger result12 = P2J5.sevenZero(num12);
        BigInteger test12 = new BigInteger("777777");
        assertEquals(test12,result12);

        int num13 = 2100;
        BigInteger result13 = P2J5.sevenZero(num13);
        BigInteger test13 = new BigInteger("77700");
        assertEquals(test13,result13);

        int num14 = 2101;
        BigInteger result14 = P2J5.sevenZero(num14);
        BigInteger test14 = new BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        assertEquals(test14,result14);

        int num15= 300000;
        BigInteger result15 = P2J5.sevenZero(num15);
        BigInteger test15 = new BigInteger("77700000");
        assertEquals(test15,result15);

        int num16= 1865255;
        BigInteger result16 = P2J5.sevenZero(num16);
        BigInteger test16 = new BigInteger("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777770");
        assertEquals(test16,result16);

        int num17= 100000000;
        BigInteger result17 = P2J5.sevenZero(num17);
        BigInteger test17 = new BigInteger("700000000");
        assertEquals(test17,result17);

        int num18= 785;
        BigInteger result18 = P2J5.sevenZero(num18);
        BigInteger test18 = new BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777770");
        assertEquals(test18,result18);

        int num19= 2574;
        BigInteger result19 = P2J5.sevenZero(num19);
        BigInteger test19 = new BigInteger("7777777777777777770");
        assertEquals(test19,result19);

        int num20= 88888;
        BigInteger result20 = P2J5.sevenZero(num20);
        BigInteger test20 = new BigInteger("77777000");
        assertEquals(test20,result20);

    }
}
