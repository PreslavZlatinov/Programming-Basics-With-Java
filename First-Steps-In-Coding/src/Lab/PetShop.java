package Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood = 2.50;
        double catFood = 4.00;
        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());
        double dFoodPrice = dogFood * dogFoodCount;
        double cFoodPrice = catFood * catFoodCount;
        double maxPrice = dFoodPrice + cFoodPrice;
        System.out.println(maxPrice+ " lv.");
    }
}
