package Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String restPlace = "";
        double tripPrice = 0.0;
        if (budget<=100)
        {
            destination = "Bulgaria";
            if (season.equals("summer"))
            {
                restPlace = "Camp";
                tripPrice = budget * 0.30;
            }
            else if(season.equals("winter"))
            {
                restPlace = "Hotel";
                tripPrice = budget * 0.70;
            }
        }
        else if(budget<=1000)
        {
            destination = "Balkans";
            if (season.equals("summer"))
            {
                restPlace = "Camp";
                tripPrice = budget * 0.40;
            }
            else if(season.equals("winter"))
            {
                restPlace = "Hotel";
                tripPrice = budget * 0.80;
            }
        }
        else {
            destination = "Europe";
            restPlace = "Hotel";
            tripPrice = budget * 0.90;
        }

        System.out.printf("Somewhere in %s",destination + "\n");
        System.out.printf("%s - %.2f",restPlace,tripPrice);
    }
}
