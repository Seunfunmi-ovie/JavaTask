import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{



    @Test
    public void testThatWhenCartTotalIsLessThan5K_FunctionReturnsCartTotal(){
    
    double cartTotal = 5000;
    String promoCode = "Nil";
    double expected = 5000;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    
    
    }
    
    @Test
    public void testThatWhenCartTotalIsMinus1000_FunctionReturnInvalidAmount(){
    
    double cartTotal = -1000;
    String promoCode = "Nil";
    double expected = 0;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    }
    
    
    @Test
    public void testThatWhenCartTotalIs5000_promoCodeIsStarter10_functionReturnCartTotal(){
    
    double cartTotal = 5000;
    String promoCode = "STARTER10";
    double expected = 4500;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    
    
    }
    
    
@Test
    public void testThatWhenCartTotalIs18000_promoCodeIsBigBoy_functionReturn20PercentDiscountOnCartTotal(){
    
    double cartTotal = 18000;
    String promoCode = "BIGBOY20";
    double expected = 14400;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    
    
    }
    
    
    
@Test
    public void testThatWhenCartTotalIs30000_promoCodeIsOshoFree_functionReturn35PercentDiscountOnCartTotal(){
    
    double cartTotal = 30000;
    String promoCode = "OSHOFREE35";
    double expected = 19500;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    
    
    }

@Test
    public void testThatWhenCartTotalIs29999_promoCodeIsOshoFree_functionReturn20PercentDiscountOnCartTotal(){
    
    double cartTotal = 29999;
    String promoCode = "BIGBOY20";
    double expected = 23999.2;
    double actual = OshoFreePromoEngine.calculateOshoFree(cartTotal,promoCode);
    
    assertEquals(expected,actual);
    
    
    }

}
