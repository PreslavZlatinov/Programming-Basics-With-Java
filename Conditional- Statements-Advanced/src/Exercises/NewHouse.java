package Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0.0;
//        цвете	Роза	Далия	Лале	Нарцис	Гладиола
//        Цена на брой  5	3.80	2.80	3	2.50
//        Съществуват следните отстъпки:
//•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
//•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%


            if (flowerType.equals("Roses")) {
                flowerPrice = flowerCount * 5;
                if (flowerCount>80)
                {
                    flowerPrice = flowerPrice * 0.9;
                }
            }
            else if(flowerType.equals("Dahlias"))
            {
                flowerPrice = flowerCount * 3.80;
                if (flowerCount>90)
                {
                    flowerPrice = flowerPrice * 0.85;
                }
            }
            else if(flowerType.equals("Tulips"))
            {
                flowerPrice = flowerCount * 2.80;
                if (flowerCount>80)
                {
                    flowerPrice = flowerPrice * 0.85;
                }
            }
            else if(flowerType.equals("Narcissus"))
            {
                flowerPrice = flowerCount * 3;
                if (flowerCount<120)
                {
                    flowerPrice = flowerPrice + (flowerPrice*0.15);
                }
            }
            else if(flowerType.equals("Gladiolus"))
            {
                flowerPrice = flowerCount * 2.50;
                if (flowerCount<80)
                {
                    flowerPrice = flowerPrice + (flowerPrice*0.2);
                }
            }


        double diff = Math.abs(budget - flowerPrice);

        if (flowerPrice <=budget)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerCount,flowerType,diff);
        }
        else {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
