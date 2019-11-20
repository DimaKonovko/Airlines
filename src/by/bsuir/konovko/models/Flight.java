package by.bsuir.konovko.models;

import java.util.ArrayList;

public class Flight {
    // variables
    private static int base_id = 0;
    private int id;
    private int maxPassengers;
    private int currPassengers;
    private String startPoint;
    private String endPoint;
    private ArrayList<Passenger> passengers;


    // methods
    public int getId() { return id; }
    public int getMaxPassengers() { return maxPassengers; }
    public int getCurrPassengers() { return currPassengers; }
    public String getStartPoint() { return startPoint; }
    public String getEndPoint() { return endPoint; }
    public ArrayList<Passenger> getPassengers() { return passengers; }

    public void setMaxPassengers(int maxPassengers) { this.maxPassengers = maxPassengers; }
    public void setCurrPassengers(int currPassengers) { this.currPassengers = currPassengers; }
    public void setStartPoint(String startPoint) { this.startPoint = startPoint; }
    public void setEndPoint(String endPoint) { this.endPoint = endPoint; }



    public Flight(int maxPassengers, String startPoint, String endPoint) {
        base_id++;
        this.id = base_id;
        this.maxPassengers = maxPassengers;
        this.currPassengers = 0;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.passengers = new ArrayList<Passenger>();
    }



    public void loadPassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            System.out.println(" The passenger already exist");
        }
        else {
            if (passengers.size() == maxPassengers) {
                System.out.println(" Passengers limit reached");
            }
            else {
                passengers.add(passenger);
                System.out.println("Successfully loaded");
            }
        }
    }



    public void print() {
        System.out.println("------- FLIGHT INFO -------");
        System.out.println("    Id: " + getId());
        System.out.println("    Max passengers: " + getMaxPassengers());
        System.out.println("    Curr passengers: " + getCurrPassengers());
        System.out.println("    Start point: " + getStartPoint());
        System.out.println("    End point: " + getEndPoint());
        System.out.println("  Passengers:");
        if (passengers.isEmpty()) {
            System.out.println("  There are no passengers");
        }
        else {
            for (var passenger : passengers) {
                passenger.print();
            }
        }
        System.out.println();
    }
}
