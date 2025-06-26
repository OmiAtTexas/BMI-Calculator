import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            BMICalculator bmiCalculator = new BMICalculator();


            System.err.println("                    BMI CALCULATOR                   ");
            System.err.println("-----------------------------------------------------");

            System.out.println("Enter BMI system (IMPERIAL or METRIC): ");
            String system = scanner.nextLine().toUpperCase();

            double weight = 0.0;
            double height = 0.0;
            double bmi = 0.0;
            String bmiCategory = "";

            switch(system){

                case "IMPERIAL":
                    weight = UserInput.obtainWeight("imperial");
                    height = UserInput.obtainHeight("imperial");
                    bmi = bmiCalculator.calculateBmiImperial(weight, height);
                    break;
                case "METRIC":
                    weight = UserInput.obtainWeight("metric");
                    height = UserInput.obtainHeight("metric");
                    bmi = bmiCalculator.calculateBmiMetric(weight, height);
                    break;
                default:
                    System.out.println("Please enter a valid BMI system" + '\n');
                    return;  
            }

            bmiCategory = bmiCalculator.getBmiCategory(bmi);

            System.out.println("Your BMI is: " + bmi);
            System.out.println("BMI Category: " + bmiCategory);
        }

        System.err.println("-----------------------------------------------------");
    }
}
