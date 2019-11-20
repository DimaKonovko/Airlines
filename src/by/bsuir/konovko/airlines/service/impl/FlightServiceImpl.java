package by.bsuir.konovko.airlines.service.impl;

import by.bsuir.konovko.airlines.bean.Flight;
import by.bsuir.konovko.airlines.bean.Passenger;
import by.bsuir.konovko.airlines.service.FlightService;
import by.bsuir.konovko.airlines.view.OutputFlights;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightServiceImpl {

    public static void addFlight(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter max passengers: ");
        int maxPassengers = Integer.parseInt(in.nextLine());;

        System.out.println(" Enter start point: ");
        String startPoint = in.nextLine();

        System.out.println(" Enter end point: ");
        String endPoint = in.nextLine();

        Flight flight = new Flight(maxPassengers, startPoint, endPoint);
        flights.add(flight);

        System.out.println("Successfully added");
    }



    public static void printFlight(ArrayList<Flight> flights) {
        OutputFlights.print(flights);
    }



    public static void updateFlight(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter flight id to update: ");
        int id = Integer.parseInt(in.nextLine());
        for (var flight : flights) {
            if (flight.getId() == id) {
                int choice;
                while (true) {
                    OutputFlights.printFlight(flight);
                    OutputFlights.printUpdateMotions();
                    choice = Integer.parseInt(in.nextLine());
                    switch (choice) {
                        case 1:
                            flight.setMaxPassengers(Integer.parseInt(in.nextLine()));
                            break;
                        case 2:
                            flight.setStartPoint(in.nextLine());
                            break;
                        case 3:
                            flight.setEndPoint(in.nextLine());
                            break;
                        case 0:
                            return;
                    }
                }
            }
        }

        System.out.println(" There is no flight with id: " + id);
    }



    public static void deleteFlight(ArrayList<Flight> flights) {
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



    public static void findFlights(ArrayList<Flight> flights) {
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter flight id to find: ");
        int id = Integer.parseInt(in.nextLine());
        for (var flight : flights) {
            if (flight.getId() == id) {
                int choice;
                while (true) {
                    OutputFlights.printFlight(flight);
                    OutputFlights.printFindMotions();
                    choice = Integer.parseInt(in.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print(" Enter fio: ");
                            String fio = in.nextLine();
                            System.out.print(" Enter age: ");
                            int age = Integer.parseInt(in.nextLine());
                            Passenger passenger = new Passenger(fio, age);

                            if (flight.getPassengers().contains(passenger)) {
                                System.out.println(" The passenger already exist");
                            }
                            else {
                                if (flight.getPassengers().size() == flight.getMaxPassengers()) {
                                    System.out.println(" Passengers limit reached");
                                }
                                else {
                                    flight.getPassengers().add(passenger);
                                    System.out.println("Successfully loaded");
                                }
                            }
                            break;
                        case 0:
                            return;
                    }
                }
            }
        }

        System.out.println(" There is no flight with id: " + id);
    }
}
