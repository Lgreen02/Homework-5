import org.Hotdog;
import org.Fries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FriesTester {
    @Test
    public void friesBasePriceTest(){
        Fries fries = new Fries();
        assertEquals(4.25, fries.getBasePrice());
    }
}
