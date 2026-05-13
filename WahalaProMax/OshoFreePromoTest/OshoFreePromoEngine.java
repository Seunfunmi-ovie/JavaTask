import java.util.Scanner;

      public class OshoFreePromoEngine{
      
        public static void main(String[] seunfunmi){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the cartTotal: ");
    double cartTotal = input.nextDouble();
        
            System.out.print("Enter Discount: ");
            double discount = input.nextDouble();
            input.nextLine();
         
      System.out.print("Enter promo code: ");
      String promoCode = input.nextLine();
 double finalAmount = calculateOshoFree(cartTotal,promoCode);
  
  System.out.print("The final Amount: " + finalAmount);
 

}
   public static double calculateOshoFree(double cartTotal, String promoCode){

    if(cartTotal < 0){ 
              return 0;
    }
    
    
    if(cartTotal < 5000){
            return cartTotal;
    }
    
    
    else if(cartTotal >= 5000 && cartTotal <= 14999){
         if(promoCode.equals("STARTER10")){
         return cartTotal - (cartTotal * 0.10);
         }else{
                return cartTotal;
         }
         
         }
    else if(cartTotal >=15000 && cartTotal <= 29999){
           if(promoCode.equals("BIGBOY20")){
           return cartTotal - (cartTotal * 0.20);
           }else{
                    return cartTotal;
           }    
    } 
    
    else{
        if(promoCode.equals("OSHOFREE35")){
        return cartTotal - (cartTotal * 0.35);
        }else{
                return cartTotal;
        }
    } 
      
      
       
    }
    }
   
    
        

















