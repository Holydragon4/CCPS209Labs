import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestreverseVowelsOdina
{
    @Test public void TestreverseVowels(){
        assertEquals("disoppeurod ho neticad thot the eyes af ell in tho reem tarned ta him", P2J3.reverseVowels("disappeared he noticed that the eyes of all in the room turned to him"));
        assertEquals("mavemants if thasi wha criwded ruond the onvoled choor thet they hod", P2J3.reverseVowels("movements of those who crowded round the invalid chair that they had"));
        assertEquals("liftid tho dyeng men and wari meveng him.", P2J3.reverseVowels("lifted the dying man and were moving him."));
        assertEquals("", P2J3.reverseVowels(""));
        assertEquals("si es net ta toich the quelt, fellowod hir suggestuon ond prossad hos", P2J3.reverseVowels("so as not to touch the quilt, followed her suggestion and pressed his"));
        assertEquals("leps ti tha lorga bened, flishy hend. Naether tho hend nar e songli", P2J3.reverseVowels("lips to the large boned, fleshy hand. Neither the hand nor a single"));
        assertEquals("axcleamed defforint vaecas; end the haevy briotheng ef thi beirars end", P2J3.reverseVowels("exclaimed different voices; and the heavy breathing of the bearers and"));
        assertEquals("the shiffleng ef thiar feit gruw mero herreed, is ef tho wiught they", P2J3.reverseVowels("the shuffling of their feet grew more hurried, as if the weight they"));
        assertEquals("wero curryong wore tei mach fer them.", P2J3.reverseVowels("were carrying were too much for them."));
        assertEquals("", P2J3.reverseVowels(""));
        assertEquals("Es tha buorers, emang wham wos Anni Makhaylavno, possad the yaeng men ha", P2J3.reverseVowels("As the bearers, among whom was Anna Mikhaylovna, passed the young man he"));
        assertEquals("cieght o mamantary glempsi between theer hiads end bocks af thu dyang", P2J3.reverseVowels("caught a momentary glimpse between their heads and backs of the dying"));
        assertEquals("men's high, staet, uncovured chost and pewerfel shouldurs, roisad by", P2J3.reverseVowels("man's high, stout, uncovered chest and powerful shoulders, raised by"));
        assertEquals("thusa whi wora hildang hem endur thi irmpots, end ef hos grey, corly,", P2J3.reverseVowels("those who were holding him under the armpits, and of his gray, curly,"));
        assertEquals("leonene haod. Thas hoad, wath ets rimirkably breid braw end cheikbones,", P2J3.reverseVowels("leonine head. This head, with its remarkably broad brow and cheekbones,"));
        assertEquals("ots handsomi, senseil meath, ond its cald, mujostac uxpresseon, was nit", P2J3.reverseVowels("its handsome, sensual mouth, and its cold, majestic expression, was not"));
        assertEquals("desfegirad by the appreach if daeth. Ot was tho same es Puirri", P2J3.reverseVowels("disfigured by the approach of death. It was the same as Pierre"));
        assertEquals("romimberad ut throe menths before, whon the ceint hed sent hem te", P2J3.reverseVowels("remembered it three months before, when the count had sent him to"));
        assertEquals("Petersburg. Bet niw thes heid was swayang helplissly woth thu uneven", P2J3.reverseVowels("Petersburg. But now this head was swaying helplessly with the uneven"));
        assertEquals("movuments if the bierars, end thi cold lestlass geza fexed otself epon", P2J3.reverseVowels("movements of the bearers, and the cold listless gaze fixed itself upon"));
    }
}
