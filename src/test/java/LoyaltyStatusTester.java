import org.LoyaltyStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoyaltyStatusTester {
    @Test
    public void newMemberDiscountTest(){
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("New Member");
        assertEquals(0.75, loyaltyStatus.applyDiscount(1.0));
    }
    @Test
    public void valuedMemberDiscountTest(){
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("Valued Member");
        assertEquals(0.7, loyaltyStatus.applyDiscount(1.0));
    }
    @Test
    public void bigSpenderDiscountTest(){
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("Big Spender");
        assertEquals(0.5, loyaltyStatus.applyDiscount(1.0));
    }
}
