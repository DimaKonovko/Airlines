package by.bsuir.konovko;

import by.bsuir.konovko.airlines.bean.Flight;
import by.bsuir.konovko.airlines.dao.factory.DAOFactory;
import by.bsuir.konovko.airlines.dao.impl.XmlSerializer;
import by.bsuir.konovko.airlines.menu.OutputMenu;
import by.bsuir.konovko.airlines.service.impl.FlightServiceImpl;
import by.bsuir.konovko.airlines.view.OutputFlights;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // variables
    private static ArrayList<Flight> flights = new ArrayList<Flight>();



    // methods
    public static void main(String[] args) throws Exception {
        flights = DAOFactory.getFlightsDAO();
        manageHandlers();
        XmlSerializer.writeFlights(flights);
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
}
