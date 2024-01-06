package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.demo.Classes.ListRecords;
import com.example.demo.Classes.Records;
import com.example.demo.Functions.JsonManager;

public class Option2 {
    // group by ms code

    public void run(){

        // 1. Read json file
        JsonManager jsonManager = new JsonManager(); // create an instance of the class
        ListRecords listRecs = jsonManager.readJson(); // we save the read data in the class

        // 2. Group by ms code
        // create an instance of a hashmap
        HashMap<String, ArrayList<Records>> map = new HashMap<>(); // empty hashmap
        listRecs.getRecords().forEach(record -> { // for each record in the list of records
            if(map.containsKey(record.getMscode())){ // if the hashmap contains the ms code
                map.get(record.getMscode()).add(record); // add the record to the hashmap
            } else {
                ArrayList<Records> list = new ArrayList<>(); // create a new list
                list.add(record); // add the record to the list
                map.put(record.getMscode(), list); // add the list to the hashmap
            }
        });

        // 3. Write new json file
        jsonManager.writetoJson(map); // write the new json file
    }
}
