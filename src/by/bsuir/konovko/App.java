package by.bsuir.konovko;

import by.bsuir.konovko.airlines.bean.Flight;
import by.bsuir.konovko.airlines.menu.OutputMenu;
import by.bsuir.konovko.airlines.service.impl.FlightServiceImpl;
import by.bsuir.konovko.airlines.view.OutputFlights;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // variables
    private static ArrayList<Flight> flights = new ArrayList<Flight>();



    // methods
    public static void main(String[] args) {
        manageHandlers();
    }



    private static void manageHandlers() {
        Scanner in = new Scanner(System.in);

        int input;
        while (true) {
            OutputMenu.printMenu();
            try {
                input = Integer.parseInt(in.nextLine());

                switch (input) {
                    case 1:
                        OutputFlights.print(flights);
                        break;
                    case 2:
                        FlightServiceImpl.addFlight(flights);
                        break;
                    case 3:
                        FlightServiceImpl.deleteFlight(flights);
                        break;
                    case 4:
                        FlightServiceImpl.updateFlight(flights);
                        break;
                    case 5:
                        FlightServiceImpl.findFlights(flights);
                        break;
                    case 0:
                        return;
                }
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }



    private static void printMenu() {
        System.out.println("#-----------------------------#");
        System.out.println("             MENU              ");
        System.out.println("#-----------------------------#");
        System.out.println("   1. Print all flights        ");
        System.out.println("   2. Add flight               ");
        System.out.println("   3. Delete flight            ");
        System.out.println("   4. Update flight            ");
        System.out.println("   5. Find flight by id        ");
        System.out.println("   0. Exit                     ");
        System.out.print("             Your choice: ");
    }
}
