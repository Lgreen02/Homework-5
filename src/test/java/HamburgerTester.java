import org.Hamburger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamburgerTester {
    @Test
    public void hamburgerNameTest(){
        Hamburger hamburger = new Hamburger();
        assertEquals("Hamburger", hamburger.getName());
    }

    @Test
    public void hamburgerBasePriceTest(){
        Hamburger hamburger = new Hamburger();
        assertEquals(5.0, hamburger.getBasePrice());
    }
}
