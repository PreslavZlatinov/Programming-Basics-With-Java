package Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String moviename = scanner.nextLine();
        int movieDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakDuration/8.0;
        double restTime = breakDuration/4.0;

        double leftTime = breakDuration - lunchTime - restTime;
        double oshteVreme = Math.abs(leftTime - movieDuration);

        if (leftTime>=movieDuration)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",moviename,Math.ceil(oshteVreme));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",moviename,Math.ceil(oshteVreme));
        }
    }
}
