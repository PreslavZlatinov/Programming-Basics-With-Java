package Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;

        for (int i = 0; i < number; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum +=num;
        }

        int rightSum = 0;
        for (int i = 0; i < number; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum +=num;
        }

        int diff = Math.abs(leftSum-rightSum);

        if (leftSum==rightSum)
        {
            System.out.printf("Yes, sum = %d", rightSum);
        }
        else{
            System.out.printf("No, diff = %d", diff);
        }
    }
}
