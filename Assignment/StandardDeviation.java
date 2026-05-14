public class StandardDeviation {

    public static void main(String [] args){

          double[] numbers = {3, 4, 5, 2, 1, 6, 7};

        double sum = calculateSum(numbers);
        double mean = calculateMean(sum,numbers);
        double standardDeviation = calculateStandardDeviation(numbers, mean);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
    
    
            public static double calculateSum(double [] number){
                 double sum = 0;
                for (int count = 1; count < number.length; count++){
                     sum += number[count];
                 }
                 return sum;
            }
            
            public static double calculateMean(double sum, double[] number) {
                return sum / number.length;
            }
    
    
           public static double calculateStandardDeviation(double[] number, double mean) {
                double squareSum = 0;
                
                for (int count = 0; count < number.length; count++) {
                    double num = number[count] - mean;
                    squareSum += num * num;
                }


                double variance = squareSum / (number.length - 1);
                return Math.sqrt(variance);
            }
   
    }
   
    
    
