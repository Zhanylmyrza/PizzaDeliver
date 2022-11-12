import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("How many pizza toppings do you want?. ");
        int ans = scan.nextInt();

        String[]toppings=new String [3];
        
        System.out.println("Great, enter each topping!");
        
        for(int i=0; i<toppings.length; i++){
            System.out.print(i+". ");
            String usersToppings = scan.next();
            toppings[i]=usersToppings;
        }
        System.out.println("Thank you! Here are the toppings you ordered");
        for(int i=0; i<toppings.length; i++){
            System.out.println(i+". "+toppings[i]);

        }
         
        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}
