package Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int pointsWon = 0;
        int wins = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String place = scanner.nextLine();

            if (place.equals("W"))
            {
                startingPoints += 2000;
                pointsWon +=2000;
                wins++;
            }
            else if(place.equals("F"))
            {
                startingPoints += 1200;
                pointsWon +=1200;
            }
            else if(place.equals("SF")){
                startingPoints += 720;
                pointsWon +=720;
            }
        }

        int averagePoints = pointsWon/tournamentCount;
        double winPercentage = (1.0*wins/tournamentCount)*100;

        System.out.printf("Final points: %d\n",startingPoints);
        System.out.printf("Average points: %d\n",averagePoints);
        System.out.printf("%.2f%%",winPercentage);

    }
}
