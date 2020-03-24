import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestPolynomialAddParsons
{
    @Test public void testPolynomialAddParsons() 
    {
        // Case 0 - add zero and zero
        Polynomial p0a = new Polynomial(new int[] {0});
        Polynomial p0b = new Polynomial(new int[] {0});
        assertEquals(p0a.add(p0b),new Polynomial(new int[] {0}));
        
        // Case 1 - add zero and one
        Polynomial p1a = new Polynomial(new int[] {0});
        Polynomial p1b = new Polynomial(new int[] {1});
        assertEquals(p1a.add(p1b),new Polynomial(new int[] {1}));
        
        // Case 2 - add one and zero
        Polynomial p2a = new Polynomial(new int[] {1});
        Polynomial p2b = new Polynomial(new int[] {0});
        assertEquals(p2a.add(p2b),new Polynomial(new int[] {1}));
        
        // Case 3 - add arbitrary polynomials of equal length
        Polynomial p3a = new Polynomial(new int[] {1,3,5});
        Polynomial p3b = new Polynomial(new int[] {2,4,6});
        assertEquals(p3a.add(p3b),new Polynomial(new int[] {3,7,11}));
        
        // Case 4 - add arbitrary polynomials of differing lengths(1)
        Polynomial p4a = new Polynomial(new int[] {1,3,5});
        Polynomial p4b = new Polynomial(new int[] {2,4,6,8,10});
        assertEquals(p4a.add(p4b),new Polynomial(new int[] {3,7,11,8,10}));
        
        // Case 5 - add arbitrary polynomials of differing lengths(2)
        Polynomial p5a = new Polynomial(new int[] {1,3,5,7,9});
        Polynomial p5b = new Polynomial(new int[] {2,4,6});
        assertEquals(p5a.add(p5b),new Polynomial(new int[] {3,7,11,7,9}));
        
        // Case 6 - add arbitrary polynomials with trailing zeros(1)
        Polynomial p6a = new Polynomial(new int[] {0,1,2,3,4});
        Polynomial p6b = new Polynomial(new int[] {5,10,15,0,0});
        assertEquals(p6a.add(p6b),new Polynomial(new int[] {5,11,17,3,4}));
        
        // Case 7 - add arbitrary polynomials with trailing zeros(2)
        Polynomial p7a = new Polynomial(new int[] {0,1,2,3,4,0,0,0});
        Polynomial p7b = new Polynomial(new int[] {5,10,15,20,25,30,35,40});
        assertEquals(p7a.add(p7b),new Polynomial(new int[] {5,11,17,23,29,30,35,40}));
        
        // Case 8 - add offsetting polynomials that sum to zero
        Polynomial p8a = new Polynomial(new int[] {2,4,6,8});
        Polynomial p8b = new Polynomial(new int[] {-2,-4,-6,-8});
        assertEquals(p8a.add(p8b),new Polynomial(new int[] {0}));
        
        // Case 9 - add offsetting polynomials that sum to non-zero
        Polynomial p9a = new Polynomial(new int[] {2,4,6,8});
        Polynomial p9b = new Polynomial(new int[] {-4,-8,-12,-16});
        assertEquals(p9a.add(p9b),new Polynomial(new int[] {-2,-4,-6,-8}));
        
        // Case 10 - add offsetting polynomials that sum to non-zero sometimes
        Polynomial p10a = new Polynomial(new int[] {-10,10,-20,20,-30,30});
        Polynomial p10b = new Polynomial(new int[] {-10,-10,-20,-20,-30,-30});
        assertEquals(p10a.add(p10b),new Polynomial(new int[] {-20,0,-40,0,-60}));
        
        // Covered all standard permutations
        // Remaining are famous polynomials added together
        // Sourced from https://en.wikipedia.org/wiki/Polynomial_sequence
        
        // Case 11 - Fibonnaci Polynomials https://en.wikipedia.org/wiki/Fibonacci_polynomials
        // F6(x) + L6(x)
        Polynomial p11a = new Polynomial(new int[] {0,3,0,4,0,1});
        Polynomial p11b = new Polynomial(new int[] {2,0,9,0,6,0,1});
        assertEquals(p11a.add(p11b),new Polynomial(new int[] {2,3,9,4,6,1,1}));
        
        // Case 12 - Euler Polynomials https://en.wikipedia.org/wiki/Bernoulli_polynomials
        // E4(x) + E6(x)
        Polynomial p12a = new Polynomial(new int[] {0,1,0,-2,1});
        Polynomial p12b = new Polynomial(new int[] {0,-3,0,5,0,-3,1});
        assertEquals(p12a.add(p12b),new Polynomial(new int[] {0,-2,0,3,1,-3,1}));
        
        // Case 13 - Rising Factorials https://en.wikipedia.org/wiki/Falling_and_rising_factorials
        // x(3) + x(4)
        Polynomial p13a = new Polynomial(new int[] {0,2,3,1});
        Polynomial p13b = new Polynomial(new int[] {0,6,11,6,1});
        assertEquals(p13a.add(p13b),new Polynomial(new int[] {0,8,14,7,1}));
        
        // Case 14 - Falling Factorials https://en.wikipedia.org/wiki/Falling_and_rising_factorials
        // x(3) + x(4)
        Polynomial p14a = new Polynomial(new int[] {0,2,-3,1});
        Polynomial p14b = new Polynomial(new int[] {0,-6,11,-6,1});
        assertEquals(p14a.add(p14b),new Polynomial(new int[] {0,-4,8,-5,1}));    
        
        // Case 15 - Prime-Generating Polynomials https://mathworld.wolfram.com/Prime-GeneratingPolynomial.html
        // distinct primes (49) + distinct primes (47)
        Polynomial p15a = new Polynomial(new int[] {213589,-45458,3294,-97,1});
        Polynomial p15b = new Polynomial(new int[] {-286397,348272,-56822,3588,99,1});
        assertEquals(p15a.add(p15b),new Polynomial(new int[] {-72808,302814,-53528,3491,100,1}));     
        
        // Case 16 - More Prime-Generating Polynomials https://mathworld.wolfram.com/Prime-GeneratingPolynomial.html
        // Fung and Ruby (45 distinct primes) + Fung and Ruby (43 distinct primes)
        Polynomial p16a = new Polynomial(new int[] {2753,-810,36});
        Polynomial p16b = new Polynomial(new int[] {10181,-1701,47});
        assertEquals(p16a.add(p16b),new Polynomial(new int[] {12934,-2511,83}));   
        
        // Case 17 - Hermite Polynomials https://en.wikipedia.org/wiki/Hermite_polynomials
        // He(10) + H(10)
        Polynomial p17a = new Polynomial(new int[] {-945,0,4725,0,-3150,0,630,0,-45,0,1});
        Polynomial p17b = new Polynomial(new int[] {-30240,0,302400,0,-403200,0,161280,0,-23040,0,1024});
        assertEquals(p17a.add(p17b),new Polynomial(new int[] {-31185,0,307125,0,-406350,0,161910,0,-23085,0,1025}));
        
        // Case 18 - Dickson Polynomials https://en.wikipedia.org/wiki/Dickson_polynomial
        // First Kind D5(x,alpha) + Second Kind E4(x,alpha) (ignoring alpha)
        Polynomial p18a = new Polynomial(new int[] {0,5,0,-5,0,1});
        Polynomial p18b = new Polynomial(new int[] {1,0,-3,0,1});
        assertEquals(p18a.add(p18b),new Polynomial(new int[] {1,5,-3,-5,1,1}));
        
        // Case 19 - Cyclotomic Polynomials https://en.wikipedia.org/wiki/Cyclotomic_polynomial
        // PHI(13) + PHI(15)
        Polynomial p19a = new Polynomial(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1});
        Polynomial p19b = new Polynomial(new int[] {1,-1,0,1,-1,1,0,-1,1});
        assertEquals(p19a.add(p19b),new Polynomial(new int[] {2,0,1,2,0,2,1,0,2,1,1,1,1}));
        
    }
    
}
