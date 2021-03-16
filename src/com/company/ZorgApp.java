package com.company;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ZorgApp {
    boolean exit = false;
    ArrayList<Patient> patientList = new ArrayList<>();
    ArrayList<Medicine> medicineList = new ArrayList<>();

    public ZorgApp() {
        Medicine medicine1 = new Medicine("test", 23, "test2");
        Medicine medicine2 = new Medicine("test2", 24, "test3");
        Medicine medicine3 = new Medicine("test3", 25, "test4");
        Medicine medicine4 = new Medicine("test4", 26, "test5");
        Medicine medicine5 = new Medicine("test5", 27, "test6");

        medicineList.add(medicine1);
        medicineList.add(medicine2);
        medicineList.add(medicine3);
        medicineList.add(medicine4);
        medicineList.add(medicine5);

        Patient patient1 = new Patient("Samir", "Aghmich", 23, 80, 178);
        patient1.addMedicine(medicine2);
        patient1.addMedicine(medicine3);
        Patient patient2 = new Patient("Koby", "Corrigan", 30, 75, 169);
        Patient patient3 = new Patient("Junior", "Lawson", 35, 78, 180);
        Patient patient4 = new Patient("Keeva", "Davila", 40, 94, 186);
        Patient patient5 = new Patient("Dolly", "Emery", 28, 78, 199);

        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);


    }

    public void runMenu() {
//  First menu
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
//  Patient menu
        for (int i = 0; i < patientList.size(); i++) {
            System.out.print((i + 1) + ". ");
            patientList.get(i).writeln();
        }

        Scanner keyboard = new Scanner(System.in);
        int choice2 = 4;
        while (choice2 != 0) {

            choice2 = keyboard.nextInt();
            Patient patient = patientList.get(choice2 - 1);
            switch (choice2) {
                case 0 -> System.out.println("STOP!");
                default -> patient.writeInformation();
            }
            System.out.println("\n\n1. Edit name");
            System.out.println("2. Return to menu");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter new name:");
                    Scanner scanner = new Scanner(System.in);
                    Patient patientName = patientList.get(choice2 - 1);
                    String userInput = scanner.nextLine();
                    patientName.setSurname(userInput);

                    patient.writeInformation();
                    System.out.println("\n\n1. return to menu");
                    Scanner in2 = new Scanner(System.in);
                    int choiceReturn = in2.nextInt();
                    switch (choiceReturn) {
                        case 1:
                            runMenu();
                            break;
                    }
                    break;
                case 2:
                    runMenu();
                    break;
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
//  Employee menu
        for (int i = 0; i < patientList.size(); i++) {
            System.out.print((i + 1) + ". ");
            patientList.get(i).writeln();
        }
        Scanner keyboard = new Scanner(System.in);
        int choice2 = 4;
        while (choice2 != 0) {

            choice2 = keyboard.nextInt();
            Patient patient = patientList.get(choice2 - 1);
            switch (choice2) {
                default -> patient.writeInformation();
            }
            System.out.println("\n\n1. Edit name");
            System.out.println("2. Edit age");
            System.out.println("3. Edit weight");
            System.out.println("4. Edit length");
            System.out.println("5. Return to menu");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
//  Choice your edit option
                case 1:
                    System.out.println("Enter new name:");
                    Scanner scanner = new Scanner(System.in);
                    Patient patientName = patientList.get(choice2 - 1);
                    String userInput = scanner.nextLine();
                    patientName.setSurname(userInput);
                    patient.writeInformation();

                    System.out.println("\n\n1. return to menu");
                    Scanner in2 = new Scanner(System.in);
                    int choiceReturn = in2.nextInt();
                    switch (choiceReturn) {
                        case 1:
                            runMenu();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter new age:");
                    Scanner scanner2 = new Scanner(System.in);
                    Patient patientAge = patientList.get(choice2 - 1);
                    int userInput2 = scanner2.nextInt();
                    patientAge.setAge(userInput2);
                    patient.writeInformation();

                    System.out.println("\n\n1. return to menu");
                    Scanner in3 = new Scanner(System.in);
                    int choiceReturn2 = in3.nextInt();
                    switch (choiceReturn2) {
                        case 1:
                            runMenu();
                            break;
                    }
                case 3:
                    System.out.println("Enter new weight:");
                    Scanner scanner3 = new Scanner(System.in);
                    Patient patientWeight = patientList.get(choice2 - 1);
                    double userInput3 = scanner3.nextDouble();
                    patientWeight.setWeight(userInput3);
                    patient.writeInformation();

                    System.out.println("\n\n1. return to menu");
                    Scanner in4 = new Scanner(System.in);
                    int choiceReturn3 = in4.nextInt();
                    switch (choiceReturn3) {
                        case 1:
                            runMenu();
                            break;
                    }
                case 4:
                    System.out.println("Enter new length:");
                    Scanner scanner4 = new Scanner(System.in);
                    Patient patientLength = patientList.get(choice2 - 1);
                    double userInput4 = scanner4.nextDouble();
                    patientLength.setWeight(userInput4);
                    patient.writeInformation();

                    System.out.println("\n\n1. return to menu");
                    Scanner in5 = new Scanner(System.in);
                    int choiceReturn4 = in5.nextInt();
                    switch (choiceReturn4) {
                        case 1:
                            runMenu();
                            break;
                    }
                case 5:
                    runMenu();
                    break;
            }
        }
    }
}