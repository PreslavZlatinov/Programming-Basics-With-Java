package Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double aquariumV = length * width * height;
        double litresV = aquariumV/1000;

        double finalLitres = litresV * (1-percentage/100);
        System.out.println(finalLitres);
    }
}
