package Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (int i = numOne; i <= numTwo ; i++) {
            String currNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currNum.length(); j++) {
                int currDigit = Integer.parseInt(String.valueOf(currNum.charAt(j)));
                if (j%2==0)
                {
                    evenSum +=currDigit;
                }
                else{
                    oddSum += currDigit;
                }
            }

            if(evenSum==oddSum)
            {
                System.out.print(currNum + " ");
            }
            
        }
    }
}
