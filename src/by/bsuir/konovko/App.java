package by.bsuir.konovko;

import by.bsuir.konovko.models.*;
import by.bsuir.konovko.handlers.*;

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
            printMenu();
            try {
                input = Integer.parseInt(in.nextLine());

                switch (input) {
                    case 1:
                        new PrintFlightHandler(flights);
                        break;
                    case 2:
                        new AddFlightHandler(flights);
                        break;
                    case 3:
                        new DeleteFlightHandler(flights);
                        break;
                    case 4:
                        new UpdateFlightHandler(flights);
                        break;
                    case 5:
                        new FindFlightHandler(flights);
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
