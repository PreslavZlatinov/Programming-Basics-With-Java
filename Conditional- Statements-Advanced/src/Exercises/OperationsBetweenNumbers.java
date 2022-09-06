package Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        boolean isZero = false;
        double result = 0.0;
        String oddEven = "";

        if (sign == '+') {
            result = numOne + numTwo;
            if (result % 2 == 0) {
                oddEven = "even";
            } else {
                oddEven = "odd";
            }
        } else if (sign == '-') {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                oddEven = "even";
            } else {
                oddEven = "odd";
            }
        } else if (sign == '*') {
            result = numOne * numTwo;
            if (result % 2 == 0) {
                oddEven = "even";
            } else {
                oddEven = "odd";
            }
        } else if (sign == '/') {
            if (numTwo == 0) {
                isZero = true;
            } else {
                result = 1.0 * numOne / numTwo;
            }
        }
        else if (sign == '%') {
            if (numTwo == 0) {
                isZero = true;
            } else {
                result = numOne % numTwo;
            }
        }

        if(sign == '+' || sign == '-' || sign=='*')
        {
            System.out.printf("%d %c %d = %.0f - %s",numOne,sign,numTwo,result,oddEven);
        }
        else if (sign =='/' && !isZero)
        {
            System.out.printf("%d / %d = %.2f",numOne,numTwo,result);
        }
        else if(sign =='%' && !isZero)
        {
            System.out.printf("%d %% %d = %.0f",numOne,numTwo,result);
        }
        else if(isZero && sign =='/' || sign == '%')
        {
            System.out.printf("Cannot divide %d by zero",numOne);
        }
    }
}
