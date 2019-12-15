package by.bsuir.konovko.airlines.dao.factory;

import by.bsuir.konovko.airlines.bean.Flight;
import by.bsuir.konovko.airlines.dao.impl.XmlSerializer;

import java.util.ArrayList;

public class DAOFactory {
    // variables
    private static ArrayList<Flight> flights = new ArrayList<Flight>();



    // methods
    public static ArrayList<Flight> getFlightsDAO() throws Exception {
        flights = XmlSerializer.readFlights();
        return flights;
    }
}
