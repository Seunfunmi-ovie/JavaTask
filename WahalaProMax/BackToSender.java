import java.util.Scanner;
    public class BackToSender {
        public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of successful delivery: ");
        int delivery = input.nextInt();

    
             int amountPerParcel = 0;
                int basePay = 5000;
            
            if(delivery < 50){
                 amountPerParcel = 160;
                 basePay = 5000;
}   

            else if (delivery >= 50 && delivery <= 59) {
                 amountPerParcel = 200;
                 basePay = 5000;

}

            else if (delivery >=60 && delivery <= 69) {
                amountPerParcel = 250;
                 basePay = 5000;
      }         
            else {
                amountPerParcel = 250;
                 basePay = 5000;
}
        

        int total = ((delivery * amountPerParcel) + basePay);
        

                System.out.println("Total delivery price is: " + total);

}

}
