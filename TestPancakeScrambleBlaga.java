// Authored by Bogdan Blaga, slightly edited by Ilkka Kokkarinen

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.util.*;

import java.util.Random;

 

public class TestPancakeScrambleBlaga

{

    //*************************************************************************************

    //************************Tests for pancakeScramble************************************

    //*************************************************************************************

    

    /*  Test cases include:

     * 

     *  Special cases

     *  1.  null string (same as if not initialized)

     *  2.  Empty/Blank character ("")

     *  3.  Some whitespace

     *  4.  Whitespace only

     *  

     *  Single and multiple characters

     *  5-6.  Only one character:

     *  7.  Some random 1-letter picks from the alphabet

     *  8.  Some random 1-letter picks from the alphabet and 0-9 numbers

     *  9-13.   More Specific examples on Strings of various length > 1

     *  14-17. Specific examples on Strings with special characters, including escape characters

     *  18. Some random 1-letter picks from all supported unicode characters

     *  19. Mass tests for large empty Strings

     *  20. Mass tests for large Strings

     */

 

    // #1

    /** covers String s2 = null; 

     *  <p>This means that (null) or "no value at all" is assigned to s2.

     *  <p>So this one, s2.length() is the same as null.length(),

     *  <p>Running the length() method for either will yield a NullPointerException

     */

    /*
    @Test public void testNull() {

        String testCase = null;

        assertEquals(null, P2J3.pancakeScramble(testCase));

    }
    */
   
    

    // #2

    /** covers test.length() = 0,

     *  <p>start = 0 = text.length(),

     *  <p>text.length()-start = 0

     */

    @Test public void testEmpty() {

        String testCase = "";

        assertEquals("", P2J3.pancakeScramble(testCase));

    }

    

    // #3

    /** covers test.length() > 0,

     *  <p>Any combination of whitespace and non-whitespace characters

     */

    @Test public void testSomeWhitespace() {

        String testCase = "abc def";

        assertEquals("fdcab e", P2J3.pancakeScramble(testCase));

    }

    

    // #4

    /** covers test.length() > 0,

     <p>Only whitespace characters

    */

    @Test public void testOnlyWhitespace() {

        Random rng = new Random();

        

        //try 1000 cases of randomly generated Strings containing only whitespace

        for (int i = 0; i < 1000; i++){

            String testCase = new String(new char[rng.nextInt(100)]).replace("\0", " ");

           String whitespacesResult = P2J3.pancakeScramble(testCase);

            

            //depending how the pancakeScramble method is written, there can be three different (independent) tests

            if(whitespacesResult.length() == 0) {assertEquals("", whitespacesResult);}

            if(whitespacesResult.length() == 1) {assertEquals(" ", whitespacesResult);}

            

            //for example, for optimization, the method can convert Strings containing only whitespaces to " "

            if(whitespacesResult.length() > 1) {assertEquals(testCase, whitespacesResult);}

            

            testCase = null;    //make the object ready to be garbage collected

        }

    }

    

    // #5-6

    /** covers test.length() = 1,

     <p>Specific examples for only one character

    */

    @Test public void testOneChar() {

        String testCase = "a";

        assertEquals("a", P2J3.pancakeScramble(testCase));

        

        String testCase2 = ""+0;

        assertEquals("0", P2J3.pancakeScramble(testCase2));

    }

    

    

    // #7

    /** covers test.length() = 1,

     <p>Some random 1-letter picks from the alphabet

    */

    @Test public void testAlphabet() {

        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

        Random rng = new Random();

        

        //try 100,000 cases of randomly generated 1-letter Strings

        for (int i = 0; i < 100000; i++){

            String testCase = ""+alphabet.charAt(rng.nextInt(51));  //random pick from the alphabet

            assertEquals(testCase, P2J3.pancakeScramble(testCase));

            testCase = null;    //make the object ready to be garbage collected

        }

    }

    

    

    // #8

