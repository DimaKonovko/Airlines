package by.bsuir.konovko.flight;

public class Flight {
    // variables
    private static int id = 0;
    private int maxPassengers;
    private int currPassengers;
    private String startPoint;
    private String endPoint;



    // methods
    public int getId() { return id; }
    public int getMaxPassengers() { return maxPassengers; }
    public int getCurrPassengers() { return currPassengers; }
    public String getStartPoint() { return startPoint; }
    public String getEndPoint() { return endPoint; }

    public void setMaxPassengers(int maxPassengers) { this.maxPassengers = maxPassengers; }
    public void setCurrPassengers(int currPassengers) { this.currPassengers = currPassengers; }
    public void setStartPoint(String startPoint) { this.startPoint = startPoint; }
    public void setEndPoint(String endPoint) { this.endPoint = endPoint; }



    public Flight(int passengersNumber, String startPoint, String endPoint) {
        id++;
        this.maxPassengers = passengersNumber;
        this.currPassengers = 0;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }



    public void print() {
        System.out.println("      ------------------      " );
        System.out.println(" Id: " + getId());
        System.out.println(" Max passengers: " + getMaxPassengers());
        System.out.println(" Curr passengers: " + getCurrPassengers());
        System.out.println(" Start point: " + getStartPoint());
        System.out.println(" End point: " + getEndPoint());
    }
}
