package Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();

        int poorCount = 0;
        int gradeCount = 0;
        double sum = 0.0;
        String currName = "";
        boolean isPoorGrade = false;

        while(!taskName.equals("Enough"))
        {
            int grade = Integer.parseInt(scanner.nextLine());
            gradeCount++;
            sum += grade;
            currName = taskName;
            if(grade<=4)
            {
                poorCount++;
            }
            if(poorCount==poorGrades)
            {
                isPoorGrade = true;
                break;
            }
            taskName = scanner.nextLine();
        }
        if(isPoorGrade)
        {
            System.out.printf("You need a break, %d poor grades.",poorCount);
        }
        else{
            System.out.printf("Average score: %.2f%n",sum/gradeCount);
            System.out.printf("Number of problems: %d%n",gradeCount);
            System.out.printf("Last problem: %s",currName);
        }
    }
}
