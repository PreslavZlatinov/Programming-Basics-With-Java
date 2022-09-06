package Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        double finalRate = deposit*interestRate/100;
        double monthRate = finalRate/12;
        double sum = deposit + months*monthRate;
        System.out.println(sum);
    }
}
