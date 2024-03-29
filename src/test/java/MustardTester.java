import org.*;
import org.FoodItem;
import org.Mustard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MustardTester {
    @Test
    public void MustardPriceTesterHamburger(){
        FoodItem hamburger = new Hamburger();
        hamburger = new Mustard(hamburger);
        assertEquals(5.75, hamburger.getBasePrice());

    }
    @Test
    public void MustardPriceTesterHotdog(){
        FoodItem hotdog = new Hotdog();
        hotdog = new Mustard(hotdog);
        assertEquals(3.75, hotdog.getBasePrice());
    }
    @Test
    public void MustardPriceTesterFries(){
        FoodItem fries = new Fries();
        fries = new Mustard(fries);
        assertEquals(5.0, fries.getBasePrice());
    }
}
