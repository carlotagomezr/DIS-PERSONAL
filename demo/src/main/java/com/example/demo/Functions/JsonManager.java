package com.example.demo.Functions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.demo.Classes.ListRecords;
import com.example.demo.Classes.Records;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonManager {
    //  TAKE THE DATA FROM THE CSV FILE AND SAVE IT IN A JSON FILE TO EXPORT (DO THIS ALSO FOR PDF FILE AND XML FILE)
    String path = "demo/src/main/java/com/example/demo/files/cp-national-datafile-json.json";

    public void csvToJson(ListRecords listRec){ // function used in option 1 - csv to json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try{
            FileWriter writer = new FileWriter("demo/src/main/java/com/example/demo/files/cp-national-datafile-json.json");
            gson.toJson(listRec.getRecords(), writer);
            writer.flush();
            writer.close();
        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }

    public ListRecords readJson(){ // pasasmos el path donde esta el json a leer y la estructura donde debe guardarse
        Gson gson = new Gson();
        ListRecords listRecs = new ListRecords(null); // creamos una instancia de la clase
        try {
            listRecs.setRecords(gson.fromJson(new FileReader(path), new TypeToken<ArrayList<Record>>(){}.getType()));
            return listRecs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // this is returning an exception
    public void writetoJson(HashMap<String, ArrayList<Records>> map) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("demo/src/main/java/com/example/demo/Files/MsCode_json.json")) {
            gson.toJson(map, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
}
