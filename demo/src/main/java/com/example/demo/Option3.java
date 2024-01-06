package com.example.demo;

import com.example.demo.Classes.ListRecords;
import com.example.demo.Functions.JsonManager;

public class Option3 {

    public void run(){
        // “CIB Range”. The JSON file from step 1 will be read and the console
        // should print out all years of the elements in which the value for the key
        // “LowerCIB” is greater than -0.5 and those of “UpperCIB” is less than 15. Both
        // conditions must be met. 

        // 1. Read JSON file from step 1 
        JsonManager jsonManager = new JsonManager();
        ListRecords listRecs = jsonManager.readJson();

        // 2. get only the records that meet the condition & print
        listRecs.getRecords()
        .stream() // process sequences of elements 
        .filter(record -> record.getLowerCIB() > -0.5 && record.getUpperCIB() < 15) 
        .forEach(record -> System.out.println(record.getYear())); 

    }

    
}
