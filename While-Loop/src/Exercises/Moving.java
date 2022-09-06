package Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int roomSize = width * length * height;

        String cardBoardBoxCount = scanner.nextLine();

        while (!"Done".equals(cardBoardBoxCount))
        {
            int counter = Integer.parseInt(cardBoardBoxCount);
            roomSize -= counter;
            if(roomSize < 0)
            {
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(roomSize));
                break;
            }
            cardBoardBoxCount = scanner.nextLine();
        }

        if(roomSize > 0) {
            System.out.printf("%d Cubic meters left.", roomSize);
        }
    }
}
