package Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String shoes = "";
        String clothes = "";

        if (degrees>=10 && degrees<=18)
        {
            if (dayTime.equals("Morning"))
            {
                shoes = "Sneakers";
                clothes = "Sweatshirt";
            }
            else if(dayTime.equals("Afternoon"))
            {
                shoes = "Moccasins";
                clothes = "Shirt";
            }
            else if(dayTime.equals("Evening"))
            {
                shoes = "Moccasins";
                clothes = "Shirt";
            }
        }
        else if(degrees>18 && degrees <=24)
        {
            if (dayTime.equals("Morning"))
            {
                shoes = "Moccasins";
                clothes = "Shirt";
            }
            else if(dayTime.equals("Afternoon"))
            {
                shoes = "Sandals";
                clothes = "T-Shirt";
            }
            else if(dayTime.equals("Evening"))
            {
                shoes = "Moccasins";
                clothes = "Shirt";
            }
        }
        else if(degrees>=25){
            if (dayTime.equals("Morning"))
            {
                shoes = "Sandals";
                clothes = "T-Shirt";
            }
            else if(dayTime.equals("Afternoon"))
            {
                shoes = "Barefoot";
                clothes = "Swim Suit";
            }
            else if(dayTime.equals("Evening"))
            {
                shoes = "Moccasins";
                clothes = "Shirt";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.",degrees,clothes,shoes);
    }
}
