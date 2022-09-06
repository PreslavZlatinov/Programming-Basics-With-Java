package Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double appartementPrice = 0.0;

        switch (month)
        {
            case "May":
            case "October":
                studioPrice = 50.00;
                appartementPrice = 65.00;

                if(nightCount>14)
                {
                    studioPrice = studioPrice* 0.70;
                }
                else if(nightCount>7)
                {
                    studioPrice = studioPrice* 0.95;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                appartementPrice = 68.70;
                if(nightCount>14)
                {
                    studioPrice = studioPrice* 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.00;
                appartementPrice = 77.00;
                break;
        }

        if(nightCount>14)
        {
            appartementPrice = appartementPrice * 0.90;
        }

        double finalPriceStudio = nightCount*studioPrice;
        double finalPriceApp = nightCount*appartementPrice;

        System.out.printf("Apartment: %.2f lv.\n",finalPriceApp);
        System.out.printf("Studio: %.2f lv.",finalPriceStudio);

    }

}
