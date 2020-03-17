import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;

public class TestPolynomialOneLeung
{
    @Test public void testPolynomial()
    {
        int [] c1 = {0, 0, 0, 1};
        Polynomial p1 = new Polynomial(c1);
        c1[2] = 1;
        assertEquals("Degree error", 3, p1.getDegree());
        assertEquals("Polynomial must compute coefficients out of range", 0, p1.getCoefficient(-1)); 
        assertEquals("Polynomial must compute coefficients out of range", 0, p1.getCoefficient(4));
        assertEquals("Array is not immutable", 0, p1.getCoefficient(2));
        assertEquals("Coefficient error near boundary", 1, p1.getCoefficient(3)); 
        assertEquals("Coefficient error near boundary", 0, p1.getCoefficient(0));
        assertEquals("Coeffificent error", 0, p1.getCoefficient(1));
        assertEquals("Evaluation error", 0, p1.evaluate(0));
        assertEquals("Evaluation error of negative x", -27, p1.evaluate(-3));
    
        int[] c2 = {-1, 0, 0, 0};
        Polynomial p2 = new Polynomial(c2);
        c2[2] = 4;
        assertEquals("Degree error", 0, p2.getDegree());
        assertEquals("Polynomial must compute coefficients out of range", 0, p2.getCoefficient(-1));
        assertEquals("Polynomial must compute coefficients out of range", 0, p2.getCoefficient(4));
        assertEquals("Array is not immutable", 0, p2.getCoefficient(2));
        assertEquals("Coefficient error near noundary", 0, p2.getCoefficient(3));
        assertEquals("Coefficient error near noundary", -1, p2.getCoefficient(0));
        assertEquals("Evaluation error", -1, p2.evaluate(0));
        assertEquals("Evaluation error of negative x", -1, p2.evaluate(-3));
        
    }
}