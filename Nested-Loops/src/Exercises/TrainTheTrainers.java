package Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double finalResult = 0.0;
        int judge = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        int presentCount = 0;
        while (!presentationName.equals("Finish")) {
            presentCount++;
            double averageScore = 0.0;
            for (int i = 1; i <= judge; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                averageScore += score;
            }
            double result = averageScore / judge;
            finalResult += result;
            System.out.printf("%s - %.2f.%n", presentationName, result);
            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",finalResult/presentCount);
    }
}
