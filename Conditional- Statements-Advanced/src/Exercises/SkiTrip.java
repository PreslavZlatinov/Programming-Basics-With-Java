package Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate = scanner.nextLine();

        double soloRoomPrice = 18.00;
        double apartmentPrice = 25.00;
        double presidentApartmentPrice = 35.00;

        double finalPriceSolo = (days - 1) * soloRoomPrice;
        double finalPriceApp = (days - 1) * apartmentPrice;
        double finalPricePres = (days - 1) * presidentApartmentPrice;

        switch (roomType) {
            case "room for one person":
            case "apartment":
                if (days > 15) {
                    finalPriceApp = finalPriceApp * 0.50;

                } else if (days > 10 && days < 15) {
                    finalPriceApp = finalPriceApp * 0.65;
                } else if (days < 10) {
                    finalPriceApp = finalPriceApp * 0.70;
                }
                break;
            case "president apartment":
                if (days > 15) {
                    finalPricePres = finalPricePres * 0.80;

                } else if (days > 10 && days < 15) {
                    finalPricePres = finalPricePres * 0.85;
                } else if (days > 10) {
                    finalPricePres = finalPricePres * 0.90;
                }
                break;
        }

        if(rate.equals("positive"))
        {
            finalPriceSolo = finalPriceSolo + finalPriceSolo*0.25; // finalPriceSolo * 1.25;
            finalPriceApp = finalPriceApp + finalPriceApp*0.25;
            finalPricePres = finalPricePres + finalPricePres*0.25;
        }
        else if(rate.equals("negative"))
        {
            finalPriceSolo = finalPriceSolo *0.9;
            finalPriceApp = finalPriceApp *0.9;
            finalPricePres = finalPricePres *0.9;
        }

        if(roomType.equals("room for one person"))
        {
            System.out.printf("%.2f",finalPriceSolo);
        }
        else if(roomType.equals("apartment"))
        {
            System.out.printf("%.2f",finalPriceApp);
        }
        else if(roomType.equals("president apartment"))
        {
            System.out.printf("%.2f",finalPricePres);
        }
    }
}
