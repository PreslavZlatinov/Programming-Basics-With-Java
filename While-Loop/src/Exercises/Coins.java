package Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coins = Double.parseDouble(scanner.nextLine());
        double stinki = coins * 100;
        int count=0;
        while (true)
        {
           stinki= Math.round(stinki);
            if(stinki>=200)
            {
                stinki -= 200;
                count++;
            }
            else if(stinki>=100)
            {
                stinki -= 100;
                count++;
            }
            else if(stinki>=50)
            {
                stinki -= 50;
                count++;
            }
            else if(stinki>=20)
            {
                stinki -=20;
                count++;
            }
            else if(stinki>=10)
            {
                stinki -=10;
                count++;
            }
            else if(stinki>=5)
            {
                stinki -=5;
                count++;
            }
            else if(stinki>=2)
            {
                stinki -=2;
                count++;
            }
            else if(stinki>=1)
            {
                stinki -=1;
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }
}
