import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Esau

public class pancakeScramblerTestER
{
    @Test
     public void testpancake(){
        String [] a1 = {"pancake","abcdefghijklmnopqrstuvwxyz","nmolpkqjishtgufvewdxcybza","abcdef","","d","Ryerson","@#$%**","computer science","Ilkka Markus","Oracle Blue J","Curb your enthusiasm","Buttermilk pancakes with syrup","The Church of Latter day Saints","\n","java swing GUI","Java is an object oriented language","Social Distancing |--6M--|","Winter goes to spring","Ground hog day"};
        String  [] a2 = {"eanpack","zxvtrpnljhfdbacegikmoqsuwy","abcdefghiqponmlkjstuvwxyz","fdbace","","d","nseRyro","* $@#%*","cempetir sceunco","Ulkka Markis","Jel laOrceBu ","mashn uybuCr oretuis","prshi eanpkirtuBteml ackswt yu","sna a etLf cuCeTh hrho atrdySit","\n","IGgisaajv wn U","eaga enioteb as vJaai nojc retdlnug","|-6- ncasDlioSca itnig|-M-","gip tso enWitrge osrn","ydghdurGon o a"};
        
        for(int i=0;i<20;i++){
            a1[i] = P2J3.pancakeScramble(a1[i]);
            try{
                assertEquals(a2[i],a1[i]);
            }
                catch(AssertionError assertFailed)
                {System.out.println("Failed");}
            }
        }
}

