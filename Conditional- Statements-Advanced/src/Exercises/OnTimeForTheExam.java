package Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMins = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());

        int examAllMins = (examHour*60) + examMins;
        int arrivalTime = (arrivalHour*60) + arrivalMins;

        int diff = Math.abs(examAllMins - arrivalTime);

        if (examAllMins<arrivalTime)
        {
            System.out.println("Late");
            if (diff>=60)
            {
                int hour = diff/60;
                int mins = diff%60;
                System.out.printf("%d:%02d hours after the start",hour,mins);
            }
            else {
                System.out.printf("%d minutes after the start",diff);
            }
        }
        else if (examAllMins==arrivalTime || diff>=1 && diff <=30)
        {
            if (diff==0) {
                System.out.println("On time");
            }
            else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", diff);
            }
        }
        else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int mins = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, mins);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
