package Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int cardCount = Integer.parseInt(scanner.nextLine());
        int procCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double cardPrice = cardCount * 250;
        double procPrice = (cardPrice*0.35)*procCount;
        double ramPrice = (cardPrice*0.1)*ramCount;

        double totalPrice = cardPrice + procPrice + ramPrice;

        if (cardCount>procCount)
        {
            totalPrice = totalPrice*0.85;
        }

        double diff = Math.abs(totalPrice - budget);

        if(totalPrice<=budget)
        {
            System.out.printf("You have %.2f leva left!", diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
