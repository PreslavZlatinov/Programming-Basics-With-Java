package Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        boolean isValid = true;
        if(city.equals("Sofia"))
        {
            if(sells>=0 && sells <=500)
            {
                commission = sells * 0.05;
            }
            else if(sells>500 && sells <=1000)
            {
                commission = sells * 0.07;
            }
            else if(sells>1000 && sells <=10000)
            {
                commission = sells * 0.08;
            }
            else if(sells>10000)
            {
                commission = sells * 0.12;
            }
            else {
                isValid = false;
            }
        }
        else if (city.equals("Varna"))
        {
            if(sells>=0 && sells <=500)
            {
                commission = sells * 0.045;
            }
            else if(sells>500 && sells <=1000)
            {
                commission = sells * 0.075;
            }
            else if(sells>1000 && sells <=10000)
            {
                commission = sells * 0.10;
            }
            else if(sells>10000)
            {
                commission = sells * 0.13;
            }
            else {
                System.out.println("error");
            }
        }
        else if (city.equals("Plovdiv"))
        {
            if(sells>=0 && sells <=500)
            {
                commission = sells * 0.055;
            }
            else if(sells>500 && sells <=1000)
            {
                commission = sells * 0.08;
            }
            else if(sells>1000 && sells <=10000)
            {
                commission = sells * 0.12;
            }
            else if(sells>10000)
            {
                commission = sells * 0.145;
            }
            else {
                isValid = false;
            }
        }
        else {
            isValid = false;
        }
    if (!isValid){
        System.out.println("error");
    }else {
        System.out.printf("%.2f", commission);
    }
    }
}
