package Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookToFind = scanner.nextLine();
        String guessBook = scanner.nextLine();
        int count = 0;

        while(!bookToFind.equals(guessBook))
        {
            guessBook = scanner.nextLine();
            count++;
            if(guessBook.equals("No More Books"))
            {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",count);
                break;
            }
        }
        if(bookToFind.equals(guessBook)) {
            System.out.printf("You checked %d books and found it.", count);
        }
    }
}
