package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.example.demo.Classes.ListRecords;
import com.example.demo.Functions.JsonManager;
import com.example.demo.Functions.ReadCsv;

public class Option1 {
    public void run() throws FileNotFoundException, IOException{
        // creamos instancias de las clases para usarlas/referenciarlas
        ReadCsv csv = new ReadCsv();
        JsonManager json = new JsonManager();

        String path = "demo/src/main/java/com/example/demo/files/cp-national-datafile-csv.csv";
        ListRecords listRec = new ListRecords(csv.read(path));
        json.csvToJson(listRec);
    }
}
