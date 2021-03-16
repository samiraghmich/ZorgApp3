package com.company;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Medicine {

    private String medicine;
    private int amount;
    private String description;

//    Set function
    public void setMedicine(String medicineGiven) {
        medicine = medicineGiven;
    }
    public void setAmount(int amountGiven){
        amount = amountGiven;
    }
    public void setDescription(String descriptionGiven){
        description = descriptionGiven;
    }

//    Get function
    public  String getMedicine(){
        return medicine;
    }
    public int getAmount(){
        return amount;
    }

    public String getDescription(){
        return  description;
    }

//
    public Medicine(String medicineName, int amountMed, String descriptionMed){
        medicine = medicineName;
        amount = amountMed;
        description = descriptionMed;
    }

    public void writeMed(){
        System.out.println(medicine + " " + amount);
    }
}


