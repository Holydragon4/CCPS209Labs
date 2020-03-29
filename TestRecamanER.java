import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRecamanER
{
    @Test public void testRecamanER(){
	int [] a1 = {1,11,111,1111,11111,111111,1111111,11111111,111111111,100000000,2,12,123,1234,12345,123456,1234567,12345678,123456789,3};
	int [] a2 = {1,22,40,574,7458,88410,3173194,31504904,90898542,203701556,3,10,260,4205,6209,201782,827716,20395349,324951689,6};
	for(int i=0;i<21;i++){
	a1[i] = P2J2.recaman(a1[i]);
	try{
		assertEquals(a2[i],a1[i]);}
	catch (AssertionError assertFailed){ System.out.println("Failed");}}   
    }
}
