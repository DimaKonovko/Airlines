package by.bsuir.konovko.airlines.bean;

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
}
