package by.bsuir.konovko.handlers;

import by.bsuir.konovko.models.Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFlightHandler {
    public AddFlightHandler(ArrayList<Flight> flights) {
        Flight flight = new Flight(enterMaxPassengers(), enterStartPoint(), enterEndPoint());
        flights.add(flight);
        System.out.println("Successfully added");
    }



    private int enterMaxPassengers() {
        Scanner in = new Scanner(System.in);
        int maxPassengers;

        while (true) {
            try {
                System.out.print(" Enter max passengers: ");
                maxPassengers = Integer.parseInt(in.nextLine());
                break;
            }
            catch (Exception e) {
                System.out.println("Incorrect input. Try again");
            }
        }

        return maxPassengers;
    }



    private String enterStartPoint() {
        Scanner in = new Scanner(System.in);
        String startPoint;

        while (true) {
            try {
                System.out.println(" Enter start point: ");
                startPoint = in.nextLine();
                break;
            }
            catch (Exception e) {
                System.out.println("Incorrect input. Try again");
            }
        }

        return startPoint;
    }



    private String enterEndPoint() {
        Scanner in = new Scanner(System.in);
        String endPoint;

        while (true) {
            try {
                System.out.println(" Enter end point: ");
                endPoint = in.nextLine();
                break;
            }
            catch (Exception e) {
                System.out.println("Incorrect input. Try again");
            }
        }

        return endPoint;
    }
}
