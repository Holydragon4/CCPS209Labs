import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class TestCreateZigZag.
 *
 * @author  (Joseph Bianchi)
 */
public class TestCreateZigZagBianchi
{
   @Test public void testCreateZigZagBianchi()
    {
        assertArrayEquals( new int[][]{ {4,5,6,7,8}, {13,12,11,10,9}, {14,15,16,17,18}, {23,22,21,20,19} }, P2J1.createZigZag( 4,5,4 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,0,0 ) );
        assertArrayEquals( new int[][]{ {} }, P2J1.createZigZag( 1,0,0 ) );
        assertArrayEquals( new int[][]{ {0} }, P2J1.createZigZag( 1,1,0 ) );
        assertArrayEquals( new int[][]{ {1} }, P2J1.createZigZag( 1,1,1 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,1,0 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,1,1 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,0,1 ) );
        assertArrayEquals( new int[][]{ {} }, P2J1.createZigZag( 1,0,1 ) );
        assertArrayEquals( new int[][]{ {}, {} }, P2J1.createZigZag( 2,0,1 ) );
        assertArrayEquals( new int[][]{ {0}, {1} }, P2J1.createZigZag( 2,1,0 ) );
        assertArrayEquals( new int[][]{ {0,1}, {3,2} }, P2J1.createZigZag( 2,2,0 ) );
        assertArrayEquals( new int[][]{ {1,2}, {4,3} }, P2J1.createZigZag( 2,2,1 ) );
        assertArrayEquals( new int[][]{ {2,3}, {5,4} }, P2J1.createZigZag( 2,2,2 ) );
        assertArrayEquals( new int[][]{ {}, {}, {} }, P2J1.createZigZag( 3,0,5 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,3,5 ) );
        assertArrayEquals( new int[][]{ {4,5,6,7}, {11,10,9,8}, {12,13,14,15}, {19,18,17,16} }, P2J1.createZigZag( 4,4,4 ) );
        assertArrayEquals( new int[][]{ {4}, {5}, {6}, {7} }, P2J1.createZigZag( 4,1,4 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,4,0 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,4,4 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,20,5 ) );
        assertArrayEquals( new int[][]{}, P2J1.createZigZag( 0,20,8 ) );
    }
}
