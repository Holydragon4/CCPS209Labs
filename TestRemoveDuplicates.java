// Authored by Edward Lee

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.util.*;

import java.util.Random;


public class TestRemoveDuplicates

{

    //*************************************************************************************

    //************************Tests for pancakeScramble************************************

    //*************************************************************************************

    

    /*  Test cases include:
     * 
     *  1.  Empty String
     *  2.  Single character String
     *  3.  Two unique character String
     *  4.  Two identical character String
     *  5.  Repeated and consecutive characters
     *  6.  Several alphabet letters, all repeating
     *  7.  Repeated characters, none consecutive
     *  8.  Alternating capital and lower case, non-consecutive
     *  9.  Numbers
     *  10. Miscellaenous characters
     *  11. Repeating, consecutive capital letters
     *  12. Repeating, consecutive lower case letters
     *  13. All unique characters
     *  14. Non-English characters
     *  15. Italic characters
     *  16. Letters with spaces
     *  17. Only spaces
     *  18. Identical characters and one unique
     *  19. Random Single Unicode characters
     *  20. Single white space
     */

    // #1
    /** covers testCase.length() = 0; 
     *  <p>This is an empty String with no chars
     *  <p>Attempting to iterate over an empty String will yield an exception
     */

    @Test public void emptyString() {

        String testCase = "";

        assertEquals("", P2J2.removeDuplicates(testCase));

    }

    // #2

    /** covers testCase.length() = 1,
     *  <p>This is a String with only one item
     *  <p>Attempting to iterate past the 0th index will yield an exception
     */
    @Test public void singleItem() {

        String testCase = "a";

        assertEquals("a", P2J2.removeDuplicates(testCase));

    }

    // #3

    /** covers testCase.length() = 2,
     *  <p>This is a String with only unique two items
     *  <p>The string should remain the same
     */
    @Test public void twoUnique() {
        
        String testCase = "ab";

        assertEquals("ab", P2J2.removeDuplicates(testCase));
    }

    // #4

    /** covers testCase.length() = 2,
     *  <p>This is a list with exactly two identical characters
     */

    @Test public void twoIdentical() {
        
        String testCase = "aa";

        assertEquals("a", P2J2.removeDuplicates(testCase));
    }
    
    // #5
    /** covers cases of very long strings (length of 1,000),
     *  <p>This is a String of 1000 letters arbitrarily chosen from the English alphabet
     */

    @Test public void veryLong() {
        
        String testCase = "vdnrxujcbkupntvinmpygciyyvcwofwvwqvrbhvqapyhrbkbpkyeqlfattdaoxkliqfibxqfooqqsoshgbqrwtukxfpdcehvejqbfqnmtdaalktlmnpqpyvfmnwqeysmedbkymuiqnsmaaoawjhnqivokdygiiccfpayukngnpqernkrrtisidgvcepjryosxktgfsdjvvccdjkewhhnvgxdiocofabweviqwqljjtyqevqeqvvxwicmythwrdiohnqlanqjelbqjslwytbrdafuokmqgnafhgaphrmbouinuevpgecxbbiiadbvkeuqcwsofelmmimhrndietnnabpgikhwxxpjeqxbrmeevhgekivaidoduosagmwdgvywdefbahxgttdjisvcjneyfmjjhqdblwiwjlgkkcqkicwxjguocivxlqixmckvbrarduxikbmlobllprclnfdyiatelpjlqbwlfgywfyowwhjhlydevkqcevsbkutkiplcsegebyuhjiilelgsurianervobtkpqlgldlxilfhramewdawaciwmwubhdxdnpahcbprtmxyftsowequatbxsjfqtojysouyledputaugrlupqabtnonxrcfjdfcfhrlunsvqqktbfdygijudhxkmwwiavifvcnfpoqpifpavqpggvqsgsmqbkywqrhomhstblfayjinieosnkwnbhctxdcsmbqxsdxxabsiwuuevhbemuvlkjtwlwehhubvsdbxkukjsnyasalthqbmmmfpsasmidmkknxkwmltjpahtbwvjucieogpmmbgrlnkhrrfdcfoyvvhbmahmpcuvlpidelyemgxeuwyirfpfeeqqodgfjhcftornmlrvsayhlsathywtaajwdupcdubhewyexbyidtjusgxhfnifmmqthskoebaxopjntjxurxuwiwcmpssmcxarrxyftinjeeinsjvjlfdbpowaupklyns";
        String result = "vdnrxujcbkupntvinmpygciyvcwofwvwqvrbhvqapyhrbkbpkyeqlfatdaoxkliqfibxqfoqsoshgbqrwtukxfpdcehvejqbfqnmtdalktlmnpqpyvfmnwqeysmedbkymuiqnsmaoawjhnqivokdygicfpayukngnpqernkrtisidgvcepjryosxktgfsdjvcdjkewhnvgxdiocofabweviqwqljtyqevqeqvxwicmythwrdiohnqlanqjelbqjslwytbrdafuokmqgnafhgaphrmbouinuevpgecxbiadbvkeuqcwsofelmimhrndietnabpgikhwxpjeqxbrmevhgekivaidoduosagmwdgvywdefbahxgtdjisvcjneyfmjhqdblwiwjlgkcqkicwxjguocivxlqixmckvbrarduxikbmloblprclnfdyiatelpjlqbwlfgywfyowhjhlydevkqcevsbkutkiplcsegebyuhjilelgsurianervobtkpqlgldlxilfhramewdawaciwmwubhdxdnpahcbprtmxyftsowequatbxsjfqtojysouyledputaugrlupqabtnonxrcfjdfcfhrlunsvqktbfdygijudhxkmwiavifvcnfpoqpifpavqpgvqsgsmqbkywqrhomhstblfayjinieosnkwnbhctxdcsmbqxsdxabsiwuevhbemuvlkjtwlwehubvsdbxkukjsnyasalthqbmfpsasmidmknxkwmltjpahtbwvjucieogpmbgrlnkhrfdcfoyvhbmahmpcuvlpidelyemgxeuwyirfpfeqodgfjhcftornmlrvsayhlsathywtajwdupcdubhewyexbyidtjusgxhfnifmqthskoebaxopjntjxurxuwiwcmpsmcxarxyftinjeinsjvjlfdbpowaupklyns";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }

