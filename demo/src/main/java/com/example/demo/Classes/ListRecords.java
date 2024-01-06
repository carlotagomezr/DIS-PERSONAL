package com.example.demo.Classes;

import java.util.ArrayList;

public class ListRecords {
    private ArrayList<Records> records; // lista de todos los records

    public ArrayList<Records> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Records> records) {
        this.records = records;
    }


    public ListRecords(ArrayList<Records> records) {
        this.records = records;
    }


    // //para mostrar por pantalla los datos como string
    // @Override
    // public String toString() {
    //     return "ListRecords{" +
    //             "records=" + records +
    //             '}';
    // }

}
