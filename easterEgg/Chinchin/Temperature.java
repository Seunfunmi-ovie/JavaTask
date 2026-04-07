import java.util.Scanner;

      public class Temperature {

 public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

       System.out.println("Enter Temperature in Celsius: ");
        int number1 = input.nextInt();

            if(number1 <=0){

    System.out.println("Freezing");
}
else if (number1 >=0 && number1 < 16) {
        System.out.println("Cold");}

        else if (number1>=16 && number1 < 25) {
            System.out.println("Warm");
}

            else if (number1 >=25 && number1 < 25) { 
                System.out.println("Hot");
}

       

}

}
