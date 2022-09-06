package Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String goHome = scanner.nextLine();
        int steps = 0;
        int diff;
        while (!goHome.equals("Going home"))
        {
            double stepsCounter = Double.parseDouble(goHome);
            steps += stepsCounter;
            if(steps>=10000)
            {
                diff = steps - 10000;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",diff);
                break;
            }
            goHome = scanner.nextLine();
        }
        if(goHome.equals("Going home"))
        {
            int toHomeSteps = Integer.parseInt(scanner.nextLine());
            steps +=toHomeSteps;
            if(steps>=10000)
            {
                diff = steps - 10000;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",diff);
            }
        }

        if(steps<10000)
        {
            System.out.printf("%d more steps to reach goal.",Math.abs(steps-10000));
        }

    }
}
