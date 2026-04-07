import java.util.Scanner;
        public class Atm {
     public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int correctpin =1234;

    System.out.println("Display balance: ");
        int number1 = input.nextInt();

if (number1 >= 1000) {
    System.out.println("Pin is Correct");
}

        else if (number1 <=0 && number1 < 1000) {
        System.out.println("Incorrect Pin");
}

}

}
