import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.setup();
        test.test1_flowerOrNet();

    }

    @Before
    public void setup() {
        Map.getInstance().loadMap("maps/flowerOrNet.jev");
    }

    @Test
    public void test1_flowerOrNet()
    {   
        Jeroo j1 = new Jeroo(1, 1, EAST, 0);
        assertTrue("no flower or net near in front", !j1.isFlowerOrNetNearInFront());
        assertTrue("jeroo should be at (1,1)", Map.getInstance().isJeroo(1,1));
        assertTrue("jeroo should be facing east", j1.isFacing(EAST));

        Jeroo j2 = new Jeroo(2, 1, EAST, 0);
        assertTrue("net is near in front", j2.isFlowerOrNetNearInFront());
        assertTrue("jeroo should be at (2,1)", Map.getInstance().isJeroo(2,1));
        assertTrue("jeroo should be facing east", j2.isFacing(EAST));

        Jeroo j3 = new Jeroo(3, 1, EAST, 0);
        assertTrue("flower is near in front", j3.isFlowerOrNetNearInFront());
        assertTrue("jeroo should be at (3,1)", Map.getInstance().isJeroo(3,1));
        assertTrue("jeroo should be facing east", j3.isFacing(EAST));

        Jeroo j4 = new Jeroo(4, 1, EAST, 0);
        assertTrue("water blocks clear path", !j4.isFlowerOrNetNearInFront());
        assertTrue("jeroo should be at (4,1)", Map.getInstance().isJeroo(4,1));
        assertTrue("jeroo should be facing east", j4.isFacing(EAST));
        
        Jeroo j5 = new Jeroo(5, 1, EAST, 0);
        assertTrue("water blocks clear path", !j5.isFlowerOrNetNearInFront());
        assertTrue("jeroo should be at (5,1)", Map.getInstance().isJeroo(5,1));
        assertTrue("jeroo should be facing east", j5.isFacing(EAST));
    }

}
