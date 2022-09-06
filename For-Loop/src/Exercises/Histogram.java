package Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        double value = 100.00/n;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                p1++;
            } else if (num <= 399) {
                p2++;
            } else if (num <= 599) {
                p3++;
            } else if (num <= 799) {
                p4++;
            }
            else
            {
                p5++;
            }
        }


        System.out.printf("%.2f%%\n",(p1*value));
        System.out.printf("%.2f%%\n",(p2*value));
        System.out.printf("%.2f%%\n",(p3*value));
        System.out.printf("%.2f%%\n",(p4*value));
        System.out.printf("%.2f%%",(p5*value));
    }
}
