package Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            if(product.equals("banana")){
                price = 2.50;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("apple"))
            {
                price = 1.20;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("orange"))
            {
                price = 0.85;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("grapefruit"))
            {
                price = 1.45;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("kiwi"))
            {
                price = 2.70;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("pineapple"))
            {
                price = 5.50;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("grapes"))
            {
                price = 3.85;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else {
                System.out.println("error");
            }
        }
        else if(day.equals("Saturday") || day.equals("Sunday"))
        {
            if(product.equals("banana")){
                price = 2.70;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("apple"))
            {
                price = 1.25;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("orange"))
            {
                price = 0.90;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("grapefruit"))
            {
                price = 1.60;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("kiwi"))
            {
                price = 3.00;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("pineapple"))
            {
                price = 5.60;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else if(product.equals("grapes"))
            {
                price = 4.20;
                double totalCost = price * quantity;
                System.out.printf("%.2f",totalCost);
            }
            else {
                System.out.println("error");
            }
        }
        else {
            System.out.println("error");
        }
    }
}
