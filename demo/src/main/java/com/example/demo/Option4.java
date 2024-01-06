package com.example.demo;

import java.util.Scanner;

import com.example.demo.Classes.ListRecords;
import com.example.demo.Functions.JsonManager;

public class Option4 {

    public void run(){
        // “EstCode Values”. When this option is chosen, the user will be asked to
        // provide a year as a parameter. The console will print out all objects in which the 
        // value for the key “EstCode” is equal to that of “E_Population”, and the value for
        // the key “SE” is less than 1000 for that year. 


        // 1. Provide a year as a parameter
        System.out.println("Type a year: ");
        Scanner scanner = new Scanner(System.in); // leer entrada del usuario desde la consola
        String year = scanner.nextLine(); // get the integer value


        

        // 2. Read JSON file from step 1
        JsonManager jsonManager = new JsonManager();
        ListRecords listRecs = jsonManager.readJson();

        listRecs.getRecords().stream()
        .filter(rec -> rec.getYear().equals(year)) // cuando es string, se usa esta funcion en lugar de ==
        .filter(rec -> rec.getEstCode().equals("_Population") && rec.getSe() < 1000)
        .forEach(rec -> System.out.println(rec));

    }
    
}
