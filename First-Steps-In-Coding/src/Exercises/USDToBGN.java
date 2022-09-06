package Exercises;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountToConvert = Double.parseDouble(scanner.nextLine());
        double usd = 1.79549;
        double bgn = amountToConvert * usd;
        System.out.println(bgn);
    }
}
