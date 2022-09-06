package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        int fail = 0;
        double total = 0.0;
        while (grade <= 12)
        {
            if (fail==2)
            {
                System.out.printf("%s has been excluded at %d grade",name,grade);
                break;
            }
            double num = Double.parseDouble(scanner.nextLine());
            if (num<4.00)
            {
                fail++;
                continue;
            }
            else{
                total +=num;
            }
            grade++;
        }

        if(grade>=12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, total / 12);
        }
    }
}
