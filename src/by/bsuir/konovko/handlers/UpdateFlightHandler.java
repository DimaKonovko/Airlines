package by.bsuir.konovko.handlers;

import by.bsuir.konovko.models.Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateFlightHandler {
    public UpdateFlightHandler(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter flight id to update: ");
        int id = Integer.parseInt(in.nextLine());
        for (var flight : flights) {
            if (flight.getId() == id) {
                int choice;
                while (true) {
                    flight.print();
                    showAvailableMotions();
                    choice = Integer.parseInt(in.nextLine());
                    switch (choice) {
                        case 1:
                            updateMaxPassengers(flight);
                            break;
                        case 2:
                            updateStartPoint(flight);
                            break;
                        case 3:
                            updateEndPoint(flight);
                            break;
                        case 0:
                            return;
                    }
                }
            }
        }

        System.out.println(" There is no flight with id: " + id);
    }



    private void showAvailableMotions() {
        System.out.println(" 1. Update max passengers");
        System.out.println(" 2. Update start point");
        System.out.println(" 3. Update end point");
        System.out.println(" 0. Back to menu");
        System.out.print("         Your choice: ");
    }



    private void updateMaxPassengers(Flight flight) {
        System.out.print(" Enter new max passengers: ");
        Scanner in = new Scanner(System.in);
        try {
            flight.setMaxPassengers(Integer.parseInt(in.nextLine()));
        }
        catch (Exception e) {
            System.out.println("Incorrect input. Try again");
        }
    }



    private void updateStartPoint(Flight flight) {
        System.out.print(" Enter new start point: ");
        Scanner in = new Scanner(System.in);
        try {
            flight.setStartPoint(in.nextLine());
        }
        catch (Exception e) {
            System.out.println("Incorrect input. Try again");
        }
    }



    private void updateEndPoint(Flight flight) {
        System.out.print(" Enter new end point: ");
        Scanner in = new Scanner(System.in);
        try {
            flight.setEndPoint(in.nextLine());
        }
        catch (Exception e) {
            System.out.println("Incorrect input. Try again");
        }
    }
}
