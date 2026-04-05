  import java.util.Scanner;

        public class EquilateralToPrism {
        
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put the length : ");
        
        int number1 = input.nextInt();

        double area = (0.43301 * (number1 * number1)) * (number1);

        System.out.println("Volume is : " + area);


}

}
