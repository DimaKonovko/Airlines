package by.bsuir.konovko.airlines.view;

import by.bsuir.konovko.airlines.bean.Passenger;

import java.util.ArrayList;

public class OutputPassengers {
    public static void print(ArrayList<Passenger> passengers) {
        for (var passenger : passengers) {
            printPassenger(passenger);
        }
    }



    private static void printPassenger(Passenger passenger) {
        System.out.println("----- PASSENGER INFO -----");
        System.out.println(" Id: " + passenger.getId());
        System.out.println(" FIO: " + passenger.getFio());
        System.out.println(" Age: " + passenger.getAge());
        System.out.println();
    }
}
