package Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxYear = Integer.parseInt(scanner.nextLine());
        double jordans = taxYear - taxYear * 40 / 100;
        double clothes = jordans - jordans * 20 / 100;
        double ball = clothes / 4;
        double accessories = ball / 5;

        double totalPrice = taxYear + jordans + clothes + ball +accessories;
        System.out.println(totalPrice);
    }
}
