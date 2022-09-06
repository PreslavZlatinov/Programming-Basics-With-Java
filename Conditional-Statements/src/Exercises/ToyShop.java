package Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int tedoberchevCount = Integer.parseInt(scanner.nextLine());
        int miniCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double toysPrice = puzzleCount * 2.60 + dollCount * 3 + tedoberchevCount * 4.10 + miniCount * 8.20 + truckCount * 2.00;
        int toysCount = puzzleCount + dollCount + tedoberchevCount + miniCount + truckCount;
        if(toysCount>=50)
        {
            toysPrice = toysPrice*0.75;
        }

        toysPrice = toysPrice * 0.90;

        double diff = Math.abs(toysPrice - tripPrice);

        if (toysPrice>=tripPrice)
        {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }
    }
}
