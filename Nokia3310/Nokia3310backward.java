import java.util.Scanner;

       public class Nokia3310 {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    int start = 0;
    while (start==0){
    System.out.print("""

                            List of menu function
                            1. PhoneBook
                            2. Messages
                            3. Chat
                            4. Call Register
                            5.  Tones
                            6. Settings
                            7. Call divert
                            8. Games
                            9. Calculator
                            10. Reminder
                            11. Clock
                            12. Profiles
                            13. SIM services             
            
                        """);
        System.out.print("Enter Option: ");
        int option = input.nextInt();
    switch (option) {
            case 1->{
                        System.out.print("""

                            PhoneBook
                            1. Search
                            2. Sevice No
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags               
                                 
                        """);
        System.out.println("Enter option: ");
            option = input.nextInt();
           switch (option) {
            case 1 ->  System.out.println("Search");
            case 2 ->   System.out.println("Service No");
            case 3 ->   System.out.println("Add name");
            case 4 ->   System.out.println("Erase");
            case 5 ->   System.out.println("Edit");
            case 6 ->   System.out.println("Assign tone");
            case 7 ->   System.out.println("Send b'card");
            case 8 ->{  
                    int back = 3;
                    while(back==3){
                    System.out.print("""
                            
                            Options
                            1. Type of view
                            2. Memory status
                            3. back

                               """); 
            System.out.println("Enter option: ");
            option = input.nextInt();
           switch (option) {
           case 1 -> System.out.println("1. Type of view");
           case 2 -> System.out.println("2. Memory");
           
            }

           System.out.print("press 3 to go to previous menu:");
           back = input.nextInt();

 }
}

        case 9 -> System.out.println("Speed dials");
        case 10 ->   System.out.println("Voice tags");
        
        }
    }
}
        System.out.println("press 0 to exit");
        start = input.nextInt();
        if(start==0) System.out.println("\texitting");
}
}
}








