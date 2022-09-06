package Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int magicalNum = Integer.parseInt(scanner.nextLine());

        int combCount = 0;
        boolean flag = false;

        for (int i = numOne; i <= numTwo; i++) {
            for (int j = numOne; j <= numTwo ; j++) {
                combCount++;
                int res = i + j;
                if (res == magicalNum)
                {
                    System.out.printf("Combination N:%d ",combCount);
                    System.out.printf("(%d + %d = %d)",i,j,magicalNum);
                    flag = true;
                    break;
                }
            }
            if (flag)
            {
                break;
            }
        }
        if(!flag) {
            System.out.printf("%d combinations - neither equals %d",combCount,magicalNum);
        }
    }
}