    // #6

    /** covers cases of repeating letters,
     *  <p>This is a String of several letters, all of which are consecutive
     */

    @Test public void testIdentical() {

        String testCase = "aaaabbbbbbbbbbbccdeeeeeeeeeeeeeeeeeeeee";
        String result = "abcde";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #7
    
    /** covers cases of Strings with repeating but non-consecutive letters
     *  <p>This is a String of several letters that repeat, but are seperated by eachother
     */

    @Test public void testRepeating() {

        String testCase = "abababacbac";
        String result = "abababacbac";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #8
    
    /** covers cases of alternating capital and lower case letters,
     *  <p>This is a String of 10 characters
     */

    @Test public void testAlternating() {

        String testCase = "AaAaAaAaAa";
        String result = "AaAaAaAaAa";
        assertEquals(result, P2J2.removeDuplicates(testCase));
    }
    
    // #9
    
    /** covers cases of Strings with numbers
     *  <p>This is a String of 10 numbers
     */

    @Test public void testNumbers() {

        String testCase = "1121233345";
        String result = "1212345";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #10
    
    /** covers cases of lists with all miscellaneous characters
     *  <p>This is a String of 20 miscellaneous characters
     */

    @Test public void testMisc() {

        String testCase = "#$%++-*&^%()^))!!&1!";
        String result = "#$%+-*&^%()^)!&1!";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #11
    
    /** covers cases of Strings with all capital letters, consecutive
     *  <p>This is a list of 10 "A"'s, all capital case
     */

    @Test public void testCapital() {

        String testCase = "AAAAAAAAAA";
        String result = "A";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #12
    
     /** covers cases of Strings with all lower case letters, consecutive
     *  <p>This is a String of 10 "a"'s, all lower case
     */

    @Test public void testLower() {

        String testCase = "aaaaaaaaaa";
        String result = "a";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    // #13
    
     /** covers cases of Strings with only unique characters
     *  <p>This is a String of all unique characters
     */

    @Test public void testUnique() {

        String testCase = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        String result = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #14
    
     /** covers cases of Strings with non-English characters
     *  <p>This is a String with characters from Traditional Chinese, the Latin Alphabet and Cyrillic scripts
     *  <p>The algorithm should cover all characters in a general scope, agnostic to any localized keyboard
     */

    @Test public void testNonLocal() {

        String testCase = "ääööüüßß中中國國ÆÆØØÅÅййфф";
        String result = "äöüß中國ÆØÅйф";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #15
    
     /** covers cases of Strings with italic and ordinary characters
      * <p>The algorithm should distinguish ordinary and italicized letters
      */
    @Test public void testItalics() {

        String testCase = "a𝑎";
        String result = "a𝑎";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #16
    
     /** covers cases of Strings of characters mixed with spaces
     *  <p>The algorithm should be general enough to treat spaces as characters as well. 
     *  <p>The last character is a space. 
     */ 
    @Test public void testLetterSpace() {

        String testCase = "a a a a a a ";
        String result = "a a a a a a?";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #17
    
     /** covers cases of Strings with only spaces
     *  <p>This is a String of 10 characters, consisting only of white spaces
     */

    @Test public void testSpace() {

        String testCase = "          ";
        String result = " ";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #18
    
     /** covers cases of Strings with all identical characters, with one unique character mixed in
     */

    @Test public void testOneUnique() {

        String testCase = "aaaabaaa";
        String result = "aba";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
    // #19
    
     /** covers cases of any single Unicode character
     *  <p>Generate 1000 cases of Strings with a single Unicode character
     */

    @Test public void testUnicode() {

        Random random = new Random();

        for(int i=0; i<1000; i++){
            String testCase = "" + (char) random.nextInt(65535); 
            assertEquals(testCase, P2J2.removeDuplicates(testCase));

        }

    }
    
    // #20
    
     /** covers cases of Strings with a single space
     *  <p>This is a String with a single space
     */

    @Test public void testDescendAscend() {

        String testCase = " ";
        String result = " ";
        assertEquals(result, P2J2.removeDuplicates(testCase));

    }
    
}