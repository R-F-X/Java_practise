
import java.util.Scanner;

public class app1 {

    Scanner userIn = new Scanner(System.in);

    void theVehicle1() {
        int maxVehicleLoad = 4000; // 4000 kg
         
        // heading
        System.out.println("\nVehicle load capacity");
        // String line = "=======================";
        System.out.println("=====================\n");


        System.out.print("Enter item 1: ");
        String item1 = userIn.nextLine();
        System.out.print("Enter the mass of item 1: ");
        double mass1 = userIn.nextDouble();
        
        System.out.print("\nEnter item 2: ");
        String item2 = userIn.next();
        System.out.print("Enter the mass of item 2: ");
        double mass2 = userIn.nextDouble();
        
        System.out.print("\nEnter item 3: ");
        String item3 = userIn.next();
        System.out.print("Enter the mass of item 3: ");
        double mass3 = userIn.nextDouble();
        
        // calc total weight
        int totalWeight = (int) (mass1 + mass2 + mass3);
        
        
        // printing
        System.out.println("\n");
        System.out.println(item1 + ": \t" + mass1 + "kg");
        System.out.println(item2 + ": \t" + mass2 + "kg");
        System.out.println(item3 + ": \t" + mass3 + "kg");

        
        
        if (totalWeight > maxVehicleLoad) {
            System.out.println("\nMass of all loaded items: \t" + totalWeight + "kg");

            double exceeded = totalWeight - maxVehicleLoad;
            System.out.println("Exceeded recommended mass by: \t" + exceeded + "kg");
        }
        
        else if (totalWeight <  maxVehicleLoad) {
            System.out.println("\nMass of all loaded items: \t" + totalWeight + "kg");

            double remaining =  maxVehicleLoad - totalWeight;
            System.out.println("Available mass: \t" + remaining + "kg");
        }
        
        
    }

   
}
