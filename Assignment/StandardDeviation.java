public class StandardDeviation {

    public static void main(String [] args){

   double [] numbers ={3,4,5,2,1,6,7};
    System.out.print(calculateStandardDeviation(numbers));

    }
    
    
    public static double calculateStandardDeviation(double [] number){
   double sum = 0;
    for (int count = 1; count < number.length; count++){
    sum += number[count];
    }
    double mean = sum/number.length;
    double square = 0;
    for (int count = 0; count < number.length; count++){
    double num = number[count] - mean;
    square += num * num;
    }
    double variance = square/(number.length - 1);
    double standard = Math.sqrt(variance);
    
    
   return standard;
    }
   
    }
   
    
    
