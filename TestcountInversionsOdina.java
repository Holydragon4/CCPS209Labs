import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestcountInversionsOdina
{
    @Test public void TestcountInversions(){
        int[]c1 ={95265, 99176, 10538, 99495, 22627, 28234, 29367, 99554, 5417, 35851};
        assertEquals(23, P2J1.countInversions(c1));
        int[]c2 ={71711, 59339, 75423, 50703, 79776, 97181, 76411, 71054, 2880, 2030};
        assertEquals(28, P2J1.countInversions(c2));
        int[]c3 ={37782, 64025, 63373, 4353, 36365, 98293, 60530, 84285, 43486, 7625};
        assertEquals(24, P2J1.countInversions(c3));
        int[]c4 ={77982, 40443, 35881, 85272, 67683, 29784, 92649, 84712, 25801, 76673};
        assertEquals(24, P2J1.countInversions(c4));
        int[]c5 ={27868, 22084, 99949, 73815, 11704, 12953, 27594, 35203, 20379, 40808};
        assertEquals(23, P2J1.countInversions(c5));
        int[]c6 ={18170, 40386, 68464, 88016, 42954, 48340, 27730, 60688, 38328, 8815};
        assertEquals(26, P2J1.countInversions(c6));
        int[]c7 ={6929, 67696, 74547, 27422, 13817, 25892, 30475, 98397, 35613, 95129};
        assertEquals(14, P2J1.countInversions(c7));
        int[]c8 ={60072, 38692, 92999, 17791, 78815, 65399, 15185, 54850, 31548, 49117};
        assertEquals(28, P2J1.countInversions(c8));
        int[]c9 ={19388, 19027, 59072, 33266, 79570, 11752, 70791, 42557, 73718, 40714};
        assertEquals(17, P2J1.countInversions(c9));
        int[]c10 ={27238, 3371, 18931, 12576, 4153, 31948, 48867, 41954, 27779, 97340};
        assertEquals(11, P2J1.countInversions(c10));
        int[]c11 ={25021, 89377, 72383, 72395, 39304, 53943, 79560, 29440, 50737, 4535, 79880, 56795, 48190};
        assertEquals(43, P2J1.countInversions(c11));
        int[]c12 ={1083, 75328, 72211, 32203, 50556, 74344, 13225, 27495, 57180, 86748, 99728};
        assertEquals(19, P2J1.countInversions(c12));
        int[]c13 ={28380, 50410, 21417, 76814, 42866, 81952, 86792, 34341, 99001};
        assertEquals(9, P2J1.countInversions(c13));
        int[]c14 ={19353, 82897, 25227, 57715, 65636, 54040, 10439, 45319, 56857, 50818, 68673, 88850, 32884};
        assertEquals(34, P2J1.countInversions(c14));
        int[]c15 ={46722, 28633, 28559, 30665, 12743, 81603, 86529, 44410, 64196, 33934, 85445, 79435};
        assertEquals(22, P2J1.countInversions(c15));
        int[]c16 ={67203, 81088, 43848, 85249, 69955, 94950, 31240, 30330, 45740, 30974, 93895, 26117, 47415};
        assertEquals(48, P2J1.countInversions(c16));
        int[]c17 ={78067, 96969, 87017, 63488, 99058, 63574, 44822, 18536, 80575, 49740, 84158};
        assertEquals(34, P2J1.countInversions(c17));
        int[]c18 ={16533, 1592, 86040, 61775, 88043, 19870, 99736, 86252, 85275, 96246, 86916, 20249};
        assertEquals(23, P2J1.countInversions(c18));
        int[]c19 ={71176, 81548, 93535, 78826, 30298, 1498, 45441, 26133, 3840, 8109, 79893};
        assertEquals(37, P2J1.countInversions(c19));
        int[]c20 ={87190, 56424, 30121, 58524, 9297, 16099, 21659, 91840, 70724};
        assertEquals(18, P2J1.countInversions(c20));
    }
}
