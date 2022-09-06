package Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int piecesOfCake = width * height;
        String command = scanner.nextLine();
        while (!(command.equals("STOP")))
        {
            int piecesTaken = Integer.parseInt(command);
            piecesOfCake -= piecesTaken;
            if (piecesOfCake<0)
            {
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(piecesOfCake));
                break;
            }
            command = scanner.nextLine();
        }
        if(piecesOfCake>0)
        {
            System.out.printf("%d pieces are left.",piecesOfCake);
        }
    }
}
