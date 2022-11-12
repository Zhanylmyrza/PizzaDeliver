import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("How many pizza toppings do you want?. ");
        int ans = scan.nextInt();

        String[]toppings=new String [3];
        
//         int numToppings = scan.nextInt(); scan.nextLine();
//         String[] toppings = new String[numToppings]; так писать предпочтителюнее и правильнее конечно)
        
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

        scan.close();


         
    }
}
