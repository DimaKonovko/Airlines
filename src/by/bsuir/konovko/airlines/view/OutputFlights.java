package by.bsuir.konovko.airlines.view;

import by.bsuir.konovko.airlines.bean.Flight;

import java.util.ArrayList;

public class OutputFlights {
    public static void print(ArrayList<Flight> flights) {
        if (flights.isEmpty()) {
            System.out.println("There are no flight now!");
        }
        else {
            for (var flight : flights) {
                printFlight(flight);
            }
        }
    }



    public static void printFlight(Flight flight) {
        System.out.println("------- FLIGHT INFO -------");
        System.out.println("    Id: " + flight.getId());
        System.out.println("    Max passengers: " + flight.getMaxPassengers());
        System.out.println("    Curr passengers: " + flight.getCurrPassengers());
        System.out.println("    Start point: " + flight.getStartPoint());
        System.out.println("    End point: " + flight.getEndPoint());
        System.out.println("  Passengers:");
        if (flight.getPassengers().isEmpty()) {
            System.out.println("  There are no passengers");
        }
        else {
            OutputPassengers.print(flight.getPassengers());
        }
        System.out.println();
    }



    public static void printUpdateMotions() {
        System.out.println(" 1. Update max passengers");
        System.out.println(" 2. Update start point");
        System.out.println(" 3. Update end point");
        System.out.println(" 0. Back to menu");
        System.out.print("         Your choice: ");
    }



    public static void printFindMotions() {
        System.out.println(" 1. Load passenger");
        System.out.println(" 0. Back to menu");
        System.out.print("         Your choice: ");
    }
}
