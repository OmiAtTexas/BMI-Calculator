import java.util.Scanner;

public class UserInput {
    
    static Scanner scanner = new Scanner(System.in);

    public static double obtainWeight(String system){

        if(system.equalsIgnoreCase("imperial")){

            System.out.println("Enter Weight in POUNDS: ");
        }
        else{

            System.out.println("Enter Weight in KILOGRAMS: ");
        }
        return scanner.nextDouble();
    }

    public static double obtainHeight(String system){

        if(system.equalsIgnoreCase("imperial")){

            System.err.println("Enter Height in INCHES: ");
        }
        else{

            System.out.println("Enter Height in METERS: ");
        }
        return scanner.nextDouble();
    }
}
