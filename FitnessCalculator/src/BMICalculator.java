public class BMICalculator {
    public double calculateBmiMetric(double weightInKilos,
                                     double heightInMeters){
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    public double calculateBmiImperial(double weightInPounds,
                                       double heightInInches) {
        // two arguments required for this method
        return weightInPounds / (heightInInches * heightInInches) * 703;
    }
}
