package Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metres = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double totalPrice = metres * price;
        double discount = totalPrice* 18 / 100;
        double finalPrice =totalPrice-discount;
        System.out.printf("The final price is: %f lv.",finalPrice);
        System.out.printf("\nThe discount is: %f lv.",discount);
    }
}
