package Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgeCount; i++) {
                String judgeName = scanner.nextLine();
                double judgePoints = Double.parseDouble(scanner.nextLine());
                double pointsSum = (judgeName.length() * judgePoints)/2;
                academyPoints +=pointsSum;

                if (academyPoints>1250.5)
                {
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,academyPoints);
                    break;
                }
        }

        double pointsDiff = 1250.5 - academyPoints;
        if (academyPoints <= 1250.5)
        {
            System.out.printf("Sorry, %s you need %.1f more!",actorName,pointsDiff);
        }
    }
}
