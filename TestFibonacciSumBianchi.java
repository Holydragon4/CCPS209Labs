import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

/**
 * The test class TestFibonacciSumBianchi.
 *
 * @author  (Joseph Bianchi)
 */
public class TestFibonacciSumBianchi
{
   @Test public void testFibonacciSum()
    {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("832040"),
            new BigInteger("121393"),
            new BigInteger("46368"),
            new BigInteger("144"),        
            new BigInteger("55")         
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("1000000")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("8"),
            new BigInteger("3"),
            new BigInteger("1")     
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("12")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("1")   
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("1")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("2")   
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("2")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("3")   
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("3")) );         
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("3"),
            new BigInteger("1")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("4")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("5")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("5")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("5"),
            new BigInteger("1")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("6")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("5"),
            new BigInteger("2")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("7")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("8"),
            new BigInteger("1")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("9")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("8"),
            new BigInteger("2")

        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("10")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
        new BigInteger("8"),
        new BigInteger("3")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("11")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("8"),
            new BigInteger("3"),
            new BigInteger("1")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("12")) );     
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("13")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("13")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("13"),
            new BigInteger("1")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("14")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("21")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("21")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("121393")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("121393")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("2504730781961")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("2504730781961")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("1346269")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("1346269")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList());
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("0")) );
        
        list = new ArrayList<BigInteger>(Arrays.asList(
            new BigInteger("75025")
        ));
        assertEquals(list, P2J5.fibonacciSum(new BigInteger("75025")) );        
    }
}
