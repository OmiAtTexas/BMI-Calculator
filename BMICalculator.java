public class BMICalculator {
    
    double weightInPounds;
    double heightInInches;
    double weightInKilos;
    double heightInMeters;

    public double calculateBmiImperial(double weightInPounds, double heightInInches){

        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters){

        return weightInKilos / (heightInMeters * heightInMeters);

    }

    public String getBmiCategory(double bmi){

        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi < 25){
            return "Normal Weight";
        }
        else if(bmi < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
}
