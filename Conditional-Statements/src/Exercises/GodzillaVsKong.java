package Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget*0.1;
        double allClothes = statistCount*clothesPrice;

        if (statistCount>=150)
        {
            allClothes = allClothes*0.9;
        }

        double filmPrice = decor + allClothes;

        if(filmPrice<=filmBudget)
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget-filmPrice);
        }
        else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(filmBudget-filmPrice));
        }
    }
}
