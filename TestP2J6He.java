import java.util.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestP2J6He { 
    
    @Test public void testSumOfDistinctCubesHe(){
      
        //Simple cases
        int nInput0 = 27; //test input
        List<Integer> resActual0 = P2J6.sumOfDistinctCubes(nInput0); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected0 = Arrays.asList(3); //expected result
        assertEquals(resExpected0, resActual0);
      
        int nInput1 = 28; //test input
        List<Integer> resActual1 = P2J6.sumOfDistinctCubes(nInput1); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected1 = Arrays.asList(3, 1); //expected result
        assertEquals(resExpected1, resActual1);
      
        int nInput2 = 36; //test input
        List<Integer> resActual2 = P2J6.sumOfDistinctCubes(nInput2); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected2 = Arrays.asList(3, 2, 1); //expected result
        assertEquals(resExpected2, resActual2);
          
        int nInput3 = 441; //test input
        List<Integer> resActual3 = P2J6.sumOfDistinctCubes(nInput3); //run P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected3 = Arrays.asList(6, 5, 4, 3, 2, 1); //expected result
        assertEquals(resExpected3, resActual3);
          
        int nInput4 = 1764; //test input
        List<Integer> resActual4 = P2J6.sumOfDistinctCubes(nInput4); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected4 = Arrays.asList(12, 3, 2, 1); //expected result
        assertEquals(resExpected4, resActual4);
          
        int nInput5 = 3561289; //test input
        List<Integer> resActual5 = P2J6.sumOfDistinctCubes(nInput5); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected5 = Arrays.asList(152, 36, 12, 9, 6, 5, 3); //expected result
        assertEquals(resExpected5, resActual5);
          
        //Cases without solution
        int nInput6 = 7; //test input
        List<Integer> resActual6 = P2J6.sumOfDistinctCubes(nInput6); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected6 = Arrays.asList(); //expected result (empty list)
        assertEquals(resExpected6, resActual6);
          
        int nInput7 = 331; //test input
        List<Integer> resActual7 = P2J6.sumOfDistinctCubes(nInput7); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected7 = Arrays.asList(); //expected result (empty list)
        assertEquals(resExpected7, resActual7);
          
        //Make sure "dinstinct cubes" is properly implemented
        int nInput8 = 594; //test input
        List<Integer> resActual8 = P2J6.sumOfDistinctCubes(nInput8); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected8 = Arrays.asList(7, 6, 3, 2); //expected result (possible wrong answer: [7, 5, 5, 1])
        assertEquals(resExpected8, resActual8);
          
        int nInput9 = 245; //test input
        List<Integer> resActual9 = P2J6.sumOfDistinctCubes(nInput9); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected9 = Arrays.asList(); //expected result (possible wrong answer: [6, 3, 1, 1])
        assertEquals(resExpected9, resActual9);
          
        int nInput10 = 1052; //test input
        List<Integer> resActual10 = P2J6.sumOfDistinctCubes(nInput10); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected10 = Arrays.asList(8, 7, 5, 4, 2); //expected result (possible wrong answer: [8, 8, 3, 1])
        assertEquals(resExpected10, resActual10);
          
        int nInput11 = 1811; //test input
        List<Integer> resActual11 = P2J6.sumOfDistinctCubes(nInput11); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected11 = Arrays.asList(); //expected result (possible wrong answer: [12, 3, 3, 3, 1, 1])
        assertEquals(resExpected11, resActual11);
          
        //Make sure "lexicographically highest" is properly implemented when multiple eligible sets of cubes exist
        int nInput12 = 225; //test input
        List<Integer> resActual12 = P2J6.sumOfDistinctCubes(nInput12); //run P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected12 = Arrays.asList(6, 2, 1); //expected result (possible wrong answer: [5, 4, 3, 2, 1])
        assertEquals(resExpected12, resActual12);
          
        int nInput13 = 15795; //test input
        List<Integer> resActual13 = P2J6.sumOfDistinctCubes(nInput13); //run P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected13 = Arrays.asList(24, 12, 6, 3); //expected result (possible wrong answer: [19, 17, 13, 11, 7, 5, 3])
        assertEquals(resExpected13, resActual13);
          
        int nInput14 = 95869873; //test input
        List<Integer> resActual14 = P2J6.sumOfDistinctCubes(nInput14); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected14 = Arrays.asList(457, 75, 14, 9, 7, 5, 4); //expected result (possible wrong answer: [457, 74, 24, 15, 12, 10, 9])
        assertEquals(resExpected14, resActual14);
          
        //More random tests
        int nInput15 = 250; //test input
        List<Integer> resActual15 = P2J6.sumOfDistinctCubes(nInput15); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected15 = Arrays.asList(); //expected result
        assertEquals(resExpected15, resActual15);
          
        int nInput16 = 1757; //test input
        List<Integer> resActual16 = P2J6.sumOfDistinctCubes(nInput16); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected16 = Arrays.asList(10, 9, 3, 1); //expected result
        assertEquals(resExpected16, resActual16);
          
        int nInput17 = 2050; //test input
        List<Integer> resActual17 = P2J6.sumOfDistinctCubes(nInput17); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected17 = Arrays.asList(11, 7, 6, 5, 3, 2); //expected result
        assertEquals(resExpected17, resActual17);
          
        int nInput18 = 12345678; //test input
        List<Integer> resActual18 = P2J6.sumOfDistinctCubes(nInput18); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected18 = Arrays.asList(231, 26, 10, 7, 6, 5, 3); //expected result
        assertEquals(resExpected18, resActual18);
          
        int nInput19 = 87654321; //test input
        List<Integer> resActual19 = P2J6.sumOfDistinctCubes(nInput19); //actual result from P2J6.sumOfDistinctCubes() 
        List<Integer> resExpected19 = Arrays.asList(444, 49, 20, 6, 4, 2); //expected result
        assertEquals(resExpected19, resActual19);
    }
    
    @Test public void testForbiddenSubstringsHe(){
        //Empty tabu list, result should be the exhaustive list of all strings of length n constructed from the alphabet
        String alphabet0 = "ABC"; //test input
        int n0 = 1; //test input
        List<String> tabu0 = Arrays.asList(); //test input
        List<String> resActual0 = P2J6.forbiddenSubstrings(alphabet0, n0, tabu0); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected0 = Arrays.asList("A", "B", "C"); //expected result
        assertEquals(resExpected0, resActual0);
      
        String alphabet1 = "ABC"; //test input
        int n1 = 2; //test input
        List<String> tabu1 = Arrays.asList(); //test input
        List<String> resActual1 = P2J6.forbiddenSubstrings(alphabet1, n1, tabu1); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected1 = Arrays.asList("AA", "AB", "AC", "BA", "BB", "BC", "CA", "CB", "CC"); //expected result
        assertEquals(resExpected1, resActual1);
      
        String alphabet2 = "ABC"; //test input
        int n2 = 3; //test input
        List<String> tabu2 = Arrays.asList(); //test input
        List<String> resActual2 = P2J6.forbiddenSubstrings(alphabet2, n2, tabu2); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected2 = Arrays.asList("AAA", "AAB", "AAC", "ABA", "ABB", "ABC", "ACA", "ACB", "ACC", "BAA", "BAB", "BAC",
        "BBA", "BBB", "BBC", "BCA", "BCB", "BCC", "CAA", "CAB", "CAC", "CBA", "CBB", "CBC", "CCA", "CCB", "CCC"); //expected result
        assertEquals(resExpected2, resActual2);
        
        String alphabet3 = "AB"; //test input
        int n3 = 3; //test input
        List<String> tabu3 = Arrays.asList(); //test input
        List<String> resActual3 = P2J6.forbiddenSubstrings(alphabet3, n3, tabu3); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected3 = Arrays.asList("AAA", "AAB", "ABA", "ABB", "BAA", "BAB", "BBA", "BBB"); //expected result
        assertEquals(resExpected3, resActual3);
        
        String alphabet4 = "AB"; //test input
        int n4 = 4; //test input
        List<String> tabu4 = Arrays.asList(); //test input
        List<String> resActual4 = P2J6.forbiddenSubstrings(alphabet4, n4, tabu4); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected4 = Arrays.asList("AAAA", "AAAB", "AABA", "AABB", "ABAA", "ABAB", "ABBA", "ABBB", "BAAA", "BAAB", 
        "BABA", "BABB", "BBAA", "BBAB", "BBBA", "BBBB"); //expected result
        assertEquals(resExpected4, resActual4);
      
        //Regular test cases (with non-empty tabu list)
        String alphabet5 = "ABC"; //test input
        int n5 = 1; //test input
        List<String> tabu5 = Arrays.asList("A"); //test input
        List<String> resActual5 = P2J6.forbiddenSubstrings(alphabet5, n5, tabu5); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected5 = Arrays.asList("B", "C"); //expected result
        assertEquals(resExpected5, resActual5);
      
        String alphabet6 = "ABC"; //test input
        int n6 = 2; //test input
        List<String> tabu6 = Arrays.asList("A"); //test input
        List<String> resActual6 = P2J6.forbiddenSubstrings(alphabet6, n6, tabu6); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected6 = Arrays.asList("BB", "BC", "CB", "CC"); //expected result
        assertEquals(resExpected6, resActual6);
      
        String alphabet7 = "ABC"; //test input
        int n7 = 3; //test input
        List<String> tabu7 = Arrays.asList("A"); //test input
        List<String> resActual7 = P2J6.forbiddenSubstrings(alphabet7, n7, tabu7); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected7 = Arrays.asList("BBB", "BBC", "BCB", "BCC", "CBB", "CBC", "CCB", "CCC"); //expected result
        assertEquals(resExpected7, resActual7);
      
        String alphabet8 = "ABC"; //test input
        int n8 = 2; //test input
        List<String> tabu8 = Arrays.asList("AB"); //test input
        List<String> resActual8 = P2J6.forbiddenSubstrings(alphabet8, n8, tabu8); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected8 = Arrays.asList("AA", "AC", "BA", "BB", "BC", "CA", "CB", "CC"); //expected result
        assertEquals(resExpected8, resActual8);
      
        String alphabet9 = "ABC"; //test input
        int n9 = 3; //test input
        List<String> tabu9 = Arrays.asList("AB", "AC"); //test input
        List<String> resActual9 = P2J6.forbiddenSubstrings(alphabet9, n9, tabu9); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected9 = Arrays.asList("AAA", "BAA", "BBA", "BBB", "BBC", "BCA", "BCB", "BCC", "CAA", "CBA", "CBB", 
        "CBC", "CCA", "CCB", "CCC"); //expected result
        assertEquals(resExpected9, resActual9);
        
        String alphabet10 = "AB"; //test input
        int n10 = 2; //test input
        List<String> tabu10 = Arrays.asList("A"); //test input
        List<String> resActual10 = P2J6.forbiddenSubstrings(alphabet10, n10, tabu10); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected10 = Arrays.asList("BB"); //expected result
        assertEquals(resExpected10, resActual10);
        
        String alphabet11 = "AB"; //test input
        int n11 = 4; //test input
        List<String> tabu11 = Arrays.asList("AB"); //test input
        List<String> resActual11 = P2J6.forbiddenSubstrings(alphabet11, n11, tabu11); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected11 = Arrays.asList("AAAA", "BAAA", "BBAA", "BBBA", "BBBB"); //expected result
        assertEquals(resExpected11, resActual11);
        
        String alphabet12 = "AB"; //test input
        int n12 = 4; //test input
        List<String> tabu12 = Arrays.asList("AA"); //test input
        List<String> resActual12 = P2J6.forbiddenSubstrings(alphabet12, n12, tabu12); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected12 = Arrays.asList("ABAB", "ABBA", "ABBB", "BABA", "BABB", "BBAB", "BBBA", "BBBB"); //expected result
        assertEquals(resExpected12, resActual12);
        
        String alphabet13 = "ABCDE"; //test input
        int n13 = 2; //test input
        List<String> tabu13 = Arrays.asList("A"); //test input
        List<String> resActual13 = P2J6.forbiddenSubstrings(alphabet13, n13, tabu13); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected13 = Arrays.asList("BB", "BC", "BD", "BE", "CB", "CC", "CD", "CE", "DB", "DC", "DD", "DE", "EB", 
        "EC", "ED", "EE"); //expected result
        assertEquals(resExpected13, resActual13);
        
        String alphabet14 = "ABCDE"; //test input
        int n14 = 3; //test input
        List<String> tabu14 = Arrays.asList("AC", "AD", "BB", "BE", "CA", "CB", "DA", "DE", "DB", "EE", "EB"); //test input
        List<String> resActual14 = P2J6.forbiddenSubstrings(alphabet14, n14, tabu14); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected14 = Arrays.asList("AAA", "AAB", "AAE", "ABA", "ABC", "ABD", "AEA", "AEC", "AED", "BAA", "BAB", "BAE", 
        "BCC", "BCD", "BCE", "BDC", "BDD", "CCC", "CCD", "CCE", "CDC", "CDD", "CEA", "CEC", "CED", "DCC", "DCD", "DCE", "DDC", "DDD", 
        "EAA", "EAB", "EAE", "ECC", "ECD", "ECE", "EDC", "EDD"); //expected result
        assertEquals(resExpected14, resActual14);
      
        //Make sure the program does not crash at special cases
        String alphabet15 = "A"; //test input
        int n15 = 999999998; //test input
        List<String> tabu15 = Arrays.asList("AA"); //test input
        List<String> resActual15 = P2J6.forbiddenSubstrings(alphabet15, n15, tabu15); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected15 = Arrays.asList(); //expected result (empty list within reasonable run time)
        assertEquals(resExpected15, resActual15);
        
        String alphabet16 = ""; //test input
        int n16 = 2; //test input
        List<String> tabu16 = Arrays.asList(); //test input
        List<String> resActual16 = P2J6.forbiddenSubstrings(alphabet16, n16, tabu16); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected16 = Arrays.asList(); //expected result (empty list)
        assertEquals(resExpected16, resActual16);
        
        String alphabet17 = ""; //test input
        int n17 = 1; //test input
        List<String> tabu17 = Arrays.asList("A", "B"); //test input
        List<String> resActual17 = P2J6.forbiddenSubstrings(alphabet17, n17, tabu17); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected17 = Arrays.asList(); //expected result (empty list)
        assertEquals(resExpected17, resActual17);
      
        String alphabet18 = "ABC"; //test input
        int n18 = 2; //test input
        List<String> tabu18 = Arrays.asList("A", "B", "C"); //test input
        List<String> resActual18 = P2J6.forbiddenSubstrings(alphabet18, n18, tabu18); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected18 = Arrays.asList(); //expected result (empty list)
        assertEquals(resExpected18, resActual18);
      
        String alphabet19 = "ABC"; //test input
        int n19 = 2; //test input
        List<String> tabu19 = Arrays.asList("ABC"); //test input
        List<String> resActual19 = P2J6.forbiddenSubstrings(alphabet19, n19, tabu19); //actual result from P2J6.forbiddenSubstrings() 
        List<String> resExpected19 = Arrays.asList("AA", "AB", "AC", "BA", "BB", "BC", "CA", "CB", "CC"); //expected result (same as no tabu list)
        assertEquals(resExpected19, resActual19);
    }
    
}