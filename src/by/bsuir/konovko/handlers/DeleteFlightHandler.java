package by.bsuir.konovko.handlers;

import by.bsuir.konovko.models.Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFlightHandler {
    public DeleteFlightHandler(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter flight id to remove: ");
        int id = Integer.parseInt(in.nextLine());
        for (var flight : flights) {
            if (flight.getId() == id) {
                flights.remove(flight);
                System.out.println("Successfully deleted");
                return;
            }
        }

        System.out.println(" There is no flight with id: " + id);
    }
}
