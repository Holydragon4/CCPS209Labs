import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestpancakeScrambleOdina
{
    @Test public void TestpancakeScramble(){
        assertEquals("", P2J3.pancakeScramble(""));
        assertEquals("VXRTACHPE I", P2J3.pancakeScramble("CHAPTER XIV"));
        assertEquals("", P2J3.pancakeScramble(""));
        assertEquals("ea h atdrto a stucet,rtsvrhgiicrrtAfe eevn e iios h oneswss ie htsegv", P2J3.pancakeScramble("After receiving her visitors, the countess was so tired that she gave"));
        assertEquals("o tvio rse tdo a erpettb,rmo id tserodr oamtn oe u h otrwstl ob uet niet", P2J3.pancakeScramble("orders to admit no more, but the porter was told to be sure to invite to"));
        
        assertEquals("an sciP,ohlh e oder h twka tt‡eÍtt--Íetl ihtefin fhrcidod rnesAn", P2J3.pancakeScramble("tÍte-‡-tÍte talk with the friend of her childhood, Princess Anna"));
        assertEquals("mr ertresensyrpr estndhesmh avlakMihyon,wo h a o enpoel ic h eundfo", P2J3.pancakeScramble("Mikhaylovna, whom she had not seen properly since she returned from"));
        assertEquals("wr ea nseptbno-atrhhi avlakMan guseePtrbr.An ihyon,wt e erwr u laatfc,de", P2J3.pancakeScramble("Petersburg. Anna Mikhaylovna, with her tear-worn but pleasant face, drew"));
        assertEquals(".stucetf ato eanracrhe hi errt hto h ones", P2J3.pancakeScramble("her chair nearer to that of the countess."));
        assertEquals("", P2J3.pancakeScramble(""));
        
        assertEquals("", P2J3.pancakeScramble(""));
        assertEquals("rhdsepseno h dsa n rVt eolavlakManAn ihyon okda eaadpue.Tecuts rse e", P2J3.pancakeScramble("Anna Mikhaylovna looked at Vera and paused. The countess pressed her"));
        assertEquals(".nhsderfin' ad", P2J3.pancakeScramble("friend's hand."));
        assertEquals("", P2J3.pancakeScramble(""));
        assertEquals("mr ertresensyrpr estndhesmh avlakMihyon,wo h a o enpoel ic h eundfo", P2J3.pancakeScramble("Mikhaylovna, whom she had not seen properly since she returned from"));
        assertEquals("wr ea nseptbno-atrhhi avlakMan guseePtrbr.An ihyon,wt e erwr u laatfc,de", P2J3.pancakeScramble("Petersburg. Anna Mikhaylovna, with her tear-worn but pleasant face, drew"));
        assertEquals(".stucetf ato eanracrhe hi errt hto h ones", P2J3.pancakeScramble("her chair nearer to that of the countess."));
        assertEquals(".nho i n eiwe u eomr,bth atdadddntig", P2J3.pancakeScramble("more, but he waited and did nothing."));
        assertEquals("", P2J3.pancakeScramble(""));
        assertEquals("o i eabe,hnh eghe tbtaon udpu h ledSudnysejme pot  u ob ihrta e mrcdhms", P2J3.pancakeScramble("Suddenly she jumped up onto a tub to be higher than he, embraced him so"));
    }
}
