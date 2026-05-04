
public class TaskFour {
    public static void main(String [] args){
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int[] even = getEvenNumber;
    System.out.print("Enter the number: ");
    for(int count : even) {
    System.out.print(" " + count);
    }
    
    System.out.println();
    
    public static int getEvenNumber(int[] number );
    int count = 0;
    
    for(int number:numbers) {
    if(number % 2 == 0) {
    count++;
    }    
    }
    int[] result = new int[count];
    int index = 0;
    for(int num : numbers) {
    if(number % 2 == 0) {
    result[index++] = number;
    }
    }
    return result;
    
    }
    
    }
    
    
