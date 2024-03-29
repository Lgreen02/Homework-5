import org.Hamburger;
import org.Hotdog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HotdogTester {
    @Test
    public void hotdogBasePriceTest(){
        Hotdog hotdog = new Hotdog();
        assertEquals(3.0, hotdog.getBasePrice());
    }
}
