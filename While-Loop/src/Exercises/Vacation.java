package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        int daysCount = 0;
        while(moneyAvailable < tripMoney)
        {
            daysCount++;
            String action = scanner.nextLine();
            double extraMoney = Double.parseDouble(scanner.nextLine());
            if(action.equals("spend"))
            {
                counter++;
                moneyAvailable -=extraMoney;
                if(moneyAvailable < 0)
                {
                    moneyAvailable = 0;
                }
            }
            else if(action.equals("save"))
            {
                counter = 0;
                moneyAvailable +=extraMoney;
            }
            if(counter >= 5)
            {
                System.out.println("You can't save the money.");
                System.out.println(daysCount);
                break;
            }
        }
        if (moneyAvailable>=tripMoney)
        {
            System.out.printf("You saved the money for %d days.",daysCount);
        }
    }
}
