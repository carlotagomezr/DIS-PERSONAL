package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void runOption() throws FileNotFoundException, IOException{
        int option = -1;
        while(option!=5){
            this.printOptions(); // we run the options function
            option = this.getOption(); // we get the option chosen by the user (with this.)
            this.runOption(option); // if the user chooses another option, we run the options again
        }
    }

    public void runOption(int option) throws FileNotFoundException, IOException{
        switch(option){
            case 1:
                Option1 option1 = new Option1();
                option1.run();
                break;
            case 2:
                Option2 option2 = new Option2();
                option2.run();
                break;
            case 3:
                Option3 option3 = new Option3(); 
                option3.run();   
                break;
            case 4:
                Option4 option4 = new Option4();
                option4.run();    
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
    // Get the integer value chosen by the user 
    public int getOption(){
        
        try{
            Scanner scanner = new Scanner(System.in); // leer entrada del usuario desde la consola
            int option = scanner.nextInt(); // get the integer value
            //scanner.close(); // close the scanner - si se cierra, se cierra la entrada 
            //lo que hace que no pueda ller la entrada de usuario después de haberlo hecho una vexz
            return option;
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            printOptions(); // if the user enters a non-integer value, we print the options again
            return 0; 
        }
    }

    // print options to choose
    public void printOptions() {
        System.out.println("1. CSV to JSON");
        System.out.println("2. Group by MSCode");
        System.out.println("3. CIB Range");
        System.out.println("4. EstCode Values");
        System.out.println("5. Exit");


        System.out.println("Enter your choice: ");
    }
}
