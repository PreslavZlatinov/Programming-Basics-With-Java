package Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        if (shape.equals("square"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double sSquare = a*a;
            System.out.printf("%.3f %n",sSquare);
        }
        else if(shape.equals("rectangle"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double sRectangle = a*b;
            System.out.printf("%.3f %n",sRectangle);
        }
        else if(shape.equals("circle"))
        {
            double r = Double.parseDouble(scanner.nextLine());
            double sCircle = Math.PI*(r*r);
            System.out.printf("%.3f %n",sCircle);
        }
        else if(shape.equals("triangle"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double sTriangle = (a*b)/2;
            System.out.printf("%.3f %n",sTriangle);
        }
        else {
            System.out.println("Incorrect shape type!");
        }
    }
}
