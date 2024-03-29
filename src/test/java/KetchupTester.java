import org.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class KetchupTester {
    @Test
    public void KetchupPriceTesterHamburger(){
        FoodItem hamburger = new Hamburger();
        hamburger = new Ketchup(hamburger);
        assertEquals(6.0, hamburger.getBasePrice());

    }
    @Test
    public void KetchupPriceTesterHotdog(){
        FoodItem hotdog = new Hotdog();
        hotdog = new Ketchup(hotdog);
        assertEquals(4.0, hotdog.getBasePrice());
    }
    @Test
    public void KetchupPriceTesterFries(){
        FoodItem fries = new Fries();
        fries = new Ketchup(fries);
        assertEquals(5.25, fries.getBasePrice());
    }
}
