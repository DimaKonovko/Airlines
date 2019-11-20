package by.bsuir.konovko.airlines.service;

import by.bsuir.konovko.airlines.bean.Flight;

import java.util.ArrayList;

public interface FlightService {
    void addFlight(ArrayList<Flight> flights);
    void printFlight(ArrayList<Flight> flights);
    void updateFlight(ArrayList<Flight> flights);
    void deleteFlight(ArrayList<Flight> flights);
    void findFlight(ArrayList<Flight> flights);
}
