import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
        public void testThatFunctionShouldAddSumOfNumbers(){
        
        double [] numbers = {3,4,5,2,1,6,7};
        double expected = 25.0;
        double actual = StandardDeviation.calculateSum(numbers);
        
              
        assertEquals(expected,actual);
    
        
        }
        
        
         @Test
        public void testThatFunctionShouldAddSumOfNumbersEqualsMean(){
        
        double [] numbers = {3,4,5,2,1,6,7};
        double sum = 25.0;
        double expected = 3.5714285714285716;
        double actual = StandardDeviation.calculateMean(sum, numbers);
        
              
        assertEquals(expected,actual);
    
        
        }
        
        @Test
        public void testThatFunctionShouldAddSquareOfMeanEqualsStandardDeviation(){
        
        double [] numbers = {3,4,5,2,1,6,7};
 
        double mean = 3.5714285714285716;
        double expected = 0.5102040816326531;
        double actual = StandardDeviation.calculateMean(mean, numbers);
        
              
        assertEquals(expected,actual);
    
        
        }
        }

