package Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());
        double rentPrice = 0.0;

        switch (season)
        {
            case "Spring":
                rentPrice = 3000;
                break;

            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;

            case "Winter":
                rentPrice = 2600;
                break;
        }

        if (fishersCount<=6)
        {
            rentPrice = rentPrice*0.9;
        }
        else if (fishersCount>7 && fishersCount<=11)
        {
            rentPrice = rentPrice*0.85;
        }
        else if (fishersCount>12)
        {
            rentPrice = rentPrice*0.75;
        }

        if (fishersCount%2==0 && !season.equals("Autumn"))
        {
            rentPrice = rentPrice*0.95;
        }

        double diff = Math.abs(rentPrice-budget);

        if(rentPrice<=budget)
        {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }


    }
}
