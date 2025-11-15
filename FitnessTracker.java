NAME: ELIZABETH WANJIRA
REG NO: S08-8408-2024

import java.util.Scanner;

public class FitnessTracker {

    // Method to determine fitness level
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000 && steps < 10000) {
            return "Good";
        } else if (steps >= 4000 && steps < 7000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();

        String fitnessLevel = getFitnessLevel(steps);

        System.out.println("Your fitness level: " + fitnessLevel);

        input.close();
    }
}
