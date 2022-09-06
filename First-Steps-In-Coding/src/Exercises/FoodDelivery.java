package Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegCount = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenCount * 10.35;
        double fishPrice = fishCount * 12.40;
        double vegPrice = vegCount * 8.15;

        double totalPriceMenus = chickenPrice + fishPrice + vegPrice;
        double desert = totalPriceMenus * 20 / 100;

        double totalPrice = totalPriceMenus + desert + 2.50;
        System.out.printf("%f",totalPrice);
    }
}
