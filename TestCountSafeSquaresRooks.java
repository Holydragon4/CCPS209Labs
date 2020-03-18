// Authored by Edward Lee

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.util.*;

import java.util.Random;

public class TestCountSafeSquaresRooks
{
    //*************************************************************************************
    //************************Tests for pancakeScramble************************************
    //*************************************************************************************

    /*  Test cases include:
     * 
     * n=2k+1 (Odd) cases
     *  1.  n=1, all rooks
     *  2.  n=1, no rooks
     *  3.  n=3, rooks only along a single diagonal line
     *  4.  n=3, all rooks
     *  5.  n=3, no rooks
     *  6.  n=3, rooks only on the center square 
     *  7.  n=3, rooks on all but the center square
     *  8.  n=3, rooks only on the corner squares
     *  9.  n=3, rooks only along column 0
     *  
     *  n=2k (Even) cases
     *  10. n=2, all rooks
     *  11. n=2, no rooks
     *  12. n=4, rooks along an L position
     *  13. Random rook arrangements on an 8x8 chessboard
     *  14. Random rook arrangements on an 8x8 chessboard
     *  15. Random rook arrangements on an 8x8 chessboard
     *  16. Random rook arrangements on an 8x8 chessboard
     *  17. Random rook arrangements on an 8x8 chessboard
     *  18. n=2, rooks adjacent and only along row 1
     *  19. Boards with only diagonal rook placements
     *  20. A very large chessboard with an X shape rook placement
     *  
     */

    // #1
    /** covers cases of size [1][1] boards with a rook
     *  <p>This is a 2d boolean array of 1x1 size, where the only field available is true
     */

    @Test public void singleRowColumnT() {

        boolean[][] testCase = {{true}};
        int testn=1;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #2

    /** covers cases of size [1][1] boards with no rooks
     *  <p>This is a 2d boolean array of 1x1 size, where the only field available is false
     */
    @Test public void singleRowColumnF() {

        boolean[][] testCase = {{false}};
        int testn=1;
        int result=1;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #3

    /** covers cases where rooks are placed along a diagonal line,
     *  <p>Where rooks appear on a diagonal line, no rooks appear along another rook's path
     */
    @Test public void testDiagonal() {

        boolean[][] testCase = {{true,false,false},{false,true,false},{false,false,true}};
        int testn=3;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));
    }

    // #4

    /** covers cases on an odd nxn board where all squares have rooks
     *  <p>No squares are safe when every square has a rook
     */

