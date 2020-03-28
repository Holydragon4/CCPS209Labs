import static org.junit.Assert.*;
import org.junit.Test;

public class TestEveryOtherJarvis {
    @Test public void testEveryOther(){
        assertArrayEquals(new int[]{},P2J1.everyOther(new int[]{}));
        assertArrayEquals(new int[]{45, 0, 39, 30},P2J1.everyOther(new int[]{45, 3, 0, 7, 39, 9, 30, 4}));
        assertArrayEquals(new int[]{7, 13},P2J1.everyOther(new int[]{7, 27, 13, 21}));
        assertArrayEquals(new int[]{34, 9},P2J1.everyOther(new int[]{34, 3, 9}));
        assertArrayEquals(new int[]{6, 38, 49},P2J1.everyOther(new int[]{6, 10, 38, 27, 49, 7}));
        assertArrayEquals(new int[]{16, 17, 11, 18, 49},P2J1.everyOther(new int[]{16, 34, 17, 39, 11, 24, 18, 48, 49}));
        assertArrayEquals(new int[]{18, 42, 11, 35},P2J1.everyOther(new int[]{18, 49, 42, 49, 11, 24, 35}));
        assertArrayEquals(new int[]{24, 15, 21, 36, 22},P2J1.everyOther(new int[]{24, 31, 15, 40, 21, 33, 36, 22, 22}));
        assertArrayEquals(new int[]{16},P2J1.everyOther(new int[]{16}));
        assertArrayEquals(new int[]{15},P2J1.everyOther(new int[]{15, 45}));
        assertArrayEquals(new int[]{21, 7},P2J1.everyOther(new int[]{21, 33, 7}));
        assertArrayEquals(new int[]{27, 9, 48},P2J1.everyOther(new int[]{27, 48, 9, 44, 48}));
        assertArrayEquals(new int[]{40, 10, 1, 1},P2J1.everyOther(new int[]{40, 16, 10, 19, 1, 8, 1, 13}));
        assertArrayEquals(new int[]{38},P2J1.everyOther(new int[]{38, 22}));
        assertArrayEquals(new int[]{34, 46, 44},P2J1.everyOther(new int[]{34, 13, 46, 9, 44}));
        assertArrayEquals(new int[]{34, 38, 29, 20, 22},P2J1.everyOther(new int[]{34, 37, 38, 18, 29, 31, 20, 44, 22}));
        assertArrayEquals(new int[]{18, 28, 49, 36},P2J1.everyOther(new int[]{18, 22, 28, 31, 49, 19, 36}));
        assertArrayEquals(new int[]{19, 47, 22, 7, 33},P2J1.everyOther(new int[]{19, 37, 47, 8, 22, 21, 7, 11, 33}));
        assertArrayEquals(new int[]{11, 33, 31, 38},P2J1.everyOther(new int[]{11, 48, 33, 26, 31, 18, 38}));
        assertArrayEquals(new int[]{10, 27, 42, 17, 37},P2J1.everyOther(new int[]{10, 39, 27, 37, 42, 34, 17, 47, 37}));

    }
}