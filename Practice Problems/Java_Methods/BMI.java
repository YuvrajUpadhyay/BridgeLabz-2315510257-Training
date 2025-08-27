public class BMI{

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        double[][] people = {
                {60, 170}, {75, 180}, {50, 160}, {90, 175}, {68, 165},
                {80, 172}, {55, 158}, {100, 185}, {45, 150}, {72, 168}
        };

        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double height = people[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            System.out.printf("Person %d → Weight: %.1f kg, Height: %.1f cm, BMI: %.2f (%s)%n",
                    i + 1, weight, height, bmi, status);
        }
    }
}
