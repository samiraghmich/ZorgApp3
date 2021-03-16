package com.company;

import java.util.ArrayList;

public class Patient {
    private String surname;
    private String lastname;
    private int age;
    private double weight;
    private double length;
    private ArrayList<Medicine> medicineList = new ArrayList<>();

    public void addMedicine(Medicine medicine){
        medicineList.add(medicine);
    }
//  Set function
    public void setSurname(String surnameGiven){
        surname = surnameGiven;
    }

    public void setLastname(String lastnameGiven) {
        lastname = lastnameGiven;
    }

    public void setAge(int ageGiven){
        age = ageGiven;
    }

    public void setAge(String ageGiven){
        age = Integer.parseInt(ageGiven);
    }

    public void setWeight(double weightGiven) {
        weight = weightGiven;
    }

    public void setLength(double lengthGiven){
        length = lengthGiven;
    }

//  Get function
    public String getSurname(){
        return surname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge (){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getLength(){
        return length;
    }

//  BMI Calculator
    public  double calculatorBmi(){
        return 10000 * getWeight() / (getLength() * getLength());
}


    public Patient(String patientSurname, String patientLastname, int patientAge, double patientWeight, double patientLength) {
        surname = patientSurname;
        lastname = patientLastname;
        age = patientAge;
        weight = patientWeight;
        length = patientLength;
    }

    public Patient(String patientsSurname, String patientsLastname) {
        surname = patientsSurname;
        lastname = patientsLastname;
    }

    public void writeln(){
        System.out.println(surname + " " + lastname);
    }

    public void writeInformation() {
        System.out.println("\n" + surname + " " + lastname + "\n" + age + " years" + "\n" + weight + " kg" + "\n" + length + " cm");
        System.out.format("BMI = %.2f", calculatorBmi());
        for (int i =0; i <medicineList.size(); i++){
            medicineList.get(i).writeMed();
        }
        System.out.println();
        }
}
