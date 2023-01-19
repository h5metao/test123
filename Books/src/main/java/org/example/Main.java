package org.example;

import org.example.Animals.Ptaki;
import org.example.resources.Gromada;

import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void writeToFile(String fileName, String[] headers, String data1, String data2, String data3) {
        try {
            FileWriter writer = new FileWriter(fileName);

            // Write the header to the CSV file
            for (String h : headers) {
                writer.append(h);
                writer.append(",");
            }
            writer.append("\n");


            writer.append(data1);
            writer.append(",");
            writer.append(data2);
            writer.append(",");
            writer.append(data3);
            writer.append(",");
            writer.append("\n");

//            // Write the data to the CSV file
//            for (String[] row : data) {
//                for (String cell : row) {
//                    writer.append(cell);
//                    writer.append(",");
//                }
//                writer.append("\n");
//            }

            // Close the writer
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        final String CSV_SEPARATOR = ",";

        Map<Enum, String> myMap = new HashMap<>();
        myMap.put(Gromada.ssaki, "SsakiXD");

        System.out.println(myMap.get(Gromada.ssaki));

        Ptaki ptak = new Ptaki("krzys", "brązowy", "3");
        System.out.println(ptak.getName());
        System.out.println(ptak.getColor());

        String[] header = {"Name", "Age", "Gender"};

        writeToFile("alepadaka.csv", header, ptak.getName(), ptak.getColor(), ptak.getPalce());




    }
}