    /** covers test.length() = 1,

     <p>Some random 1-letter picks from the alphabet and 0-9 numbers

    */

    @Test public void testAlphaNumeric() {

        String alphaNumeric = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";

        Random rng = new Random();

        

        //try 100,000 cases of randomly generated 1-letter Strings

        for (int i = 0; i < 100000; i++){

            String testCase = ""+alphaNumeric.charAt(rng.nextInt(61)); //random alphanumeric pick

            assertEquals(testCase, P2J3.pancakeScramble(testCase));

            testCase = null;    //make the object ready to be garbage collected

        }

    }

    

    // #9-13

    /** covers test.length() > 1,

     <p>More Specific examples on Strings of various length > 1

    */

    @Test public void testRandomAlphaNumeric() {

        String testCase = "a0 ";

        assertEquals(" a0", P2J3.pancakeScramble(testCase));

        

        String testCase2 = "0";

        assertEquals("0", P2J3.pancakeScramble(testCase2));

        

        String testCase3 = "1abC2";

        assertEquals("2b1aC", P2J3.pancakeScramble(testCase3));

        

        String testCase4 = "ab C*/";

        assertEquals("/Cba *", P2J3.pancakeScramble(testCase4));

        

        String testCase5 = "%^aA";

        assertEquals("A^%a", P2J3.pancakeScramble(testCase5));

 

    }

    

    // #14-17

    /** covers test.length() > 1,

     <p>Specific examples on Strings with special characters, including escape characters

    */

    @Test public void testSpecialStrings() {

        String testCase = "\n";

        assertEquals("\n", P2J3.pancakeScramble(testCase));

        

        String testCase2 = "&&";

        assertEquals("&&", P2J3.pancakeScramble(testCase2));

        

        String testCase3 = "!";

        assertEquals("!", P2J3.pancakeScramble(testCase3)); 

        

        String testCase4 = "⛅";

        assertEquals("⛅", P2J3.pancakeScramble(testCase4));

 

    }

    

    // #18

    /** covers test.length() = 1,

     <p>Some random 1-letter picks from all supported unicode characters

    */

    @Test public void testSomeUnicode() {

        Random rng = new Random();

        for(int i=0; i<1000; i++){

            String testCase = "" + (char) rng.nextInt(65535); //randomly generate any one of the supported unicode characters

            assertEquals(testCase, P2J3.pancakeScramble(testCase));

        }

 

    }

    

    

    // #19

    /** covers the uninitialized case 

     <p>Test some 'large' empty Strings, aimed for length at or near the maximum String length which is the size of a 4-byte int (2^31)-1.

    */

   /*
    @Test public void testStringsNull() {

        //First ensure the basic null test passes

        testEmpty();

        

        Random rng = new Random(1);

        for (int i = 0; i < 1000; i++){

            String testCase = new String(new char[rng.nextInt(Integer.MAX_VALUE-8)]); //create an empty string of the largest safe String size

            assertEquals("", P2J3.pancakeScramble(testCase));

            testCase = null;    //make the object ready to be garbage collected

        }

    }
    */
    

    // #20

    /** covers various Strings of a random test.length() less than 2,147,483,648

     <p>Test some Strings, aimed for length near or at the maximum String length which is the size of a 4-byte int (2^31)-1.

    */

    @Test public void testStringsMass() {

        for (int i = 0; i < 10; i++){

            testStrings();  //run some tests for randomly generate alphanumeric Strings

        }

    }

    

    private void testStrings() {

        //local fields -> force garbage collection after each test

        if(true){

            String alphaNumeric = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789 ";

            Random rngChr = new Random();

            StringBuilder strB = new StringBuilder();

            String repeatedChar = "" + alphaNumeric.charAt(rngChr.nextInt(62));

            for (int exponent = 0; exponent < rngChr.nextInt(29)+1; exponent++){
                strB.append(strB+repeatedChar);
            }

            String testCase = strB.toString();

            assertEquals(testCase, P2J3.pancakeScramble(testCase));

        }

    }

    

}