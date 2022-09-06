package Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int totalTickets = 0;
        int studentTickets = 0;
        int basicTickets = 0;
        int kidTickets = 0;
        while (!movieName.equals("Finish"))
        {
            int roomSeats = Integer.parseInt(scanner.nextLine());
            int ticketCounter = 0;
                for (int i = 0; i < roomSeats ; i++) {
                    String tickedType = scanner.nextLine();
                    if(tickedType.equals("student"))
                    {
                        studentTickets++;
                        ticketCounter++;
                    }
                    else if(tickedType.equals("standard"))
                    {
                        basicTickets++;
                        ticketCounter++;
                    }
                    else if(tickedType.equals("kid")){
                        kidTickets++;
                        ticketCounter++;
                    }
                    if(tickedType.equals("End"))
                    {
                        break;
                    }
                }
                totalTickets += ticketCounter;
            System.out.printf("%s - %.2f%% full.%n",movieName,(1.0*ticketCounter/roomSeats)*100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",(1.0*studentTickets/totalTickets)*100);
        System.out.printf("%.2f%% standard tickets.%n",(1.0*basicTickets/totalTickets)*100);
        System.out.printf("%.2f%% kids tickets.",(1.0*kidTickets/totalTickets)*100);
    }
}
