package Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePen = 5.80;
        double markerPrice = 7.20;
        double detergentPrice = 1.20;

        int pensCount = Integer.parseInt(scanner.nextLine());
        int markerCount = Integer.parseInt(scanner.nextLine());
        int detergentLitres = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double penFinalPrice = pensCount*pricePen;
        double markerFinalPrice = markerCount*markerPrice;
        double detergentFinalPrice = detergentLitres*detergentPrice;
        double totalPrice = penFinalPrice + markerFinalPrice + detergentFinalPrice;
        double priceWithDiscount = totalPrice - (totalPrice*discountPercentage/100);
        System.out.println(priceWithDiscount);
    }
}
