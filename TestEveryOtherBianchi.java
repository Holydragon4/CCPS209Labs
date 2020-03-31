import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class TestEveryOther.
 *
 * @author  (Joseph Bianchi)
 */
public class TestEveryOtherBianchi
{
   @Test public void testEveryOtherBianchi()
    {
        assertArrayEquals( new int[]{1,3}, P2J1.everyOther( new int[]{1,2,3} ) );
        assertArrayEquals( new int[]{}, P2J1.everyOther( new int[]{} ) );
        assertArrayEquals( new int[]{0}, P2J1.everyOther( new int[]{0} ) );
        assertArrayEquals( new int[]{1}, P2J1.everyOther( new int[]{1} ) );
        assertArrayEquals( new int[]{1}, P2J1.everyOther( new int[]{1,2} ) );
        assertArrayEquals( new int[]{-1,1}, P2J1.everyOther( new int[]{-1,0,1} ) );
        assertArrayEquals( new int[]{1,3}, P2J1.everyOther( new int[]{1,2,3,4} ) );
        assertArrayEquals( new int[]{1,3,5}, P2J1.everyOther( new int[]{1,2,3,4,5} ) );
        assertArrayEquals( new int[]{9,1}, P2J1.everyOther( new int[]{9,0,1} ) );
        assertArrayEquals( new int[]{-10}, P2J1.everyOther( new int[]{-10,-11} ) );
        assertArrayEquals( new int[]{-200}, P2J1.everyOther( new int[]{-200,500} ) );
        assertArrayEquals( new int[]{10,8}, P2J1.everyOther( new int[]{10,1,8} ) );
        assertArrayEquals( new int[]{9883}, P2J1.everyOther( new int[]{9883} ) );
        assertArrayEquals( new int[]{-1}, P2J1.everyOther( new int[]{-1} ) );
        assertArrayEquals( new int[]{503}, P2J1.everyOther( new int[]{503,1} ) );
        assertArrayEquals( new int[]{999,9}, P2J1.everyOther( new int[]{999,99,9} ) );
        assertArrayEquals( new int[]{93}, P2J1.everyOther( new int[]{93,78} ) );
        assertArrayEquals( new int[]{500}, P2J1.everyOther( new int[]{500} ) );
        assertArrayEquals( new int[]{45}, P2J1.everyOther( new int[]{45} ) );
        assertArrayEquals( new int[]{-45}, P2J1.everyOther( new int[]{-45} ) );
        assertArrayEquals( new int[]{508,405}, P2J1.everyOther( new int[]{508,903,405,443} ) );
        assertArrayEquals( new int[]{508,405,508,405}, P2J1.everyOther( new int[]{508,903,405,443,508,903,405,443} ) );
        assertArrayEquals( new int[]{508,405,508,405,508,405,508,405,508,405,508,405}, P2J1.everyOther( new int[]{508,903,405,443,508,903,405,443,508,903,405,443,508,903,405,443,508,903,405,443,508,903,405,443} ) );
    }
}
