package Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plasticNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int razreditelNeeded = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double extraPaint = paintNeeded * 0.1;

        double plasticPrice = (plasticNeeded + 2) * 1.50;
        double paintPrice = (paintNeeded + extraPaint) * 14.50;
        double razreditelPrice = razreditelNeeded * 5.00;

        double bagPrice = 0.40;
        double materialsPrice = plasticPrice + paintPrice + razreditelPrice + bagPrice;
        double salary = (materialsPrice*30/100)*workHours;
        double total = salary+materialsPrice;
        System.out.printf("%f",total);
    }
}
