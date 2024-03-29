import org.Fries;
import org.Hamburger;
import org.Hotdog;
import org.Cheese;
import org.FoodItem;
import org.junit.jupiter.api.Test;
import org.FoodItemDecorator;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CheeseTester {

    @Test
    public void CheesePriceTesterHamburger(){
        FoodItem hamburger = new Hamburger();
        hamburger = new Cheese(hamburger);
        assertEquals(7.75, hamburger.getBasePrice());

    }
    @Test
    public void CheesePriceTesterHotdog(){
        FoodItem hotdog = new Hotdog();
        hotdog = new Cheese(hotdog);
        assertEquals(5.75, hotdog.getBasePrice());
    }
    @Test
    public void CheesePriceTesterFries(){
        FoodItem fries = new Fries();
        fries = new Cheese(fries);
        assertEquals(7, fries.getBasePrice());
    }
}
