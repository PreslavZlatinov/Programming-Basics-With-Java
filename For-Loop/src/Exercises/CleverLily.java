package Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double money = 0.0;
        double moneyHui = 0.0;
        int toyCount = 0;
        for (int i = 1; i <= age; i++) {
            if(i%2==0)
            {
                money += 10.00;
                moneyHui += money;
                moneyHui--;
            }
            else {
                toyCount +=1;
            }
        }
        double allMoney = moneyHui + (toyCount*toyPrice);
        double diff = Math.abs(allMoney-laundryPrice);
        if(allMoney>=laundryPrice)
        {
            System.out.printf("Yes! %.2f",diff);
        }
        else{
            System.out.printf("No! %.2f",diff);
        }
    }
}
