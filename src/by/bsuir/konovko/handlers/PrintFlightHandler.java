package by.bsuir.konovko.handlers;

import by.bsuir.konovko.flight.Flight;

import java.util.ArrayList;

public class PrintFlightHandler {
    public PrintFlightHandler(ArrayList<Flight> flights) {
        if (flights.isEmpty()) {
            System.out.println("There are no flight now!");
        }
        else {
            for (var flight : flights) {
                flight.print();
            }
        }
    }
}
