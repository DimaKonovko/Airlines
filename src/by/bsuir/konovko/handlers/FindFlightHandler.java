package by.bsuir.konovko.handlers;

import by.bsuir.konovko.models.Flight;
import by.bsuir.konovko.models.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class FindFlightHandler {
    public FindFlightHandler(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter flight id to find: ");
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
                            loadPassenger(flight);
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
        System.out.println(" 1. Load passenger");
        System.out.println(" 0. Back to menu");
        System.out.print("         Your choice: ");
    }



    private void loadPassenger(Flight flight) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter fio: ");
        String fio = in.nextLine();
        System.out.print(" Enter age: ");
        int age = Integer.parseInt(in.nextLine());
        flight.loadPassenger(new Passenger(fio, age));
    }
}
