import java.util.Scanner;
    public class RainbowColourDisplay {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
            int number1 = input.nextInt();
    
        if (number1==1) {
        System.out.println("Yellow");
}

      else if (number1 == 2) {
        System.out.println("Indigo");
}

       else if (number1 == 3) {
        System.out.println("Blue");
}
    
    else if (number1 == 4) {
        System.out.println("Red");
}

   else if (number1 ==5) {
        System.out.println("Green");
}

      else  if (number1 == 6) {
        System.out.println("Violet");
}

    else  if (number1 == 7) {
        System.out.println("Orange");
}

    
}

}
