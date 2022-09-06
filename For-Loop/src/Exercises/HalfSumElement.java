package Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num>maxNum)
            {
                maxNum = num;
            }
            sum+=num;
        }
        sum = sum - maxNum;

        if(maxNum == sum)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d",maxNum);
        }
        else
        {
            int diff = Math.abs(maxNum-sum);
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }


    }
}
