import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestPolynomialMultiplyParsons
{
    @Test public void testPolynomialMultiplyParsons() 
    {
        // Case 0 - Multiply zero times zero
        Polynomial p0a = new Polynomial(new int[] {0});
        Polynomial p0b = new Polynomial(new int[] {0});
        assertEquals(p0a.multiply(p0b),new Polynomial(new int[] {0}));
        
        // Case 1 - Multiply zero times one
        Polynomial p1a = new Polynomial(new int[] {0});
        Polynomial p1b = new Polynomial(new int[] {1});
        assertEquals(p1a.multiply(p1b),new Polynomial(new int[] {0}));
        
        // Case 2 - Multiply one times zero
        Polynomial p2a = new Polynomial(new int[] {1});
        Polynomial p2b = new Polynomial(new int[] {0});
        assertEquals(p2a.multiply(p2b),new Polynomial(new int[] {0}));
        
        // Case 3 - Multiply arbitrary polynomial times a constant
        Polynomial p3a = new Polynomial(new int[] {1,2,3});
        Polynomial p3b = new Polynomial(new int[] {2});
        assertEquals(p3a.multiply(p3b),new Polynomial(new int[] {2,4,6}));
        
        // Case 4 - Multiply arbitrary polynomial times a polynomial of degree 1
        Polynomial p4a = new Polynomial(new int[] {1,2,3});
        Polynomial p4b = new Polynomial(new int[] {5,10});
        assertEquals(p4a.multiply(p4b),new Polynomial(new int[] {5,20,35,30}));
        
        // Case 5 - Multiply arbitrary polynomial times a polynomial of degree 2
        Polynomial p5a = new Polynomial(new int[] {1,2,3});
        Polynomial p5b = new Polynomial(new int[] {-3,-6,-9});
        assertEquals(p5a.multiply(p5b),new Polynomial(new int[] {-3,-12,-30,-36,-27}));
        
        // Case 6 - Multiply arbitrary polynomials with trailing zeros(1)
        Polynomial p6a = new Polynomial(new int[] {1,2,3,0,0,0});
        Polynomial p6b = new Polynomial(new int[] {-3,-6,-9});
        assertEquals(p6a.multiply(p6b),new Polynomial(new int[] {-3,-12,-30,-36,-27}));
        
        // Case 7 - Multiply arbitrary polynomials with trailing zeros(2)
        Polynomial p7a = new Polynomial(new int[] {1,2,3});
        Polynomial p7b = new Polynomial(new int[] {-3,-6,-9,0,0,0});
        assertEquals(p7a.multiply(p7b),new Polynomial(new int[] {-3,-12,-30,-36,-27}));
        
        // Case 8 - Multiply polynomials leading to certain zero coefficients
        Polynomial p8a = new Polynomial(new int[] {2,1});
        Polynomial p8b = new Polynomial(new int[] {-2,1});
        assertEquals(p8a.multiply(p8b),new Polynomial(new int[] {-4,0,1}));
        
        // Case 9 - Multiply 3 polynomials by chaining the result of the first two
        Polynomial p9a = new Polynomial(new int[] {3,1});
        Polynomial p9b = new Polynomial(new int[] {-3,1});
        Polynomial p9c = new Polynomial(new int[] {9,0,1});
        assertEquals(p9a.multiply(p9b).multiply(p9c),new Polynomial(new int[] {-81,0,0,0,1}));
        
        // Covered all standard permutations
        // Remaining are famous polynomials multiplied together
        // Sourced from https://en.wikipedia.org/wiki/Polynomial_sequence
        
        // Case 10 - Rook Polynomials https://en.wikipedia.org/wiki/Rook_polynomial
        // R2(x) * R4(x)
        
        Polynomial p10a = new Polynomial(new int[] {1,4,2});
        Polynomial p10b = new Polynomial(new int[] {1,16,72,96,24});
        assertEquals(p10a.multiply(p10b),new Polynomial(new int[] {1,20,138,416,552,288,48}));
        
        // Case 11 - Fibonnaci Polynomials https://en.wikipedia.org/wiki/Fibonacci_polynomials
        // F5(x) * L5(x)
        Polynomial p11a = new Polynomial(new int[] {1,0,3,0,1});
        Polynomial p11b = new Polynomial(new int[] {0,5,0,5,0,1});
        assertEquals(p11a.multiply(p11b),new Polynomial(new int[] {0,5,0,20,0,21,0,8,0,1}));
        
        // Case 12 - Euler Polynomials https://en.wikipedia.org/wiki/Bernoulli_polynomials
        // E2(x) * E4(x)
        Polynomial p12a = new Polynomial(new int[] {0,-1,1});
        Polynomial p12b = new Polynomial(new int[] {0,1,0,-2,1});
        assertEquals(p12a.multiply(p12b),new Polynomial(new int[] {0,0,-1,1,2,-3,1}));
        
        // Case 13 - Rising Factorials https://en.wikipedia.org/wiki/Falling_and_rising_factorials
        // x(2) * x(4)
        Polynomial p13a = new Polynomial(new int[] {0,1,1});
        Polynomial p13b = new Polynomial(new int[] {0,6,11,6,1});
        assertEquals(p13a.multiply(p13b),new Polynomial(new int[] {0,0,6,17,17,6,1}));
        
        // Case 14 - Falling Factorials https://en.wikipedia.org/wiki/Falling_and_rising_factorials
        // x(2) * x(3)
        Polynomial p14a = new Polynomial(new int[] {0,-1,1});
        Polynomial p14b = new Polynomial(new int[] {0,2,-3,1});
        assertEquals(p14a.multiply(p14b),new Polynomial(new int[] {0,0,-2,5,-4,1}));    
        
        // Case 15 - Prime-Generating Polynomials https://mathworld.wolfram.com/Prime-GeneratingPolynomial.html
        // Legendre (29 distinct primes) * Legendre (16 distinct primes)
        Polynomial p15a = new Polynomial(new int[] {29,0,2});
        Polynomial p15b = new Polynomial(new int[] {17,1,1});
        assertEquals(p15a.multiply(p15b),new Polynomial(new int[] {493,29,43,2,2}));     
        
        // Case 16 - More Prime-Generating Polynomials https://mathworld.wolfram.com/Prime-GeneratingPolynomial.html
        // Euler (40 distinct primes) * F. Gobbo (24 distinct primes)
        Polynomial p16a = new Polynomial(new int[] {41,-1,1});
        Polynomial p16b = new Polynomial(new int[] {4871,-371,7});
        assertEquals(p16a.multiply(p16b),new Polynomial(new int[] {199711,-20082,5529,-378,7}));   
        
        // Case 17 - Hermite Polynomials https://en.wikipedia.org/wiki/Hermite_polynomials
        // He(3) * H(3)
        Polynomial p17a = new Polynomial(new int[] {0,-3,0,1});
        Polynomial p17b = new Polynomial(new int[] {0,-12,0,8});
        assertEquals(p17a.multiply(p17b),new Polynomial(new int[] {0,0,36,0,-36,0,8}));
        
        // Case 18 - Dickson Polynomials https://en.wikipedia.org/wiki/Dickson_polynomial
        // First Kind D3(x,alpha) * Second Kind E3(x,alpha) (ignoring alpha)
        Polynomial p18a = new Polynomial(new int[] {0,-3,0,1});
        Polynomial p18b = new Polynomial(new int[] {0,-2,0,1});
        assertEquals(p18a.multiply(p18b),new Polynomial(new int[] {0,0,6,0,-5,0,1}));
        
        // Case 19 - Cyclotomic Polynomials https://en.wikipedia.org/wiki/Cyclotomic_polynomial
        // PHI(10) * PHI(16)
        Polynomial p19a = new Polynomial(new int[] {1,-1,1,-1,1});
        Polynomial p19b = new Polynomial(new int[] {1,0,0,0,0,0,0,0,1});
        assertEquals(p19a.multiply(p19b),new Polynomial(new int[] {1,-1,1,-1,1,0,0,0,1,-1,1,-1,1}));
        
    }
}
