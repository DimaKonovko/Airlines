package by.bsuir.konovko.airlines.dao.impl;

import by.bsuir.konovko.airlines.bean.*;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.ArrayList;

public class XmlSerializer {
    public static void writeFlights(ArrayList<Flight> array) throws FileNotFoundException {
        XMLEncoder encoder =
                new XMLEncoder(
                        new BufferedOutputStream(
                                new FileOutputStream(".//src//main//java//by//bsuir//konovko//airlines//dao//impl//flights.xml")));
        encoder.writeObject(array);
        encoder.close();
    }

    public static ArrayList<Flight> readFlights() throws Exception {
        XMLDecoder decoder =
                new XMLDecoder(
                        new BufferedInputStream(
                                new FileInputStream(".//src//main//java//by//bsuir//konovko//airlines//dao//impl//flights.xml")));
        ArrayList<Flight> array = (ArrayList<Flight>)decoder.readObject();
        decoder.close();
        return array;
    }

}