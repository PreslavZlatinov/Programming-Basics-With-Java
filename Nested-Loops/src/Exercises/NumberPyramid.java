package Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int iterationCount = 0;
        boolean loopStop = false;
        for (int rows = 1; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                iterationCount++;
                if(iterationCount>n)
                {
                    loopStop = true;
                    break;
                }
                System.out.print(iterationCount + " ");
            }
            if(loopStop){
                break;
            }
            System.out.println();
        }
    }
}
