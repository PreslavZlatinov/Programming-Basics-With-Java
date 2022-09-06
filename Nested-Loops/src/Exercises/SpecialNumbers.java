package Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            String currNum = "" + i;
            int count = 0;
            for (int j = 0; j < currNum.length(); j++) {
                int currDigit = Integer.parseInt(String.valueOf(currNum.charAt(j)));
                if(currDigit==0){
                    break;
                }
                else if(n%currDigit==0)
                {
                    count++;
                }
            }
            if(count == 4)
            {
                System.out.print(currNum + " ");
            }
        }
    }
}
