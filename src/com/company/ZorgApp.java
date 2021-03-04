package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ZorgApp {
    boolean exit;
    ArrayList<Patient> patientList = new ArrayList<>();

    public ZorgApp(){
        Patient patient1 = new Patient("Samir", "Aghmich", 23, 80, 178, "bmi");
        Patient patient2 = new Patient("Koby", "Corrigan", 30, 75, 169, "");
        Patient patient3 = new Patient("Junior", "Lawson", 35, 78, 180, "");
        Patient patient4 = new Patient("Keeva", "Davila", 40, 94, 186, "");
        Patient patient5 = new Patient("Dolly", "Emery", 28, 78, 199, "");

        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);
    }

    public void runMenu() {
        System.out.println("------------------------------");
        System.out.println("------Welcome to ZorgApp------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        while (!exit) {
            System.out.println("\nPlease make a selection: ");
            System.out.println("0) Exit menu");
            System.out.println("1) Employee");
            System.out.println("2) Patient");
            int choice = getInput();

            switch (choice) {
                case 0 -> {
                    exit = true;
                    System.out.println("Thank you for using the application");
                }
                case 1 -> forEmployee();
                case 2 -> forPatient();
                default -> System.out.println("An unknown error has occurred.");
            }
        }
    }
    private void forPatient() {
        for (int i=0; i<patientList.size(); i++){
            System.out.print((i+1) + ". " ); patientList.get(i).writeln();
        }

        Scanner keyboard = new Scanner(System.in);
        int choice2 = 4;
        while (choice2 != 0) {

            choice2 = keyboard.nextInt();
            Patient patient = patientList.get(choice2 -1);
            switch (choice2) {
                case 0 -> System.out.println("STOP!");
                default -> patient.writeInformation();
            }
        }
    }

    private int getInput() {
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > 2)
            try {
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again");
            }
        return choice;
    }

    private void forEmployee() {

        for (int i=0; i<patientList.size(); i++){
            System.out.print((i+1) + ". " ); patientList.get(i).writeln();
        }
        Scanner keyboard = new Scanner(System.in);
        int choice2 = 4;
        while (choice2 != 0) {

            System.out.print("\nEnter your choice: ");

            choice2 = keyboard.nextInt();
            Patient patient = patientList.get(choice2 -1);
            switch (choice2) {
                case 0 -> System.out.println("STOP!");
                default -> patient.writeInformation();
            }
        }
    }
}
