package com.example.demo.Functions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

import com.example.demo.Classes.Records;

// SAVE DATA FROM CSV FILE IN A CLASS
public class ReadCsv {
    // static vatiable that shows the type of the limiter the csv file will have
    private static final String COMMA_DELIMITER = ",";

    // function that reads the csv file and stores it in the defined class
    public ArrayList<Records> read(String path) throws FileNotFoundException, IOException{ // An ArrayList must have a type, a class type
        ArrayList<Records> records = new ArrayList<Records>(); // we create an ArrayList of type Record
        try (BufferedReader buf_read = new BufferedReader(new FileReader(path))) {
            String line = "";
            buf_read.readLine(); // we read the first line of the csv file
            while ((line = buf_read.readLine()) != null) { // we read the csv file line by line
                UUID uuid = UUID.randomUUID();
                String[] value = line.split(COMMA_DELIMITER);
                String _id = uuid.toString();
                String mscode = value[0];
                String year = value[1];
                String estCode = value[2];
                
                float estimate = !Objects.equals(value[3], " ") ? Float.parseFloat(value[3]) : 0;
                float se = !Objects.equals(value[4], " ") ? Float.parseFloat(value[4]) : 0;
                float lowerCIB = !Objects.equals(value[5], " ") ? Float.parseFloat(value[5]) : 0;
                float upperCIB = !Objects.equals(value[6], " ") ? Float.parseFloat(value[6]) : 0; 
                
                String flag = "";
                if (value.length == 8) {
                    flag = value[7].trim();
                }

                Records record = new Records(_id, mscode, year, estCode, estimate, se, lowerCIB, upperCIB, flag); // we create a new instance of the class Record
                records.add(record);
                            
            }
            return records; 
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        

    }
}
