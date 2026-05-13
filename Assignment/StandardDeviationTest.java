import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
        public void testThatFunctionShouldAddSumOfNumbers(){
        
        double [] numbers = {3,4,5,2,1,6,7};
        double expected = 2.2092877;
        double actual = StandardDeviation.calculateStandardDeviation(numbers);
        
              
        assertEquals(expected,actual);
    
        
        }
        }

