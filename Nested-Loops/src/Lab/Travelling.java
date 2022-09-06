package Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End"))
        {
            double budget = Double.parseDouble(scanner.nextLine());
            double allMoney = 0.0;

            while (allMoney<budget)
            {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                allMoney += savedMoney;
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scanner.nextLine();
        }
    }
}
