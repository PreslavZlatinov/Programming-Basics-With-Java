package Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hours*60) +minutes + 15;
        int finalHours = allMinutes/60;
        int finalMinutes = allMinutes%60;

        if (finalHours > 23) {
            finalHours = 0;
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        } else {
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }
    }
}
