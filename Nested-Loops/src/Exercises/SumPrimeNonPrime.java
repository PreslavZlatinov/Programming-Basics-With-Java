package Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsString = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        int counter = 0;
        while (!numberAsString.equals("stop")) {
            int numberAsInt = Integer.parseInt(numberAsString);


            if (numberAsInt < 0) {
                System.out.println("Number is negative.");
                numberAsString = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= numberAsInt; i++) {
                if (numberAsInt % i == 0)
                {
                    counter++;
                }
            }

            if (counter == 2)
            {
                primeSum += numberAsInt;
            }
            else{
                nonPrimeSum += numberAsInt;
            }

            numberAsString = scanner.nextLine();
            counter = 0;
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);
    }
}
