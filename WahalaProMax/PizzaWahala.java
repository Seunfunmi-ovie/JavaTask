 import java.util.Scanner;
  public class PizzaWahala {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

 
        
      
     System.out.print(""" 
                
              WELCOME TO IYA ARAMIDE PIZZA JOINT
                
                1. Sapa size
                2. Small Money
                3. Big boys
                4. Odogwu

                    """);


        System.out.print("Enter the options: ");
         int option = input.nextInt();
            
        System.out.println("Enter the number of guest: ");
            int guest = input.nextInt(); 
                    
    
         int numberOfSlice = 0;
         int priceOfPizza = 0;  
         
                  switch(option) {           
                    case 1 ->{  System.out.println("You ordered sapa size");
                                   numberOfSlice = 4;
                                    priceOfPizza = 2500;                    

}
                        case 2 ->{ System.out.println("You ordered small money");
                                   numberOfSlice = 6;
                                    priceOfPizza = 2900; 
                                    
}   
                        case 3 ->{ System.out.println("You ordered Big boys"); 
                                       numberOfSlice = 8;
                                    priceOfPizza = 4000;  
}

                        case 4 ->{ System.out.println("You ordered Odogwu");
                                        numberOfSlice = 12;
                                    priceOfPizza = 5200;  
}
                        default -> System.out.println("Invalid options: ");

}

                        int box = guest/numberOfSlice;
               
                    if (guest % numberOfSlice != 0) {
                                box = box + 1;
                        
                              
                System.out.println("The number of box is: " + box);
}
                    else {
                    System.out.println("The number of box is: " + box);
                        }
                        
        int price = box * priceOfPizza;
            System.out.println("Price:  " + price);
            
        int leftOver = (numberOfSlice * box) - guest;
    
           System.out.println("Leftover:  " + leftOver);
          
           
            

       }    
}


 

 



