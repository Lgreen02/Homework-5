
import org.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrderTester {

    @Test
    public void calculateOrderTester(){
        FoodItem hamburger = new Hamburger();
        hamburger = new Cheese(hamburger);

        hamburger = new Ketchup(hamburger);
        FoodItem hotdog = new Hotdog();
        hotdog = new Mustard(hotdog);

        Order order1 = new Order();
        order1.addOrderItem(hamburger);
        order1.addOrderItem(hotdog);

        assertEquals(12.5, order1.calculateTotal());

    }

}