    @Test public void oddallTrue() {

        boolean[][] testCase = {{true,true,true},{true,true,true},{true,true,true}};
        int testn=3;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));
    }

    // #5
    /** covers cases on an odd nxn board where no squares have rooks
     *  <p>All squares are safe when no square has a rook
     */

    @Test public void oddallFalse() {

        boolean[][] testCase = {{false,false,false},{false,false,false},{false,false,false}};
        int testn=3;
        int result=9;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #6

    /** covers cases where only the center square has a rook
     */

    @Test public void testCenter() {

        boolean[][] testCase = {{false,false,false},{false,true,false},{false,false,false}};
        int testn=3;
        int result=4;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #7

    /** covers cases where all squares but the center square have rooks
     */

    @Test public void testNoCenter() {

        boolean[][] testCase = {{true,true,true},{true,false,true},{true,true,true}};
        int testn=3;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #8

    /** covers cases where only the corner squares have rooks,
     * 
     */

    @Test public void testCorners() {

        boolean[][] testCase = {{true,false,true},{false,false,false},{true,false,true}};
        int testn=3;
        int result=1;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));
    }

    // #9

    /** covers cases where only a single column has rooks
     *  <p>A general test to detect if the algorithm can account for overlapping rook paths
     */

    @Test public void testOverlapping() {

        boolean[][] testCase = {{true,false,false},{true,false,false},{true,false,false}};
        int testn=3;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #10

    /** covers cases where even nxn boards have rooks
     */

    @Test public void testEvenTrue() {

        boolean[][] testCase = {{true,true},{true,true}};
        int testn=2;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #11

    /** covers cases where even nxn boards have no rooks
     */

    @Test public void testEvenFalse() {

        boolean[][] testCase = {{false,false},{false,false}};
        int testn=2;
        int result=4;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #12

    /** covers cases rooks have overlapping paths, as well as several unique paths
     * <p>The L shape contains adjacent rooks, with paths that overlap and intersect
     */

    @Test public void testL() {

        boolean[][] testCase = {{true,false,false,false},{true,false,false,false},{true,false,false,false},{true,true,true,false}};
        int testn=4;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }
    // #13-17

    /** covers cases of n=8, with arbitrarily chosen rook positions
     *  <p>This tests the algorithm's performance along a standard chessboard, where one blindly arranges rooks across the squares
     */

    @Test public void testRandom() {
        //Randomly generated
        boolean[][] testCase = {{false, true, false, false, false, false, true, true},{true, true, false, false, false, false, true, true},{false, false, false, false, true, true, false, true},{false, true, true, false, false, true, false, true},{true, true, true, true, false, false, false, true},{false, true, false, true, true, true, false, true},{false, true, true, true, false, false, false, true},{true, true, true, true, false, false, true, true}};
        int testn=8;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

        //Randomly generated
        boolean[][] testCase2={{false, false, false, false, true, true, false, false},{true, false, false, true, true, false, true, true},{true, true, false, true, true, true, true, false},{true, false, true, false, false, true, false, true},{false, false, false, false, false, false, true, false},{true, true, false, true, true, false, true, false},{false, false, false, true, false, true, false, true},{false, true, true, true, true, true, true, true}};
        result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase2));

        //Randomly generated, with one square being safe
        boolean[][] testCase3={{false, false, false, false, false, false, false, false},{false, false, false, true, true, false, true, true},{false, true, false, true, true, true, true, false},{false, false, true, false, false, true, false, true},{false, false, false, false, false, false, true, false},{false, true, false, true, true, false, true, false},{false, false, false, true, false, true, false, true},{false, true, true, true, true, true, true, true}};
        result=1;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase3));

        //Randomly generated, with 2 squares being safe
        boolean[][] testCase4={{false, false, false, false, false, false, false, false},{false, false, false, true, true, false, true, false},{false, true, false, true, true, true, true, false},{false, false, true, false, false, true, false, false},{false, false, false, false, false, false, true, false},{false, true, false, true, true, false, true, false},{false, false, false, true, false, true, false, false},{false, true, true, true, true, true, true, false}};
        result=2;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase4));

        //Randomly generated, with 4 squares being safe
        boolean[][] testCase5={{true, true, false, false, false, false, false, false},{false, false, false, false, false, false, false, false},{false, false, false, false, false, false, false, false},{false, true, true, false, false, true, false, false},{true, true, true, true, false, false, false, false},{false, true, false, true, true, true, false, false},{false, true, true, true, false, false, false, false},{true, true, true, true, false, false, false, false}};
        result=4;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase5));
    }

    // #18

    /** covers cases of rooks appearing only along one row
     */ 
    @Test public void testRow() {

        boolean[][] testCase = {{false,false},{true,true}};
        int testn=2;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #19

    /** covers cases of boards where rooks can only appear diagonal to another rook
     * <p>The rooks are always one square apart, except along their diagonal positions
     * <p>
     */
    @Test public void testOnlyDiagonal() {

        boolean[][] testCase = {{true,false,true,false},{false,true,false,true},{true,false,true,false},{false,true,false,true}};
        int testn=4;
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }

    // #20

    /** covers cases of very large boards
     *  <p>This is strictly to test the efficiency of the algorithm and it's ability to handle large arrays
     *  <p>The rooks appear along an X shape, forcing the algorithm to determine the paths of each rook
     */ 
    @Test public void testVeryLarge() {
        int testn=10000;
        int col=0;
        boolean[][] testCase = new boolean[testn][testn];
        for (int row =0;row<testn;row++){
            testCase[row][col]=true;
            testCase[testn-1-row][col]=true;
            col+=1;
        }
        int result=0;
        assertEquals(result, P2J2.countSafeSquaresRooks(testn,testCase));

    }
}

