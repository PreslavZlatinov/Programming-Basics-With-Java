package Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double secondsRecord = Double.parseDouble(scanner.nextLine());
        double metresCount = Double.parseDouble(scanner.nextLine());
        double timePerMetre = Double.parseDouble(scanner.nextLine());

        double timeIvan = metresCount*timePerMetre;
        double exraSlowing = Math.floor((metresCount/15))*12.5;

        double finalTime = timeIvan + exraSlowing;
        double extraTime = Math.abs(finalTime - secondsRecord);
        if(finalTime>=secondsRecord)
        {
            System.out.printf("No, he failed! He was %.2f seconds slower.", extraTime);
        }
        else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }
    }
}
